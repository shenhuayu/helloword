package top.lrshuai.helloword;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

/***
 @author shenhy
 @create 2021-01-25 9:57 
 ***/
public class HnDsGJJdataServiceTest {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    void GjjdataService() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("idNum", " xxxxxxxxxxxxxxxxxx")
                .build();
        Request request = new Request.Builder()
                .url("")
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();

    }

    public static void main(String[] args) {

    }

}
