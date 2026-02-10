package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingMinus: ImageVector? = null

val Icons.Br.BasketShoppingMinus: ImageVector
    get() = _BasketShoppingMinus ?: UXIcon(name = "BasketShoppingMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.16f, 9.21f)
            curveToRelative(-0.57f, -0.66f, -1.36f, -1.06f, -2.22f, -1.17f)
            curveTo(20.46f, 3.53f, 16.64f, 0f, 12f, 0f)
            reflectiveCurveTo(3.53f, 3.53f, 3.05f, 8.05f)
            curveToRelative(-0.84f, 0.11f, -1.62f, 0.51f, -2.19f, 1.16f)
            curveTo(0.2f, 9.98f, -0.1f, 11f, 0.05f, 12.01f)
            lineToRelative(1.01f, 6.86f)
            curveToRelative(0.43f, 2.92f, 2.98f, 5.13f, 5.94f, 5.13f)
            horizontalLineToRelative(10.04f)
            curveToRelative(2.96f, 0f, 5.51f, -2.21f, 5.94f, -5.13f)
            lineToRelative(1.01f, -6.86f)
            curveToRelative(0.15f, -1.01f, -0.15f, -2.03f, -0.81f, -2.8f)
            close()
            moveTo(12f, 3f)
            curveToRelative(2.96f, 0f, 5.43f, 2.17f, 5.91f, 5f)
            lineTo(6.09f, 8f)
            curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
            close()
            moveTo(20.0f, 18.43f)
            curveToRelative(-0.21f, 1.46f, -1.49f, 2.56f, -2.97f, 2.56f)
            lineTo(7.0f, 21f)
            curveToRelative(-1.48f, 0f, -2.75f, -1.1f, -2.97f, -2.56f)
            lineToRelative(-1.01f, -6.86f)
            curveToRelative(-0.03f, -0.2f, 0.06f, -0.34f, 0.12f, -0.4f)
            curveToRelative(0.06f, -0.06f, 0.18f, -0.17f, 0.38f, -0.17f)
            lineTo(20.51f, 11f)
            curveToRelative(0.2f, 0f, 0.32f, 0.11f, 0.38f, 0.17f)
            curveToRelative(0.06f, 0.06f, 0.14f, 0.2f, 0.12f, 0.4f)
            lineToRelative(-1.01f, 6.86f)
            close()
            moveTo(16f, 16f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _BasketShoppingMinus = it }
