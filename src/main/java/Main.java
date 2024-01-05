
import fileIO.fileIO;
import rest.RestClient;
import rest.model.PhotoResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
//        ex:1 using okHttpClient
            /*
            fileIO f=new fileIO();
            f.read_Sort_Write("C:/Users/JSA334/IdeaProjects/java-basics/files/in1.txt","C:/Users/JSA334/IdeaProjects/java-basics/files/in2.txt");
            */

//        ex:2 using Retrofit
            /*
            RestClient restClient= new RestClient();
            Response<List<PhotoResponse>> response = restClient.getJsonPlaceholderAPI().getPhotos().execute();
            response.body().forEach(photo->{
                System.out.println(photo.getTitle());
            });
            */

    }

}