package br.com.mariojp.solid.isp;

public class SimplePrinter implements IPrinter {
	@Override
	public void print(String content) {
		System.out.println(content);
	}

}
