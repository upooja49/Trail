package day5;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		String[] name = new String[10];
		System.out.println(name.length);
		String[] nameList = Arrays.copyOf(name, 30);
		System.out.println(name.length);

	}

}
