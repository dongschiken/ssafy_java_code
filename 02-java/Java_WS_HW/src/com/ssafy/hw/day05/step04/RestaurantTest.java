package com.ssafy.hw.day05.step04;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setResId(100407);
		restaurant1.setName("SSAFY");
		restaurant1.setAddress("대전시 봉명동");
		restaurant1.setSignatureMenu("JAVA");
		restaurant1.setRate(5);
		
		
		Restaurant restaurant2 = new Restaurant(100408, "SWMA", "서울시 강남구", "C", 4);
		
		RestaurantManager restaurantManager = new RestaurantManager();
		restaurantManager.addRestaurant(restaurant1);
		restaurantManager.addRestaurant(restaurant2);
		
		
		Review review1 = new Review();
		review1.setReviewId(1000);
		review1.setResId(100407);
		review1.setWriter("이동영");
		review1.setContent("SSAFY 좋아요");
		
		Review review2 = new Review(1001, 100408 , "이동영", "소마 별로임");
		
		restaurantManager.addReview(review1);
		restaurantManager.addReview(review2);
		
		System.out.println(restaurantManager.getRestaurant(100407));
		System.out.println(restaurantManager.getRestaurant(100408));
		System.out.println(restaurantManager.getReviews()[0]);
		System.out.println(restaurantManager.getReviews()[1]);
		System.out.println(restaurantManager.removeReview(1001));
		System.out.println(restaurantManager.removeRestaurant(100407));
		System.out.println(restaurantManager.getRestaurantList()[0]);
		//System.out.println(restaurantManager.getRestaurantList()[1]); // 삭제된 레스토랑
		System.out.println(restaurantManager.getReviews()[0]);
		//System.out.println(restaurantManager.getReviews()[1]); // 삭제된 리뷰
	}
}
