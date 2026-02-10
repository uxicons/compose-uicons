package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessValue: ImageVector? = null

val Icons.Br.BusinessValue: ImageVector
    get() = _BusinessValue ?: UXIcon(name = "BusinessValue") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 8.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(0.64f)
            curveToRelative(0.45f, -1.72f, 2.0f, -3f, 3.86f, -3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
            horizontalLineToRelative(0.64f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(22.09f, 13.8f)
            curveToRelative(-0.38f, -0.5f, -0.97f, -0.8f, -1.6f, -0.8f)
            horizontalLineToRelative(-1.61f)
            lineToRelative(1.13f, 3f)
            horizontalLineToRelative(-4.01f)
            lineToRelative(1.13f, -3f)
            horizontalLineToRelative(-1.61f)
            curveToRelative(-0.63f, 0f, -1.23f, 0.3f, -1.6f, 0.8f)
            lineToRelative(-1.56f, 2.08f)
            curveToRelative(-0.49f, 0.66f, -0.46f, 1.56f, 0.07f, 2.19f)
            lineToRelative(5.58f, 5.93f)
            lineToRelative(-2.06f, -6f)
            horizontalLineToRelative(4.13f)
            lineToRelative(-2.06f, 6f)
            lineToRelative(5.58f, -5.93f)
            curveToRelative(0.54f, -0.62f, 0.56f, -1.53f, 0.07f, -2.19f)
            lineToRelative(-1.56f, -2.08f)
            close()
        }
    }.also { _BusinessValue = it }
