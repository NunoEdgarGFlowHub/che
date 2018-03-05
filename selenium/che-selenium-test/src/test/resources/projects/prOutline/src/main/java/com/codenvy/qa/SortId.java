/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package com.codenvy.qa;


import java.util.Comparator;

public class SortId implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getEmployeeNumber().compareTo(e2.getEmployeeNumber());
    }
}