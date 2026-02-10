package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameCurved: ImageVector? = null

val Icons.Ts.FireFlameCurved: ImageVector
    get() = _FireFlameCurved ?: UXIcon(name = "FireFlameCurved") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24.05f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.46f, 2.36f, -5.95f, 4.67f, -7.93f)
                lineToRelative(1.18f, -1.01f)
                lineToRelative(-0.37f, 1.51f)
                curveToRelative(-0.16f, 0.68f, -0.49f, 2.72f, -0.49f, 4.38f)
                curveToRelative(0f, 2.53f, 0.27f, 5f, 3.5f, 5f)
                curveToRelative(1.45f, 0f, 2.48f, -1.03f, 2.5f, -2.51f)
                curveToRelative(0.02f, -1.33f, -0.51f, -2.51f, -1.02f, -3.65f)
                curveToRelative(-0.48f, -1.06f, -0.97f, -2.17f, -0.97f, -3.35f)
                curveToRelative(0f, -2.73f, 2.0f, -5.66f, 2.09f, -5.78f)
                lineToRelative(0.43f, -0.62f)
                lineToRelative(0.4f, 0.64f)
                curveToRelative(0.89f, 1.41f, 2.06f, 2.74f, 3.2f, 4.03f)
                curveToRelative(2.4f, 2.73f, 4.88f, 5.54f, 4.88f, 9.29f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(6.25f, 7.84f)
                curveToRelative(-1.74f, 1.66f, -3.25f, 3.66f, -3.25f, 6.2f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.37f, -2.25f, -5.92f, -4.63f, -8.63f)
                curveToRelative(-0.98f, -1.12f, -2.0f, -2.27f, -2.85f, -3.5f)
                curveToRelative(-0.56f, 0.96f, -1.51f, 2.86f, -1.51f, 4.58f)
                curveToRelative(0f, 0.96f, 0.43f, 1.92f, 0.89f, 2.94f)
                curveToRelative(0.53f, 1.18f, 1.13f, 2.52f, 1.11f, 4.07f)
                curveToRelative(-0.03f, 2.02f, -1.5f, 3.49f, -3.5f, 3.49f)
                curveToRelative(-4.5f, 0f, -4.5f, -4.05f, -4.5f, -6f)
                curveToRelative(0f, -1.05f, 0.12f, -2.22f, 0.25f, -3.15f)
                close()
            }
        }.also { _FireFlameCurved = it}
