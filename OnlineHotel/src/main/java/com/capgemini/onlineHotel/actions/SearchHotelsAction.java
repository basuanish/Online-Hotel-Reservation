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

import com.capgemini.onlineHotel.dto.HotelSearch;
import com.capgemini.onlineHotel.forms.SearchHotelsForm;

public class SearchHotelsAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		HttpSession session = request.getSession(true);
		DynaValidatorForm  searchForm = (DynaValidatorForm )form;
		HotelSearch search = new HotelSearch();
		search.setHotelName((String) searchForm.get("hotelName"));
		search.setLocation((String) searchForm.get("location"));
		java.util.Date utilDate1 = sdf.parse((String) searchForm.get("checkInDate"));
		java.util.Date utilDate2 = sdf.parse((String) searchForm.get("checkOutDate"));
		search.setCheckInDate(new java.sql.Date(utilDate1.getTime()));
		search.setCheckOutDate(new java.sql.Date(utilDate2.getTime()));
		System.out.println(search);
		return mapping.findForward("success");

	}
}
