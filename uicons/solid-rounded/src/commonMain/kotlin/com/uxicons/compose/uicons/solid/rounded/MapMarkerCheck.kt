package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Sr.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 3.22f)
                curveTo(17.7f, 1.14f, 14.94f, 0f, 12f, 0f)
                reflectiveCurveTo(6.3f, 1.15f, 4.22f, 3.22f)
                curveToRelative(-2.08f, 2.08f, -3.22f, 4.84f, -3.22f, 7.78f)
                reflectiveCurveToRelative(1.14f, 5.7f, 3.25f, 7.8f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(1.02f, 1.0f, 2.38f, 1.55f, 3.81f, 1.55f)
                reflectiveCurveToRelative(2.78f, -0.55f, 3.79f, -1.53f)
                lineToRelative(3.99f, -3.69f)
                curveToRelative(2.08f, -2.08f, 3.22f, -4.84f, 3.22f, -7.78f)
                reflectiveCurveToRelative(-1.14f, -5.7f, -3.22f, -7.78f)
                close()
                moveTo(17.7f, 8.71f)
                lineToRelative(-5.79f, 5.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.58f)
                lineToRelative(-2.78f, -2.7f)
                curveToRelative(-0.4f, -0.39f, -0.41f, -1.02f, -0.02f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.41f, 1.41f, -0.02f)
                lineToRelative(2.79f, 2.71f)
                lineToRelative(5.81f, -5.7f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                close()
            }
        }.also { _MapMarkerCheck = it}
