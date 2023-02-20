package edu.citytech.cst.client.sample.function.marginaltax;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.client.sample.function.marginaltax.model.MarginalTax;



public class MarginalTaxService {
    final static String sUrl = " http://127.0.0.1:3000/taxsummary?code=SM&salary=55000";

    public static MarginalTax getTaxSummary(Code code, float salary) {

        String sURL = URL.replace("$code", code)
                .replace("$salary", salary + "");
        MarginalTax marginalTax = JSONGet.submitGet(sUrl, MarginalTax.class);

        return marginalTax;

    }

}

       /* MarginalTax o = JSONGet.submitGet(sUrl, MarginalTax.class);
        System.out.println(o.getTaxList()[0]);
        var x = o.getPercentage();
        var y = o;

        return o;


        */





