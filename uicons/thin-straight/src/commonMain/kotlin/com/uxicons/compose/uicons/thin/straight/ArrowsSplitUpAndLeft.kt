package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitUpAndLeft: ImageVector? = null

val Icons.Ts.ArrowsSplitUpAndLeft: ImageVector
    get() = _ArrowsSplitUpAndLeft ?: UXIcon(name = "ArrowsSplitUpAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(14.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(13f)
                horizontalLineTo(1.25f)
                lineToRelative(4.61f, 4.65f)
                lineToRelative(-0.71f, 0.7f)
                lineTo(0.47f, 13.63f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0.0f, -2.26f)
                lineTo(5.14f, 6.65f)
                lineToRelative(0.71f, 0.7f)
                lineTo(1.25f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(1.25f)
                lineTo(7.35f, 5.86f)
                lineToRelative(-0.7f, -0.71f)
                lineTo(11.37f, 0.47f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0.0f)
                lineToRelative(4.72f, 4.68f)
                lineToRelative(-0.7f, 0.71f)
                lineTo(13f, 1.25f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.5f)
                close()
            }
        }.also { _ArrowsSplitUpAndLeft = it}
