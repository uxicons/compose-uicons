package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUpDown: ImageVector? = null

val Icons.Br.ChartLineUpDown: ImageVector
    get() = _ChartLineUpDown ?: UXIcon(name = "ChartLineUpDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 24f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(0f, 1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(19f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23f, 2f)
            horizontalLineToRelative(-5.05f)
            curveToRelative(-0.85f, 0f, -1.27f, 1.02f, -0.67f, 1.62f)
            lineToRelative(1.47f, 1.47f)
            lineToRelative(-2.81f, 2.76f)
            curveToRelative(-0.13f, 0.13f, -0.28f, 0.15f, -0.35f, 0.15f)
            reflectiveCurveToRelative(-0.23f, -0.02f, -0.35f, -0.15f)
            curveToRelative(-0.06f, -0.06f, -1.28f, -0.93f, -1.28f, -0.93f)
            curveToRelative(-1.33f, -1.23f, -3.6f, -1.15f, -4.81f, 0.06f)
            lineToRelative(-3.67f, 3.41f)
            curveToRelative(-0.61f, 0.56f, -0.64f, 1.51f, -0.08f, 2.12f)
            curveToRelative(0.3f, 0.32f, 0.7f, 0.48f, 1.1f, 0.48f)
            curveToRelative(0.37f, 0f, 0.73f, -0.13f, 1.02f, -0.4f)
            lineToRelative(3.71f, -3.45f)
            curveToRelative(0.13f, -0.13f, 0.28f, -0.15f, 0.35f, -0.15f)
            reflectiveCurveToRelative(0.23f, 0.02f, 0.35f, 0.15f)
            curveToRelative(0.06f, 0.06f, 1.28f, 0.93f, 1.28f, 0.93f)
            curveToRelative(1.33f, 1.23f, 3.56f, 1.18f, 4.83f, -0.09f)
            lineToRelative(2.82f, -2.77f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.6f, 0.6f, 1.62f, 0.17f, 1.62f, -0.67f)
            lineTo(24f, 3f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
            moveTo(22.38f, 12.28f)
            lineToRelative(-1.49f, 1.49f)
            lineToRelative(-1.33f, -1.33f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(1.33f, 1.33f)
            lineToRelative(-1.49f, 1.49f)
            curveToRelative(-0.6f, 0.6f, -0.17f, 1.62f, 0.67f, 1.62f)
            horizontalLineToRelative(5.05f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-5.05f)
            curveToRelative(0f, -0.85f, -1.02f, -1.27f, -1.62f, -0.67f)
            close()
        }
    }.also { _ChartLineUpDown = it }
