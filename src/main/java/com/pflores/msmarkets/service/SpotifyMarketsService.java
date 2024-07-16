package com.pflores.msmarkets.service;



import com.pflores.msmarkets.client.ISpotifyClientMarkets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SpotifyMarketsService {

    @Autowired
    private ISpotifyClientMarkets spotifyClientMarkets;

    public Map<String, Object> fetchMarkets() {
        return spotifyClientMarkets.fetchMarkets();
    }
}
