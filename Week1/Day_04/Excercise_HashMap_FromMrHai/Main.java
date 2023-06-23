package Day_04.Excercise_HashMap_FromMrHai;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Election elec = new Election();
        elec.vote("Obama");
        elec.vote("Obama");
        elec.vote("Obama");

        elec.vote("Abraham Lincon");

        elec.winner();

        // candidates.put("Obama", 1);
        // candidates.put("Abraham Lincon", 2);
        // candidates.put("Abraham Lincon", 3);
    }

    // Methods
    // 4. Tạo class Election (cuộc bầu cử), cung cấp 2 method là vote và winner, mô
    // tả bài toán được thể hiện bên dưới:
    public static class Election {
        HashMap<String, Integer> candidates = new HashMap<>();

        // vote method
        public void vote(String candidate) {

            int vote = 1;
            // check candidate has already in candidates arr?
            if (candidates.containsKey(candidate)) {
                // TH1: if candidate has been in candidates arr ==> (value) vote + 1
                Integer votes = candidates.get(candidate);

                candidates.put(candidate, votes + 1);
                // System.out.println("Votes" + votes);

            } else {
                candidates.put(candidate, vote);
            }

            System.out.println("candidates: " + candidates);
            // Thiếu Collection.MAx ==> lấy value lớn nhất

        }

        // winner method
        public String winner() {
            String winner = "";
            Integer votes_number = 0;

            for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
                String candidateName = entry.getKey();
                Integer votes = entry.getValue();

                if (votes > votes_number) {
                    votes_number = votes;
                    winner = candidateName;
                    System.out.println("winner: " + candidateName + " - " + votes);
                }

            }

            return winner;
        }

    }

}
