package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyDataModel {

    private String mValue;

    public static CurrencyDataModel fromJson (JSONObject jsonObject) {

        try {
            CurrencyDataModel currency = new CurrencyDataModel();

            double tempResult = jsonObject.getJSONObject("averages").getDouble("day");
            currency.mValue = Double.toString(tempResult);

            return currency;

        } catch (JSONException e) {
            Log.e("Bitcoin" , "Get value failed");
            return null;

        }
    }

    public String getValue() {
        return mValue;
    }
}
