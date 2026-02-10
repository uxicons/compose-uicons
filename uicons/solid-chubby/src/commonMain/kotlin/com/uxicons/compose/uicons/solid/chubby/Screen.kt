package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screen: ImageVector? = null

val Icons.Sc.Screen: ImageVector
    get() = _Screen ?: UXIcon(name = "Screen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 2.78f)
                curveToRelative(-0.12f, -0.31f, -0.39f, -0.54f, -0.72f, -0.61f)
                curveToRelative(-0.17f, -0.04f, -4.24f, -0.91f, -9.06f, -0.91f)
                reflectiveCurveTo(3.11f, 2.13f, 2.94f, 2.17f)
                curveToRelative(-0.33f, 0.07f, -0.6f, 0.3f, -0.72f, 0.61f)
                curveToRelative(-0.05f, 0.13f, -1.22f, 3.15f, -1.22f, 7.16f)
                curveToRelative(0f, 0.66f, 0.03f, 1.29f, 0.08f, 1.89f)
                curveToRelative(1.83f, 0.33f, 6.14f, 1.0f, 10.92f, 1.0f)
                reflectiveCurveToRelative(9.09f, -0.67f, 10.92f, -1.0f)
                curveToRelative(0.05f, -0.6f, 0.08f, -1.23f, 0.08f, -1.89f)
                curveToRelative(0f, -4.05f, -1.17f, -7.04f, -1.22f, -7.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.36f, 13.91f)
                curveToRelative(0.35f, 1.9f, 0.82f, 3.12f, 0.86f, 3.19f)
                curveToRelative(0.12f, 0.31f, 0.39f, 0.54f, 0.72f, 0.61f)
                curveToRelative(0.15f, 0.03f, 3.43f, 0.73f, 7.56f, 0.88f)
                verticalLineToRelative(1.14f)
                horizontalLineToRelative(-2.98f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.96f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.98f)
                verticalLineToRelative(-1.14f)
                curveToRelative(4.13f, -0.15f, 7.41f, -0.84f, 7.56f, -0.88f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.03f, -0.08f, 0.5f, -1.3f, 0.85f, -3.19f)
                curveToRelative(-2.14f, 0.36f, -6.16f, 0.92f, -10.63f, 0.92f)
                reflectiveCurveToRelative(-8.49f, -0.56f, -10.63f, -0.92f)
                close()
            }
        }.also { _Screen = it}
