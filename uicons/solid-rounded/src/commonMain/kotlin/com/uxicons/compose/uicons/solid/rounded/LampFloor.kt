package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Sr.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.75f, 11f)
                curveToRelative(0.96f, 0f, 1.86f, -0.42f, 2.48f, -1.15f)
                curveToRelative(0.62f, -0.73f, 0.88f, -1.69f, 0.73f, -2.63f)
                lineToRelative(-0.75f, -4.5f)
                curveToRelative(-0.26f, -1.57f, -1.61f, -2.71f, -3.21f, -2.71f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.59f, 0f, -2.94f, 1.14f, -3.21f, 2.71f)
                lineToRelative(-0.75f, 4.5f)
                curveToRelative(-0.16f, 0.94f, 0.11f, 1.91f, 0.73f, 2.63f)
                curveToRelative(0.62f, 0.73f, 1.52f, 1.15f, 2.48f, 1.15f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(3.75f)
                close()
            }
        }.also { _LampFloor = it}
