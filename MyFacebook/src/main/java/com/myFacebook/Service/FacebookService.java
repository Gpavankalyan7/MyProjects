package com.myFacebook.Service;

import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;

public interface FacebookService {


	public String genarateFacebookAuthorizeUrl();

	public void generateFacebookAccessToken(String code);

	public PagedList<Post> getUserFeed();
	
	public String getUserData();

	
}
