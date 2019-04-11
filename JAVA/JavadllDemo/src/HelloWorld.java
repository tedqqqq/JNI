/**
 * 主要就是生成Java与C/C++之间进行通信的约定接口
 * */
public class HelloWorld {
	
	static {
		System.loadLibrary("HelloWorld");
	}
	
	public HelloWorld() {
	}
	
	public native int init(int lPort);
	
	public native void print(String str);
	
}
