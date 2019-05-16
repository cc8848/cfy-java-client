package co.cloudify.client;

import java.util.List;
import java.util.Map;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import co.cloudify.client.APIV31.Visibility;

public class Application {

    // private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) throws Exception {

        APIV31Impl api = APIV31Impl.create("default_tenant", "admin", "admin", "10.239.2.6", 80);

        // ExecutionV31 ex = api.startExecution("install", "apitest", null, null, null,
        // null, null);
        // ex = api.cancelExecution(ex.getId(), null);

        api.deleteDeployment("apitest", false);

        // System.out.println(ex.getId());
    }

}