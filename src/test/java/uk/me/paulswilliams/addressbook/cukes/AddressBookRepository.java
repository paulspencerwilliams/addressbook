package uk.me.paulswilliams.addressbook.cukes;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.util.concurrent.ExecutionException;

import static org.elasticsearch.client.Requests.createIndexRequest;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddressBookRepository {

    public void recreate() throws ExecutionException, InterruptedException {
        Client client = new TransportClient()
                .addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
        assertThat(client.admin().indices().prepareDelete("addressbook").execute().actionGet().isAcknowledged(), equalTo(true));
        client.admin().indices().create(createIndexRequest("addressbook")).actionGet();
        assertThat(client.prepareCount("addressbook").execute().get().getCount(), equalTo(0L));
    }
}
