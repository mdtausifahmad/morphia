/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jmkgreen.morphia.testmodel;

import com.github.jmkgreen.morphia.annotations.Property;
import com.github.jmkgreen.morphia.testutil.TestEntity;

/**
 *
 * @author Olafur Gauti Gudmundsson
 */
public class Circle extends TestEntity implements Shape {
	private static final long serialVersionUID = 1L;

    @Property
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }
}
