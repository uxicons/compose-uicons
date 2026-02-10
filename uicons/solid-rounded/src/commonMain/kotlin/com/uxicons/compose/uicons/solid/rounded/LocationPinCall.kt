package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationPinCall: ImageVector? = null

val Icons.Sr.LocationPinCall: ImageVector
    get() = _LocationPinCall ?: UXIcon(name = "LocationPinCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 1.46f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.6f, 1.48f, 3.55f)
                lineToRelative(1.75f, 1.71f)
                curveToRelative(0.49f, 0.48f, 1.13f, 0.71f, 1.77f, 0.71f)
                reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.71f)
                lineToRelative(1.77f, -1.73f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.66f, 14.86f)
                curveToRelative(-1.19f, -1.14f, -3.09f, -1.14f, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                curveToRelative(-3.2f, -1.36f, -5.47f, -3.64f, -6.93f, -6.95f)
                lineToRelative(1.6f, -1.9f)
                curveToRelative(0.56f, -0.58f, 0.86f, -1.34f, 0.86f, -2.15f)
                reflectiveCurveToRelative(-0.3f, -1.56f, -0.86f, -2.14f)
                curveToRelative(0f, 0f, -1.85f, -2.41f, -1.88f, -2.44f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.33f, -0.05f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(0.63f, 3.02f, 0f, 4.57f, 0f, 6.24f)
                curveToRelative(0f, 7.64f, 10.13f, 17.76f, 17.76f, 17.76f)
                curveToRelative(1.67f, 0f, 3.23f, -0.63f, 4.42f, -1.83f)
                lineToRelative(0.91f, -1.05f)
                curveToRelative(1.21f, -1.21f, 1.21f, -3.17f, 0f, -4.38f)
                curveToRelative(-0.03f, -0.03f, -2.44f, -1.88f, -2.44f, -1.88f)
                close()
            }
        }.also { _LocationPinCall = it}
