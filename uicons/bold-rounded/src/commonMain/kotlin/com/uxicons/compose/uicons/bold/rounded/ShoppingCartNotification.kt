package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingCartNotification: ImageVector? = null

val Icons.Br.ShoppingCartNotification: ImageVector
    get() = _ShoppingCartNotification ?: UXIcon(name = "ShoppingCartNotification") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.7f, 10.89f)
            lineToRelative(-0.81f, 3.04f)
            curveToRelative(-0.64f, 2.4f, -2.83f, 4.08f, -5.31f, 4.08f)
            horizontalLineToRelative(-10.3f)
            curveToRelative(-1.75f, 0f, -3.24f, -1.31f, -3.47f, -3.04f)
            lineToRelative(-1.54f, -11.53f)
            curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
            horizontalLineToRelative(-0.25f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.25f)
            curveToRelative(1.75f, 0f, 3.24f, 1.31f, 3.47f, 3.04f)
            lineToRelative(0.26f, 1.96f)
            horizontalLineToRelative(9.0f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-8.6f)
            lineToRelative(0.88f, 6.57f)
            curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.5f, 0.43f)
            horizontalLineToRelative(10.3f)
            curveToRelative(1.13f, 0f, 2.12f, -0.76f, 2.42f, -1.85f)
            lineToRelative(0.81f, -3.04f)
            curveToRelative(0.21f, -0.8f, 1.04f, -1.28f, 1.84f, -1.06f)
            curveToRelative(0.8f, 0.21f, 1.27f, 1.04f, 1.06f, 1.84f)
            close()
            moveTo(7.02f, 20f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(17.02f, 20f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(20.5f, 7f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            close()
        }
    }.also { _ShoppingCartNotification = it }
