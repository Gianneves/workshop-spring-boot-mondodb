package com.nelioalves.workshopmongo.resources;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostServices services;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
