/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.network.events;

import org.terasology.entitySystem.EntityRef;
import org.terasology.entitySystem.EntityStore;
import org.terasology.entitySystem.event.AbstractEvent;
import org.terasology.entitySystem.persistence.PlayerEntityStore;

import java.util.Map;

/**
 * @author Immortius
 */
public class ConnectedEvent extends AbstractEvent {

    private PlayerEntityStore entityStore;

    public ConnectedEvent(PlayerEntityStore store) {
        this.entityStore = store;
    }

    public PlayerEntityStore getEntityStore() {
        return entityStore;
    }

}