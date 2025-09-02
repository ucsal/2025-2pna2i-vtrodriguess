package br.com.mariojp.solid.isp;

public class OfficeService {
	private final IPrinter printer;

	public OfficeService(IPrinter printer) {
		this.printer = printer;
	}

	public void printReport(String content) {
		printer.print(content);
	}
}
