package come.gogle.nicat;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Lion("Nidjat"),
                new Parrot("Shahriyar"),
                new Tiger("Jamil")
        };

        for (Animal a : zoo) {
            System.out.println("Type: " + a.getClass().getSimpleName());
            a.showInfo();
            a.makeSound();
            a.move();
            a.eat();
            System.out.println("----------");
        }
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some animal sound");
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void showInfo() {
        System.out.println("Name: " + name);
    }
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }

    @Override
    public void move() {
        System.out.println("Lion runs fast");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }
}

class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot says: hello");
    }

    @Override
    public void move() {
        System.out.println("Parrot flies");
    }

    @Override
    public void eat() {
        System.out.println("Parrot pecks seeds");
    }
}

class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger growls");
    }

    @Override
    public void move() {
        System.out.println("Tiger walks silently");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats deer");
    }
}
