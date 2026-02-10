package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnRight: ImageVector? = null

val Icons.Ts.TurnRight: ImageVector
    get() = _TurnRight ?: UXIcon(name = "TurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.53f, 9.63f)
                lineToRelative(-6.68f, 6.72f)
                lineToRelative(-0.71f, -0.7f)
                lineToRelative(6.6f, -6.65f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(20.25f)
                lineToRelative(-6.6f, -6.65f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(6.68f, 6.72f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.27f)
                close()
            }
        }.also { _TurnRight = it}
