package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArrowGrow: ImageVector? = null

val Icons.Ts.ChartArrowGrow: ImageVector
    get() = _ChartArrowGrow ?: UXIcon(name = "ChartArrowGrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 23f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, -0.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(21.52f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 5.7f)
                verticalLineToRelative(6.48f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-5.76f, 5.76f)
                lineToRelative(-2.49f, -2.49f)
                lineToRelative(-7.15f, 7.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(7.85f, -7.85f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(5.05f, -5.05f)
                lineToRelative(-3.73f, -3.73f)
                horizontalLineToRelative(6.48f)
                curveToRelative(0.94f, 0f, 1.7f, 0.76f, 1.7f, 1.7f)
                close()
                moveTo(23f, 5.7f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                horizontalLineToRelative(-4.07f)
                lineToRelative(4.77f, 4.77f)
                verticalLineToRelative(-4.07f)
                close()
            }
        }.also { _ChartArrowGrow = it}
