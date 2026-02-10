package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeHeart: ImageVector? = null

val Icons.Sr.CoffeeHeart: ImageVector
    get() = _CoffeeHeart ?: UXIcon(name = "CoffeeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(0.03f, -0.23f, 0.07f, -0.44f, 0.1f, -0.67f)
                curveToRelative(0.09f, -0.85f, -0.19f, -1.71f, -0.77f, -2.34f)
                curveToRelative(-0.56f, -0.62f, -1.37f, -0.98f, -2.21f, -0.98f)
                lineToRelative(-14.01f, -0.0f)
                curveToRelative(-0.84f, 0f, -1.65f, 0.36f, -2.21f, 0.98f)
                curveTo(0.21f, 11.62f, -0.07f, 12.47f, 0.01f, 13.32f)
                curveToRelative(0.3f, 3.06f, 1.11f, 5.61f, 2.39f, 7.58f)
                curveToRelative(1.26f, 1.94f, 3.43f, 3.09f, 5.81f, 3.09f)
                horizontalLineToRelative(3.57f)
                curveToRelative(2.34f, 0f, 4.47f, -1.12f, 5.74f, -3f)
                horizontalLineToRelative(2.48f)
                curveToRelative(2.17f, 0f, 4f, -1.77f, 4f, -3.86f)
                curveToRelative(0f, -1.94f, -1.53f, -3.14f, -4f, -3.14f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-1.41f)
                curveToRelative(0.4f, -0.91f, 0.71f, -1.92f, 0.95f, -3f)
                horizontalLineToRelative(0.46f)
                curveToRelative(1.33f, 0f, 2f, 0.39f, 2f, 1.14f)
                curveToRelative(0f, 0.99f, -0.94f, 1.86f, -2f, 1.86f)
                close()
                moveTo(12.25f, 0f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                reflectiveCurveToRelative(-2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0f, 1.79f, 2.1f, 4.31f, 3.43f, 5.37f)
                curveToRelative(0.62f, 0.5f, 1.51f, 0.5f, 2.13f, 0f)
                curveToRelative(1.33f, -1.07f, 3.43f, -3.58f, 3.43f, -5.37f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                close()
            }
        }.also { _CoffeeHeart = it}
