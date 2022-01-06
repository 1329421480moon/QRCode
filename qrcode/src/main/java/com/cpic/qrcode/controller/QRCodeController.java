package com.cpic.qrcode.controller;


import com.cpic.qrcode.pojo.R;
import com.cpic.qrcode.util.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>QRCodeController</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2020/7/10
 */
@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

    /**
     * 根据 content 生成二维码
     *
     * @param content
     * @param width
     * @param height
     * @return
     */
    //http://localhost:8080/qrcode/getQRCode?content=https://www.baidu.com
    @GetMapping("/getQRCodeBase64")
    public R getQRCode(@RequestParam("content") String content,
                       @RequestParam(value = "logoUrl", required = false) String logoUrl,
                       @RequestParam(value = "width", required = false) Integer width,
                       @RequestParam(value = "height", required = false) Integer height) {
        return R.ok(QRCodeUtil.getBase64QRCode(content, logoUrl));
    }

    /**
     * 根据 content 生成二维码
     */
    @GetMapping(value = "/getQRCode")
    public void getQRCode(HttpServletResponse response,
                          @RequestParam("content") String content,
                          @RequestParam(value = "logoUrl", required = false) String logoUrl) throws Exception {
        ServletOutputStream stream = null;
        try {
            stream = response.getOutputStream();
            QRCodeUtil.getQRCode(content, logoUrl, stream);
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            if (stream != null) {
                stream.flush();
                stream.close();
            }
        }
    }

}