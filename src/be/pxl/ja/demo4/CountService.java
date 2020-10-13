package be.pxl.ja.demo4;

public class CountService implements Service<Integer, String> {

	@Override
	public Integer execute(String arg) {
		return arg.length();
	}
}
