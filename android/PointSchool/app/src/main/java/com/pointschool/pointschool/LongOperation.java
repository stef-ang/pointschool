package com.pointschool.pointschool;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karsten on 09/03/2015.
 */
public class LongOperation extends AsyncTask<String, Void, Void> {
    private Context context;
    private ProgressDialog pDialog;
    public LongOperation(Context ctx){
        context = ctx;
    }
    protected Void doInBackground(String... params) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://128.199.140.247/pointschool/index.php/rest");
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(2);
        parameters.add(new BasicNameValuePair("table", params[0]));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(parameters));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            HttpResponse response = httpClient.execute(httpPost);
            // write response to log
            if (response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();
                String json = EntityUtils.toString(entity);
                Log.d("Http Post Response:", json);

                // Getting JSON Array node
                JSONArray jsonArr = new JSONArray(json);

                // looping through All Contacts
                for (int i = 0; i < jsonArr.length(); i++) {
                    JSONObject jsonObj = jsonArr.getJSONObject(i);
                    Log.d("JSON Object",jsonObj.toString());
                }
            }

        } catch (ClientProtocolException e) {
            // Log exception
            e.printStackTrace();
        } catch (IOException e) {
            // Log exception
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    protected void onPreExecute() {
       pDialog = ProgressDialog.show(context, "", "Please Wait...", true, false);
    }
    protected void onPostExecute(Void unused) {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
    protected void onProgressUpdate(Void... values) {}
}
