package com.kodilla.good.patterns.challenges.OrderService;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Witaj " + user.getLogin() + ",\n\nDziekujemy za zamowienie w naszym sklepie ! Twoje zamowione zostanie spakowane i wyslane na adres:\n\nSzanowny Pan\n" + user.getName() + " " + user.getSurname() + "\n" + user.getAddress() + "\n");
    }
}
