package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Rs.LampFloor: ImageVector
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
                moveTo(6.51f, 3.04f)
                curveToRelative(0.1f, -0.6f, 0.62f, -1.04f, 1.23f, -1.04f)
                horizontalLineToRelative(8.52f)
                curveToRelative(0.61f, 0f, 1.13f, 0.44f, 1.23f, 1.04f)
                lineToRelative(0.99f, 5.96f)
                horizontalLineTo(5.52f)
                lineToRelative(0.99f, -5.96f)
                close()
            }
        }.also { _LampFloor = it}
