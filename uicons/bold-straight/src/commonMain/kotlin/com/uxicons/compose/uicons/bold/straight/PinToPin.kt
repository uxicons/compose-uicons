package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PinToPin: ImageVector? = null

val Icons.Bs.PinToPin: ImageVector
    get() = _PinToPin ?: UXIcon(name = "PinToPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 18.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(9.22f, 17f)
                curveToRelative(0.17f, 0.47f, 0.28f, 0.97f, 0.28f, 1.5f)
                reflectiveCurveToRelative(-0.11f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(5.55f)
                curveToRelative(-0.17f, -0.47f, -0.28f, -0.97f, -0.28f, -1.5f)
                reflectiveCurveToRelative(0.11f, -1.03f, 0.28f, -1.5f)
                horizontalLineToRelative(-5.55f)
                close()
                moveTo(19f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10f, 8f)
                curveToRelative(0f, 1.33f, -0.52f, 2.59f, -1.47f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.52f, -3.45f)
                curveToRelative(-0.96f, -0.96f, -1.48f, -2.21f, -1.48f, -3.55f)
                curveTo(-0.06f, 5.31f, 2.31f, 2.94f, 5f, 3f)
                curveToRelative(1.33f, 0f, 2.59f, 0.52f, 3.54f, 1.46f)
                horizontalLineToRelative(0f)
                curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(24f, 8f)
                curveToRelative(0f, 1.33f, -0.52f, 2.59f, -1.47f, 3.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.52f, -3.45f)
                curveToRelative(-0.96f, -0.96f, -1.48f, -2.21f, -1.48f, -3.55f)
                curveToRelative(-0.06f, -2.69f, 2.31f, -5.06f, 5f, -5f)
                curveToRelative(1.33f, 0f, 2.59f, 0.52f, 3.54f, 1.46f)
                horizontalLineToRelative(0f)
                curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _PinToPin = it}
