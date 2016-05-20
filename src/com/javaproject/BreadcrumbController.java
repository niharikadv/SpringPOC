package com.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

/*@Component
public class BreadcrumbController {
	public List<Breadcrumb> getBreadcrumbs(final  LoginModel loginModel) throws IllegalArgumentException {
        final List<Breadcrumb> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(getLoginBreadcrumb(loginModel));
        Breadcrumb category = getCategoryBreadcrumb(loginModel.getCategory());
        breadcrumbs.add(category);
        Collections.reverse(breadcrumbs);
        return breadcrumbs;
    }

    protected Breadcrumb getLoginBreadcrumb(final LoginModel login) {
        final String loginUrl = "/index/" + login.getU_id();
        return new Breadcrumb(loginUrl, login.getUsername());
    }

    protected Breadcrumb getCategoryBreadcrumb(final CategoryDetailsController category) {
        final String categoryUrl = "/categories/" + category.getCategoryDetails();
        return new Breadcrumb(categoryUrl, category.getCategoryName());
    }

}
*/