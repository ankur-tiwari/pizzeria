package pzinsta.pizzeria.model.delivery;

import pzinsta.pizzeria.model.Constants;
import pzinsta.pizzeria.model.order.Order;
import pzinsta.pizzeria.model.user.Customer;
import pzinsta.pizzeria.model.user.DeliveryAddress;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Delivery implements Serializable {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    private DeliveryAddress deliveryAddress;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Deliveryperson deliveryperson;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    // TODO: 4/8/2018 add delivery events like dispatch, successful delivery etc. with dates and stuff

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Deliveryperson getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Deliveryperson deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}