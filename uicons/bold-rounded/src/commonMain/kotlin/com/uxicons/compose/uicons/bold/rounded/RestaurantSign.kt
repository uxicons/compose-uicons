package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RestaurantSign: ImageVector? = null

val Icons.Br.RestaurantSign: ImageVector
    get() = _RestaurantSign ?: UXIcon(name = "RestaurantSign") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 7.61f)
            verticalLineToRelative(-2.66f)
            curveToRelative(1.69f, -0.24f, 3f, -1.69f, 3f, -3.45f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-17.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-17.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(2.61f)
            curveToRelative(-1.78f, 0.91f, -3f, 2.76f, -3f, 4.89f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(8f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -2.13f, -1.22f, -3.98f, -3f, -4.89f)
            close()
            moveTo(18f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-2f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(20f, 18f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -1f, 1.12f, -1f, 1.12f, -1f)
            curveToRelative(0.38f, -1.68f, 1.7f, -3.0f, 3.38f, -3.38f)
            verticalLineToRelative(-0.62f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(0.62f)
            curveToRelative(1.68f, 0.38f, 3.0f, 1.7f, 3.38f, 3.38f)
            curveToRelative(0f, 0f, 1.12f, 0f, 1.12f, 1f)
            close()
        }
    }.also { _RestaurantSign = it }
