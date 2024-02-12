package Lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record ListComparator(ArrayList<Integer> list1,
                             ArrayList<Integer> list2) {
    public ListComparator {
        if (Objects.isNull(list1)) {
            throw new IllegalArgumentException("list1 is null");
        }
        if (Objects.isNull(list2)) {
            throw new IllegalArgumentException("list2 is null");
        }
        if (list1.isEmpty()) {
            throw new IllegalArgumentException("list1 is empty");
        }
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("list2 is empty");
        }
    }

    private static double getListAvg(final List<Integer> list) {
        return list.stream().mapToInt((e) -> e).average().orElse(0);
    }

    public double getList1Avg() {
        return getListAvg(this.list1);
    }

    public double getList2Avg() {
        return getListAvg(this.list2);
    }

    public int getBiggerListIndex() {
        if (this.list1.isEmpty() || this.list2.isEmpty()) {
            return -1;
        }
        else {
            double avg1 = getList1Avg();
            double avg2 = getList2Avg();
            if (avg1 > avg2) {
                return 1;
            } else if (avg1 < avg2) {
                return 2;
            } else {
                return 0;
            }
        }
    }

    public String getBiggerListMessage() {
        int response = this.getBiggerListIndex();
        return switch (response) {
            case -1 -> "Один или оба списка пустые";
            case 0 -> "Средние значения равны";
            case 1 -> "Первый список имеет большее среднее значение";
            case 2 -> "Второй список имеет большее среднее значение";
            default ->
                    throw new ArithmeticException(
                            String.format("getBiggerListMessage()"
                                    + "returned illegal value %d",
                                    response));
        };
    }
}
