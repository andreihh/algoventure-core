/*
 * Copyright 2016 Andrei Heidelbacher <andrei.heidelbacher@gmail.com>
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

package com.aheidelbacher.algoventure.core.generation

abstract class LevelGenerator(
        val levelWidth: Int,
        val levelHeight: Int
) {
    companion object {
        fun randomInt(lower: Int, upperExclusive: Int): Int =
                lower + (Math.random() * (upperExclusive - lower)).toInt()
    }

    init {
        require(levelWidth > 0 && levelHeight > 0) {
            "Level gen sizes ($levelWidth, $levelHeight) must be positive!"
        }
    }

    abstract fun generate(): Level
}
