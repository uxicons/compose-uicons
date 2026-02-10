package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Bs.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 11f)
                horizontalLineToRelative(7.08f)
                lineToRelative(-1.35f, -8.07f)
                curveToRelative(-0.28f, -1.7f, -1.73f, -2.93f, -3.45f, -2.93f)
                horizontalLineToRelative(-7.57f)
                curveToRelative(-1.72f, 0f, -3.17f, 1.23f, -3.45f, 2.92f)
                lineToRelative(-1.35f, 8.07f)
                horizontalLineToRelative(7.08f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-10f)
                close()
                moveTo(7.72f, 3.42f)
                curveToRelative(0.04f, -0.24f, 0.25f, -0.42f, 0.49f, -0.42f)
                horizontalLineToRelative(7.57f)
                curveToRelative(0.24f, 0f, 0.45f, 0.17f, 0.49f, 0.42f)
                lineToRelative(0.76f, 4.58f)
                horizontalLineTo(6.96f)
                lineToRelative(0.76f, -4.58f)
                close()
            }
        }.also { _LampFloor = it}
