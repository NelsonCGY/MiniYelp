package model;

import org.json.JSONObject;

/**
 * An interface for the restaurant.
 *
 */
public interface RestaurantInterface {

	/**
	 * render the JSONObject to the front end
	 */
	public JSONObject toJSONObject();

	/**
	 * @return the restaurant's id
	 */
	public String getBusinessId();

	/**
	 * set restaurant's id
	 * 
	 * @param businessId
	 */
	public void setBusinessId(String businessId);

	/**
	 * @return the restaurant's name
	 */
	public String getName();

	/**
	 * set restaurant's name
	 * 
	 * @param name
	 */
	public void setName(String name);

	/**
	 * @return the restaurant's category
	 */
	public String getCategories();

	/**
	 * set restaurant's category
	 * 
	 * @param categories
	 */
	public void setCategories(String categories);

	/**
	 * @return the restaurant's city
	 */
	public String getCity();

	/**
	 * set restaurant's city
	 * 
	 * @param city
	 */
	public void setCity(String city);

	/**
	 * @return the restaurant's state
	 */
	public String getState();

	/**
	 * set restaurant's state
	 * 
	 * @param state
	 */
	public void setState(String state);

	/**
	 * @return the restaurant's address
	 */
	public String getFullAddress();

	/**
	 * set restaurant's address
	 * 
	 * @param fullAddress
	 */
	public void setFullAddress(String fullAddress);

	/**
	 * @return the restaurant's stars
	 */
	public double getStars();

	/**
	 * set restaurant's stars
	 * 
	 * @param stars
	 */
	public void setStars(double stars);

	/**
	 * @return the restaurant's latitude
	 */
	public double getLatitude();

	/**
	 * set restaurant's latitude
	 * 
	 * @param latitude
	 */
	public void setLatitude(double latitude);

	/**
	 * @return the restaurant's longitude
	 */
	public double getLongitude();

	/**
	 * set restaurant's longitude
	 * 
	 * @param longitude
	 */
	public void setLongitude(double longitude);

	/**
	 * @return the restaurant's image
	 */
	public String getImageUrl();

	/**
	 * set restaurant's image
	 * 
	 * @param imageUrl
	 */
	public void setImageUrl(String imageUrl);

	/**
	 * @return the restaurant's page
	 */
	public String getUrl();

	/**
	 * set restaurant's page
	 * 
	 * @param url
	 */
	public void setUrl(String url);
}
