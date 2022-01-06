package com.cpic.qrcode.pojo;

/**
 * author: guoxinghang
 * date: 2022/1/6
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *   "code": 0,
 *   "msg": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAIwAAACMCAIAAAAhotZpAAABuklEQVR42u3aQY7EMAgEwPz/0zs/WGk0NGCn+hwlscsHZHj+ZH0eWwBJIEESSAIJkkASSJAEEiSBJJAgCSQpRnq68tV3/39454ogQYIECRKk9yFVljF1+9725oa9ggQJEiRIkO5FKqzfcgXbkhVBggQJEiRIkIaWlOOHBAkSJEiQIJ1f3eU6VZAgQYIECRKk8/tJud/Q9IMECRIkSJC6kKYmWKcufowZQ4IECRIkSAcmsR1LVwoJEiRIkCAdjFQ4SZqrlHLDsL8sEBIkSJAgQXo9Um7stPBVOf6GIhMSJEiQIEE6Gamwjlqyd7mzsqWfBAkSJEiQIC1Fyu1O4YfaHoYECRIkSJAgnbB3uXq1/1WQIEGCBAnSRUhtydVR4/UbJEiQIEGCdC/S05Xcd8dbRJAgQYIECdJbkdruY3KXRm1HBxIkSJAgQYIUW3Db4cidlaXVHSRIkCBBgvQ6pLYBmPlGGiRIkCBBggSpuDSaujRq4IcECRIkSJDuRcrdx+QaOTsHYCBBggQJEqQbkaYmWKf++chrIUiQIEGCBGkMSSAJJEgCCZJAEkiQBJJAgiSQBBIkgQRJIMk3+QBWsB+4yRwtkgAAAABJRU5ErkJggg==",
 *   "data": null
 * }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {
    private Integer code;
    private String msg;
    private Object data;

    public static R ok(String s){
        R r = new R();
        r.code = 0;
        r.msg = s;
        return r;
    }

}
