package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTurnLeft: ImageVector? = null

val Icons.Rs.ArrowTurnLeft: ImageVector
    get() = _ArrowTurnLeft ?: UXIcon(name = "ArrowTurnLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                verticalLineToRelative(18.05f)
                lineToRelative(5.79f, -5.76f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-6.72f, 6.68f)
                curveToRelative(-0.39f, 0.4f, -0.92f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.09f, -0.22f, -1.49f, -0.62f)
                lineTo(0.8f, 16.71f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(5.79f, 5.76f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _ArrowTurnLeft = it}
