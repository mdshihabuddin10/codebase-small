class Fruit {
    public void show() {
        System.out.println("Food");
    }
}

class Mango extends Fruit {
    @Override
    public void show() {
        System.out.println("It tastes sweet");
    }
}

class Orange extends Fruit {
    @Override
    public void show() {
        System.out.println("It tastes good");
    }
}
