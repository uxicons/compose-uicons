package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Ts.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.37f, 8f)
                lineToRelative(-3.64f, 8f)
                horizontalLineToRelative(13.27f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-13.72f)
                lineToRelative(-3.16f, 6.96f)
                lineToRelative(-0.91f, -0.41f)
                lineToRelative(2.97f, -6.54f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(9.63f)
                lineToRelative(3.64f, -8f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(13.72f)
                lineTo(16.89f, 0.04f)
                lineToRelative(0.91f, 0.41f)
                lineToRelative(-2.97f, 6.54f)
                horizontalLineToRelative(9.18f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-9.63f)
                close()
            }
        }.also { _NotEqual = it}
