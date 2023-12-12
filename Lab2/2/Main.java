import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();

        SortProcess.process(new Merge_sort());
        SortProcess.process(new Insertion_sort());
        SortProcess.process(new Selection_sort());
    }
}