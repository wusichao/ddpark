package com.wusichao.config;

import com.wusichao.result.InResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(InResult.class)
@Configuration
public class InResultImport {
}
