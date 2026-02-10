package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bomb: ImageVector? = null

val Icons.Br.Bomb: ImageVector
    get() = _Bomb ?: UXIcon(name = "Bomb") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 6.24f)
            lineToRelative(-0.39f, -1.36f)
            lineToRelative(-1.36f, -0.39f)
            curveToRelative(-1.01f, -0.29f, -1.01f, -1.72f, 0f, -2.0f)
            lineToRelative(1.36f, -0.39f)
            lineToRelative(0.39f, -1.36f)
            curveToRelative(0.29f, -1.01f, 1.72f, -1.01f, 2.0f, 0f)
            lineToRelative(0.39f, 1.36f)
            lineToRelative(1.36f, 0.39f)
            curveToRelative(1.01f, 0.29f, 1.01f, 1.72f, 0f, 2.0f)
            lineToRelative(-1.36f, 0.39f)
            lineToRelative(-0.39f, 1.36f)
            curveToRelative(-0.29f, 1.01f, -1.72f, 1.01f, -2.0f, 0f)
            close()
            moveTo(20.0f, 10.87f)
            curveToRelative(0.64f, 1.24f, 1.0f, 2.64f, 1.0f, 4.13f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            reflectiveCurveTo(3f, 19.96f, 3f, 15f)
            reflectiveCurveTo(7.04f, 6f, 12f, 6f)
            curveToRelative(1.5f, 0f, 2.91f, 0.37f, 4.15f, 1.02f)
            curveToRelative(0f, 0f, 0.29f, -0.33f, 0.31f, -0.35f)
            curveToRelative(0.89f, -0.89f, 2.33f, -0.89f, 3.21f, 0f)
            lineToRelative(0.66f, 0.66f)
            curveToRelative(0.89f, 0.89f, 0.89f, 2.33f, 0f, 3.21f)
            lineToRelative(-0.34f, 0.34f)
            close()
            moveTo(18f, 15.0f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            close()
            moveTo(24f, 3.5f)
            curveTo(24f, 1.89f, 22.69f, 0.0f, 19f, 0.0f)
            curveTo(14.27f, 0.0f, 10.3f, 1.0f, 10.13f, 1.05f)
            curveToRelative(-0.8f, 0.2f, -1.29f, 1.02f, -1.08f, 1.82f)
            curveToRelative(0.2f, 0.8f, 1.02f, 1.29f, 1.82f, 1.08f)
            curveToRelative(0.04f, -0.01f, 3.8f, -0.95f, 8.13f, -0.95f)
            curveToRelative(1.48f, 0f, 1.96f, 0.41f, 2f, 0.5f)
            curveToRelative(0f, 0.33f, 0.01f, 0.32f, -0.17f, 0.56f)
            curveToRelative(-0.24f, 0.27f, -0.39f, 0.62f, -0.39f, 1.01f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(0.48f, 0f, 0.91f, -0.23f, 1.19f, -0.58f)
            curveToRelative(0.24f, -0.27f, 0.87f, -1.1f, 0.87f, -2.49f)
            close()
        }
    }.also { _Bomb = it }
