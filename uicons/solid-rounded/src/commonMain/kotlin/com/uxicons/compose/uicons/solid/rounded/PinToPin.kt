package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PinToPin: ImageVector? = null

val Icons.Sr.PinToPin: ImageVector
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
                moveTo(8.54f, 11.54f)
                lineToRelative(-1.92f, 1.88f)
                curveToRelative(-0.89f, 0.87f, -2.34f, 0.87f, -3.23f, 0f)
                lineToRelative(-1.91f, -1.87f)
                curveToRelative(-1.96f, -1.96f, -1.96f, -5.13f, -0.01f, -7.08f)
                curveToRelative(1.86f, -1.94f, 5.21f, -1.94f, 7.07f, 0f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(22.54f, 11.54f)
                lineToRelative(-1.92f, 1.88f)
                curveToRelative(-0.89f, 0.87f, -2.34f, 0.87f, -3.23f, 0f)
                lineToRelative(-1.91f, -1.87f)
                curveToRelative(-1.96f, -1.96f, -1.96f, -5.13f, -0.01f, -7.08f)
                curveToRelative(1.86f, -1.94f, 5.21f, -1.94f, 7.07f, 0f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(21f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(15f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PinToPin = it}
