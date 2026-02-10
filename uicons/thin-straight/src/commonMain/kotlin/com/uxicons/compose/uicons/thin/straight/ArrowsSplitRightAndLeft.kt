package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Ts.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 6.56f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.35f, -4.35f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(1.29f)
                lineToRelative(4.35f, 4.35f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.44f, 6.56f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineTo(4.94f, -0.06f)
                lineToRelative(0.71f, 0.71f)
                lineTo(1.29f, 5f)
                horizontalLineToRelative(6.71f)
                curveToRelative(1.75f, 0f, 3.26f, 1.02f, 4f, 2.48f)
                curveToRelative(0.74f, -1.47f, 2.25f, -2.48f, 4f, -2.48f)
                horizontalLineToRelative(6.71f)
                lineTo(18.35f, 0.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                close()
            }
        }.also { _ArrowsSplitRightAndLeft = it}
