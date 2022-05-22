package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExample<T>{
    private List<T> unknownTypeList;

    public ForEachExample(List<T> unknownTypeList) {
        this.unknownTypeList = unknownTypeList;
    }

    public List<T> getMyList() {
        List<T> unknownList = new ArrayList<>();
        unknownTypeList.forEach( x -> unknownList.add(x));
        // This can also be done like this
        // unknownTypeList.forEach(unknownList::add);
        return unknownList;
    }

    public List<T> getOrderedList() {
        List<T> unknownList = new ArrayList<>();
        unknownTypeList.stream().forEachOrdered(unknownList::add);
        return unknownList;
    }

}
