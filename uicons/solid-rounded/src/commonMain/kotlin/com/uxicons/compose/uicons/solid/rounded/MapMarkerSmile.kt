package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSmile: ImageVector? = null

val Icons.Sr.MapMarkerSmile: ImageVector
    get() = _MapMarkerSmile ?: UXIcon(name = "MapMarkerSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 3.22f)
                curveTo(17.7f, 1.15f, 14.94f, 0f, 12f, 0f)
                reflectiveCurveTo(6.3f, 1.15f, 4.22f, 3.22f)
                curveToRelative(-2.08f, 2.08f, -3.22f, 4.84f, -3.22f, 7.78f)
                reflectiveCurveToRelative(1.14f, 5.7f, 3.25f, 7.8f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(1.02f, 1.0f, 2.38f, 1.55f, 3.81f, 1.55f)
                reflectiveCurveToRelative(2.78f, -0.55f, 3.79f, -1.53f)
                lineToRelative(3.99f, -3.69f)
                curveToRelative(2.08f, -2.08f, 3.22f, -4.84f, 3.22f, -7.78f)
                reflectiveCurveToRelative(-1.15f, -5.7f, -3.22f, -7.78f)
                close()
                moveTo(14.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.71f, 13.05f)
                curveToRelative(-1.26f, 1.26f, -2.93f, 1.95f, -4.71f, 1.95f)
                reflectiveCurveToRelative(-3.45f, -0.69f, -4.71f, -1.95f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.88f, 0.88f, 2.05f, 1.36f, 3.29f, 1.36f)
                reflectiveCurveToRelative(2.41f, -0.48f, 3.29f, -1.36f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _MapMarkerSmile = it}
