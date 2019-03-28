package ru.job4j.adress;

import java.util.Objects;

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

    public static class Address implements Comparable<Address> {
        private String city;
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

        @Override
        public boolean equals(Object o) {
            boolean result = false;
            if (this == o) {
                result = true;
            }
            Address ad = (Address) o;
            if (this.city.equals(ad.city) && this.street.equals(ad.street) && this.home == ad.home && this.apartment == ad.apartment) {
                result = true;
            }
            return  result;
        }

        @Override
        public int hashCode() {
            return Objects.hash(street, city, home, apartment);
        }

        @Override
        public int compareTo(Address ad) {
            int result = this.city.compareTo(ad.city);
            return result;
        }
    }
}


