package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowsDown: ImageVector? = null

val Icons.Bs.TentArrowsDown: ImageVector
    get() = _TentArrowsDown ?: UXIcon(name = "TentArrowsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6.02f)
                lineTo(2.43f, 19.59f)
                curveToRelative(-0.55f, 0.91f, -0.57f, 2.0f, -0.05f, 2.93f)
                curveToRelative(0.52f, 0.93f, 1.52f, 1.51f, 2.61f, 1.51f)
                horizontalLineToRelative(14.04f)
                curveToRelative(1.08f, 0f, 2.08f, -0.58f, 2.61f, -1.51f)
                curveToRelative(0.52f, -0.93f, 0.5f, -2.02f, -0.08f, -2.98f)
                lineTo(12f, 6.02f)
                close()
                moveTo(15.26f, 21.04f)
                lineToRelative(-3.26f, -4.54f)
                lineToRelative(-3.27f, 4.55f)
                lineToRelative(-3.68f, 0.01f)
                lineToRelative(6.95f, -9.6f)
                lineToRelative(6.93f, 9.57f)
                lineToRelative(-3.67f, 0.01f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, -3.71f)
                close()
                moveTo(0f, 5f)
                horizontalLineToRelative(3f)
                lineTo(3f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(0f, 5f)
                close()
            }
        }.also { _TentArrowsDown = it}
