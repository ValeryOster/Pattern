package interview.khorstmann.reflection;

public class Test1 {
    void contextLoads() {
        Double a = 2.;
        Class cl = a.getClass();
        printSuperClasses(cl, 0 );

        System.out.println("Done");
    }

    private void printSuperClasses(Class cl, int i) {
        if (cl == null) { return; }

        for (int j = 0; j < i; j++) { System.out.print("\t"); }

        if (cl.isInterface()) {
            System.out.print("implement -> ");
        } else {
            System.out.print("extend -> ");
        }

        System.out.println(cl.getName());
        printSuperClasses(cl.getSuperclass(), ++i);
        Class[] interfaces = cl.getInterfaces();
        for (Class ia : interfaces) {
            printSuperClasses(ia, i);
        }
    }
}

