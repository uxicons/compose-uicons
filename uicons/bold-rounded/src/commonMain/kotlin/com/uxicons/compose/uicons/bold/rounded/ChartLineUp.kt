package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Br.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 24f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(0f, 1.5f)
            curveTo(0.03f, -0.47f, 2.97f, -0.47f, 3f, 1.5f)
            lineTo(3f, 20.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            lineTo(22.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(20.5f, 5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(1.35f)
            lineToRelative(-2.91f, 2.85f)
            curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
            curveToRelative(-0.06f, -0.06f, -1.28f, -0.93f, -1.28f, -0.93f)
            curveToRelative(-1.37f, -1.26f, -3.51f, -1.23f, -4.81f, 0.06f)
            lineToRelative(-3.67f, 3.41f)
            curveToRelative(-0.61f, 0.56f, -0.64f, 1.51f, -0.08f, 2.12f)
            curveToRelative(0.57f, 0.61f, 1.51f, 0.64f, 2.12f, 0.08f)
            lineToRelative(3.71f, -3.45f)
            curveToRelative(0.2f, -0.19f, 0.51f, -0.2f, 0.71f, 0f)
            curveToRelative(0.06f, 0.06f, 1.28f, 0.93f, 1.28f, 0.93f)
            curveToRelative(1.37f, 1.26f, 3.52f, 1.23f, 4.83f, -0.09f)
            lineToRelative(2.95f, -2.89f)
            verticalLineToRelative(1.41f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
        }
    }.also { _ChartLineUp = it }
