package com.pflores.msmarkets.client;


import com.pflores.msmarkets.configuration.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "spotifyClient", url = "${spotify.api.url}", configuration = FeignClientConfiguration.class)
public interface ISpotifyClientMarkets {

    @GetMapping(value = "v1/markets")
    Map<String, Object> fetchMarkets();
}