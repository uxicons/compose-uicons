package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Ts.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 11f)
                horizontalLineToRelative(7.59f)
                lineToRelative(-1.42f, -8.49f)
                curveToRelative(-0.24f, -1.45f, -1.49f, -2.51f, -2.96f, -2.51f)
                horizontalLineToRelative(-7.43f)
                curveToRelative(-1.47f, 0f, -2.72f, 1.05f, -2.96f, 2.51f)
                lineToRelative(-1.42f, 8.49f)
                horizontalLineToRelative(7.59f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-12f)
                close()
                moveTo(6.31f, 2.67f)
                curveToRelative(0.16f, -0.97f, 0.99f, -1.67f, 1.97f, -1.67f)
                horizontalLineToRelative(7.43f)
                curveToRelative(0.98f, 0f, 1.81f, 0.7f, 1.97f, 1.67f)
                lineToRelative(1.22f, 7.33f)
                horizontalLineTo(5.09f)
                lineToRelative(1.22f, -7.33f)
                close()
            }
        }.also { _LampFloor = it}
