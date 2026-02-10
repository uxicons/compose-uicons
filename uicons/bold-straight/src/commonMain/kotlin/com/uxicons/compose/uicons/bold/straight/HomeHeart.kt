package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeHeart: ImageVector? = null

val Icons.Bs.HomeHeart: ImageVector
    get() = _HomeHeart ?: UXIcon(name = "HomeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.66f, 7.41f)
                lineTo(14.16f, 0.76f)
                curveToRelative(-1.27f, -0.99f, -3.04f, -0.99f, -4.31f, 0f)
                lineTo(1.34f, 7.41f)
                curveToRelative(-0.85f, 0.67f, -1.34f, 1.67f, -1.34f, 2.76f)
                verticalLineToRelative(13.82f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, -0.49f, -2.09f, -1.34f, -2.76f)
                close()
                moveTo(21f, 20.99f)
                lineTo(3f, 20.99f)
                verticalLineToRelative(-10.82f)
                curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                lineTo(11.69f, 3.12f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.61f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.12f, 0.1f, 0.19f, 0.24f, 0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                close()
                moveTo(16.48f, 12.47f)
                curveToRelative(0f, 2.59f, -4.5f, 5.78f, -4.5f, 5.78f)
                curveToRelative(0f, 0f, -4.5f, -3.18f, -4.5f, -5.78f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                close()
            }
        }.also { _HomeHeart = it}
