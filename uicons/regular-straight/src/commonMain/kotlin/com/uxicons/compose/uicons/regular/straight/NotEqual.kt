package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Rs.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.46f, 9f)
                lineToRelative(-2.73f, 6f)
                horizontalLineToRelative(12.27f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-13.17f)
                lineToRelative(-3.17f, 6.96f)
                lineToRelative(-1.82f, -0.83f)
                lineToRelative(2.79f, -6.14f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.54f)
                lineToRelative(2.73f, -6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13.17f)
                lineTo(16.34f, 0.04f)
                lineToRelative(1.82f, 0.83f)
                lineToRelative(-2.79f, 6.14f)
                horizontalLineToRelative(8.63f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9.54f)
                close()
            }
        }.also { _NotEqual = it}
