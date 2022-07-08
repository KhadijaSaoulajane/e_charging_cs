
package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "station")
public class Station {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "city")
        private String city;

        @Column(name = "address")
        private String address;

        @Column(name = "availability")
        private boolean availability;

        @Column(name = "price")
        private Long price;

        @Column(name = "owner_id")
        private Long owner_id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public boolean isAvailability() {
            return availability;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public Long getOwner_id() {
            return owner_id;
        }

        public void setOwner_id(Long owner_id) {
            this.owner_id = owner_id;
        }

        public Station(String city, String address, boolean availability, Long price, Long owner_id) {
            this.city = city;
            this.address = address;
            this.availability = availability;
            this.price = price;
            this.owner_id = owner_id;
        }

    public Station() {
    }
}

