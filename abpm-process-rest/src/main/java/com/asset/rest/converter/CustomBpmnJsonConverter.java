package com.asset.rest.converter;

import org.flowable.bpmn.model.BaseElement;
import org.flowable.editor.language.json.converter.BaseBpmnJsonConverter;
import org.flowable.editor.language.json.converter.BpmnJsonConverter;

import java.util.Map;

/**
 * @author lichao
 */
public class CustomBpmnJsonConverter extends BpmnJsonConverter {

	// 通过继承开放convertersToJsonMap的访问
	public static Map<Class<? extends BaseElement>, Class<? extends BaseBpmnJsonConverter>> getConvertersToJsonMap() {
		return convertersToJsonMap;
	}

	// 通过继承开放convertersToJsonMap的访问
	public static Map<String, Class<? extends BaseBpmnJsonConverter>> getConvertersToBpmnMap() {
		return convertersToBpmnMap;
	}
}
