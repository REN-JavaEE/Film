package com.lls.erpweb.derive;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;


public class MyExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<Wares> wares = (List<Wares>) model.get("wares");
		Sheet sheet = workbook.createSheet("商品表");
		response.addHeader("Content-Disposition", "attchement;filename=" + URLEncoder.encode("商品", "UTF-8") + ".xlsx");
		Field[] field = Wares.class.getDeclaredFields();
		for (int i = 0; i < wares.size(); i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < field.length; j++) {
				String fieldName = field[j].getName();
				Method method = Wares.class
						.getDeclaredMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
				row.createCell(j).setCellValue(method.invoke(wares.get(i)).toString());
				System.out.println(wares.get(i).toString());
			}
		}
	}*/

}
