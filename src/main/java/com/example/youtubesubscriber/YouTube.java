package com.example.youtubesubscriber;

import com.google.api.services.youtube.model.SubscriptionListResponse;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

public interface YouTube {

    @GetExchange("/subscriptions?part=subscriberSnippet&mySubscribers=true")
    SubscriptionListResponse subscribersList(
            @RequestParam int maxResults);

}
