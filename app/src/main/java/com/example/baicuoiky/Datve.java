package com.example.baicuoiky;

public class Datve {

        private String movieName;
        private int quantity;
        private double totalAmount;

        public Datve() {
            // Empty constructor needed for Firebase
        }

        public Datve(String movieName, int quantity, double totalAmount) {
            this.movieName = movieName;
            this.quantity = quantity;
            this.totalAmount = totalAmount;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

}
