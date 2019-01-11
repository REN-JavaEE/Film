package com.lls.erpweb.derive;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lls.entity.OrderA;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class MyPdf extends AbstractPdfView{


	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<OrderA> wares = (List<OrderA>)model.get("wares");
		wares.forEach(ware->{
			document.add(new Paragraph(ware.toString()));
		});
	}

}
