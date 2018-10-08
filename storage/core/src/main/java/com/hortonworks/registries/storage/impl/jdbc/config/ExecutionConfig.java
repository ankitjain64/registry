/**
 * Copyright 2016 Hortonworks.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.hortonworks.registries.storage.impl.jdbc.config;

import com.hortonworks.registries.storage.impl.jdbc.DatabaseType;
import com.hortonworks.registries.storage.impl.jdbc.provider.sql.factory.QueryExecutor;
import com.hortonworks.registries.storage.impl.jdbc.provider.sql.statement.PreparedStatementBuilder;

/**
 * Wrapper object that serves has a placeholder for configuration (e.g. {@code query timeout}) that needs
 * to be passed to objects like {@link QueryExecutor} or {@link PreparedStatementBuilder}. <br>
 *
 * This class should be immutable as the configuration should not change after passed in to the configurable objects
 **/
public class ExecutionConfig {

    private final int queryTimeoutSecs;
    private final DatabaseType databaseType;

    // Replace constructors with Builder pattern as more configuration options become available
    public ExecutionConfig(int queryTimeoutSecs, DatabaseType databaseType) {
        this.queryTimeoutSecs = queryTimeoutSecs;
        this.databaseType = databaseType;
    }

    public ExecutionConfig(int queryTimeoutSecs) {
        this.queryTimeoutSecs = queryTimeoutSecs;
        this.databaseType = null;
    }

    public int getQueryTimeoutSecs() {
        return queryTimeoutSecs;
    }

    public DatabaseType getDatabaseType() {
        return databaseType;
    }
}
