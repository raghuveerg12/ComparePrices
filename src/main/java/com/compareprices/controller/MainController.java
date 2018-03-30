package com.compareprices.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.dw.DWData;
import com.example.Example_Data;
import com.product.Product;

public class MainController {
	private static final Logger log = Logger.getLogger(MainController.class
			.getName());
	private static final String FILE_NAME_WRITE = ClassLoader.getSystemClassLoader().getResource("MyFirstExcel.xlsx").getPath();
	private static final String FILE_NAME_READ = ClassLoader.getSystemClassLoader().getResource("data2excel.xlsx").getPath();
	private static final String EMPTY_STRING="empty";
	
	public static void main(String[] args) {
		log.log(Level.INFO, "Before the readUrlsFromExcel");

		Map<String, List<String>> mapList = readUrlsFromExcel();

		log.log(Level.INFO, "Map values", mapList);

		generateDataToExcel(mapList);

	}

	private static void generateDataToExcel(Map<String, List<String>> mapList) {
		log.log(Level.INFO, "INTO the generateDataToExcel", mapList);
		
		try (FileOutputStream fos = new FileOutputStream(FILE_NAME_WRITE);
				XSSFWorkbook workbook = new XSSFWorkbook();) {

			XSSFSheet worksheet = workbook.createSheet("ComparePrices");
			int rowNumber = 1;
			
			XSSFRow row1 = worksheet.createRow(0);
			Cell cell1=row1.createCell(0);
			cell1.setCellValue("NUMBER");

			Cell cell2=row1.createCell(1);
			cell2.setCellValue("LIST PRICE");
			
			Cell cell3=row1.createCell(2);
			cell3.setCellValue("COST PRICES");
			
			Cell cell4=row1.createCell(3);
			cell4.setCellValue("DW LIST PRICES");
			
			Cell cell5=row1.createCell(4);
			cell5.setCellValue("MDM PRODCUT");
			for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
				log.info("Item : " + entry.getKey() + " Count : "
						+ entry.getValue());

				List<String> stringList = entry.getValue();
				XSSFRow row = worksheet.createRow(rowNumber);
				Cell cell = row.createCell(0);
				cell.setCellValue(entry.getKey());
				for (int j = 1; j < entry.getValue().size()+1; j++) {

					 cell = row.createCell(j);
					cell.setCellValue(stringList.get(j-1));

				}
				rowNumber++;

			}

			// Save the workbook in .xls file
			workbook.write(fos);
			fos.flush();

		} catch (FileNotFoundException e) {
			e.getMessage();
			log.log(Level.INFO, "into the exception in the write to URL when file not found",e.fillInStackTrace());

		} catch (IOException e) {
			log.log(Level.INFO, "into the exception in the write to URL",e.fillInStackTrace());

		}

		
	}

	private static MultiValueMap<String, String> getHeaders() {
		log.log(Level.INFO, "into the  getHeaders");

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		headers.add("Authorization", "Bearer "
				+ "8b802a4f8fe513a6501f2abdab448275");
		return headers;
	}

	private static Map<String, List<String>> readUrlsFromExcel() {
		log.log(Level.INFO, "into the  readUrlsFromExcel");

		Map<String, List<String>> mapList = new HashMap<>();


		try (FileInputStream excelFile = new FileInputStream(FILE_NAME_READ);
				XSSFWorkbook workbook = new XSSFWorkbook(excelFile);) {
			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(1);
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				String lastTwo = null;
				
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					

					if (!cell.getStringCellValue().isEmpty()) {
						String cellValue = cell.getStringCellValue();
						log.info(cellValue);
						if (cellValue != null && cellValue.length() >= 2) {
							lastTwo = cellValue
									.substring(cellValue.length() - 2);
						}

						mapList.put(cellValue,
								retreiveDataFromURLToCompare(cellValue,
										lastTwo));

					} else {
						log.log(Level.INFO, "into the  readUrlsFromExcel check whether the cell type is",CellType.NUMERIC);
					}
			

				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			log.log(Level.INFO, "into the exception in the readURL",e.fillInStackTrace());

		}

		return mapList;
	}

	private static List<String> retreiveDataFromURLToCompare(String cellValue,
			String lastTwo) {
		lastTwo=trimLeadingZeroes(lastTwo);
		String urlOne = "https://www-qa2.scholastic.com/content/scholastic/books/aso/tso/"
				+ lastTwo + "/" + cellValue + "/data.json";
		String urlTwo = "https://nonprod.api.scholastic.com/qa/ondemand/2.1/product/2.1/isbn13/"
				+ cellValue;
		String urlThree = "https://development-rco-scholastic.demandware.net/s/Sites-tso-usa-Site/dw/shop/v16_9/products/"+cellValue+"-tso-us?client_id=ec2f5cac-1682-4e84-b30e-5d995a2664d8";
		List<String> list = new ArrayList<>();
		
		
		

		list.add(getReponseSecondEntity(urlTwo));
		list.add(getReponseThirdEntity(urlThree));
				
		String splitData=getReponseEntity(urlOne);
		String[] zee=splitData.split(";");
		list.add(zee[0]);
		list.add(zee[1]);
		log.log(Level.INFO,"get the list of data ",list);
		
		

		return list;
	}
	
	

	private static String getReponseEntity(String url){
		log.log(Level.INFO,url,"URL in THE RESPONSE");
		StringBuilder jsonValue=new StringBuilder();
		RestTemplate template = new RestTemplate();
		ResponseEntity<Example_Data>  exdate=null;
		
		try {
			  exdate =template.exchange(url, HttpMethod.GET,null, Example_Data.class);
			
			if(exdate.getBody().getListPrice()!=null && exdate.getStatusCode().equals(HttpStatus.OK) ){
				jsonValue.append(exdate.getBody().getListPrice()).append(";").append(exdate.getBody().getProductID());
					}else{
						jsonValue.append(EMPTY_STRING).append(";").append(EMPTY_STRING);
					}
		} catch (Exception e) {
			jsonValue.append(EMPTY_STRING).append(";").append(exdate.getBody().getProductID());
			log.log(Level.INFO,"jsonValue in exception of responseSecondEntity"+jsonValue);

		}
		
		log.log(Level.INFO,jsonValue.toString());
		
		
		return jsonValue.toString();
	}
	
	private static String trimLeadingZeroes(String value){
		while (value.length() > 1 && value.indexOf('0')==0){
	         value = value.substring(1);
		}
	         return value;
	}
	
	private static String getReponseSecondEntity(String url){
		log.log(Level.INFO,"INTO getReponseSecondEntity" , url);

		String jsonValue;
		RestTemplate template=new RestTemplate();
		
		try {
			ResponseEntity<Product>  exdate =template.exchange(url, HttpMethod.GET,new HttpEntity<String>(getHeaders()), Product.class);
			
			if(exdate.getBody().getProduct().getData().getCorpListPrice()!=null && exdate.getStatusCode().equals(HttpStatus.OK) ){
				jsonValue=exdate.getBody().getProduct().getData().getCorpListPrice();
					}else{
						jsonValue=EMPTY_STRING;
					}
		} catch (Exception e) {

			jsonValue=EMPTY_STRING;
			log.log(Level.INFO,jsonValue+"in exception");
		}
		log.log(Level.INFO,jsonValue);
		
		
		
		return jsonValue;
	}
	
	private static String getReponseThirdEntity(String url){
		log.log(Level.INFO,"INTO getReponseSecondEntity" , url);

		StringBuilder jsonValue=new StringBuilder();
		RestTemplate template=new RestTemplate();
		
		try {
			ResponseEntity<DWData>  exdate =template.exchange(url, HttpMethod.GET,null, DWData.class);
			
			if(exdate.getBody().getCListPrice()!=null && exdate.getStatusCode().equals(HttpStatus.OK) ){
				jsonValue.append(String.valueOf(exdate.getBody().getCListPrice()));
					}else{
						jsonValue.append(EMPTY_STRING);
					}
			
		} catch (Exception e) {

			jsonValue.append(EMPTY_STRING);
			log.log(Level.INFO,jsonValue+"in exception");
		}
		
		
		
		return jsonValue.toString();
	}
	
	

}

