package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExplanationOfStream {

    /**
     * @param names
     * @return This method will give names where characters are less than 10 characters
     */
    public List<String> getNamesLessThan10Characters(List<String> names) {
        Stream<String> streamName = names.stream();
        List<String> namesLessThan10Characters = streamName.filter(name -> name.length() < 10).collect(Collectors.toList());
        return namesLessThan10Characters;
    }

    /**
     * @param names
     * @return This method converts names to upper case, use of map
     */
    public List<String> convertToUpperCase(List<String> names) {
        return names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    }

    /**
     * @param names
     * @return this method gives the count of names which are less than 8 characters
     */
    public long getCountOfNamesLessThan8Characters(List<String> names) {
        return names.stream().filter(name -> name.length() < 8).count();
    }
}
