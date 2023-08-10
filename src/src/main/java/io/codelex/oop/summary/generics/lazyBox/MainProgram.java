package io.codelex.oop.summary.generics.lazyBox;

public class MainProgram {

    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate);

        Integer contents = box.get();
        System.out.println("Contents: " + contents);

        Integer contents2 = box.get();
        System.out.println("Contents: " + contents2);
    }

    public static Integer calculate() {
        return 200;
    }
}
