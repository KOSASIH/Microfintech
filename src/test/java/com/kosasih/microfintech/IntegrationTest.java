package com.kosasih.microfintech;

import com.kosasih.microfintech.MicrofintechApp;
import com.kosasih.microfintech.config.AsyncSyncConfiguration;
import com.kosasih.microfintech.config.EmbeddedElasticsearch;
import com.kosasih.microfintech.config.EmbeddedKafka;
import com.kosasih.microfintech.config.EmbeddedSQL;
import com.kosasih.microfintech.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MicrofintechApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
