package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayCircle: ImageVector? = null

val Icons.Tc.PlayCircle: ImageVector
    get() = _PlayCircle ?: UXIcon(name = "PlayCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.25f, 8.9f)
                curveToRelative(-2.55f, -1.53f, -4.1f, -1.87f, -4.16f, -1.89f)
                curveToRelative(-0.25f, -0.06f, -0.5f, 0.09f, -0.58f, 0.34f)
                curveToRelative(-0.02f, 0.06f, -0.51f, 1.61f, -0.51f, 4.65f)
                reflectiveCurveToRelative(0.49f, 4.59f, 0.51f, 4.65f)
                curveToRelative(0.08f, 0.24f, 0.34f, 0.39f, 0.58f, 0.34f)
                curveToRelative(0.06f, -0.01f, 1.61f, -0.35f, 4.16f, -1.89f)
                curveToRelative(2.45f, -1.47f, 3.51f, -2.64f, 3.63f, -2.77f)
                curveToRelative(0.17f, -0.19f, 0.17f, -0.47f, 0f, -0.66f)
                curveToRelative(-0.11f, -0.13f, -1.18f, -1.3f, -3.63f, -2.77f)
                close()
                moveTo(12.73f, 14.24f)
                curveToRelative(-1.6f, 0.96f, -2.78f, 1.43f, -3.39f, 1.63f)
                curveToRelative(-0.14f, -0.64f, -0.34f, -1.94f, -0.34f, -3.87f)
                reflectiveCurveToRelative(0.21f, -3.23f, 0.34f, -3.87f)
                curveToRelative(0.61f, 0.2f, 1.79f, 0.67f, 3.39f, 1.63f)
                curveToRelative(1.62f, 0.97f, 2.6f, 1.81f, 3.06f, 2.25f)
                curveToRelative(-0.46f, 0.44f, -1.44f, 1.27f, -3.06f, 2.25f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
            }
        }.also { _PlayCircle = it}
