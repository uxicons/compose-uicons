package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Ss.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                horizontalLineToRelative(7.84f)
                lineToRelative(-1.38f, -8.29f)
                curveToRelative(-0.26f, -1.57f, -1.61f, -2.71f, -3.21f, -2.71f)
                horizontalLineTo(7.74f)
                curveToRelative(-1.59f, 0f, -2.94f, 1.14f, -3.21f, 2.71f)
                lineToRelative(-1.38f, 8.29f)
                horizontalLineToRelative(7.84f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-11f)
                close()
            }
        }.also { _LampFloor = it}
