package arraysTestear;

public class ArrayUtil {
	
    public String inReverse(int[] values) {
        String message = "";
        for (int i = values.length - 1; i >= 0; i--) {
            message += values[i];
        }
        return message;
    }
	
//	public String inReverse2(int[] values) {
//		String message = "";
//		for (int elto : values) {
//			message = elto + " " + message;
//		}
//		return message;
//	}
}

