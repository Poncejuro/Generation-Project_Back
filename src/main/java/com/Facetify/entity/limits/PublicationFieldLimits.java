package com.Facetify.entity.limits;

public interface PublicationFieldLimits {
	int TITLE_MIN_LENGTH = 15;
	int TITLE_MAX_LENGTH = 100;
	int TITLE_DB_LENGTH = 100;

	int FOOTER_MIN_LENGTH = 15;
	int FOOTER_MAX_LENGTH = 100;
	int FOOTER_DB_LENGTH = 100;

	int IMG_MIN_LENGTH = 0;
	int IMG_MAX_LENGTH = 150;
	int IMG_DB_LENGTH = 150;

	int EVENTDETAILS_MIN_LENGTH = 50;
	int EVENTDETAILS_MAX_LENGTH = 400;
	int EVENTDETAILS_DB_LENGTH = 400;

}
