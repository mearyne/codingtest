package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class _82612 {
    public static void main(String[] args) {

    }

    public long solution(int price, int money, int count) {
        long answer = (long) money;

        while (count>=1) {
            answer-=(long)(price*count);
            count-=1;
        }

        if (answer<0) {
            return answer*=(-1);
        } else {
            return 0;
        }
    }
}
