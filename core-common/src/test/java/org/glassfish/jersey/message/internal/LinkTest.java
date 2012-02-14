/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2011-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.glassfish.jersey.message.internal;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Link;
import javax.ws.rs.ext.RuntimeDelegate;

import org.glassfish.jersey.internal.TestRuntimeDelegate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for LinkTest class.
 *
 * @author Santiago Pericas-Geertsen (Santiago.PericasGeertsen at oracle.com)
 */
public class LinkTest {

    @Path("/myresource")
    static class MyResource {

        @GET
        @Produces("text/plain")
        public String self() {
            return "myself";
        }

        @GET
        @Produces("application/xml")
        public String notSelf() {
            return "<xml>notSelf</xml>";
        }
    }

    @Before
    public void setUp() throws Exception {
        RuntimeDelegate.setInstance(new TestRuntimeDelegate());
    }

    @After
    public void tearDown() throws Exception {
        RuntimeDelegate.setInstance(null);
    }

    @Test
    public void testFromResourceMethod1() {
        Link l1 = Link.fromResourceMethod(MyResource.class, "self").build();
        Link l2 = Link.fromUri("/myresource").rel("self").produces("text/plain").method("GET").build();
        assertEquals(l1, l2);
    }

    @Test
    public void testFromResourceMethod2() {
        Link l1 = Link.fromResourceMethod(MyResource.class, "notSelf", "self").build();
        Link l2 = Link.fromUri("/myresource").rel("self").produces("application/xml").method("GET").build();
        assertEquals(l1, l2);
    }

    @Test
    public void testGetUri() {
        URI u = URI.create("http://example.org/app/link1");
        Link l1 = Link.fromUri("http://example.org/app/link1").param("foo1", "bar1").param("foo2", "bar2").build();
        assertEquals(l1.getUri(), u);
        assertEquals(l1.getUriBuilder().build(), u);
    }

    @Test
    public void testGetters() {
        Link l1 = Link.fromResourceMethod(MyResource.class, "self").build();
        assertEquals(l1.getUri(), URI.create("/myresource"));
        assertEquals(l1.getRel().get(0), "self");
        assertEquals(l1.getProduces().get(0), "text/plain");
        assertEquals(l1.getMethod(), "GET");
        assertEquals(l1.getTitle(), null);
        assertEquals(l1.getType(), null);
        assertEquals(l1.getConsumes().size(), 0);
        assertEquals(l1.getParams().size(), 3);
    }
}
