package com.tws.refactoring.extract_variable;

public class BannerRender {

    private static final String MAC = "MAC";
    private static final String IE = "IE";
    private static final String IEonMAC = "IE on Mac?";
    private static final String BANNER = "banner";

    public String renderBanner(String platform, String browser) {
        if (checkIEonMac(platform, browser)) {
            return IEonMAC;
        }
        return BANNER;
    }

    private boolean checkIEonMac(String platform, String browser) {

        return (platform.toUpperCase().contains(MAC)) && (browser.toUpperCase().contains(IE));
    }
}
