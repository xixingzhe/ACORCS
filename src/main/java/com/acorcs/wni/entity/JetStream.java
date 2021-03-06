package com.acorcs.wni.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vividsolutions.jts.geom.LineString;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by dengc on 2016/12/11.
 */
@Data
public class JetStream extends WniEntity<LineString> implements Serializable {


    @Override
    public String getContentsKind() {
        return "JET STREAM";
    }
}
