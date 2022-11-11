package DZ_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    static List<List<Integer>> allCombo;
    static String inExpr = "2? + 5? = 79";
    static Character[] charExpr;
    static List<Integer> quest;
    static StringBuilder sb;

    public static void main(String[] args) {
        allCombo = new ArrayList<>();
        String repExpr = inExpr.replace(" ", "");
        charExpr = new Character[repExpr.length()];
        quest = new ArrayList<>();

        for (int i = 0; i < repExpr.length(); i++) {
            charExpr[i] = repExpr.charAt(i);
            if (charExpr[i] == '?') quest.add(i);
        }
        helper(0, new ArrayList<>(), 9, quest.size());
    }

    private static void helper(int prev, List<Integer> combo, int n, int k) {
        if (combo.size() == k) {
            allCombo.add(new ArrayList<>(combo));
            isEqual(combo);
            return;
        }

        for (int i = 0; i <= n; i++) {
            combo.add(i);
            helper(i, combo, n, k);
            combo.remove(combo.size() - 1);
        }
    }

    private static void isEqual(List<Integer> combo) {
        for (int i = 0; i < combo.size(); i++) {
            charExpr[quest.get(i)] = Character.forDigit(combo.get(i), 10);
        }
        sb = new StringBuilder();
        for (Character character : charExpr) sb.append(character);
        String[] newStr = sb.toString().replace('+', '=').split("=");

        if (Integer.parseInt(newStr[0]) + Integer.parseInt(newStr[1]) == Integer.parseInt(newStr[2])) {
            System.out.println(sb + " " + "Верно");
        }
    }
}
