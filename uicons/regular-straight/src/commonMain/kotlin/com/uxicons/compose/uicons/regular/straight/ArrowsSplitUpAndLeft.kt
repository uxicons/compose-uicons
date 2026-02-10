package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitUpAndLeft: ImageVector? = null

val Icons.Rs.ArrowsSplitUpAndLeft: ImageVector
    get() = _ArrowsSplitUpAndLeft ?: UXIcon(name = "ArrowsSplitUpAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineTo(2.95f)
                lineToRelative(3.76f, 3.8f)
                lineToRelative(-1.42f, 1.41f)
                lineTo(0.61f, 14.48f)
                curveToRelative(-0.82f, -0.82f, -0.82f, -2.15f, 0.0f, -2.97f)
                lineTo(5.29f, 6.8f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-3.76f, 3.8f)
                horizontalLineTo(12f)
                verticalLineTo(2.95f)
                lineToRelative(-3.8f, 3.76f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(11.52f, 0.61f)
                curveToRelative(0.82f, -0.82f, 2.15f, -0.82f, 2.97f, 0.0f)
                lineToRelative(4.72f, 4.67f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(-3.8f, -3.76f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _ArrowsSplitUpAndLeft = it}
