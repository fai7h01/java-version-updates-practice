package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class TraderTest {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        System.out.println("Find all transactions in the year 2011 and sort them by value(small to high)");
        transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


        System.out.println("What are all the unique cities where the traders work?");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Find all traders from Cambridge and sort them by name.");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("Return a string of all traders’ names sorted alphabetically");
        String names = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(names);

        System.out.println("Are any traders based in Milan?");
        boolean anyMilan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(anyMilan);

        System.out.println("Print the values of all transactions from the traders living in Cambridge");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("What is the highest value of all the transactions?");
        //1
        int max1 = transactions.stream()
                .max(comparing(Transaction::getValue))
                .map(Transaction::getValue).get();
        System.out.println(max1);
        //2
        int max2 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max).get();
        System.out.println(max2);

        System.out.println("Find the transaction with the smallest value.");
        //1
        int min1 = transactions.stream()
                .min(comparing(Transaction::getValue))
                .map(Transaction::getValue).get();
        System.out.println(min1);
        //2
        int min2 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min).get();
        System.out.println(min2);
    }
}
