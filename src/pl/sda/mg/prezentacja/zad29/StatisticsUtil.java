package pl.sda.mg.prezentacja.zad29;

import java.util.List;
import java.util.function.Predicate;

public class StatisticsUtil {

    public static <T> double partOf(List<T> elements, Predicate<T> conditionPredicate) {
        if (elements == null || elements.isEmpty()) {
            return 0;
        }

        long count = elements.stream()
                .filter(conditionPredicate)
                .count();

        return (double)count / (double)elements.size() * 100;
    }
}
