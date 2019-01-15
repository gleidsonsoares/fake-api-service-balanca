package br.com.pactosolucoes.api.fake.config.properties;

import br.com.pactosolucoes.api.fake.service.balanca.BalancaService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Bruno Cattany
 * @since 07/01/2019
 */
@Getter
@Setter
@ConfigurationProperties(
        prefix = "fake.balanca.service"
)
public class FakeBalancaServiceProperties {

    /**
     * Op&ccedil;&atilde;o para uma implementa&ccedil;&atilde;o de {@link BalancaService}, que por sua vez simula o servi&ccedil;o controlador de balan&ccedil;a.
     * <p>
     *     <b>Informe o bean desejado.</b>
     * </p>
     *
     * <table width="800px" cellpadding="5" cellspacing="10">
     *
     *     <caption>Implementa&ccedil;&otilde;es dispon&iacute;veis:</caption>
     *
     *     <tr>
     *         <th>Nome do bean</th>
     *         <th>Classe correspondente</th>
     *         <th>Cen&aacute;rio de simula&ccedil;&atilde;o</th>
     *     </tr>
     *
     *     <tr>
     *         <td>balancaServiceRetornoZeradoDepoisCompleto</td>
     *         <td>BalancaServiceRetornoZeradoDepoisCompleto.class</td>
     *         <td>Simula&ccedil;&atilde;o que sempre trar&aacute; um resultado zerado, ou seja, inv&aacute;lido para o consumidor.</td>
     *     </tr>
     *     <tr>
     *         <td>balancaServiceRetornoZeradoDepoisParcial</td>
     *         <td>BalancaServiceRetornoZeradoDepoisParcial.class</td>
     *         <td>Simula&ccedil;&atilde;o que sempre trar&aacute; um resultado zerado como primeira a&ccedil;&atilde;o, e depois como segunda a&ccedil;&atilde;o, trar&aacute; o resultado parcial.</td>
     *     </tr>
     * </table>
     *
     */
    private String option;

}
