package com.capgemini.onlineHotel.actions;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.DynaValidatorForm;

import com.capgemini.onlineHotel.dto.HotelEntity;
import com.capgemini.onlineHotel.dto.HotelSearch;
import com.capgemini.onlineHotel.forms.SearchHotelsForm;
import com.capgemini.onlineHotel.service.HotelService;

public class SearchHotelsAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Hello");
		HttpSession session = request.getSession(true);
		SearchHotelsForm  searchForm = (SearchHotelsForm)form;
		HotelSearch search = new HotelSearch();
		search.setHotelName(searchForm.getHotelName());
		search.setLocation(searchForm.getLocation());
		java.util.Date utilDate1 = sdf.parse(searchForm.getCheckInDate());
		java.util.Date utilDate2 = sdf.parse(searchForm.getCheckOutDate());
		search.setCheckInDate(new java.sql.Date(utilDate1.getTime()));
		search.setCheckOutDate(new java.sql.Date(utilDate2.getTime()));
		System.out.println(search);
		HotelService service = new HotelService();
		HotelEntity hotel = new HotelEntity();
		hotel = service.searchHotel(search);
		return mapping.findForward("success");

	}
}
