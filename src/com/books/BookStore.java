package com.books;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookStore {
    ArrayList<Books> list = new ArrayList<>();
    Scanner sc;

    public void addBooks() {
        list.add(new Books("The big sleep", "Raymond chandler", "Crime", 100));
        list.add(new Books("In the woods", "Tana french", "Crime", 110));
        list.add(new Books("Killing floor", "Lee child", "Crime", 149));
        list.add(new Books("Altered Carben", "Jo Mesbo", "Crime", 199));
        list.add(new Books("One by one", "Ruth ware", "Crime", 156));
        list.add(new Books("The neon rain", "Lee burke", "Crime", 300));
        list.add(new Books("Eranken Stein", "Mary shelley", "Horror", 153));
        list.add(new Books("Gothic tales", "Elizabeth", "Horror", 140));
        list.add(new Books("Carmilla", "Sheridan", "Horror", 160));
        list.add(new Books("I am legend", "Richard math", "Horror", 200));
        list.add(new Books("Psycho", "Robert bloch", "Horror", 222));
        list.add(new Books("The shining", "Stephen king", "Horror", 158));
        list.add(new Books("The Rumi", "Kabir helminski", "Poetry", 225));
        list.add(new Books("On love & barky", "Lucien stark", "Poetry", 186));
        list.add(new Books("The divine", "Dante alighieri", "Poetry", 311));
        list.add(new Books("Leavese of grass", "Walt whitnan", "Poetry", 329));
        list.add(new Books("The signal man", "Charles", "Short stories", 255));
        list.add(new Books("The happy princes", "Ascar wilde", "Short stories", 140));
        list.add(new Books("The magic shop", "H.G.wells", "Short stories", 120));
        list.add(new Books("The gift of maggi", "O.Henry", "Short stories", 250));
        list.add(new Books("Mohy dick", "Oliver twist", "Classics", 350));
        list.add(new Books("Oliver Twist", "Charies dickens", "Classics", 256));
        list.add(new Books("Black beauty", "Anna sewell", "Classics", 270));
        list.add(new Books("Jungle book", "Rudyard kipling", "Classics", 356));
        list.add(new Books("Robinson crusoe", "Daniel defoe", "Classics", 150));

        System.out.println("--------------------------------------");
        Iterator<Books> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("--------------------------------------");
    }

    public void searchBook() {
        sc = new Scanner(System.in);
        System.out.println("Enter Book name to search Book:- ");
        String name = sc.next();
        System.out.println("-----------------------------------");
        List<Books> searchName = list.stream()
                .filter(p -> p.getName().startsWith(name))
                .collect(Collectors.toList());
        System.out.println(searchName);
        System.out.println("------------------------------------");
    }

    public void searchAuthor() {
        sc = new Scanner(System.in);
        System.out.println("Enter Author name to search Book:- ");
        String authorName = sc.next();
        System.out.println("-----------------------------------");
        List<Books> searchAuthor = list.stream()
                .filter(p -> p.getAuthor().startsWith(authorName))
                .collect(Collectors.toList());
        System.out.println(searchAuthor);
        System.out.println("------------------------------------");
    }

    public void searchBookType() {
        System.out.println("---------------------------------------");
        System.out.println("List of Crime books :- ");
        list.stream().filter(b -> b.getBookType() == "Crime").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of Horror books :- ");
        list.stream().filter(b -> b.getBookType() == "Horror").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of Poetry books :- ");
        list.stream().filter(b -> b.getBookType() == "Poetry").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of Short story books :- ");
        list.stream().filter(b -> b.getBookType() == "Short stories").forEach(System.out::println);
        System.out.println("---------------------------------------");
        System.out.println("List of Classics books :- ");
        list.stream().filter(b -> b.getBookType() == "Classics").forEach(System.out::println);
        System.out.println("---------------------------------------");
    }

    public void searchPrice() {
        System.out.println("-----------------------------------");
        System.out.println("Books in the range of 100-200 are: ");
        list.stream().filter(books -> books.getPrice() < 200).forEach(System.out::println);
        System.out.println("------------------------------------");
        System.out.println("Books in the range of 200-300 are: ");
        list.stream().filter(books -> books.getPrice() < 300).forEach(System.out::println);
        System.out.println("------------------------------------");
        System.out.println("Books in the range of 300-400 are: ");
        list.stream().filter(books -> books.getPrice() < 400).forEach(System.out::println);
        System.out.println("------------------------------------");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStore bs = new BookStore();
        int choice = 0;
        while (choice != 6) {
            System.out.println(" 1-Add Books\n 2-Search Books\n 3-Search By Author\n 4-Book types\n 5-Price Range\n 6-Exit\nPlease Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bs.addBooks();
                    break;
                case 2:
                    bs.searchBook();
                    break;
                case 3:
                    bs.searchAuthor();
                    break;
                case 4:
                    bs.searchBookType();
                    break;
                case 5:
                    bs.searchPrice();
                    break;
                case 6:
                    break;
            }
        }

    }
}
