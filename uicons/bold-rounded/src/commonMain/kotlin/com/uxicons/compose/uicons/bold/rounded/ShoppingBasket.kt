package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoppingBasket: ImageVector? = null

val Icons.Br.ShoppingBasket: ImageVector
    get() = _ShoppingBasket ?: UXIcon(name = "ShoppingBasket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.2f, 9.18f)
            curveToRelative(-0.55f, -0.64f, -1.31f, -1.04f, -2.14f, -1.15f)
            curveTo(20.51f, 3.51f, 16.66f, 0f, 12f, 0f)
            reflectiveCurveTo(3.49f, 3.51f, 2.94f, 8.03f)
            curveToRelative(-0.82f, 0.12f, -1.57f, 0.52f, -2.11f, 1.15f)
            curveTo(0.19f, 9.91f, -0.09f, 10.88f, 0.05f, 11.84f)
            lineToRelative(1.01f, 6.89f)
            curveToRelative(0.44f, 3.0f, 3.11f, 5.27f, 6.2f, 5.27f)
            horizontalLineToRelative(9.5f)
            curveToRelative(3.1f, 0f, 5.76f, -2.27f, 6.2f, -5.27f)
            lineToRelative(1.01f, -6.89f)
            curveToRelative(0.14f, -0.95f, -0.14f, -1.92f, -0.78f, -2.66f)
            close()
            moveTo(12f, 3f)
            curveToRelative(2.99f, 0f, 5.49f, 2.16f, 6.02f, 5f)
            lineTo(5.98f, 8f)
            curveToRelative(0.53f, -2.84f, 3.03f, -5f, 6.02f, -5f)
            close()
            moveTo(21.01f, 11.4f)
            lineToRelative(-1.01f, 6.89f)
            curveToRelative(-0.23f, 1.54f, -1.62f, 2.7f, -3.23f, 2.7f)
            lineTo(7.26f, 21f)
            curveToRelative(-1.62f, 0f, -3.01f, -1.16f, -3.23f, -2.7f)
            lineToRelative(-1.01f, -6.89f)
            curveToRelative(-0.01f, -0.1f, 0.01f, -0.18f, 0.08f, -0.26f)
            curveToRelative(0.05f, -0.05f, 0.15f, -0.14f, 0.32f, -0.14f)
            lineTo(20.61f, 11.0f)
            curveToRelative(0.17f, 0f, 0.28f, 0.09f, 0.32f, 0.14f)
            curveToRelative(0.05f, 0.05f, 0.1f, 0.14f, 0.08f, 0.26f)
            close()
            moveTo(16f, 14.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(11f, 14.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ShoppingBasket = it }
