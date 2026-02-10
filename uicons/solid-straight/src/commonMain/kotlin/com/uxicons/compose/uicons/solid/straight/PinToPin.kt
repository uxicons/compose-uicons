package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PinToPin: ImageVector? = null

val Icons.Ss.PinToPin: ImageVector
    get() = _PinToPin ?: UXIcon(name = "PinToPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(17f, 19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(15.14f, 18f)
                horizontalLineToRelative(-6.28f)
                curveToRelative(0.08f, 0.32f, 0.14f, 0.65f, 0.14f, 1f)
                reflectiveCurveToRelative(-0.06f, 0.68f, -0.14f, 1f)
                horizontalLineToRelative(6.28f)
                curveToRelative(-0.08f, -0.32f, -0.14f, -0.65f, -0.14f, -1f)
                reflectiveCurveToRelative(0.06f, -0.68f, 0.14f, -1f)
                close()
                moveTo(10f, 8.01f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                curveToRelative(-0.95f, -0.95f, -1.47f, -2.21f, -1.47f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.46f, -3.54f)
                reflectiveCurveToRelative(2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                close()
                moveTo(7f, 8.01f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 8.01f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                curveToRelative(-0.95f, -0.95f, -1.47f, -2.21f, -1.47f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.46f, -3.54f)
                reflectiveCurveToRelative(2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                close()
                moveTo(21f, 8.01f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _PinToPin = it}
