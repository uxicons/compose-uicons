package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUpDown: ImageVector? = null

val Icons.Bs.ChartLineUpDown: ImageVector
    get() = _ChartLineUpDown ?: UXIcon(name = "ChartLineUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 21f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(3f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(20.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(22.91f, 2f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-4.94f, 4.94f)
                lineToRelative(-4f, -4f)
                lineToRelative(-5.56f, 5.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.44f, -3.44f)
                lineToRelative(4f, 4f)
                lineToRelative(7.06f, -7.06f)
                lineToRelative(2.44f, 2.44f)
                lineTo(24.0f, 3.09f)
                curveToRelative(0f, -0.6f, -0.49f, -1.09f, -1.09f, -1.09f)
                close()
                moveTo(19.06f, 11.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.44f, 2.44f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.6f, 0f, 1.09f, -0.49f, 1.09f, -1.09f)
                verticalLineToRelative(-5.91f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.5f, -2.5f)
                close()
            }
        }.also { _ChartLineUpDown = it}
