public class Main {
    public static void main(String[] args) {

        Phone num1 = new Phone("614222222");
        Email em1 = new Email("John@john.com");

        num1.contact();
        em1.contact();

    }
}

abstract class Contacts{
    abstract public void contact();


}

class Email extends Contacts{
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}

class Phone extends Contacts{
    private String phone;

    public Phone(String phone) {
        this.phone = phone;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + phone);
    }
}