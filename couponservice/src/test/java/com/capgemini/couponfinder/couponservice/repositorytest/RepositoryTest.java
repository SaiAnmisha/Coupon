package com.capgemini.couponfinder.couponservice.repositorytest;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.repository.CouponRepository;
import com.capgemini.couponfinder.couponservice.service.CouponService;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Book;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

    @Autowired
    public CouponRepository couponRepositary;

	@Test
	public void testSaveMovie() throws Exception {
        String couponName = "Upto 50% off";
        String couponImage = "https://mediaservice.retailmenot.com/ws/mediagroup/R22ASI6HQRE2BANLTBP57PD5EU?width=300&height=150";
        String couponDescription = "Exclusive offer on clothing trends upto 50% off valid until 02 sep 2020";
        String couponCode = "AMZ01";
        String couponCategory = "clothing";
        String couponStore ="Amazon";
        String couponRate ="Code";

        Coupon newcoupon = new Coupon("1",couponName,couponImage,couponDescription,couponCode,couponCategory,couponStore,couponRate);

        couponRepositary.save(newcoupon);
		final Coupon couponResult = couponRepositary.getByCouponName(couponName);
		String CouponStore= couponResult.getCouponStore();
		assertEquals(CouponStore,couponStore);
	}

}
