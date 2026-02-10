package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartGantt: ImageVector? = null

val Icons.Ts.ChartGantt: ImageVector
    get() = _ChartGantt ?: UXIcon(name = "ChartGantt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(24f, 23f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 11f)
                lineTo(9f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ChartGantt = it}
