package com.myFacebook.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.stereotype.Service;

@Service
public class FacebookServiceImpl implements FacebookService{

	private String accessToken;
	
	@Value
	private String facebookAppId;
	
	
	private String facebookSecret;
	
	
	

	private FacebookConnectionFactory createConnection() {
		return new FacebookConnectionFactory(facebookAppId, facebookSecret);
	
	
	@Override
	public String genarateFacebookAuthorizeUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateFacebookAccessToken(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PagedList<Post> getUserFeed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUserData() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
