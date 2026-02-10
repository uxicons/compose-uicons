package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Siren: ImageVector? = null

val Icons.Sc.Siren: ImageVector
    get() = _Siren ?: UXIcon(name = "Siren") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(4.05f, 0.02f, 6.62f, 0.14f, 8.46f, 0.37f)
                lineToRelative(-0.79f, -5.96f)
                curveToRelative(-0.93f, -5.53f, -1.7f, -8.42f, -7.68f, -8.42f)
                reflectiveCurveToRelative(-6.74f, 2.9f, -7.68f, 8.5f)
                lineToRelative(-0.78f, 5.88f)
                curveToRelative(1.84f, -0.23f, 4.42f, -0.35f, 8.46f, -0.37f)
                close()
                moveTo(8.71f, 7.78f)
                curveToRelative(0.32f, -1.43f, 0.55f, -1.91f, 0.72f, -2.16f)
                curveToRelative(0.12f, -0.18f, 0.29f, -0.31f, 0.49f, -0.38f)
                curveToRelative(0.43f, -0.16f, 1.15f, -0.24f, 2.08f, -0.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-0.48f, 0f, -0.81f, 0.03f, -1.03f, 0.05f)
                curveToRelative(-0.07f, 0.22f, -0.18f, 0.58f, -0.3f, 1.16f)
                curveToRelative(-0.12f, 0.54f, -0.67f, 0.88f, -1.19f, 0.76f)
                curveToRelative(-0.54f, -0.12f, -0.88f, -0.65f, -0.76f, -1.19f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 0.42f, -0.04f, 0.82f, -0.13f, 1.24f)
                reflectiveCurveToRelative(-0.44f, 0.73f, -0.86f, 0.78f)
                curveToRelative(-1.2f, 0.14f, -4.58f, 0.48f, -10.01f, 0.48f)
                reflectiveCurveToRelative(-8.81f, -0.33f, -10.01f, -0.48f)
                curveToRelative(-0.42f, -0.05f, -0.77f, -0.36f, -0.86f, -0.78f)
                reflectiveCurveToRelative(-0.13f, -0.82f, -0.13f, -1.24f)
                curveToRelative(0.01f, -1.67f, 1.27f, -3.02f, 2.93f, -3.18f)
                curveToRelative(1.59f, -0.15f, 4.27f, -0.32f, 8.07f, -0.32f)
                reflectiveCurveToRelative(6.48f, 0.18f, 8.07f, 0.32f)
                curveToRelative(1.66f, 0.16f, 2.92f, 1.55f, 2.93f, 3.18f)
                close()
            }
        }.also { _Siren = it}
