package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lips: ImageVector? = null

val Icons.Sc.Lips: ImageVector
    get() = _Lips ?: UXIcon(name = "Lips") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.64f, 10.5f)
                curveToRelative(0.87f, -0.72f, 1.56f, -1.64f, 2.27f, -2.62f)
                curveToRelative(0.65f, -0.9f, 1.33f, -1.82f, 2.19f, -2.61f)
                curveToRelative(0.94f, -0.87f, 1.9f, -1.29f, 2.91f, -1.3f)
                curveToRelative(0.81f, 0.01f, 1.92f, 0.29f, 2.99f, 1.45f)
                curveToRelative(1.07f, -1.15f, 2.18f, -1.44f, 2.99f, -1.45f)
                curveToRelative(0.99f, -0.03f, 1.97f, 0.43f, 2.91f, 1.3f)
                curveToRelative(0.86f, 0.8f, 1.53f, 1.72f, 2.19f, 2.61f)
                curveToRelative(0.71f, 0.98f, 1.4f, 1.9f, 2.27f, 2.62f)
                curveToRelative(-1.9f, 0.17f, -6.15f, 0.5f, -10.37f, 0.5f)
                reflectiveCurveToRelative(-8.46f, -0.33f, -10.37f, -0.5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-4.43f, 0f, -8.89f, -0.36f, -10.72f, -0.53f)
                curveToRelative(1.69f, 4.72f, 5.65f, 7.53f, 10.72f, 7.53f)
                reflectiveCurveToRelative(9.03f, -2.8f, 10.72f, -7.53f)
                curveToRelative(-1.84f, 0.17f, -6.3f, 0.53f, -10.72f, 0.53f)
                close()
            }
        }.also { _Lips = it}
