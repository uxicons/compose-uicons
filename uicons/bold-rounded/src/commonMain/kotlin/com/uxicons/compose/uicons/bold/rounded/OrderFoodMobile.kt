package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OrderFoodMobile: ImageVector? = null

val Icons.Br.OrderFoodMobile: ImageVector
    get() = _OrderFoodMobile ?: UXIcon(name = "OrderFoodMobile") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 18f)
            horizontalLineToRelative(-12f)
            verticalLineToRelative(-12.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.61f, 0f, 1.2f, 0.22f, 1.65f, 0.62f)
            curveToRelative(0.62f, 0.55f, 1.57f, 0.49f, 2.12f, -0.13f)
            curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
            curveToRelative(-1.0f, -0.89f, -2.3f, -1.38f, -3.64f, -1.38f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, -0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13.5f)
            curveToRelative(0.06f, 2.73f, 2.21f, 5.01f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            curveToRelative(0f, 0f, 0f, -1f, -1f, -1f)
            close()
            moveTo(8.99f, 22.02f)
            horizontalLineToRelative(-1.99f)
            curveToRelative(-0.56f, 0f, -1.01f, -0.45f, -1.01f, -1.01f)
            reflectiveCurveToRelative(0.45f, -1.01f, 1.01f, -1.01f)
            horizontalLineToRelative(1.99f)
            curveToRelative(0.56f, 0f, 1.01f, 0.45f, 1.01f, 1.01f)
            reflectiveCurveToRelative(-0.45f, 1.01f, -1.01f, 1.01f)
            close()
            moveTo(21.5f, 5.0f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            lineToRelative(0.0f, 7.41f)
            curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
            lineToRelative(2.83f, -1.83f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-4.0f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(20f, 12f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(1.74f)
            lineToRelative(1.24f, 0.84f)
            curveToRelative(0.32f, 0.21f, 0.73f, 0.21f, 1.04f, 0f)
            lineToRelative(1.24f, -0.84f)
            horizontalLineToRelative(1.74f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(15f, 9f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _OrderFoodMobile = it }
