package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnRight: ImageVector? = null

val Icons.Rs.TurnRight: ImageVector
    get() = _TurnRight ?: UXIcon(name = "TurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.38f, 10.49f)
                lineToRelative(-6.67f, 6.72f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(5.76f, -5.79f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(11f)
                horizontalLineTo(0f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18.05f)
                lineToRelative(-5.76f, -5.79f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(6.68f, 6.72f)
                curveToRelative(0.82f, 0.82f, 0.82f, 2.15f, -0.0f, 2.97f)
                close()
            }
        }.also { _TurnRight = it}
