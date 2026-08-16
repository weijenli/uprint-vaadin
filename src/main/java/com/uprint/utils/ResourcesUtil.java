package com.uprint.utils;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class ResourcesUtil {
    public static Resource[] getImageCountInResources(String resourceFolderPath) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            return resolver.getResources("classpath*:META-INF/resources/static/images/" + resourceFolderPath + "/*");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
