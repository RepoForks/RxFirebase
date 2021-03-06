/*
 * Copyright 2017 WBinaryTree
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package phoenixlib.io.rxfirebase.database;

/**
 * Created by yaoda on 06/04/17.
 */

public class ValueEvent<T> {
    private final EventType type;
    private final T value;
    private final String key;

    ValueEvent(EventType type, T value, String key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public EventType getType() {
        return type;
    }

    public T getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }
}
