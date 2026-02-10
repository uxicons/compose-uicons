package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowLeftRight: ImageVector? = null

val Icons.Bs.TentArrowLeftRight: ImageVector
    get() = _TentArrowLeftRight ?: UXIcon(name = "TentArrowLeftRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.05f, 6f)
                lineTo(2.48f, 19.57f)
                curveToRelative(-0.56f, 0.91f, -0.57f, 2.0f, -0.05f, 2.93f)
                curveToRelative(0.52f, 0.94f, 1.52f, 1.51f, 2.61f, 1.51f)
                horizontalLineToRelative(14.04f)
                curveToRelative(1.08f, 0f, 2.08f, -0.58f, 2.6f, -1.51f)
                curveToRelative(0.52f, -0.93f, 0.5f, -2.02f, -0.08f, -2.98f)
                lineTo(12.05f, 6f)
                close()
                moveTo(15.31f, 21.02f)
                lineToRelative(-3.26f, -4.52f)
                lineToRelative(-3.27f, 4.53f)
                lineToRelative(-3.68f, 0.01f)
                lineToRelative(6.95f, -9.6f)
                lineToRelative(6.93f, 9.58f)
                lineToRelative(-3.67f, 0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.7f, 3.77f)
                lineTo(19.99f, -0.02f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.05f)
                verticalLineTo(-0.02f)
                lineTo(0.34f, 3.77f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.71f, 3.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(15.94f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _TentArrowLeftRight = it}
