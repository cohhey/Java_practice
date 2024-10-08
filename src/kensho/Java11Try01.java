package kensho;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class Java11Try01 {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = List.of("a","b","c","d");

		//ラムダ式でのvarを用いた型推論
		System.out.println(list.stream().map((var s) -> s.toUpperCase()).collect(Collectors.toList()));
		//でもvarいらんやろ
		System.out.println(list.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList()));

		//この場合は必要。anotationを使用する場合
//		System.out.println(list.stream().map((@Notnull var s) -> s.toUpperCase()).collect(Collectors.toList()));

		//型考えるときに面倒な時に使用しよう。lombokみたいな感じ

//		HTTP 2に対応
//		WebSocket通信（＝軽量な双方向通信）に対応
//		非同期メソッドを提供
		HttpClient cli = HttpClient.newBuilder()
				.version(HttpClient.Version.HTTP_2)
				.build();
		// ②HttpRequestを生成
		HttpRequest req = HttpRequest.newBuilder()
				.uri(URI.create("https://www.google.com//"))
				.build();
				// ③リクエストを送信
				cli.sendAsync(req, HttpResponse.BodyHandlers.ofString())
				.thenAccept(res -> {
				System.out.println(res.body());
				});

				Thread.sleep(3000);



		}
}
