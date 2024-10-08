package kensho;

public class Java14Try01 {
	public static void main(String[] args) throws InterruptedException {

		//従来
		var day = "MONDAY";
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			System.out.println("(´Д｀)");
			break;
		case "FRIDAY":
			System.out.println("ヽ(･∀･)ﾉ");
			break;
			case "SATURDAY":
			case "SUNDAY":
					System.out.println("ヽ(*´∀｀)ﾉ");
					break;
			default:
					System.out.println("(-_-)");
					break;
		}

		// 14以降
		day="FRIDAY";
		switch(day) {
		case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY":
			System.out.println("(´Д｀)");
			break;
		case "FRIDAY":
			System.out.println("ヽ(･∀･)ﾉ");
			break;
			case "SATURDAY":
			case "SUNDAY":
				System.out.println("ヽ(*´∀｀)ﾉ");
				break;
			default:
				System.out.println("(-_-)");
				break;
		}

		//アロー演算子が使用可能
		day = "SATURDAY";
		switch(day) {
	    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY"
	        -> System.out.println("(´Д｀)");
	    case "FRIDAY"
	        -> System.out.println("ヽ(･∀･)ﾉ");
	    case "SATURDAY", "SUNDAY"
	        -> System.out.println("ヽ(*´∀｀)ﾉ");
	    default
	        -> System.out.println("(-_-)");
		}
		//式として使用可能
		String emotion = switch(day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY"
			-> "(´Д｀)";
		case "FRIDAY"
			-> "ヽ(･∀･)ﾉ";
		case "SATURDAY", "SUNDAY"
			-> "ヽ(*´∀｀)ﾉ";
		default
			-> "(-_-)";
		};
		System.out.println(emotion);
	}
}
