package com.ReviewSite;

public class Review {

	protected long id;
	private String title;
	private String image;
	private String category;
	private String content;

	public Review(long id, String title, String image, String category, String content) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.category = category;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}
