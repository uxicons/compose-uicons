package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Rr.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-1.43f, 0f, -2.78f, -0.55f, -3.81f, -1.55f)
                lineToRelative(-3.94f, -3.64f)
                curveToRelative(-2.11f, -2.1f, -3.25f, -4.87f, -3.25f, -7.8f)
                reflectiveCurveToRelative(1.14f, -5.7f, 3.22f, -7.78f)
                curveTo(6.3f, 1.15f, 9.06f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.7f, 1.14f, 7.78f, 3.22f)
                horizontalLineToRelative(0f)
                curveToRelative(2.08f, 2.08f, 3.22f, 4.84f, 3.22f, 7.78f)
                reflectiveCurveToRelative(-1.14f, 5.7f, -3.22f, 7.78f)
                lineToRelative(-3.99f, 3.69f)
                curveToRelative(-1.0f, 0.98f, -2.35f, 1.53f, -3.79f, 1.53f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-2.4f, 0f, -4.66f, 0.94f, -6.36f, 2.64f)
                curveToRelative(-1.7f, 1.7f, -2.64f, 3.96f, -2.64f, 6.36f)
                reflectiveCurveToRelative(0.94f, 4.66f, 2.64f, 6.36f)
                lineToRelative(3.94f, 3.63f)
                curveToRelative(1.34f, 1.31f, 3.54f, 1.29f, 4.84f, 0.02f)
                lineToRelative(3.98f, -3.68f)
                curveToRelative(1.67f, -1.67f, 2.61f, -3.93f, 2.61f, -6.34f)
                reflectiveCurveToRelative(-0.94f, -4.66f, -2.64f, -6.36f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                close()
                moveTo(11.91f, 14.42f)
                lineToRelative(5.79f, -5.71f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.01f)
                lineToRelative(-5.81f, 5.7f)
                lineToRelative(-2.79f, -2.71f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.38f, -1.41f, 0.02f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                lineToRelative(2.78f, 2.7f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.42f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                close()
            }
        }.also { _MapMarkerCheck = it}
