package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Rc.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 21.29f)
                lineToRelative(-3.67f, -3.67f)
                curveToRelative(1.97f, -2.23f, 2.96f, -4.46f, 2.96f, -6.62f)
                curveToRelative(0f, -5.26f, -4.67f, -9.93f, -10.01f, -10f)
                curveToRelative(-2.41f, 0.03f, -4.88f, 1.07f, -6.76f, 2.81f)
                lineToRelative(-2.52f, -2.52f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(20f, 20f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(11.99f, 3f)
                curveToRelative(3.79f, 0.05f, 8.01f, 3.35f, 8.01f, 8f)
                curveToRelative(0f, 1.64f, -0.8f, 3.38f, -2.38f, 5.21f)
                lineToRelative(-10.98f, -10.98f)
                curveToRelative(1.51f, -1.38f, 3.46f, -2.21f, 5.34f, -2.23f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.3f, 19.27f)
                curveToRelative(-0.49f, 0.45f, -1.56f, 1.12f, -2.28f, 1.55f)
                curveToRelative(-0.68f, -0.44f, -1.86f, -1.21f, -2.44f, -1.65f)
                curveToRelative(-1.68f, -1.27f, -5.59f, -4.6f, -5.59f, -8.18f)
                curveToRelative(0f, -0.57f, 0.07f, -1.2f, 0.21f, -1.77f)
                curveToRelative(0.13f, -0.54f, -0.2f, -1.08f, -0.74f, -1.21f)
                curveToRelative(-0.53f, -0.12f, -1.08f, 0.2f, -1.21f, 0.74f)
                curveToRelative(-0.17f, 0.72f, -0.27f, 1.51f, -0.27f, 2.23f)
                curveToRelative(0f, 4.32f, 4.0f, 7.98f, 6.39f, 9.78f)
                curveToRelative(0.9f, 0.67f, 2.98f, 2.01f, 3.07f, 2.07f)
                curveToRelative(0.16f, 0.1f, 0.35f, 0.16f, 0.54f, 0.16f)
                curveToRelative(0.17f, 0f, 0.34f, -0.04f, 0.49f, -0.13f)
                curveToRelative(0.23f, -0.13f, 2.24f, -1.28f, 3.16f, -2.12f)
                curveToRelative(0.41f, -0.37f, 0.44f, -1.0f, 0.06f, -1.41f)
                reflectiveCurveToRelative(-1.0f, -0.44f, -1.41f, -0.06f)
                close()
            }
        }.also { _MapMarkerSlash = it}
