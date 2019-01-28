package br.com.pactosolucoes.api.fake.config.properties;

import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import br.com.pactosolucoes.api.fake.service.balanca.impl.BalancaServiceRetornoZeradoDepoisCompleto;
import br.com.pactosolucoes.api.fake.service.balanca.impl.BalancaServiceRetornoZeradoDepoisParcial;
import lombok.Getter;

/**
 * Opções de simuladores para o <b>Serviço controlador da Balança</b>, aos quais devem ser implementações de:
 * <ul>
 * <li>BalancaService</li>
 * <li>BeanConfigurableByProperties</li>
 * </ul>
 *
 * @author Bruno Cattany
 * @since 27/01/2019
 */
@Getter
public enum FakeBalancaServiceOption {

    /**
     * Veja na classe: {@link BalancaServiceRetornoZeradoDepoisCompleto}
     */
    BALANCA_SERVICE_RETORNO_ZERADO_DEPOIS_COMPLETO(BalancaServiceRetornoZeradoDepoisCompleto.class),
    /**
     * Veja na classe: {@link BalancaServiceRetornoZeradoDepoisParcial}
     */
    BALANCA_SERVICE_RETORNO_ZERADO_DEPOIS_PARCIAL(BalancaServiceRetornoZeradoDepoisParcial.class);

    private final Class<?> beanClass;

    <T extends BalancaService & BeanConfigurableByProperties> FakeBalancaServiceOption(Class<T> beanClass) {
        this.beanClass = beanClass;
    }

}
