/*
 * Informational Notice:
 *
 * This software, the ”TBD,” was developed under contract funded by the National Library of Medicine, which is part of the National Institutes of Health, an agency of the Department of Health and Human Services, United States Government.
 *
 * The license of this software is an open-source BSD-like license.  It allows use in both commercial and non-commercial products.
 *
 * The license does not supersede any applicable United States law.
 *
 * The license does not indemnify you from any claims brought by third parties whose proprietary rights may be infringed by your usage of this software.
 *
 * Government usage rights for this software are established by Federal law, which includes, but may not be limited to, Federal Acquisition Regulation (FAR) 48 C.F.R. Part 52.227-14, Rights in Data—General.
 * The license for this software is intended to be expansive, rather than restrictive, in encouraging the use of this software in both commercial and non-commercial products.
 *
 * LICENSE:
 *
 * Government Usage Rights Notice:  The U.S. Government retains unlimited, royalty-free usage rights to this software, but not ownership, as provided by Federal law.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above Government Usage Rights Notice, this list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above Government Usage Rights Notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *  The names, trademarks, and service marks of the National Library of Medicine, the National Institutes of Health, and the names of any of the software developers shall not be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE U.S. GOVERNMENT AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITEDTO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE U.S. GOVERNMENT
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.pl.triagepic.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 5/20/14.
 */
public class DummyEventContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyEventItem> ITEMS = new ArrayList<DummyEventItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyEventItem> ITEM_MAP = new HashMap<String, DummyEventItem>();

    static {
        /*
        // Add 3 sample items.
        addItem(new DummyItem("0", "Drafts", "10"));
        addItem(new DummyItem("1", "Sent", "20"));
        addItem(new DummyItem("2", "Outbox", "30"));
        addItem(new DummyItem("3", "Deleted", "40"));
        addItem(new DummyItem("4", "TriageTrak", "100"));
        */
    }

    // changed to public
    public static void addItem(DummyEventItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyEventItem {
        public String id;
        public String rowIndex;
        public String incident_id;
        public String parent_id;
        public String name;
        public String shortname;
        public String date;
        public String type;
        public String latitude;
        public String longitude;
        public String street;
        public String group;
        public String closed;

        public DummyEventItem(String id,
                         String rowIndex,
                         String incident_id,
                         String parent_id,
                         String name,
                         String shortname,
                         String date,
                         String type,
                         String latitude,
                         String longitude,
                         String street,
                         String group,
                         String closed){
            this.id = id;
            this.rowIndex = rowIndex;
            this.incident_id = incident_id;
            this.parent_id = parent_id;
            this.name = name;
            this.shortname = shortname;
            this.date = date;
            this.type = type;
            this.latitude = latitude;
            this.longitude = longitude;
            this.street = street;
            this.group = group;
            this.closed = closed;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
