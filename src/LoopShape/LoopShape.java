package LoopShape;

public class LoopShape {

	static void createRectangle(int width, int height) {
		// Draw a Rectangle
		for (int i = 0; i < width; i++) {
			System.out.print('#');

		}
		System.out.println();
		for (int j = 0; j < width - 2; j++) {
			System.out.print("#");
			for (int i = 0; i < width - 2; i++) {
				System.out.print(" ");
			}
			if (width > 1) {
				System.out.println("#");
			} else {
				System.out.println();
			}
		}
		if (height > 1) {
			for (int j = 0; j < width; j++) {
				System.out.print('#');

			}
			System.out.println();
		}

	}

	static void createTriangle(int leg) {
		// Draw an Isosceles Right Triangle
		int l = 1;

		// if line is 1
		if (l == 1)
		// print one symbol
		{
			System.out.print("#");
		}

		// else if line<leg

		else if (l < leg) {
			// print one symbol
			System.out.print("#");
		}
		// loop line-2 times
		// print space
		// print one symbol and newline
		// else
		// loop leg times\
		// print symbol

		

		
	}
}