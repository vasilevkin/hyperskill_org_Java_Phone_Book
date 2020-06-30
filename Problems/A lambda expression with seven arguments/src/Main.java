class Seven {

    public static MultipleArgumentsLambda.SeptenaryStringFunction fun =
            (one, two, three, four, five, six, seven) -> {
                StringBuilder sb = new StringBuilder();

                sb.append(one);
                sb.append(two);
                sb.append(three);
                sb.append(four);
                sb.append(five);
                sb.append(six);
                sb.append(seven);

                return sb.toString().toUpperCase();
            };
    //write your code here
}
