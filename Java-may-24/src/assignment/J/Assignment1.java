package assignment.J;

public class Assignment1 {

	// 23gdhgty45hjh67hjnb--89--ghfgd)
	/**
	 * it will filter the numbers and make sum if there are numeric 0 present then
	 * result 0 if string length is 0 then return 0
	 * 
	 * @param alphanumaric
	 * @return
	 */
	public static int filterthenumbersandmakethesum(String alphanumaricstring) {
		if (alphanumaricstring.length() == 0) {
			return 0;
		} else {
			int result = 0;
			if (alphanumaricstring.replaceAll("[0-9]", "").length() > 0) {
				for (char eachchar : alphanumaricstring.replaceAll("[^0-9]", "").toCharArray()) {
					result = result + eachchar -'0' ;
				}
				return result;
			} else {
				return result;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(filterthenumbersandmakethesum("23gdh1gty45hjh67hjnb--89-ghfgd"));
	}
}
