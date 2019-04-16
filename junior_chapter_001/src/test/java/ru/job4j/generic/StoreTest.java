package ru.job4j.generic;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

public class StoreTest {
    Store<User> userStore = new UserStore(3);

    @Before
    public void setup() {
        userStore.add(new User("First"));
        userStore.add(new User("Second"));
        userStore.add(new User("Third"));
    }

    @Test
    public void checkAddMethod() {
        Assert.assertThat(userStore.findById("First").getId(), is("First"));
        Assert.assertThat(userStore.findById("Second").getId(), is("Second"));
        Assert.assertThat(userStore.findById("Third").getId(), is("Third"));
    }

    @Test
    public void whenFindNone() {
        Assert.assertThat(userStore.findById("4"), is((User) null));
    }

    @Test
    public void whenReplaceElement() {
        userStore.replace("Third", new User("Fifth"));
        Assert.assertThat(userStore.findById("Fifth").getId(), is("Fifth"));
        Assert.assertThat(userStore.findById("Third"), is((User) null));
    }

    @Test
    public void whenIncorrectID() {
        Assert.assertThat(userStore.replace("1", new User("Fifth")), is(false));
    }

    @Test
    public void whenDeleteElement() {
        userStore.delete("Second");
        Assert.assertThat(userStore.findById("Second"), is((User) null));
    }
}
