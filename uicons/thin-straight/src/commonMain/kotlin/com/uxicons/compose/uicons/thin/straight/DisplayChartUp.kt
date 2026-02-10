package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayChartUp: ImageVector? = null

val Icons.Ts.DisplayChartUp: ImageVector
    get() = _DisplayChartUp ?: UXIcon(name = "DisplayChartUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(2f, 1f)
                curveTo(0.9f, 1f, 0f, 1.9f, 0f, 3f)
                lineTo(0f, 19f)
                lineTo(11.5f, 19f)
                verticalLineToRelative(3f)
                lineTo(6f, 22f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(1f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(22f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                lineTo(1f, 18f)
                lineTo(1f, 3f)
                close()
                moveTo(20f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 6.71f)
                lineToRelative(-6.15f, 6.15f)
                lineToRelative(-3f, -3f)
                lineToRelative(-4.63f, 4.63f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.33f, -5.33f)
                lineToRelative(3f, 3f)
                lineToRelative(5.45f, -5.45f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DisplayChartUp = it}
