package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerSlash: ImageVector? = null

val Icons.Sc.MapMarkerSlash: ImageVector
    get() = _MapMarkerSlash ?: UXIcon(name = "MapMarkerSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 20.44f)
                lineToRelative(-3.2f, -3.2f)
                curveToRelative(1.75f, -2.11f, 2.63f, -4.2f, 2.63f, -6.24f)
                curveToRelative(0f, -5.26f, -4.67f, -9.93f, -10.01f, -10f)
                curveToRelative(-2.25f, 0.03f, -4.56f, 0.94f, -6.38f, 2.48f)
                lineToRelative(-2.04f, -2.04f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.92f, 7.88f)
                curveToRelative(-0.28f, 0.22f, -0.56f, 0.57f, -0.7f, 1.11f)
                curveToRelative(-0.18f, 0.65f, -0.22f, 1.36f, -0.22f, 2.01f)
                curveToRelative(0f, 4.32f, 4.0f, 7.98f, 6.39f, 9.78f)
                curveToRelative(0.9f, 0.67f, 2.98f, 2.01f, 3.07f, 2.07f)
                curveToRelative(0.16f, 0.1f, 0.35f, 0.16f, 0.54f, 0.16f)
                curveToRelative(0.17f, 0f, 0.34f, -0.05f, 0.49f, -0.13f)
                curveToRelative(0.35f, -0.19f, 2.07f, -1.3f, 3.29f, -2.13f)
                close()
            }
        }.also { _MapMarkerSlash = it}
