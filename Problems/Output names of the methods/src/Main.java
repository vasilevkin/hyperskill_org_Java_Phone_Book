class CreateInstance {

    public static SuperClass create() {

        SuperClass instance =
                new SuperClass() {
                    public static void method1() {
                        String name = new Object() {
                        }.getClass().getEnclosingMethod().getName();
                        System.out.println(name);
                    }

                    public void method2() {
                        String name = new Object() {
                        }.getClass().getEnclosingMethod().getName();
                        System.out.println(name);
                    }

                    public abstract void method3() {
                        String name = new Object() {
                        }.getClass().getEnclosingMethod().getName();
                        System.out.println(name);
                    }
                };
        /* create an instance of an anonymous class here,
                                 do not forget ; on the end */

        return instance;
    }
}
