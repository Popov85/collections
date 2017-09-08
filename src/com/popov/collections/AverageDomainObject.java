package com.popov.collections;

/**
 * Created by Andrey on 06.09.2017.
 */
public class AverageDomainObject {
        private String code;
        private String name;
        private int age;

        public AverageDomainObject(String code, String name, int age) throws Exception {
                if ((code==null)|| (name==null)||(age==0)) throw new Exception();
                this.code = code;
                this.name = name;
                this.age = age;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                AverageDomainObject that = (AverageDomainObject) o;

                if (age != that.age) return false;
                if (!code.equals(that.code)) return false;
                return name.equals(that.name);

        }

        @Override
        public int hashCode() {
                int result = code.hashCode();
                result = 31 * result + name.hashCode();
                result = 31 * result + age;
                return result;
        }

        @Override
        public String toString() {
                return "AverageDomainObject{" +
                        "code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
        }
}
