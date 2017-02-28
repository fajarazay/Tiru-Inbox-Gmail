package comfajarazay.httpsgithub.tirulistinboxgmail.network;

import java.util.List;

import comfajarazay.httpsgithub.tirulistinboxgmail.Message;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by FAJAR SEPTIAN on 27-02-2017.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
