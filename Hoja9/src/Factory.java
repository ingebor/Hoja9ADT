/**
 * @author Ingebor Rubio
 *
 */
public class Factory {

	public iMap getType(int option) {
		if(option==1) {
			return new HashMap();
		}
		else
			return null;
	}
}
