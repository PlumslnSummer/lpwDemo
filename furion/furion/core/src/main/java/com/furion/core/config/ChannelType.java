/*
 * * *****************************************************************************
 *  Copyright ( c ) 2017 huibur Inc. All Rights Reserved.
 *
 *  This software is the confidential and proprietary information of Huibur Inc
 *  (*Confidential Information*). You shall not disclose such Confidential Information
 *  and shall use it only in accordance with the terms of the license agreement
 *  you entered into with Huibur or a Huibur authorized
 *  reseller (the "License Agreement*).
 *  ******************************************************************************
 */

package com.furion.core.config;

import org.springframework.util.StringUtils;

/**
 * @author luoxiaoming
 */
public enum ChannelType {

    /**
     * 苹果IOS
     */
    IOS("ios", "苹果IOS", 0L),
    /**
     * 安卓客户端
     */
    ANDROID("android", "安卓", 0L),
    /**
     * 微信公众号
     */
    WX_WEB("wx_web", "微信公众号", 60 * 30L),
    /**
     * 微信小程序
     */
    WX_MIN_APP("wx_min_app", "微信小程序", 60 * 30L),
    /**
     * H5
     */
    H5("h5", "H5微网站", 60 * 15L),
    /**
     * 网站
     */
    WEB("web", "网站", 60 * 60L);


    private final String value;
    private final String label;
    private final long expireSeconds;

    ChannelType(String value, String label, long expireSeconds) {
        this.value = value;
        this.label = label;
        this.expireSeconds = expireSeconds;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public long getExpireSeconds() {
        return expireSeconds;
    }

    public static ChannelType getChannelType(String value) {
        if (StringUtils.hasLength(value)) {
            for (ChannelType channelType : ChannelType.values()) {
                if (channelType.getValue().equals(StringUtils.trimWhitespace(value))) {
                    return channelType;
                }
            }
        }
        return null;
    }
}
