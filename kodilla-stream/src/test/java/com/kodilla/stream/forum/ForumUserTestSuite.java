package com.kodilla.stream.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ForumUserTestSuite {

    @Test
    void testGetLocationOfFriends() {

        //Given
        ForumUser user1 = new ForumUser("alan01", "Alan kosovski", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRik", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Rovert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //when
        //relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //relations for user10
        user10.addFriend(user1);
        //relations for user2
        user2.addFriend(user3);
        //relations for user9
        user9.addFriend(user3);

        //Then
        Assert.assertEquals(3, user1.getLocationsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationsOfFriends().contains("Orlando"));

    }

    @Test
    void testGetLocationsOfFriendsOfFriends() {
        //Given
        ForumUser user1 = new ForumUser("alan01", "Alan kosovski", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRik", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Rovert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //when
        //relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //relations for user10
        user10.addFriend(user1);
        //relations for user2
        user2.addFriend(user3);
        //relations for user9
        user9.addFriend(user3);

        //Then
        Assert.assertEquals(2, user3.getLocationsOfFriendsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationsOfFriendsOfFriends().contains("Orlando"));
    }
}
