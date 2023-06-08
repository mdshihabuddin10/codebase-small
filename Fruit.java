class Fruit {
    public void show() {
        System.out.println("The animal makes a sound.");
    }
}

class Mango extends Fruit {
    @Override
    public void show() {
        System.out.println("It's taste is sweet");
    }
}

class Orange extends Fruit {
    @Override
    public void show() {
        System.out.println("It's taste is also sweet");
    }
}
