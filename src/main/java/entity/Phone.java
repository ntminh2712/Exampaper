package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    private long id;
    private String name;
    private String branch;
    private String price;
    private String description;

    public Phone() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static final class PhoneBuilder {
        private long id;
        private String name;
        private String branch;
        private String price;
        private String description;

        private PhoneBuilder() {
        }

        public static PhoneBuilder aPhone() {
            return new PhoneBuilder();
        }

        public PhoneBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public PhoneBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PhoneBuilder withBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public PhoneBuilder withPrice(String price) {
            this.price = price;
            return this;
        }

        public PhoneBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBranch(branch);
            phone.setPrice(price);
            phone.setDescription(description);
            return phone;
        }
    }
}
