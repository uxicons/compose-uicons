package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Bs.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.27f, 0.74f, -2.44f, 1.98f, -3.12f)
                curveToRelative(0.29f, -0.16f, 0.6f, -0.54f, 0.5f, -1.07f)
                curveToRelative(-0.07f, -0.38f, -0.41f, -0.72f, -0.79f, -0.79f)
                curveToRelative(-0.42f, -0.08f, -0.7f, 0.1f, -0.84f, 0.22f)
                curveToRelative(-0.23f, 0.19f, -0.36f, 0.47f, -0.36f, 0.77f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.1f, -1.08f, 3.28f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.23f, 3.23f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.39f, -2.01f, 4.22f)
                curveToRelative(-0.21f, 0.12f, -0.43f, 0.32f, -0.43f, 0.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(13.5f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.07f, 17.07f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveTo(6.82f, 1.04f, 4.93f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.15f)
                lineToRelative(7.06f, 6.9f)
                lineToRelative(7.07f, -6.92f)
                close()
                moveTo(16.95f, 5.05f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.04f, 4.94f)
                lineToRelative(-4.96f, 4.85f)
                lineToRelative(-4.95f, -4.84f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                close()
            }
        }.also { _MapMarkerQuestion = it}
