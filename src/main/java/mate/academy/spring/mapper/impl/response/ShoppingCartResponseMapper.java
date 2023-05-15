package mate.academy.spring.mapper.impl.response;

import mate.academy.spring.mapper.DtoResponseMapper;
import mate.academy.spring.model.ShoppingCart;
import mate.academy.spring.model.dto.response.ShoppingCartResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartResponseMapper implements DtoResponseMapper<ShoppingCartResponseDto,
        ShoppingCart> {
    @Override
    public ShoppingCartResponseDto toDto(ShoppingCart cart) {
        ShoppingCartResponseDto responseDto = new ShoppingCartResponseDto();
        responseDto.setId(cart.getId());
        responseDto.setUser(cart.getUser());
        responseDto.setTickets(cart.getTickets());
        return responseDto;
    }
}