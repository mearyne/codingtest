package programmers.level1;

// https://school.programmers.co.kr/learn/courses/30/lessons/2501252
public class _2501252 {
    public static void main(String[] args) {

    }

    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        for (int i = 0; i < 4; i++) { // 상하좌우 체크

            if (i == 0 && h + 1 != board.length && board[h + 1][w].equals(board[h][w])) { // 1. 하(h+1)
                answer++;

            } else if (i == 1 && w + 1 != board.length && board[h][w + 1].equals(board[h][w])) { // 2. 우(w+1)
                answer++;

            } else if (i == 2 && h - 1 != -1 && board[h - 1][w].equals(board[h][w])) { // 3. 상(h-1)
                answer++;

            } else if (i == 3 && w - 1 != -1 && board[h][w - 1].equals(board[h][w])) { // 4. 좌(w-1)
                answer++;
            }

            System.out.println("---");
            System.out.println("board[h][w] : " + board[h][w]);
            System.out.println("i : " + i);
            System.out.println("answer : " + answer);
            System.out.println("---");
        }

        return answer;

    }
}
