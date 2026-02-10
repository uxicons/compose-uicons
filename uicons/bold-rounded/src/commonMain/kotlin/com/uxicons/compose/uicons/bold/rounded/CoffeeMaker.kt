package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeMaker: ImageVector? = null

val Icons.Br.CoffeeMaker: ImageVector
    get() = _CoffeeMaker ?: UXIcon(name = "CoffeeMaker") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 10f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-2.14f)
            curveToRelative(1.72f, -0.45f, 3f, -2f, 3f, -3.86f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(5.5f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.75f)
            curveToRelative(1.8f, 0f, 3.25f, -1.46f, 3.25f, -3.25f)
            verticalLineToRelative(-1.25f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(-5.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(8.5f, 5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(14.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineTo(8.5f)
            close()
        }
    }.also { _CoffeeMaker = it }
