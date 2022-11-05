public class Main {

    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.BirthdayDay = 13;
        post.birthday.BirthdayMonth = 11;
        post.birthday.BirthdayYear = 1996;
        post.name = "Иван";
        post.passport = "1234 № 456789";
        post.patronymic = "Иванович";
        post.phone = "89991234567";
        post.surname = "Иванов";
        post.subscription = "true";
    }
}