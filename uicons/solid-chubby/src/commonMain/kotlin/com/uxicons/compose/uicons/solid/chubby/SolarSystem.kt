package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Sc.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                curveToRelative(1.4f, 0.01f, 2.47f, 0.68f, 2.5f, 2.5f)
                curveToRelative(-0.04f, 1.89f, -1.09f, 2.49f, -2.5f, 2.5f)
                curveToRelative(-1.4f, -0.01f, -2.46f, -0.61f, -2.5f, -2.5f)
                curveToRelative(0.03f, -1.85f, 1.09f, -2.49f, 2.5f, -2.5f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0.03f, 1.51f, 0.88f, 1.99f, 2f, 2f)
                curveToRelative(1.13f, -0.01f, 1.97f, -0.49f, 2f, -2f)
                curveToRelative(-0.03f, -1.45f, -0.88f, -1.99f, -2f, -2f)
                curveToRelative(-1.13f, 0.01f, -1.97f, 0.52f, -2f, 2f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(0.02f, 1.13f, 0.66f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.84f, -0.01f, 1.48f, -0.37f, 1.5f, -1.5f)
                curveToRelative(-0.02f, -1.09f, -0.66f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.84f, 0.01f, -1.48f, 0.39f, -1.5f, 1.5f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -0.56f, -0.02f, -1.09f, -0.05f, -1.6f)
                curveToRelative(-0.06f, -0.83f, -0.77f, -1.45f, -1.6f, -1.39f)
                curveToRelative(-0.83f, 0.06f, -1.45f, 0.77f, -1.39f, 1.6f)
                curveToRelative(0.03f, 0.44f, 0.05f, 0.91f, 0.05f, 1.4f)
                curveToRelative(0f, 5.98f, -2.02f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -2.02f, -8f, -8f)
                reflectiveCurveToRelative(2.02f, -8.0f, 8f, -8.0f)
                curveToRelative(0.49f, 0f, 0.95f, 0.01f, 1.4f, 0.05f)
                curveToRelative(0.82f, 0.05f, 1.54f, -0.57f, 1.6f, -1.39f)
                curveToRelative(0.06f, -0.83f, -0.57f, -1.54f, -1.39f, -1.6f)
                curveToRelative(-0.51f, -0.04f, -1.04f, -0.05f, -1.6f, -0.05f)
                curveToRelative(-7.61f, 0f, -11.0f, 3.39f, -11.0f, 11f)
                reflectiveCurveToRelative(3.39f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.39f, 11f, -11f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -3.66f, -1.58f, -5.6f, -4.84f, -5.94f)
                curveToRelative(-0.81f, -0.09f, -1.56f, 0.51f, -1.65f, 1.33f)
                reflectiveCurveToRelative(0.51f, 1.56f, 1.33f, 1.65f)
                curveToRelative(1.49f, 0.16f, 2.16f, 0.62f, 2.16f, 2.96f)
                curveToRelative(0f, 2.38f, -0.62f, 3f, -3f, 3f)
                curveToRelative(-2.34f, 0f, -2.8f, -0.67f, -2.96f, -2.16f)
                curveToRelative(-0.09f, -0.82f, -0.82f, -1.42f, -1.65f, -1.33f)
                curveToRelative(-0.82f, 0.09f, -1.42f, 0.82f, -1.33f, 1.65f)
                curveToRelative(0.34f, 3.26f, 2.29f, 4.84f, 5.94f, 4.84f)
                curveToRelative(4.04f, 0f, 6f, -1.96f, 6f, -6f)
                close()
            }
        }.also { _SolarSystem = it}
