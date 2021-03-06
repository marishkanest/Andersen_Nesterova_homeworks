package Homework3.AlexPattern.adapter;

public class Adapter{

    public interface Chief {

        public Object makeBreakfast();
        public Object makeDinner();
        public Object makeSupper();

    }

// Файл Plumber.java

    public static class Plumber {

        public Object getPipe() {
            return new Object();
        }

        public Object getKey() {
            return new Object();
        }

        public Object getScrewDriver() {
            return new Object();
        }

    }

// Файл ChiefAdapter.java

    public static class ChiefAdapter implements Chief {

        private Plumber plumber = new Plumber();

        @Override
        public Object makeBreakfast() {
            return plumber.getKey();
        }

        @Override
        public Object makeDinner() {
            return plumber.getScrewDriver();
        }

        @Override
        public Object makeSupper() {
            return plumber.getPipe();
        }

    }

// Файл Client.java

    public static class Client {

        public static void main(String [] args) {
            Chief chief = new ChiefAdapter();

            Object key = chief.makeDinner();
        }

    }
}

