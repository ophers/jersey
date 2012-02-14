/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 Oracle and/or its affiliates. All rights reserved.
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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.03 at 05:59:50 PM CEST 
//


package org.glassfish.jersey.media.json.internal.rim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Represents a collection of objects that is governed by a shared set of policies and managed by a designated 
 *         set of steward organizations where each organization has specific stewardship roles.
 *       
 * 
 * <p>Java class for RegisterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}RegistryPackageType">
 *       &lt;attribute name="registerOwner" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}objectReferenceType" />
 *       &lt;attribute name="registerManager" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}objectReferenceType" />
 *       &lt;attribute name="controlBody" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:4.0}objectReferenceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterType")
public class RegisterType
    extends RegistryPackageType
{

    @XmlAttribute(required = true)
    protected String registerOwner;
    @XmlAttribute(required = true)
    protected String registerManager;
    @XmlAttribute(required = true)
    protected String controlBody;

    /**
     * Gets the value of the registerOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterOwner() {
        return registerOwner;
    }

    /**
     * Sets the value of the registerOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterOwner(String value) {
        this.registerOwner = value;
    }

    /**
     * Gets the value of the registerManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterManager() {
        return registerManager;
    }

    /**
     * Sets the value of the registerManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterManager(String value) {
        this.registerManager = value;
    }

    /**
     * Gets the value of the controlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlBody() {
        return controlBody;
    }

    /**
     * Sets the value of the controlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlBody(String value) {
        this.controlBody = value;
    }

}
