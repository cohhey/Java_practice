package kensho;

public class Java15Try01 {
	public static void main(String[] args) {

		//テキストブロック
		var a = """
				Hello, %s,
				This is an article
				that introduces new features of the "modern" Java platform.
				""".formatted("mexess");
		System.out.println(a);

	}
}
