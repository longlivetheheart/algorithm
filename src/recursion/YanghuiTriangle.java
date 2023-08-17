package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author joe
 * @date 2023/8/17 16:11
 * @description
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        System.out.println(genYHTriangle(10));
    }
    public static List<List<Integer>> genYHTriangle(int rows) {
        List<List<Integer>> res = new ArrayList<>();
        if (rows == 0) {
            return res;
        }
        if (rows == 1) {
            res.add(new ArrayList<>(Collections.singletonList(1)));
            return res;
        }
        res = genYHTriangle(rows - 1);
        List<Integer> preRow = res.get(res.size() - 1);
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        for (int i = 1; i < preRow.size(); i++) {
            newRow.add(preRow.get(i - 1) + preRow.get(i));
        }
        newRow.add(1);
        res.add(newRow);
        return res;
    }
}
