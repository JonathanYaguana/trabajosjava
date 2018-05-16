package torredehanoi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ordenador
 */
public class Torre {

    private List<Integer> discs;

    public Torre() {
        discs = new ArrayList<>();
    }

    public Torre(int length) {
        discs = new ArrayList<>();

        for (int i = length; i > 0; i--) {
            discs.add(i);
        }
    }

    public int size() {
        return discs.size();
    }

    public int getDiscAt(int position) {
        return discs.get(position);
    }

    public boolean isDone(int max) {
        boolean done = false;

        if (discs.size() == max) {
            for (int i = max; i > 0; i--) {
                done = discs.get(i - 1) == i;
                if (!done) {
                    break;
                }
            }
        }

        return done;
    }

    public boolean isEmpty() {
        return discs.isEmpty();
    }

    public void add(int value) {
        discs.add(value);
    }

    public int last() {
        return discs.get(discs.size() - 1);
    }

    public void refresh() {
        discs.remove(discs.size() - 1);
    }
}
