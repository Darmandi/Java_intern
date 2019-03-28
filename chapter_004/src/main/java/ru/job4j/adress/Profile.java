package ru.job4j.adress;

/**
 * Класс анкеты
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Profile {
    private Address address;

    /**
     * Анкета клиента
     * @param address адресс клиента
     */
    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return  address;
    }

    public static class Address {
        public String city;
        private String street;
        private int home;
        private int apartment;

        /**
         * Адрес
         * @param city город
         * @param street улица
         * @param home дом
         * @param apartment квартира
         */
        public Address(String city, String street, int home, int apartment) {
            this.city = city;
            this.street = street;
            this.home = home;
            this.apartment = apartment;
        }
    }
}


