package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartScatter: ImageVector? = null

val Icons.Br.ChartScatter: ImageVector
    get() = _ChartScatter ?: UXIcon(name = "ChartScatter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 24f)
            lineTo(3.5f, 24f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(0f, 1.5f)
            curveTo(0.03f, -0.47f, 2.97f, -0.47f, 3f, 1.5f)
            lineTo(3f, 20.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            lineTo(22.5f, 21f)
            curveToRelative(1.97f, 0.03f, 1.97f, 2.97f, 0f, 3f)
            close()
            moveTo(14f, 12.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
            moveTo(20f, 6.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
            moveTo(11f, 17.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
            moveTo(20f, 16.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
            moveTo(9f, 4.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
            moveTo(5f, 11.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            close()
        }
    }.also { _ChartScatter = it }
