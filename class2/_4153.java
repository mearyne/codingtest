package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class _4153 {
    public static void main(String[] args) throws IOException {
        // 0. 출력 받기
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] array = input.split(" ");

            if (input.equals("0 0 0")) {
                return;
            }

            // 1. min, middle, max 구하기
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int middle = 0;

            for (int i = 0; i < array.length; i++) {
                if (Integer.parseInt(array[i]) > max) {
                    max = Integer.parseInt(array[i]);
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (Integer.parseInt(array[i]) < min) {
                    min = Integer.parseInt(array[i]);
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (Integer.parseInt(array[i]) < max && Integer.parseInt(array[i]) > min) {
                    middle = Integer.parseInt(array[i]);
                }
            }

            // 2. 직각삼각형 여부 체크 후 right, wrong 출력하기
            if ((Math.pow(min, 2) + Math.pow(middle, 2)) == Math.pow(max, 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }


    }
}
