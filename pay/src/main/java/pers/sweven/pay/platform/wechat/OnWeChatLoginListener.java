package pers.sweven.pay.platform.wechat;

/**
 * 微信登录回调
 */
public interface OnWeChatLoginListener {


    /**
     * 微信登录回调信息
     *
     * @param code
     * @param msg
     * @param user
     */
    void onWeChatLogin(int code, String msg, WeChatUser user);

}
