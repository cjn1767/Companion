package student.application.lhu_companion_2.rest;

import android.util.Log;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.RequiresHeader;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;
import org.androidannotations.rest.spring.api.RestClientHeaders;
import org.androidannotations.rest.spring.api.RestClientRootUrl;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import org.springframework.util.LinkedMultiValueMap;

import java.io.IOException;

import student.application.lhu_companion_2.responses.LoadInitialData;



@Rest(rootUrl = "ec2-54-186-111-1.us-west-2.compute.amazonaws.com:4000", converters = { FormHttpMessageConverter.class, GsonHttpMessageConverter.class, ByteArrayHttpMessageConverter.class}, interceptors = {HTTPLoggingInterceptor.class})
public interface Data extends RestClientHeaders, RestClientErrorHandling, RestClientRootUrl {
        void setRootUrl(String rootUrl);

    void setHeader(String name, String value);
    String getHeader(String name);

      @Get("/event")
      LoadInitialData loadInitialData();

}

class HTTPLoggingInterceptor implements ClientHttpRequestInterceptor {
    public static final String TAG = "CALL_RESTCLIENT";

    public HTTPLoggingInterceptor() {
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] data, ClientHttpRequestExecution execution) throws IOException {
        Log.v(TAG, request.getMethod() + " [URI] => " + request.getURI());
        Log.v(TAG, request.getMethod() + " [DATA] =>" + data);
        Log.v(TAG, request.getMethod() + " [HEADERS] => " + request.getHeaders());

        return execution.execute(request, data);
    }
}
