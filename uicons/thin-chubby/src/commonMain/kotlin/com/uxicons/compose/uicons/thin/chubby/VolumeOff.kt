package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Tc.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.19f, 3.12f)
                curveToRelative(-0.42f, -0.2f, -0.85f, -0.15f, -1.13f, 0.16f)
                curveToRelative(-0.71f, 0.89f, -3.07f, 3.54f, -4.06f, 3.96f)
                lineToRelative(-4.11f, 0.39f)
                curveToRelative(-0.14f, 0.01f, -0.28f, 0.09f, -0.36f, 0.21f)
                curveToRelative(-0.97f, 1.36f, -1.53f, 2.48f, -1.53f, 4.17f)
                reflectiveCurveToRelative(0.56f, 2.81f, 1.53f, 4.17f)
                curveToRelative(0.08f, 0.12f, 0.21f, 0.19f, 0.36f, 0.21f)
                lineToRelative(4.11f, 0.39f)
                curveToRelative(1.0f, 0.41f, 3.35f, 3.07f, 4.06f, 3.95f)
                curveToRelative(0.28f, 0.33f, 0.75f, 0.35f, 1.13f, 0.17f)
                curveToRelative(1.4f, -0.67f, 2.81f, -3.93f, 2.81f, -8.88f)
                reflectiveCurveToRelative(-1.41f, -8.22f, -2.81f, -8.88f)
                close()
                moveTo(11.78f, 20.02f)
                curveToRelative(-0.46f, -0.56f, -3.13f, -3.74f, -4.5f, -4.22f)
                curveToRelative(-0.04f, -0.01f, -0.08f, -0.02f, -0.12f, -0.03f)
                lineToRelative(-3.95f, -0.38f)
                curveToRelative(-0.8f, -1.16f, -1.21f, -2.03f, -1.21f, -3.4f)
                reflectiveCurveToRelative(0.41f, -2.25f, 1.21f, -3.4f)
                lineToRelative(3.95f, -0.38f)
                curveToRelative(0.04f, -0.0f, 0.08f, -0.01f, 0.12f, -0.03f)
                curveToRelative(1.34f, -0.47f, 3.92f, -3.52f, 4.47f, -4.18f)
                curveToRelative(0.0f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f)
                curveToRelative(0.78f, 0.38f, 2.24f, 3.1f, 2.24f, 7.98f)
                reflectiveCurveToRelative(-1.45f, 7.59f, -2.22f, 8.02f)
                close()
            }
        }.also { _VolumeOff = it}
