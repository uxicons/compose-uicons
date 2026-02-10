package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignSlash: ImageVector? = null

val Icons.Ss.AlignSlash: ImageVector
    get() = _AlignSlash ?: UXIcon(name = "AlignSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.76f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.76f)
                lineToRelative(2f, 2f)
                close()
                moveTo(9.76f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11.76f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(0f, 4.24f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(1.76f)
                lineToRelative(-1.76f, -1.76f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16.76f)
                lineToRelative(-2f, -2f)
                lineTo(0f, 19f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(-2f)
                lineTo(5.41f, 4f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.54f, -1.54f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(6.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8.59f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(11.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-13.59f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(16.59f)
                close()
            }
        }.also { _AlignSlash = it}
