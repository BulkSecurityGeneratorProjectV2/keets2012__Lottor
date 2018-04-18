package com.blueskykong.tm.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author keets
 */
@Data
@ConfigurationProperties(prefix = "tx.core")
public class TxConfig {

    private String serializer = "kryo";


    private String nettySerializer = "kryo";


    private int delayTime = 30;


    private int transactionThreadMax = Runtime.getRuntime().availableProcessors() << 1;


    private int nettyThreadMax = Runtime.getRuntime().availableProcessors() << 1;

    private int heartTime = 10;


    private String rejectPolicy = "Abort";

    private String blockingQueueType = "Linked";

    private Boolean compensation = false;

    private String compensationCacheType;


    private int compensationQueueMax = 5000;

    private int compensationThreadMax = Runtime.getRuntime().availableProcessors() << 1;


    private int compensationRecoverTime = 60;


    private int refreshInterval = 60;


    private int retryMax = 10;


    private int recoverDelayTime = 60;


    private String txManagerId;


    private TxDbConfig txDbConfig;

    private TxMongoConfig txMongoConfig;

    private TxRedisConfig txRedisConfig;


}
