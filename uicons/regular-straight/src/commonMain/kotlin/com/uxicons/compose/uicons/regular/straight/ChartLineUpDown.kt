package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUpDown: ImageVector? = null

val Icons.Rs.ChartLineUpDown: ImageVector
    get() = _ChartLineUpDown ?: UXIcon(name = "ChartLineUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-7f, 7f)
                lineToRelative(-4f, -4f)
                lineToRelative(-5.29f, 5.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(6.71f, -6.71f)
                lineToRelative(4f, 4f)
                lineToRelative(5.59f, -5.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(2f, 21f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-2f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 15.59f)
                lineToRelative(-3.79f, -3.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.79f, 3.79f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.59f)
                close()
            }
        }.also { _ChartLineUpDown = it}
