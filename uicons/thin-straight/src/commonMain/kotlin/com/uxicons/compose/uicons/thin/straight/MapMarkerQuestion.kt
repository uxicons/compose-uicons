package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerQuestion: ImageVector? = null

val Icons.Ts.MapMarkerQuestion: ImageVector
    get() = _MapMarkerQuestion ?: UXIcon(name = "MapMarkerQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.99f)
                lineToRelative(-7.07f, -6.91f)
                curveToRelative(-3.9f, -3.9f, -3.9f, -10.25f, -0.0f, -14.15f)
                curveTo(6.82f, 1.04f, 9.33f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.24f, 0f, 14.14f)
                lineToRelative(-7.07f, 6.92f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-2.4f, 0f, -4.67f, 0.94f, -6.36f, 2.64f)
                curveToRelative(-3.51f, 3.51f, -3.51f, 9.22f, 0f, 12.73f)
                lineToRelative(6.36f, 6.22f)
                lineToRelative(6.37f, -6.23f)
                curveToRelative(3.5f, -3.5f, 3.5f, -9.21f, -0.0f, -12.72f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                close()
                moveTo(12.5f, 14.13f)
                curveToRelative(0f, -0.98f, 0.67f, -2.21f, 1.43f, -2.63f)
                curveToRelative(1.5f, -0.83f, 2.31f, -2.52f, 2.01f, -4.23f)
                curveToRelative(-0.28f, -1.61f, -1.6f, -2.93f, -3.22f, -3.22f)
                curveToRelative(-1.19f, -0.21f, -2.38f, 0.11f, -3.29f, 0.87f)
                curveToRelative(-0.91f, 0.76f, -1.43f, 1.88f, -1.43f, 3.06f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.89f, 0.39f, -1.73f, 1.07f, -2.3f)
                curveToRelative(0.69f, -0.58f, 1.57f, -0.81f, 2.48f, -0.65f)
                curveToRelative(1.2f, 0.21f, 2.19f, 1.2f, 2.4f, 2.4f)
                curveToRelative(0.23f, 1.3f, -0.36f, 2.55f, -1.51f, 3.18f)
                curveToRelative(-1.07f, 0.59f, -1.95f, 2.16f, -1.95f, 3.5f)
                verticalLineToRelative(0.87f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.87f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _MapMarkerQuestion = it}
