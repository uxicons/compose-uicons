package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flask: ImageVector? = null

val Icons.Br.Flask: ImageVector
    get() = _Flask ?: UXIcon(name = "Flask") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.8f, 9.52f)
            curveToRelative(-0.51f, -0.47f, -0.8f, -1.13f, -0.8f, -1.83f)
            lineTo(17f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(6.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(4.69f)
            curveToRelative(0f, 0.69f, -0.29f, 1.36f, -0.8f, 1.83f)
            curveTo(3.37f, 12.13f, 0f, 15.98f, 0f, 19.5f)
            curveToRelative(0f, 0.85f, 0.21f, 1.64f, 0.63f, 2.35f)
            curveToRelative(0.79f, 1.33f, 2.31f, 2.15f, 3.96f, 2.15f)
            horizontalLineToRelative(14.82f)
            curveToRelative(1.65f, 0f, 3.17f, -0.82f, 3.96f, -2.15f)
            curveToRelative(0.42f, -0.7f, 0.63f, -1.49f, 0.63f, -2.35f)
            curveToRelative(0f, -3.52f, -3.37f, -7.37f, -6.2f, -9.98f)
            close()
            moveTo(20.79f, 20.32f)
            curveToRelative(-0.25f, 0.42f, -0.79f, 0.69f, -1.38f, 0.69f)
            lineTo(4.59f, 21.0f)
            curveToRelative(-0.59f, 0f, -1.13f, -0.27f, -1.38f, -0.68f)
            curveToRelative(-0.14f, -0.24f, -0.21f, -0.51f, -0.21f, -0.82f)
            curveToRelative(0f, -0.7f, 0.28f, -1.55f, 0.81f, -2.5f)
            horizontalLineToRelative(10.69f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(6.0f, 14.0f)
            curveToRelative(0.65f, -0.74f, 1.41f, -1.51f, 2.24f, -2.28f)
            curveToRelative(1.12f, -1.03f, 1.76f, -2.5f, 1.76f, -4.03f)
            lineTo(10.0f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4.69f)
            curveToRelative(0f, 1.53f, 0.64f, 3.0f, 1.76f, 4.03f)
            curveToRelative(3.28f, 3.03f, 5.24f, 5.94f, 5.24f, 7.78f)
            curveToRelative(0f, 0.31f, -0.07f, 0.58f, -0.21f, 0.81f)
            close()
        }
    }.also { _Flask = it }
