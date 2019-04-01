/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingjdbc.spring.namespace.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Encrypt data source parser tag constants.
 * 
 * @author panjuan
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EncryptDataSourceBeanDefinitionParserTag {
    
    public static final String ROOT_TAG = "data-source";
    
    public static final String ENCRYPT_RULE_CONFIG_TAG = "encrypt-rule";
    
    public static final String DATA_SOURCE_NAME_TAG = "data-source-name";
    
    public static final String TABLE_RULES_TAG = "table-rules";
    
    public static final String TABLE_RULE_TAG = "table-rule";
    
    public static final String LOGIC_TABLE_ATTRIBUTE = "logic-table";
    
    public static final String DEFAULT_ENCRYPTOR_REF_ATTRIBUTE = "default-encryptor-ref";
    
    public static final String ENCRYPTOR_REF_ATTRIBUTE = "encryptor-ref";
    
    public static final String ENCRYPTOR_REF_TAG = "encryptor";
}
