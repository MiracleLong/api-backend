package com.hui.huiapiclientsdk;

import com.hui.huiapiclientsdk.client.HuiApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 客户端配置
 * @author dargon
 * @create 2023-08-26
 */
@Configuration
@ConfigurationProperties("huiapi.client")
@Data
@ComponentScan
public class HuiApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public HuiApiClient huiApiClient() {
        return new HuiApiClient(accessKey, secretKey);
    }

}
