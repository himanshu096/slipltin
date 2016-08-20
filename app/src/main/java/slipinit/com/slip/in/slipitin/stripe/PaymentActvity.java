package slipinit.com.slip.in.slipitin.stripe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.api.GoogleApiClient;

import slipinit.com.slip.in.slipitin.R;

public class PaymentActvity extends AppCompatActivity {

    public static final String PUBLISHABLE_KEY = "AIzaSyD_PG-JcIu-SiFRN1HgVxh6s94_wv8nn7Y";

    // Unique identifiers for asynchronous requests:
    private static final int LOAD_MASKED_WALLET_REQUEST_CODE = 1000;
    private static final int LOAD_FULL_WALLET_REQUEST_CODE = 1001;
    private GoogleApiClient mGoogleApiClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_actvity);


    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);


    }
}