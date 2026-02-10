package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Bs.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.01f, 9f)
                lineToRelative(-2.73f, 6f)
                horizontalLineToRelative(11.72f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13.08f)
                lineToRelative(-2.71f, 5.97f)
                lineToRelative(-2.73f, -1.24f)
                lineToRelative(2.15f, -4.73f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.99f)
                lineToRelative(2.73f, -6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(13.08f)
                lineTo(15.79f, 0.03f)
                lineToRelative(2.73f, 1.24f)
                lineToRelative(-2.15f, 4.73f)
                horizontalLineToRelative(7.62f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.99f)
                close()
            }
        }.also { _NotEqual = it}
