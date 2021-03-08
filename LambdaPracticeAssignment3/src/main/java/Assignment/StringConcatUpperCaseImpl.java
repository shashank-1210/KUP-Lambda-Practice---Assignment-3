package Assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConcatUpperCaseImpl {

    StringConcatUpperCase s = (s1,s2,s3,s4,s5,s6,s7) ->
    {
       return Arrays.asList(s1,s2,s3,s4,s5,s6,s7).stream().map(k->k.toUpperCase()).map(o->o.replace(" ","")).collect(Collectors.joining());
    };


}
