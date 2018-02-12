package yelp;

/**
 * An interface for the Yelp API. Designed with Facade.
 *
 */
public interface YelpInterface {

	/**
	 * @param lat
	 * @param lon
	 * @return a request to the Search API by term and location
	 */
	public String searchForBusinessesByLocation(double lat, double lon);

}
