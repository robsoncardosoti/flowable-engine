/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.engine.impl.persistence.entity.data;

import java.util.List;

import org.flowable.engine.common.impl.Page;
import org.flowable.engine.common.impl.persistence.entity.data.DataManager;
import org.flowable.engine.impl.HistoryJobQueryImpl;
import org.flowable.engine.impl.persistence.entity.HistoryJobEntity;
import org.flowable.engine.runtime.HistoryJob;

/**
 * @author Tijs Rademakers
 */
public interface HistoryJobDataManager extends DataManager<HistoryJobEntity>, JobInfoDataManager<HistoryJobEntity> {

    List<HistoryJob> findHistoryJobsByQueryCriteria(HistoryJobQueryImpl query, Page page);

    long findHistoryJobCountByQueryCriteria(HistoryJobQueryImpl query);
    
}
