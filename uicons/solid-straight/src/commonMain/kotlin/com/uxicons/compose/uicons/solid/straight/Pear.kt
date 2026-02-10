package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pear: ImageVector? = null

val Icons.Ss.Pear: ImageVector
    get() = _Pear ?: UXIcon(name = "Pear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.72f, 3.81f)
                curveToRelative(0.87f, -0.89f, 1.82f, -2.25f, 1.82f, -3.93f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.0f, -0.61f, 1.87f, -1.21f, 2.49f)
                curveToRelative(-0.86f, -0.67f, -1.87f, -1.15f, -2.98f, -1.36f)
                curveToRelative(-2.83f, -0.53f, -5.67f, 0.67f, -7.23f, 3.05f)
                curveToRelative(-0.41f, 0.62f, -1.0f, 1.01f, -1.61f, 1.06f)
                curveToRelative(-2.25f, 0.18f, -4.36f, 1.16f, -5.96f, 2.76f)
                curveTo(0.77f, 9.66f, -0.12f, 11.98f, 0.06f, 14.4f)
                curveToRelative(0.17f, 2.28f, 1.27f, 4.54f, 3.09f, 6.37f)
                curveToRelative(2.07f, 2.07f, 4.56f, 3.11f, 6.97f, 3.11f)
                curveToRelative(2.15f, 0f, 4.24f, -0.83f, 5.92f, -2.51f)
                curveToRelative(1.59f, -1.59f, 2.57f, -3.71f, 2.76f, -5.96f)
                curveToRelative(0.05f, -0.61f, 0.44f, -1.2f, 1.06f, -1.61f)
                curveToRelative(2.38f, -1.56f, 3.58f, -4.4f, 3.05f, -7.23f)
                curveToRelative(-0.19f, -1.01f, -0.61f, -1.95f, -1.19f, -2.76f)
                close()
                moveTo(11.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Pear = it}
