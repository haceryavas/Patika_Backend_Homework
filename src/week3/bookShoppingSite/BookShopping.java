package week3.bookShoppingSite;

import week3.bookShoppingSite.model.Author;
import week3.bookShoppingSite.model.Order;
import week3.bookShoppingSite.model.Product;
import week3.bookShoppingSite.model.User;
import week3.bookShoppingSite.service.AuthorService;
import week3.bookShoppingSite.service.OrderService;
import week3.bookShoppingSite.service.ProductService;
import week3.bookShoppingSite.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShopping {
    public static void main(String[] args) {

        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        ProductService productService = new ProductService();

        metot(productService);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            writeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Müşteri adı giriniz: ");
                    String name = scanner.nextLine();

                    System.out.print("Müşteri email adresini giriniz: ");
                    String email = scanner.nextLine();

                    System.out.print("Şifre giriniz: ");
                    String password = scanner.nextLine();

                    userService.create(name, email, password);

                    break;

                case 2:
                    System.out.println("---------- Tüm Ürünler ----------");
                    productService.list();
                    break;

                case 3:
                    System.out.print("Müşteri email adresini giriniz: ");
                    String givenEmail = scanner.nextLine();
                    User foundUser = userService.findUserByEmail(givenEmail);
                    System.out.print("Ürün ismini giriniz: ");
                    String productName = scanner.nextLine();
                    Product foundProduct = productService.findProductByName(productName);
                    orderService.create(1324, foundUser, List.of(foundProduct));
                    break;

                case 4:
                    System.out.print("Müşteri email adresini giriniz: ");
                    String givenEmail1 = scanner.nextLine();
                    User foundUser1 = userService.findUserByEmail(givenEmail1);
                    orderService.foundOrders(foundUser1);
                    break;

                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz İşlem Seçimi!");
                    break;
            }
        }


    }

    private static void metot(ProductService productService) {
        AuthorService authorService = new AuthorService();

        authorService.create("Gülten", "Dayıoğlu");
        authorService.create("Zeynep", "Cemali");
        authorService.create("Yaşar", "Kemal");
        authorService.create("Jules", "Verne");

        Author author1 = authorService.findAuthor("Gülten");
        Author author2 = authorService.findAuthor("Zeynep");
        Author author3 = authorService.findAuthor("Yaşar");
        Author author4 = authorService.findAuthor("Jules");

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);

        productService.create("Ölümsüz Ece", 200, List.of(author1), LocalDate.of(2000, 8, 19));
        productService.create("Gökyüzündeki Mor Bulutlar", 250, List.of(author1), LocalDate.of(1978, 5, 18));
        productService.create("Patenli Kız", 250, List.of(author2), LocalDate.of(1978, 5, 18));
        productService.create("İnce Memed 1", 300, List.of(author3), LocalDate.of(1978, 5, 18));
        productService.create("Denizler Altında 20000 Fersah", 300, List.of(author4), LocalDate.of(1978, 5, 18));
        productService.create("Patika Teknoloji Dergisi", 50);
        productService.create("Patika Bilim Dergisi", 100);
    }

    private static void writeMenu() {
        System.out.println("1 - Müşteri Ekle\n" +
                "2 - Ürünleri Görüntüle\n" +
                "3 - Sipariş Ver\n" +
                "4 - Siparişlerimi Görüntüle\n" +
                "5 - Çıkış Yap");
    }
}
