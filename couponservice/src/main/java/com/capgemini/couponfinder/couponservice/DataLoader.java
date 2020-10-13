package com.capgemini.couponfinder.couponservice;

import com.capgemini.couponfinder.couponservice.domain.Coupon;
import com.capgemini.couponfinder.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CouponRepository couponRepository;

    public DataLoader(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        couponRepository.save(new Coupon("01", "30% Off Regular Menu Priced Items",
                "https://mediaservice.retailmenot.com/ws/mediagroup/ZKGK6LH3NFGDZPIUB53NJSUBEY?width=300&height=150",
                "Get 30% off Regular Menu Priced Item. Available at participating locations.",
                "PJPIZZA30", "Food", "papa Johns", "CODE"));
        couponRepository.save(new Coupon("02","$5 Off $25+",
                "https://mediaservice.retailmenot.com/ws/mediagroup/3WVSVTOARFAU3AR6DK4TY5GTJ4?width=300&height=150",
                "Save $5 on your order of $25 or more. Valid for a limited time. Participation may vary by location.",
                "visafive","Food","pizaa Hut","CODE"));
        couponRepository.save(new Coupon("03","Footlongs For $5 Each When You Buy 2","https://mediaservice.retailmenot.com/ws/mediagroup/YZ4AK4T2FVDALJ2OYG5BETG3GA?width=300&height=150",
                "Get Footlongs for $5 each When you buy 2. Check to see if restaurant is participating before placing your order, add 2 to your cart & discount will apply if restaurant is participating.",
                "SUB5D","Food","subway","CODE"));
        couponRepository.save(new Coupon("04","Burger King 2020 Coupons & Deals","https://mediaservice.retailmenot.com/ws/mediagroup/O5S553LXDZG67LUIIV7FZK4JNE?width=300&height=150",
                "50% off coupon code needed. Prices as marked. Go to shop the sale now.",
                "BURGER50","Food","burger king","CODE"));
        couponRepository.save(new Coupon("05","30% Off Menu-price Pizzas Order",
                "https://mediaservice.retailmenot.com/ws/mediagroup/55UFEDEZNRFBNNQBRFWXW7M6EY?width=300&height=150",
                "Tuesday & Wednesday Only! Get 30% off menu-price pizzas ordered online or through the app. Available for a limited time at participating locations. Prices may vary. Dollar and Percent off offers are not combinable with other offers.",
                "JULY30","Food","marco pizza","CODE"));
        couponRepository.save(new Coupon("06", "Delivery Or Pick-Up! 25% Off Pizza Orders Online!",
                "https://mediaservice.retailmenot.com/ws/mediagroup/ZKGK6LH3NFGDZPIUB53NJSUBEY?width=300&height=150",
                "Expires 8/31/2020 Get 25% Off Regular Menu-Priced Orders with Papa John's coupon code. Valid at participating locations. No Contact Delivery Available on all orders.",
                "25OFF", "Food", "papa Johns", "CODE"));
        couponRepository.save(new Coupon("07","10% Off Catering Orders of $75+",
                "https://mediaservice.retailmenot.com/ws/mediagroup/YZ4AK4T2FVDALJ2OYG5BETG3GA?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "TENOFF75","Food","subway","CODE"));
        couponRepository.save(new Coupon("08","25% Off Sitewide",
                "https://mediaservice.retailmenot.com/ws/mediagroup/55UFEDEZNRFBNNQBRFWXW7M6EY?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "SAVE25","Food","marco pizza","CODE"));
        couponRepository.save(new Coupon("09","$20 Off Catering Order of $200 Or More",
                "https://mediaservice.retailmenot.com/ws/mediagroup/YZ4AK4T2FVDALJ2OYG5BETG3GA?width=300&height=150",
                "Get $20 Off Catering Order of $200 or more (MUST include sub or wrap platter, giant sub or minimum of 8 Subway to Go box meals) with coupon.",
                "SAVE20","Food","subway","CODE"));

        couponRepository.save(new Coupon("10", "$10 Off Sitewide",
                "https://mediaservice.retailmenot.com/ws/mediagroup/XSC6QDC7RFG4ZLTJM2MBKVK6JI?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "HM47", "Clothing", "H&M",  "CODE"));
        couponRepository.save(new Coupon("11", "60% Off When You Buy 3+ Items",
                "https://mediaservice.retailmenot.com/ws/mediagroup/3BHNQYO5VJBE5CVYLI3OGN4VCQ?width=300&height=150",
                "Best Summer Basics! Get 60% Off when you buy 3+ Items. Selected Items Only.",
                "36SH7", "Clothing", "shein", "CODE"));
        couponRepository.save(new Coupon("12","10% Off First Purchase For UO Rewards Member",
                "https://mediaservice.retailmenot.com/ws/mediagroup/3UDXKKU7BNGD5DWDQYJIGHUPSM?width=300&height=150",
                "Get 10% Off Your First Purchase When you Sign Up As A UO Rewards Member.",
                "URB10","Clothing","urban outfitters","CODE"));
        couponRepository.save(new Coupon("13","Extra 20% Off Apparel",
                "https://mediaservice.retailmenot.com/ws/mediagroup/MT2WJGUJRNGMRPUK6QXE7GERIY?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "FRESH","Clothing","calvin klein","CODE"));
        couponRepository.save(new Coupon("14", "10% Off Your Order",
                "https://mediaservice.retailmenot.com/ws/mediagroup/3BHNQYO5VJBE5CVYLI3OGN4VCQ?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "IzabelaQ1", "Clothing", "shein", "CODE"));

        couponRepository.save(new Coupon("15", "Hotel Booking: 20% Off select hotels",
                "https://www.retailmenot.com/thumbs/logos/l/expedia.com-coupons.jpg?versionId=Pw5Pp_9H1hwCmnJ8iNbi0ru_dJ6Xmr2G",
                "Save 20% on select hotels when you book 60 days in advance. Available at Participating Hotels for select Room types. Minimum Stay may be Required.",
                "EXP20", "Travel", "expedia", "CODE"));
        couponRepository.save(new Coupon("16","C$72 off your first booking",
                "https://www.retailmenot.com/thumbs/logos/l/airbnb.ca-coupons.jpg?versionId=50xTYlIKJhotePx7wLnmmj_3vCza._VR",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "briant8184","Travel","airbnb","CODE"));
        couponRepository.save(new Coupon("17","Up to 20% Off Stays",
                "https://www.retailmenot.com/thumbs/logos/l/booking.com-coupons.jpg?versionId=g1A7nlf8Ls3IR13F2_PZG_Iov3bfIAXi",
                "Getaway Deals: Get Up to 20% Off Stays. Travel between June 1 through August 31st.",
                "book456","Travel","booking.com","CODE"));

        couponRepository.save(new Coupon("18","15% Off For MAC Lover Member When Signed In",
                "https://mediaservice.retailmenot.com/ws/mediagroup/MPM7DW2FT5DFJPKF5Y4ONPUAGM?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "LOVER15","Beauty","mac","CODE"));
        couponRepository.save(new Coupon("19","$5 Cash Back For Online Purchases of $65+ Sitewide",
                "https://mediaservice.retailmenot.com/ws/mediagroup/EBQJ262OS5EDXIAYOJASPL74WQ?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "SEF55","Beauty","sephora","CODE"));
        couponRepository.save(new Coupon("20","Bath And Body Works Coupons And Top Offers",
                "https://mediaservice.retailmenot.com/ws/mediagroup/DTX2ZQNFVVCZTDH7TLKVMBPYZ4?width=300&height=150",
                "Check out the best Bath and Body Works coupons and offers available upto August!",
                "BBW25","Beauty","Bath Body and works","CODE"));
        couponRepository.save(new Coupon("21","Free 2-Day Shipping on $45+",
                "https://mediaservice.retailmenot.com/ws/mediagroup/MPM7DW2FT5DFJPKF5Y4ONPUAGM?width=300&height=150",
                "Tap offer to copy the coupon code. Remember to paste code when you check out. Online only.",
                "MAC","Beauty","mac","CODE"));






    }
}
