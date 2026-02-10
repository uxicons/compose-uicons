package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitUpAndLeft: ImageVector? = null

val Icons.Ss.ArrowsSplitUpAndLeft: ImageVector
    get() = _ArrowsSplitUpAndLeft ?: UXIcon(name = "ArrowsSplitUpAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(2.95f)
                lineToRelative(3.8f, 3.76f)
                lineToRelative(1.41f, -1.42f)
                lineTo(14.49f, 0.62f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, -0.0f)
                lineTo(6.8f, 5.29f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(3.8f, -3.76f)
                verticalLineTo(12f)
                horizontalLineTo(2.95f)
                lineToRelative(3.76f, -3.8f)
                lineToRelative(-1.42f, -1.41f)
                lineTo(0.62f, 11.51f)
                curveToRelative(-0.82f, 0.82f, -0.82f, 2.15f, -0.0f, 2.97f)
                lineToRelative(4.68f, 4.72f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(-3.76f, -3.8f)
                horizontalLineTo(12f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(15f)
                close()
            }
        }.also { _ArrowsSplitUpAndLeft = it}
