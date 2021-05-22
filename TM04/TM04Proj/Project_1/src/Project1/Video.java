package Project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Video {

	String videoName;
	boolean checkout;
	int rating;

	Video(String name){
	videoName=name;
	}

	String getName()
	{
		return videoName;
	}
	void doCheckout()
	{
		checkout=true;
	}
	void doReturn()
	{
		checkout=false;
	}
	void recieveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return rating;
	}
	boolean getCheckout()
	{
		return checkout;
	}

}
