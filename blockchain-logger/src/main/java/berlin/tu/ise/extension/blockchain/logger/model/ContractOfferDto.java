package berlin.tu.ise.extension.blockchain.logger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.eclipse.edc.api.model.BaseResponseDto;
import org.eclipse.edc.api.model.CriterionDto;

import java.util.ArrayList;
import java.util.List;

@JsonDeserialize(builder = ContractOfferDto.Builder.class)
public class ContractOfferDto extends BaseResponseDto {
    private String id;
    private String accessPolicyId;
    private String contractPolicyId;

    private String dataUrl;
    private List<CriterionDto> criteria = new ArrayList<>();

    private ContractOfferDto() {
    }

    public String getAccessPolicyId() {
        return accessPolicyId;
    }

    public String getContractPolicyId() {
        return contractPolicyId;
    }

    public List<CriterionDto> getCriteria() {
        return criteria;
    }

    public String getId() {
        return id;
    }

    public String getDataUrl() { return dataUrl; }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder extends BaseResponseDto.Builder<ContractOfferDto, Builder> {
        private Builder() {
            super(new ContractOfferDto());
        }

        @JsonCreator
        public static Builder newInstance() {
            return new Builder();
        }

        public Builder accessPolicyId(String accessPolicyId) {
            dto.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder contractPolicyId(String contractPolicyId) {
            dto.contractPolicyId = contractPolicyId;
            return this;
        }

        public Builder criteria(List<CriterionDto> criteria) {
            dto.criteria = criteria;
            return this;
        }

        public Builder dataUrl(String dataUrl) {
            dto.dataUrl = dataUrl;
            return this;
        }

        @Override
        public Builder self() {
            return this;
        }

        public Builder id(String id) {
            dto.id = id;
            return this;
        }
    }
}

