package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartGantt: ImageVector? = null

val Icons.Bs.ChartGantt: ImageVector
    get() = _ChartGantt ?: UXIcon(name = "ChartGantt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 9f)
                lineTo(10f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 3f)
                lineTo(6f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                lineTo(13f, 3f)
                close()
            }
        }.also { _ChartGantt = it}
