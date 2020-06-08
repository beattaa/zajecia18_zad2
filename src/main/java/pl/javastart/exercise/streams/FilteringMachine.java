package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {

        return numberList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {

        return numberList.stream()
                .filter(n -> n >= 20)
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {

        return titles.stream()
                .map(title -> new Book(title))
                .collect(Collectors.toList());
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {

        return titles.stream()
                .map(title -> new Book(title))
                .filter(book -> book.getTitle().startsWith("Gra"))
                .collect(Collectors.toList());
    }
}
