package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUpDown: ImageVector? = null

val Icons.Ts.ChartLineUpDown: ImageVector
    get() = _ChartLineUpDown ?: UXIcon(name = "ChartLineUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 23f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(22.5f, 2f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.29f)
                lineToRelative(-7.29f, 7.29f)
                lineToRelative(-4.46f, -4.46f)
                lineToRelative(-7.28f, 7.28f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.57f, -6.57f)
                lineToRelative(4.46f, 4.46f)
                lineTo(23f, 3.71f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 18.29f)
                lineToRelative(-5.77f, -5.77f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(5.77f, 5.77f)
                horizontalLineToRelative(-5.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.29f)
                close()
            }
        }.also { _ChartLineUpDown = it}
