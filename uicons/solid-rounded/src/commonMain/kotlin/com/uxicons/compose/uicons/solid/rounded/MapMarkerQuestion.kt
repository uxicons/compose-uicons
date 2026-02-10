package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Sr.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
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
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.93f, 11.51f)
                curveToRelative(-0.52f, 0.29f, -0.93f, 0.94f, -0.93f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.27f, 0.81f, -2.61f, 1.96f, -3.25f)
                curveToRelative(0.76f, -0.42f, 1.16f, -1.25f, 1.0f, -2.12f)
                curveToRelative(-0.14f, -0.79f, -0.81f, -1.46f, -1.6f, -1.6f)
                curveToRelative(-0.6f, -0.11f, -1.2f, 0.05f, -1.66f, 0.43f)
                curveToRelative(-0.46f, 0.38f, -0.71f, 0.94f, -0.71f, 1.53f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.11f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.22f, 3.22f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.22f)
                close()
            }
        }.also { _MapMarkerQuestion = it}
