package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerEdit: ImageVector? = null

val Icons.Br.MapMarkerEdit: ImageVector
    get() = _MapMarkerEdit ?: UXIcon(name = "MapMarkerEdit") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-1.51f, 0f, -2.93f, -0.58f, -4.0f, -1.64f)
            lineToRelative(-3.73f, -3.47f)
            curveTo(-0.07f, 14.55f, -0.07f, 7.54f, 4.22f, 3.24f)
            curveTo(6.3f, 1.15f, 9.06f, 0f, 12f, 0f)
            reflectiveCurveToRelative(5.7f, 1.15f, 7.78f, 3.24f)
            horizontalLineToRelative(0f)
            curveToRelative(4.28f, 4.3f, 4.28f, 11.31f, 0f, 15.62f)
            lineToRelative(-3.81f, 3.54f)
            curveToRelative(-1.04f, 1.03f, -2.47f, 1.61f, -3.97f, 1.61f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-2.14f, 0f, -4.14f, 0.84f, -5.65f, 2.35f)
            curveToRelative(-3.12f, 3.14f, -3.12f, 8.24f, 0f, 11.38f)
            lineToRelative(3.72f, 3.46f)
            curveToRelative(1.08f, 1.06f, 2.81f, 1.03f, 3.83f, 0.03f)
            lineToRelative(3.8f, -3.52f)
            curveToRelative(3.08f, -3.1f, 3.08f, -8.2f, -0.04f, -11.34f)
            curveToRelative(-1.51f, -1.52f, -3.52f, -2.35f, -5.65f, -2.35f)
            close()
            moveTo(12f, 13.83f)
            lineToRelative(3.41f, -3.41f)
            curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
            lineToRelative(-3.41f, 3.41f)
            curveToRelative(-0.75f, 0.75f, -1.17f, 1.77f, -1.17f, 2.83f)
            verticalLineToRelative(1.17f)
            horizontalLineToRelative(1.17f)
            curveToRelative(1.06f, 0f, 2.08f, -0.42f, 2.83f, -1.17f)
            close()
        }
    }.also { _MapMarkerEdit = it }
