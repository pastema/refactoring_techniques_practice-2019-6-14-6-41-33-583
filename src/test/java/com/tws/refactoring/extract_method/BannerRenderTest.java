package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {

    @Test
    public void should_IE_on_MAC() {
        String platform = "MAC";
        String browser = "IE";

        BannerRender bannerRender = new BannerRender();
        String output = bannerRender.renderBanner(platform,browser);

        assertEquals("IE on Mac?" , output);
    }

    @Test
    public void should_show_banner() {
        String platform = "SONY";
        String browser = "Firefox";

        BannerRender bannerRender = new BannerRender();
        String output = bannerRender.renderBanner(platform,browser);

        assertEquals("banner" , output);
    }
}
