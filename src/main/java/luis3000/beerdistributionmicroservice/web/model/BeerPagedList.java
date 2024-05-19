package luis3000.beerdistributionmicroservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/*
 * Created by Jose Castillo 5/19/24.
 */
public class BeerPagedList extends PageImpl<BeetDto> {

    public BeerPagedList(List<BeetDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeetDto> content) {
        super(content);
    }
}
