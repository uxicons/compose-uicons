package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Bs.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.64f, 6.36f)
                lineToRelative(-4.64f, 4.64f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                lineTo(0.36f, 6.36f)
                curveToRelative(-0.48f, -0.48f, -0.48f, -1.25f, 0f, -1.73f)
                lineTo(5f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                curveToRelative(1.58f, 0f, 3.0f, 0.67f, 4f, 1.74f)
                curveToRelative(1.0f, -1.07f, 2.42f, -1.74f, 4f, -1.74f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                lineToRelative(4.64f, 4.64f)
                curveToRelative(0.48f, 0.48f, 0.48f, 1.25f, 0f, 1.73f)
                close()
            }
        }.also { _ArrowsSplitRightAndLeft = it}
