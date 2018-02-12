package offline;

/**
 * An interface for user.
 *
 */
public interface UserInterface {

	/**
	 * @return a user's id
	 */
	public String getId();

	/**
	 * Set a user's id
	 * 
	 * @param id
	 */
	public void setId(String id);

	/**
	 * @return a user's rating
	 */
	public Double getValue();

	/**
	 * Set a user's rating
	 * 
	 * @param value
	 */
	public void setValue(Double value);
}
