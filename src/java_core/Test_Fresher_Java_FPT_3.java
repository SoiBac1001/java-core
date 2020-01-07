package java_core;

public class Test_Fresher_Java_FPT_3 {
	boolean[] b = new boolean[3];
	int count = 0;

	void set(boolean[] x, int i) {
		x[i] = true;
		++count;
	}

	public static void main(String[] args) {
		Integer i = 1;
		System.out.println(++i + i++ + ++i); // 8
		System.out.println("==============");
		
		for (i = 0; i <= 5; ++i) {
			if (i % 2 == 0)
				continue;
			System.out.println("This is a " + i + " iteration"); // 3 lần hiện
		}
		System.out.println("==============");
		
		String s = "null";
		if (s == null) {
			System.out.println("hihi");
		} else if (s.length() == 0) {
			System.out.println("ok");
		} else {
			System.out.println("M-TP");
		}
		System.out.println("==============");

		Test_Fresher_Java_FPT_3 ba = new Test_Fresher_Java_FPT_3();
		ba.set(ba.b, 0);
		ba.set(ba.b, 2);
		ba.test();
		Float f = new Float("12");
		System.out.println(f - 5); // 7
		/*
		 * switch (f) // k thể swich với giá trị float { case 12:
		 * System.out.println("Twelve"); case 0: System.out.println("Zero"); default:
		 * System.out.println("Default"); }
		 */
	}

	void test() {
		if (b[0] && b[1] | b[2])
			count++;
		if (b[1] && b[(++count - 2)])
			count += 7;
		System.out.println("count = " + count);
	}
}