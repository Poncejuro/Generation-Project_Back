package com.Facetify.entity.limits;

public interface ProfileFieldLimits {
	int ROLE_MIN_LENGTH = 10;
	int ROLE_MAX_LENGTH = 45;
	int ROLE_DB_LENGTH = 45;
	
	int BIOGRAPHY_MIN_LENGTH = 10;
	int BIOGRAPHY_MAX_LENGTH = 200;
	int BIOGRAPHY_DB_LENGTH = 200;

	int PHOTO_MIN_LENGTH = 0;
	int PHOTO_MAX_LENGTH = 150;
	int PHOTO_DB_LENGTH = 150;
	
}
