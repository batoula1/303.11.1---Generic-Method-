public class myRunner {

    public static void main(String[] args) {
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);
        dObj.genericsMethod("Per Scholas");
        dObj.genericsMethod(2563.5);
        dObj.genericsMethod('H');

        System.out.println("\n************GLAB SECOND PART***************");

        GMultipleDataType <String, Integer> mobj = new GMultipleDataType<>("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        GMultipleDataType <String, String> mobj2 = new GMultipleDataType<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}