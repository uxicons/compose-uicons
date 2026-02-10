package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner2: ImageVector? = null

val Icons.Ss.Banner2: ImageVector
    get() = _Banner2 ?: UXIcon(name = "Banner2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 15f)
                curveToRelative(-6.46f, 0.5f, -5.54f, 4f, -10.15f, 4f)
                curveToRelative(-0.92f, 0f, -1.85f, -0.5f, -1.85f, -0.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(6.46f, 0f, 5.54f, -4f, 10.15f, -4f)
                curveToRelative(0.92f, 0f, 1.85f, 0.5f, 1.85f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(0.77f, 0f, 1.38f, -0.07f, 1.9f, -0.17f)
                curveToRelative(-0.27f, -1.09f, -1.14f, -1.96f, -2.28f, -2.21f)
                curveToRelative(-1.79f, -0.39f, -3.94f, -1.0f, -5.58f, -1.67f)
                verticalLineToRelative(0.07f)
                curveToRelative(1.19f, 2.94f, 2.98f, 5.01f, 2.98f, 5.01f)
                curveToRelative(0f, 0f, -1.49f, 2.03f, -2.98f, 2.98f)
                verticalLineToRelative(0.07f)
                reflectiveCurveToRelative(1.58f, 1.07f, 3.96f, 1.66f)
                verticalLineToRelative(-5.74f)
                close()
                moveTo(24f, 12.94f)
                verticalLineToRelative(-0.07f)
                reflectiveCurveToRelative(-1.59f, -1.07f, -4f, -1.66f)
                verticalLineToRelative(5.64f)
                lineToRelative(-1.85f, 0.14f)
                curveToRelative(-0.81f, 0.06f, -1.45f, 0.18f, -2.0f, 0.32f)
                curveToRelative(0.33f, 0.99f, 1.16f, 1.77f, 2.24f, 2.01f)
                curveToRelative(1.8f, 0.39f, 3.96f, 1.0f, 5.61f, 1.67f)
                verticalLineToRelative(-0.07f)
                curveToRelative(-1.19f, -2.94f, -3f, -5.01f, -3f, -5.01f)
                curveToRelative(0f, 0f, 1.5f, -2.03f, 3f, -2.98f)
                close()
            }
        }.also { _Banner2 = it}
