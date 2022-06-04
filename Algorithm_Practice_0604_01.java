import java.util.ArrayList;
import java.util.List;
        public class Solution {
    public int[] solution(int[] answers) {
        final int[] student1 = {1, 2, 3, 4, 5};
        final int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int studentAnswer1 = 0;
        int studentAnswer2 = 0;
        int studentAnswer3 = 0;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                studentAnswer1++;
            }
            if (answers[i] == student2[i % student2.length]) {
                studentAnswer2++;
            }
            if (answers[i] == student3[i % student3.length]) {
                studentAnswer3++;
            }
        }

        int topScore = Math.max(studentAnswer1, Math.max(studentAnswer2, studentAnswer3));

        if (topScore == studentAnswer1) {
            result.add(1);
        }
        if (topScore == studentAnswer2) {
            result.add(2);
        }
        if (topScore == studentAnswer3) {
            result.add(3);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
