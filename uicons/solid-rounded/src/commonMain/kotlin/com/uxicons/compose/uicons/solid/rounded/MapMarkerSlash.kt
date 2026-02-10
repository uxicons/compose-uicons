package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Sr.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-3.73f, -3.73f)
                curveToRelative(1.95f, -2.05f, 3.02f, -4.72f, 3.02f, -7.56f)
                curveToRelative(0f, -2.94f, -1.14f, -5.7f, -3.22f, -7.78f)
                curveTo(17.7f, 1.15f, 14.94f, 0f, 12f, 0f)
                curveToRelative(-2.84f, 0f, -5.51f, 1.08f, -7.56f, 3.02f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(3.16f, 7.32f)
                curveToRelative(-0.25f, -0.25f, -0.61f, -0.35f, -0.95f, -0.26f)
                curveToRelative(-0.34f, 0.08f, -0.61f, 0.34f, -0.71f, 0.67f)
                curveToRelative(-1.22f, 3.92f, -0.17f, 8.15f, 2.75f, 11.07f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(1.02f, 1.0f, 2.38f, 1.55f, 3.81f, 1.55f)
                reflectiveCurveToRelative(2.78f, -0.55f, 3.79f, -1.53f)
                lineToRelative(0.55f, -0.5f)
                curveToRelative(0.2f, -0.18f, 0.32f, -0.44f, 0.32f, -0.71f)
                curveToRelative(0.01f, -0.27f, -0.1f, -0.54f, -0.29f, -0.73f)
                lineTo(3.16f, 7.32f)
                close()
            }
        }.also { _MapMarkerSlash = it}
