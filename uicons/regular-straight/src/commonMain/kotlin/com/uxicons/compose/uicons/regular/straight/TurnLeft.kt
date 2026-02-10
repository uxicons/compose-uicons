package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TurnLeft: ImageVector? = null

val Icons.Rs.TurnLeft: ImageVector
    get() = _TurnLeft ?: UXIcon(name = "TurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(2.95f)
                lineToRelative(5.76f, 5.79f)
                lineToRelative(-1.42f, 1.41f)
                lineTo(0.61f, 10.48f)
                curveToRelative(-0.4f, -0.39f, -0.61f, -0.92f, -0.61f, -1.48f)
                reflectiveCurveToRelative(0.22f, -1.09f, 0.62f, -1.49f)
                lineTo(7.29f, 0.8f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-5.76f, 5.79f)
                horizontalLineToRelative(18.05f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _TurnLeft = it}
