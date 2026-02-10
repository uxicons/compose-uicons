package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Br.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 24f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(-1.64f)
            curveToRelative(-1.37f, 0f, -2.59f, -0.82f, -3.1f, -2.08f)
            reflectiveCurveToRelative(-0.23f, -2.7f, 0.73f, -3.66f)
            lineTo(8.96f, 1.26f)
            curveToRelative(1.68f, -1.67f, 4.4f, -1.68f, 6.08f, 0f)
            curveToRelative(0f, 0f, 5.97f, 6f, 5.97f, 6f)
            curveToRelative(0.96f, 0.96f, 1.25f, 2.4f, 0.73f, 3.66f)
            curveToRelative(-0.52f, 1.26f, -1.73f, 2.08f, -3.1f, 2.08f)
            horizontalLineToRelative(-1.65f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            close()
            moveTo(8.5f, 10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.27f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
            lineTo(14f, 11.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.14f)
            curveToRelative(0.15f, 0f, 0.27f, -0.08f, 0.33f, -0.23f)
            reflectiveCurveToRelative(0.03f, -0.28f, -0.08f, -0.4f)
            lineTo(12.92f, 3.38f)
            curveToRelative(-0.51f, -0.5f, -1.33f, -0.5f, -1.83f, 0f)
            lineToRelative(-5.97f, 6f)
            curveToRelative(-0.12f, 0.12f, -0.14f, 0.25f, -0.08f, 0.4f)
            curveToRelative(0.06f, 0.15f, 0.17f, 0.22f, 0.34f, 0.23f)
            horizontalLineToRelative(3.13f)
            close()
        }
    }.also { _Up = it }
