package gc;

public class GCTest1 {
	
	private static final int _1MB = 1024*1024;
	
	/**
	 * VM参数：-verbose：gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 *  -XX:MaxTenuringThreshold=1 -XX:PretenureSizeThreshold=5242880
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte[] allocation1, allocation2, allocation3;
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		allocation1 = new byte[_1MB/4];
		
		//什么时间进老年代取决于MaxTenuringThreshold设置
		allocation2 = new byte[4*_1MB];
		allocation3 = new byte[4*_1MB];
		allocation3 = null;
		allocation3 = new byte[4*_1MB];
		allocation3 = new byte[4*_1MB];
		allocation3 = new byte[4*_1MB];
	}

}
