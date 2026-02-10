package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayChartUp: ImageVector? = null

val Icons.Bs.DisplayChartUp: ImageVector
    get() = _DisplayChartUp ?: UXIcon(name = "DisplayChartUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.98f, 6.96f)
                verticalLineToRelative(5.07f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-3.78f, 3.78f)
                lineToRelative(-3.74f, -3.74f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(4.88f, -4.88f)
                lineToRelative(3.74f, 3.74f)
                lineToRelative(1.66f, -1.66f)
                lineToRelative(-1.94f, -1.94f)
                horizontalLineToRelative(5.07f)
                curveToRelative(0.52f, 0f, 0.94f, 0.42f, 0.94f, 0.94f)
                close()
                moveTo(13.5f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                lineTo(21f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                lineTo(13.5f, 18f)
                close()
                moveTo(21f, 15f)
                lineTo(21f, 4f)
                lineTo(3.0f, 4f)
                lineToRelative(0.0f, 11f)
                lineTo(21f, 15f)
                close()
            }
        }.also { _DisplayChartUp = it}
