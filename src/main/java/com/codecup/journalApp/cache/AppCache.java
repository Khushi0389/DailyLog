package com.codecup.journalApp.cache;

import com.codecup.journalApp.entity.ConfigJournalAppEntity;
import com.codecup.journalApp.repository.ConfigJournalAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys {
        WEATHER_API;
    }

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    public Map<String, String> appCache;

    @PostConstruct
    public void init() {
        appCache = new HashMap<>();
        List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
        for (ConfigJournalAppEntity configJournalAppEntity : all) {
            appCache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());//key-value from database is put on appcache
        }
    }
}