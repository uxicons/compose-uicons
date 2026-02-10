package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCheck: ImageVector? = null

val Icons.Tc.MapMarkerCheck: ImageVector
    get() = _MapMarkerCheck ?: UXIcon(name = "MapMarkerCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.99f, 1f)
                curveToRelative(-5.32f, 0.07f, -9.99f, 4.74f, -9.99f, 10f)
                curveToRelative(0f, 6.52f, 9.36f, 11.72f, 9.76f, 11.94f)
                curveToRelative(0.07f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                reflectiveCurveToRelative(0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.4f, -0.22f, 9.76f, -5.42f, 9.76f, -11.94f)
                curveToRelative(0f, -5.26f, -4.67f, -9.93f, -10.01f, -10f)
                close()
                moveTo(12f, 21.92f)
                curveToRelative(-1.46f, -0.85f, -9f, -5.54f, -9f, -10.92f)
                curveToRelative(0f, -5.23f, 4.75f, -8.94f, 8.99f, -9f)
                curveToRelative(4.26f, 0.06f, 9.01f, 3.77f, 9.01f, 9f)
                curveToRelative(0f, 5.38f, -7.54f, 10.07f, -9f, 10.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.23f, 8.56f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.03f, -0.67f, 0.21f)
                curveToRelative(-1.5f, 2.92f, -3.73f, 4.25f, -4.48f, 4.64f)
                curveToRelative(-0.54f, -0.45f, -1.86f, -1.61f, -2.67f, -2.71f)
                curveToRelative(-0.16f, -0.22f, -0.48f, -0.27f, -0.7f, -0.11f)
                reflectiveCurveToRelative(-0.27f, 0.48f, -0.11f, 0.7f)
                curveToRelative(1.1f, 1.51f, 3.01f, 3.03f, 3.09f, 3.1f)
                curveToRelative(0.09f, 0.07f, 0.2f, 0.11f, 0.31f, 0.11f)
                curveToRelative(0.06f, 0f, 0.13f, -0.01f, 0.19f, -0.04f)
                curveToRelative(0.13f, -0.05f, 3.25f, -1.35f, 5.26f, -5.24f)
                curveToRelative(0.13f, -0.25f, 0.03f, -0.55f, -0.21f, -0.67f)
                close()
            }
        }.also { _MapMarkerCheck = it}
