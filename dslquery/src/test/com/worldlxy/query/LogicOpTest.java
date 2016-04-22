package com.worldlxy.query;

import org.junit.Test;

import static com.worldlxy.query.LogicOp.and;
import static com.worldlxy.query.LogicOp.or;
import static com.worldlxy.query.QueryField.field;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicOpTest {

    @Test
    public void should_generate_simple_query_exp() throws Exception {
        QueryExp exp = field("name").eq("lxy");

        assertThat(exp.toString(), is("(name=lxy)"));
    }

    @Test
    public void should_generate_complex_query_exp() throws Exception {
        QueryExp exp = or(and(field("name").eq("'lxy'"), field("age").eq("32")), field("name").eq("'zxs'"));

        assertThat(exp.toString(), is("(((name='lxy') and (age=32)) or (name='zxs'))"));
    }

}