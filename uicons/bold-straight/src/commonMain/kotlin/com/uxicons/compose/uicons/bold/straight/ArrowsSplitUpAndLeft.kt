package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitUpAndLeft: ImageVector? = null

val Icons.Bs.ArrowsSplitUpAndLeft: ImageVector
    get() = _ArrowsSplitUpAndLeft ?: UXIcon(name = "ArrowsSplitUpAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(15.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(4.65f)
                lineToRelative(2.92f, 2.94f)
                lineToRelative(-2.13f, 2.11f)
                lineTo(0.76f, 15.34f)
                curveToRelative(-1.01f, -1.01f, -1.01f, -2.66f, 0.01f, -3.67f)
                lineTo(5.43f, 6.94f)
                lineToRelative(2.13f, 2.11f)
                lineToRelative(-2.92f, 2.94f)
                horizontalLineToRelative(7.35f)
                verticalLineTo(4.65f)
                lineToRelative(-2.94f, 2.92f)
                lineToRelative(-2.11f, -2.13f)
                lineTo(11.66f, 0.76f)
                curveToRelative(1.01f, -1.01f, 2.66f, -1.01f, 3.67f, 0.01f)
                lineToRelative(4.72f, 4.67f)
                lineToRelative(-2.11f, 2.13f)
                lineToRelative(-2.94f, -2.92f)
                verticalLineToRelative(15.85f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8.5f)
                close()
            }
        }.also { _ArrowsSplitUpAndLeft = it}
