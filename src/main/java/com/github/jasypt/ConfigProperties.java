package com.github.jasypt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 石少东
 * @date 2020-08-27 14:44
 * @since 1.0
 */

@Data
@Component
@ConfigurationProperties(prefix = "config.to.encrypt")
public class ConfigProperties {

    private Map<String, String> properties;

}
