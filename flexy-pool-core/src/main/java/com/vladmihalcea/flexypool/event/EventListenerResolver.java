package com.vladmihalcea.flexypool.event;

import java.util.List;

/**
 * <code>EventListenerResolver</code> - Resolves the current configured {@link EventListener}
 *
 * @author Vlad Mihalcea
 * @since 1.2.3
 */
public interface EventListenerResolver {

    /**
     * Resolve the list of {@link EventListener}
     */
    List<EventListener<? extends Event>> resolveListeners();
}
