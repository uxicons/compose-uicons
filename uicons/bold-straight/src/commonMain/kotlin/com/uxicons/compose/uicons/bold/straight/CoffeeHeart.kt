package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeHeart: ImageVector? = null

val Icons.Bs.CoffeeHeart: ImageVector
    get() = _CoffeeHeart ?: UXIcon(name = "CoffeeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.51f, 12f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-0.04f, -0.65f, -0.28f, -1.28f, -0.72f, -1.79f)
                curveToRelative(-0.64f, -0.76f, -1.57f, -1.2f, -2.56f, -1.2f)
                lineToRelative(-12.42f, -0.0f)
                curveToRelative(-0.97f, 0f, -1.9f, 0.43f, -2.53f, 1.17f)
                curveTo(0.15f, 10.89f, -0.12f, 11.81f, 0.03f, 12.72f)
                curveToRelative(0.79f, 4.79f, 4.57f, 10.39f, 4.74f, 10.62f)
                lineToRelative(0.45f, 0.66f)
                lineTo(13.93f, 24f)
                lineToRelative(0.44f, -0.69f)
                curveToRelative(0.07f, -0.11f, 0.92f, -1.44f, 1.87f, -3.31f)
                horizontalLineToRelative(3.27f)
                curveToRelative(2.44f, 0f, 4.5f, -2.0f, 4.5f, -4.36f)
                curveToRelative(0f, -2.21f, -1.77f, -3.64f, -4.5f, -3.64f)
                close()
                moveTo(12.27f, 21f)
                lineTo(6.82f, 21f)
                curveToRelative(-0.97f, -1.54f, -3.29f, -5.5f, -3.83f, -8.76f)
                curveToRelative(-0.0f, -0.01f, 0.0f, -0.24f, 0.29f, -0.24f)
                reflectiveCurveToRelative(12.42f, 0.0f, 12.42f, 0.0f)
                curveToRelative(0.11f, 0f, 0.21f, 0.07f, 0.29f, 0.21f)
                curveToRelative(-0.6f, 3.27f, -2.8f, 7.22f, -3.73f, 8.79f)
                close()
                moveTo(19.51f, 17f)
                horizontalLineToRelative(-1.88f)
                curveToRelative(0.27f, -0.65f, 0.52f, -1.32f, 0.73f, -2f)
                horizontalLineToRelative(1.15f)
                curveToRelative(0.56f, 0f, 1.5f, 0.08f, 1.5f, 0.64f)
                curveToRelative(0f, 0.71f, -0.71f, 1.36f, -1.5f, 1.36f)
                close()
                moveTo(5.5f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, 2.3f, -4f, 5.13f, -4f, 5.13f)
                curveToRelative(0f, 0f, -4f, -2.83f, -4f, -5.13f)
                close()
            }
        }.also { _CoffeeHeart = it}
