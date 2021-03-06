package data;
import com.desafio.java.junior.sysmanager.TrainComposition;
import lombok.Getter;

import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "contagem")
@Getter @Setter
public class DataCount extends TrainComposition {

        @Id
        private String id;
        private String data;
        private String trem;
        private String conteudo;


        public (String trem, String data) {
            this.trem = trem;
            this.conteudo = conteudo;
            this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        }
    }
}
