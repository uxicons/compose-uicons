package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballPlayer: ImageVector? = null

val Icons.Br.BaseballPlayer: ImageVector
    get() = _BaseballPlayer ?: UXIcon(name = "BaseballPlayer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 3.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(2f, 5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(23.84f, 9.83f)
            lineTo(19.34f, 0.83f)
            curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f)
            curveToRelative(-0.74f, 0.37f, -1.04f, 1.27f, -0.67f, 2.01f)
            lineToRelative(3.42f, 6.83f)
            horizontalLineToRelative(-2.71f)
            curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.17f, -0.03f)
            lineToRelative(-4.7f, -1.75f)
            curveToRelative(-0.76f, -0.31f, -1.62f, -0.3f, -2.37f, 0.03f)
            curveToRelative(-0.75f, 0.33f, -1.3f, 0.98f, -1.61f, 1.74f)
            lineToRelative(-4.62f, 13.01f)
            curveToRelative(-0.28f, 0.78f, 0.13f, 1.64f, 0.91f, 1.92f)
            curveToRelative(0.76f, 0.27f, 1.64f, -0.12f, 1.92f, -0.91f)
            lineToRelative(2.12f, -5.96f)
            lineToRelative(3.16f, 2.24f)
            verticalLineToRelative(3.23f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.48f)
            curveToRelative(0f, -0.81f, -0.4f, -1.57f, -1.05f, -2.04f)
            lineToRelative(-2.12f, -1.5f)
            lineToRelative(1.66f, -4.69f)
            lineToRelative(2.65f, 0.99f)
            curveToRelative(0.39f, 0.15f, 0.8f, 0.22f, 1.22f, 0.22f)
            horizontalLineToRelative(5.14f)
            curveToRelative(0.52f, 0f, 1.0f, -0.27f, 1.28f, -0.71f)
            curveToRelative(0.27f, -0.44f, 0.3f, -0.99f, 0.07f, -1.46f)
            close()
        }
    }.also { _BaseballPlayer = it }
