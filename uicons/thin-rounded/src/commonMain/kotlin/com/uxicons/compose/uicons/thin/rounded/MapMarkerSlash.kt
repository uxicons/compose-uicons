package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Tr.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 23.15f)
                lineToRelative(-4.27f, -4.27f)
                lineToRelative(0.19f, -0.18f)
                curveToRelative(2.08f, -2.07f, 3.22f, -4.82f, 3.22f, -7.75f)
                reflectiveCurveToRelative(-1.14f, -5.68f, -3.22f, -7.75f)
                curveTo(17.7f, 1.14f, 14.94f, 0f, 12f, 0f)
                reflectiveCurveTo(6.3f, 1.14f, 4.22f, 3.21f)
                curveToRelative(-0.05f, 0.05f, -0.1f, 0.1f, -0.15f, 0.15f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineTo(23.15f, 23.85f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(18.88f, 18.17f)
                lineTo(4.78f, 4.07f)
                curveToRelative(0.05f, -0.05f, 0.1f, -0.1f, 0.15f, -0.15f)
                curveToRelative(1.89f, -1.88f, 4.4f, -2.92f, 7.07f, -2.92f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.92f)
                curveToRelative(1.89f, 1.88f, 2.93f, 4.38f, 2.93f, 7.04f)
                reflectiveCurveToRelative(-1.04f, 5.16f, -2.91f, 7.02f)
                lineToRelative(-0.21f, 0.19f)
                close()
                moveTo(17.37f, 20.24f)
                curveToRelative(0.19f, 0.2f, 0.17f, 0.52f, -0.03f, 0.71f)
                lineToRelative(-1.74f, 1.6f)
                curveToRelative(-0.96f, 0.94f, -2.24f, 1.46f, -3.6f, 1.46f)
                reflectiveCurveToRelative(-2.64f, -0.52f, -3.61f, -1.47f)
                lineToRelative(-4.15f, -3.82f)
                curveTo(0.95f, 15.44f, 0.07f, 10.45f, 2.04f, 6.29f)
                curveToRelative(0.12f, -0.25f, 0.41f, -0.36f, 0.67f, -0.24f)
                curveToRelative(0.25f, 0.12f, 0.36f, 0.42f, 0.24f, 0.67f)
                curveToRelative(-1.79f, 3.79f, -0.99f, 8.32f, 1.98f, 11.28f)
                lineToRelative(4.15f, 3.81f)
                curveToRelative(1.59f, 1.55f, 4.27f, 1.54f, 5.84f, 0.01f)
                lineToRelative(1.75f, -1.61f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.17f, 0.71f, 0.03f)
                close()
            }
        }.also { _MapMarkerSlash = it}
