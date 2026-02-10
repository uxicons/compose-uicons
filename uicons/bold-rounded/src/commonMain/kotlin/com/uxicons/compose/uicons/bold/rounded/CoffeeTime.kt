package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeTime: ImageVector? = null

val Icons.Br.CoffeeTime: ImageVector
    get() = _CoffeeTime ?: UXIcon(name = "CoffeeTime") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.5f, 12f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(24f, 19.71f)
            curveToRelative(0f, 1.26f, -1.14f, 2.29f, -2.4f, 2.29f)
            horizontalLineToRelative(-1.61f)
            curveToRelative(-1.01f, 1.26f, -2.57f, 2f, -4.26f, 2f)
            horizontalLineToRelative(-1.46f)
            curveToRelative(-1.85f, 0f, -3.54f, -0.88f, -4.53f, -2.35f)
            curveToRelative(-0.75f, -1.13f, -1.44f, -2.0f, -1.73f, -4.56f)
            curveToRelative(-0.08f, -0.78f, 0.18f, -1.56f, 0.7f, -2.15f)
            curveToRelative(0.53f, -0.59f, 1.3f, -0.93f, 2.1f, -0.93f)
            lineToRelative(8.36f, 0.0f)
            curveToRelative(0.8f, 0f, 1.57f, 0.34f, 2.1f, 0.93f)
            curveToRelative(0.53f, 0.58f, 0.79f, 1.37f, 0.7f, 2.15f)
            curveToRelative(-0.04f, 0.34f, -0.08f, 0.64f, -0.13f, 0.93f)
            curveToRelative(1.16f, 0.06f, 2.15f, 0.53f, 2.15f, 1.7f)
            close()
            moveTo(17.92f, 19.75f)
            curveToRelative(0.51f, -0.74f, 0.88f, -1.29f, 1.05f, -2.75f)
            lineToRelative(-7.95f, -0.0f)
            curveToRelative(0.2f, 1.6f, 0.6f, 2.07f, 1.21f, 2.98f)
            curveToRelative(0.42f, 0.63f, 1.21f, 1.02f, 2.04f, 1.02f)
            horizontalLineToRelative(1.46f)
            curveToRelative(0.95f, 0.0f, 1.76f, -0.49f, 2.19f, -1.25f)
            close()
            moveTo(3f, 10.5f)
            curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
            reflectiveCurveToRelative(7.5f, 3.36f, 7.5f, 7.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -5.79f, -4.71f, -10.5f, -10.5f, -10.5f)
            reflectiveCurveToRelative(-10.5f, 4.71f, -10.5f, 10.5f)
            curveToRelative(0f, 2.98f, 1.27f, 5.83f, 3.5f, 7.83f)
            curveToRelative(0.61f, 0.55f, 1.56f, 0.5f, 2.12f, -0.12f)
            curveToRelative(0.55f, -0.62f, 0.5f, -1.56f, -0.12f, -2.12f)
            curveToRelative(-1.59f, -1.42f, -2.5f, -3.46f, -2.5f, -5.59f)
            close()
        }
    }.also { _CoffeeTime = it }
