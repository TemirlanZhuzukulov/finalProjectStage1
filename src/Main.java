import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        Book book1=new Book(1010L,"Jamilia", Genre.ROMANCE,new BigDecimal(2000),
                "Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.ofYearDay(2005,2));
        Book book2=new Book(1010L,"The White Ship by", Genre.ROMANCE,new BigDecimal(4000),
                "Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.ofYearDay(2003,2));
        Book book3=new Book(1010L,"Reach man and Poor man", Genre.ROMANCE,new BigDecimal(2000),
                "Robert ", Language.RUSSIAN, LocalDate.ofYearDay(2020,2));
        Book book4=new Book(1010L,"Think and reachest", Genre.ROMANCE,new BigDecimal(2010),
                "Jame", Language.KYRGYZ, LocalDate.ofYearDay(2005,2));
        Book book5=new Book(1010L,"Man", Genre.FANTASY,new BigDecimal(2000),
                "Jhon ", Language.ENGLISH, LocalDate.ofYearDay(2005,2));

        List<Book> books= new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5));


        User user1=new User(1020L,"Adam","Adamov","A.Adam@gmail.com", "+996703258725", Gender.MALE, new BigDecimal(20000),books);
        User user2=new User(1030L,"Aman","Adamov","A.Adam@gmail.com", "+996703258725", Gender.MALE, new BigDecimal(20000),books);
        User user3=new User(1040L,"Aktan","Adamov","A.Adam@gmail.com", "+996703258725", Gender.MALE, new BigDecimal(20000),books);
        User user4=new User(1050L,"Asan","Adamov","A.Adam@gmail.com", "+996703258725", Gender.MALE, new BigDecimal(20000),books);
        User user5=new User(1060L,"Uson","Adamov","A.san@gmail.com", "+996703258725", Gender.MALE, new BigDecimal(20000),books);


    }
}