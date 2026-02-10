package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Ss.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 7.41f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.5f, -3.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2f)
                verticalLineTo(10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.59f, 7.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineTo(5.09f, 0.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.5f, 3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.64f, 0f, 3.09f, 0.81f, 4f, 2.03f)
                curveToRelative(0.91f, -1.23f, 2.36f, -2.03f, 4f, -2.03f)
                horizontalLineToRelative(5f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(18.91f, 0.09f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _ArrowsSplitRightAndLeft = it}
