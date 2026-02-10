package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PinToPin: ImageVector? = null

val Icons.Br.PinToPin: ImageVector
    get() = _PinToPin ?: UXIcon(name = "PinToPin") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(19f, 16f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(13f, 17f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(10f, 8f)
            curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.47f, 3.54f)
            lineToRelative(-2.44f, 2.46f)
            curveToRelative(-0.61f, 0.59f, -1.58f, 0.59f, -2.19f, 0f)
            lineToRelative(-2.43f, -2.46f)
            curveToRelative(-0.95f, -0.95f, -1.48f, -2.21f, -1.48f, -3.54f)
            reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
            curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
            reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
            curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
            close()
            moveTo(7f, 8f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            close()
            moveTo(24f, 8f)
            curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.47f, 3.54f)
            lineToRelative(-2.44f, 2.46f)
            curveToRelative(-0.61f, 0.59f, -1.58f, 0.59f, -2.19f, 0f)
            lineToRelative(-2.43f, -2.46f)
            curveToRelative(-0.95f, -0.95f, -1.48f, -2.21f, -1.48f, -3.54f)
            reflectiveCurveToRelative(0.52f, -2.59f, 1.47f, -3.54f)
            curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
            reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
            curveToRelative(0.94f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
            close()
            moveTo(21f, 8f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            close()
        }
    }.also { _PinToPin = it }
