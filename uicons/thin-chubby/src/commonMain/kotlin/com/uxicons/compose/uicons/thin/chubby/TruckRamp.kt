package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Tc.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.82f, 16.68f)
                lineToRelative(0.55f, -11.74f)
                curveToRelative(0.05f, -1.13f, 0.72f, -2.14f, 1.74f, -2.63f)
                lineToRelative(0.6f, -0.29f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.24f, -0.67f)
                curveToRelative(-0.12f, -0.25f, -0.42f, -0.35f, -0.67f, -0.23f)
                lineToRelative(-0.6f, 0.29f)
                curveToRelative(-1.35f, 0.65f, -2.24f, 1.98f, -2.31f, 3.48f)
                lineToRelative(-0.56f, 11.95f)
                curveToRelative(-0.31f, 0.1f, -0.59f, 0.25f, -0.85f, 0.44f)
                curveToRelative(-1.42f, 0.6f, -4.2f, 1.68f, -7.07f, 2.24f)
                curveToRelative(-4.07f, 0.79f, -9.33f, 0.67f, -9.38f, 0.67f)
                curveToRelative(-0.31f, -0.02f, -0.51f, 0.21f, -0.51f, 0.49f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.51f, 0.49f, 0.51f)
                curveToRelative(0.05f, 0f, 0.38f, 0.01f, 0.9f, 0.01f)
                curveToRelative(1.7f, 0f, 5.5f, -0.08f, 8.7f, -0.7f)
                curveToRelative(2.14f, -0.41f, 4.22f, -1.11f, 5.76f, -1.69f)
                curveToRelative(-0.1f, 0.31f, -0.16f, 0.65f, -0.16f, 0.99f)
                curveToRelative(0f, 1.72f, 1.4f, 3.12f, 3.12f, 3.12f)
                reflectiveCurveToRelative(3.12f, -1.4f, 3.12f, -3.12f)
                curveToRelative(0f, -1.71f, -1.38f, -3.1f, -3.09f, -3.12f)
                close()
                moveTo(19.79f, 21.91f)
                curveToRelative(-1.17f, 0f, -2.12f, -0.95f, -2.12f, -2.12f)
                reflectiveCurveToRelative(0.95f, -2.12f, 2.12f, -2.12f)
                reflectiveCurveToRelative(2.12f, 0.95f, 2.12f, 2.12f)
                reflectiveCurveToRelative(-0.95f, 2.12f, -2.12f, 2.12f)
                close()
            }
        }.also { _TruckRamp = it}
