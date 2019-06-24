package rongyan.rntissue.repo.util;

import java.nio.charset.Charset;

public class DesTuil {

    /**
     * 默认的私钥
     */
    private static final String DEFAULT_PRIVATE_SECRET_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJeNNvqhHxzPAeeOd8EmuXwLoNYfN3QJ7j1YLEid+OJGH0Firq3ABLavfTrMDSmcw98iJIthcy3Uxye+9ohJntlScSADlZItMkGa06pNxj1/oNGllCZaDRO2wOY9wmm8sztKL/x4MPuIA2bBY1ymRgGc+pjMzQr7cp/WpoctVuyRAgMBAAECgYAfs5V1lfCZKSA/3MhmKgCQ1yncwIjsCAvC30fcJNdkFcEB/2+Evu79e/YZL4ftVXKPoWe9lDPwuVqzkLmnRqcogVNRAVrayodPFIwSqMfgcHijRccty467Jmj8tbNhQYYC3NbylHSIjeCMa3Y/e3GSkfTz2MmdyELQg32jARWAJQJBAOPbRU0ok5KCc/8x6ebZLGUytiFxLR4wV8GcemEpZki1GI60mO5XKD2ZXSRRar984GksXcTGRvr5mjV4OvpnctsCQQCqRTbklxUsfYpY7QptkF2ag0BG+KXcJhv52HQtaqDgJZFSXs9aldChnoY0k83UUPHHj+ahXhe4FOplvTfZg/wDAkEAiBSYWvB00fcfF7XTn47sOLQEmgxhiboNbw/o9sYm1B1zwSaSfyWGXuONAPeu7RXDYIyio7ZXBeSz+GMJtiq6KQJAAPFvM2bu1BdB6+osM50oF5IAiiQYbxa68vBS/GlpyLQMkQM7bMoFpM+G+MWUz0c/f5Z5dY1a3kcnYTbiF09W1wJBAJB8pRG2UAm/ZDEe0mmqSW7y8suubNyw4ovyeB6IsddrqTaxlCzfVb+3QC//6C8DfmnyB4AkxtRgKP95o2EUUdI=";


    /**
     * 私钥解密
     *
     * @param str 待解密字符串
     * @return 解密后字符串
     */
    public static String decrypt(String str) {
        return decrypt(DEFAULT_PRIVATE_SECRET_KEY, str);
    }

    /**
     * 私钥解密
     *
     * @param privateKey 私钥
     * @param pwd        待解密字符串
     * @return 解密后字符串
     */
    public static String decrypt(String privateKey, String pwd) {
        try {
            pwd = pwd.replace("%2B", "+");
            byte[] bytes = RSAUtils.decryptByPrivateKey(pwd, privateKey);
            return new String(bytes, Charset.forName("utf-8"));
        } catch (Exception e) {
        }
        return pwd;
    }
}
