package com.innerbean.pojo;

public class Blog {
	private Gallery gallery;
	private String title;
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

	
	public void displayGalleryInBlog(){
		gallery.displayGallery();
	}
	
	
}
