package com.capgemini.couponfinder.couponservice.controllertest;

import com.capgemini.couponfinder.couponservice.controller.CouponController;
import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.service.CouponService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(CouponController.class)
public class ControllerTest {
    private MockMvc couponMockMvc;

	@MockBean
	private CouponService couponServices;

	@InjectMocks
	private CouponController couponController;

	static List<Coupon> coupons;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
        couponMockMvc = MockMvcBuilders.standaloneSetup(couponController).build();
        coupons = new ArrayList<>();
	}

	@Test
	public void testGetAllCoupons() throws Exception {
		String couponName = "Upto 50% off";
		String couponImage = "https://mediaservice.retailmenot.com/ws/mediagroup/R22ASI6HQRE2BANLTBP57PD5EU?width=300&height=150";
		String couponDescription = "Exclusive offer on clothing trends upto 50% off valid until 02 sep 2020";
		String couponCode = "AMZ01";
		String couponCategory = "clothing";
		String couponStore ="Amazon";
		String couponRate ="Code";

        Coupon coupon = new Coupon("1",couponName,couponImage,couponDescription,couponCode,couponCategory,couponStore,couponRate);

		when(couponServices.getallCoupons()).thenReturn(null);
        couponMockMvc.perform(get("/api/coupons")).andExpect(status().isOk());
		verify(couponServices, times(1)).getallCoupons();
		verifyNoMoreInteractions(couponServices);
	}
	@Test
	public void deleteCoupon() throws Exception {
		String couponName = "Upto 50% off";
		String couponImage = "https://mediaservice.retailmenot.com/ws/mediagroup/R22ASI6HQRE2BANLTBP57PD5EU?width=300&height=150";
		String couponDescription = "Exclusive offer on clothing trends upto 50% off valid until 02 sep 2020";
		String couponCode = "AMZ01";
		String couponCategory = "clothing";
		String couponStore ="Amazon";
		String couponRate ="Code";

		Coupon coupon = new Coupon("1",couponName,couponImage,couponDescription,couponCode,couponCategory,couponStore,couponRate);
		couponServices.saveCoupon(coupon);
		Mockito.when(couponServices.deleteCoupon("1")).thenReturn(true);
		couponMockMvc.perform(MockMvcRequestBuilders.delete("/api/coupon/{couponId}", coupon.getCouponId()))
				.andExpect(status().isOk());
	}
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
