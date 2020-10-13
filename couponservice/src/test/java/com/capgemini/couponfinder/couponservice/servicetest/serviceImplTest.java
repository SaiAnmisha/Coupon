package com.capgemini.couponfinder.couponservice.servicetest;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.repository.CouponRepository;
import com.capgemini.couponfinder.couponservice.service.CouponServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)

public class serviceImplTest {
    @Mock
	private CouponRepository couponRepository;

	@InjectMocks
	private CouponServiceImpl couponServiceImpl;

	private Coupon coupon;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMockCreation() {
		// assertNotNull(movie);
		assertNotNull("jpaRepository creation fails: use @injectMocks on couponServicempl", couponRepository);
	}

	@Test
	public void testSaveMovieSuccess() throws Exception {
        String couponName = "Upto 50% off";
        String couponImage = "https://mediaservice.retailmenot.com/ws/mediagroup/R22ASI6HQRE2BANLTBP57PD5EU?width=300&height=150";
        String couponDescription = "Exclusive offer on clothing trends upto 50% off valid until 02 sep 2020";
        String couponCode = "AMZ01";
        String couponCategory = "clothing";
        String couponStore ="Amazon";
        String couponRate ="Code";

        Coupon newcoupon = new Coupon("1",couponName,couponImage,couponDescription,couponCode,couponCategory,couponStore,couponRate);


        when(couponRepository.save(newcoupon)).thenReturn(newcoupon);
        Coupon returnedcoupon = couponServiceImpl.saveCoupon(newcoupon);

		assertEquals("saving coupon failed , the call to couponServiceImpl is returning false ,check this method", newcoupon,
                returnedcoupon);
		verify(couponRepository, times(1)).save(newcoupon);

	}
}
