package com.pflores.msmarkets.controller;

import com.pflores.msmarkets.service.SpotifyMarketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/v1")
@RestController
public class MarketsController {

    @Autowired
    private SpotifyMarketsService spotifyMarketsService;

    @GetMapping("/markets")
    public Map fetchMarkets() {
        return spotifyMarketsService.fetchMarkets();
    }
}
