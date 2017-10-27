package com.ReviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


@Component
public class ReviewRepository {
	
	protected Map<Long, Review> reviews = new HashMap<Long, Review>();
	
	public ReviewRepository() {
		
		Review guitarWolf = new Review (1111L, "Guitar Wolf", "/images/guitarwolf.jpg", "Japanese Punk Rock", "Guitar Wolf is a Japanese garage rock power trio founded in Nagasaki in 1987. The band is known for songs with piercing vocals and an extremely loud style of noise-influenced punk which emphasizes heavy distortion and feedback. ");
		Review teengenerate = new Review (2222L, "Teengenerate", "/images/teengenerate.jpg", "Japanese Punk Rock", "Teengenerate were a Japanese punk rock band from 1993 to 1996, known for their fun style of playing garage punk with a sense of humor and often incomprehensible English lyrics.");
		Review five678s = new Review (3333L, "The 5,6,7,8's", "/images/5678s.jpg", "Japanese Punk Rock", "The 5.6.7.8's are a Japanese rock trio, whose music is reminiscent of American surf music, rockabilly and garage rock. They frequently cover songs from American rock and roll. All members are from Tokyo, Japan.");

		reviews.put(guitarWolf.getId(), guitarWolf);
		reviews.put(teengenerate.getId(), teengenerate);
		reviews.put(five678s.getId(), five678s);
	}
	
	public Collection <Review> findAll() {
		return reviews.values();
	}
	
	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
