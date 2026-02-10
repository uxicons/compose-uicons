package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Tr.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-1.36f, 0f, -2.64f, -0.52f, -3.61f, -1.47f)
                lineToRelative(-4.15f, -3.82f)
                curveToRelative(-2.09f, -2.08f, -3.24f, -4.83f, -3.24f, -7.76f)
                reflectiveCurveToRelative(1.15f, -5.68f, 3.22f, -7.75f)
                curveTo(6.3f, 1.14f, 9.06f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.7f, 1.14f, 7.78f, 3.21f)
                horizontalLineToRelative(0f)
                curveToRelative(2.08f, 2.07f, 3.22f, 4.82f, 3.22f, 7.75f)
                reflectiveCurveToRelative(-1.15f, 5.68f, -3.22f, 7.75f)
                lineToRelative(-4.18f, 3.84f)
                curveToRelative(-0.96f, 0.94f, -2.24f, 1.46f, -3.6f, 1.46f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-2.67f, 0f, -5.18f, 1.04f, -7.07f, 2.92f)
                curveToRelative(-1.89f, 1.88f, -2.93f, 4.38f, -2.93f, 7.04f)
                reflectiveCurveToRelative(1.04f, 5.16f, 2.93f, 7.04f)
                lineToRelative(4.15f, 3.81f)
                curveToRelative(1.59f, 1.55f, 4.27f, 1.54f, 5.84f, 0.01f)
                lineToRelative(4.17f, -3.84f)
                curveToRelative(1.87f, -1.87f, 2.91f, -4.37f, 2.91f, -7.02f)
                reflectiveCurveToRelative(-1.04f, -5.16f, -2.93f, -7.04f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, -1.88f, -4.4f, -2.92f, -7.07f, -2.92f)
                close()
                moveTo(11.56f, 13.56f)
                lineToRelative(6.29f, -6.21f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-6.29f, 6.21f)
                curveToRelative(-0.19f, 0.2f, -0.51f, 0.2f, -0.71f, -0.01f)
                lineToRelative(-3.29f, -3.21f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(3.29f, 3.2f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.38f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                close()
            }
        }.also { _MapMarkerCheck = it}
