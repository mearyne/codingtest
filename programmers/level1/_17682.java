package programmers.level1;

import java.util.*;

class _17682 {
    public static void main(String[] args) {

    }
    public int solution(String dartResult) {
        int[] scores = {0,0,0};
        int[] idxs = {0, 0, 0};
        int cnt = 0;

        for (int i=0; i<dartResult.length()-1; i++) {
            if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                idxs[cnt] = i;

                if (dartResult.charAt(i+1)=='0') { // 10인 경우
                    scores[cnt] = 10;
                    i += 1;
                } else {
                    scores[cnt] =  dartResult.charAt(i) - 48; // 0~9인 경우
                }
                cnt++;
            }
        }

        System.out.println(Arrays.toString(idxs));
        System.out.println(Arrays.toString(scores));


        for (int i=idxs[0]; i<idxs[1]; i++) {
            if (dartResult.charAt(i)=='D') {
                scores[0] = scores[0] * scores[0];
            } else if (dartResult.charAt(i)=='T') {
                scores[0] = scores[0] * scores[0] * scores[0];
            } else if (dartResult.charAt(i)=='*') {
                scores[0] *= 2;
            } else if (dartResult.charAt(i)=='#') {
                scores[0] *= -1;
            }
        }

        for (int i=idxs[1]; i<idxs[2]; i++) {
            if (dartResult.charAt(i)=='D') {
                scores[1] = scores[1] * scores[1];
            } else if (dartResult.charAt(i)=='T') {
                scores[1] = scores[1] * scores[1] * scores[1];
            } else if (dartResult.charAt(i)=='*') {
                scores[1] *= 2;
                scores[0] *= 2;
            } else if (dartResult.charAt(i)=='#') {
                scores[1] *= -1;
            }
        }

        for (int i=idxs[2]; i<dartResult.length(); i++) {
            if (dartResult.charAt(i)=='D') {
                scores[2] = scores[2] * scores[2];
            } else if (dartResult.charAt(i)=='T') {
                scores[2] = scores[2] * scores[2] * scores[2];
            } else if (dartResult.charAt(i)=='*') {
                scores[2] *= 2;
                scores[1] *= 2;
            } else if (dartResult.charAt(i)=='#') {
                scores[2] *= -1;
            }
        }
        System.out.println(Arrays.toString(scores));


        return scores[0] + scores[1] + scores[2];
    }
}