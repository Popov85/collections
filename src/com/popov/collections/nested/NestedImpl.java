package com.popov.collections.nested;

import com.sun.xml.internal.ws.api.config.management.policy.ManagedServiceAssertion;

/**
 * Created by Andrey on 07.09.2017.
 */
public class NestedImpl implements NestedInterface {
        @Override
        public void getData() {
                NestedImpl impl = new NestedImpl();
                NestedImpl.Nest i = new NestedImpl.Nest() {

                        @Override
                        public String getName() {
                                return null;
                        }

                        @Override
                        public int getNumber() {
                                return 0;
                        }
                };
        }
}
