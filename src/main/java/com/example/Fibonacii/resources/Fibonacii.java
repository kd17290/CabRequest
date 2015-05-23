package com.example.Fibonacii.resources;

import com.example.Fibonacii.core.CalculateFibIterative;
import com.example.Fibonacii.core.CalculateFibRedis;
import com.google.inject.Inject;
import com.yammer.dropwizard.auth.Auth;
import com.example.Fibonacii.core.CalculateFib;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/kuldeep")
public class Fibonacii {
    private final JedisPool jedisPool;
    @Inject
    public Fibonacii(JedisPool jedisPool)
    {
        this.jedisPool=jedisPool;
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public CabRequestResponce getFibNumber(CabRequest n) throws Exception {

        System.out.println("Connection to server sucessfully");

        Jedis jedis = jedisPool.getResource();
        System.out.println("Server is running: ");

        jedis.sadd("1",n.toString());

        System.out.println("crazy stuff: ");

        return new CabRequestResponce(1,n);
    }
}
