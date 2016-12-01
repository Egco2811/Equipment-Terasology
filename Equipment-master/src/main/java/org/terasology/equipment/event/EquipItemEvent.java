/*
 * Copyright 2016 MovingBlocks
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
package org.terasology.equipment.event;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.equipment.component.EquipmentSlot;

public class EquipItemEvent implements Event {
    private EntityRef character;
    private EntityRef item;
    private EquipmentSlot equipmentSlot;

    public EquipItemEvent() {
    }

    public EquipItemEvent(EntityRef character, EntityRef item, EquipmentSlot eequipmentSlot) {
        this.character = character;
        this.item = item;
        this.equipmentSlot = eequipmentSlot;
    }

    public EntityRef getCharacter() {
        return character;
    }

    public EntityRef getItem() {
        return item;
    }

    public EquipmentSlot getEquipmentSlot() {
        return equipmentSlot;
    }
}
