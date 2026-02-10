package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Sc.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.44f, 9.88f)
                curveToRelative(-0.14f, -0.31f, -0.43f, -0.53f, -0.77f, -0.58f)
                curveToRelative(-0.18f, -0.03f, -4.53f, -0.68f, -9.68f, -0.68f)
                reflectiveCurveToRelative(-9.49f, 0.65f, -9.68f, 0.68f)
                curveToRelative(-0.35f, 0.05f, -0.64f, 0.28f, -0.77f, 0.61f)
                curveToRelative(-0.02f, 0.05f, -0.54f, 1.33f, -0.54f, 2.96f)
                curveToRelative(0f, 1.65f, 0.53f, 2.85f, 0.56f, 2.9f)
                curveToRelative(0.14f, 0.3f, 0.42f, 0.52f, 0.75f, 0.58f)
                curveToRelative(0.18f, 0.03f, 4.54f, 0.76f, 9.69f, 0.76f)
                reflectiveCurveToRelative(9.51f, -0.73f, 9.69f, -0.76f)
                curveToRelative(0.33f, -0.06f, 0.61f, -0.28f, 0.75f, -0.58f)
                curveToRelative(0.02f, -0.05f, 0.56f, -1.3f, 0.56f, -2.94f)
                curveToRelative(0f, -1.65f, -0.54f, -2.89f, -0.56f, -2.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.51f, 18.54f)
                curveToRelative(0.12f, 1.52f, 1.39f, 2.72f, 2.94f, 2.72f)
                curveToRelative(1.37f, 0f, 2.53f, -0.95f, 2.85f, -2.22f)
                curveToRelative(-2.4f, -0.11f, -4.46f, -0.33f, -5.79f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.7f, 19.03f)
                curveToRelative(0.33f, 1.28f, 1.48f, 2.22f, 2.85f, 2.22f)
                curveToRelative(1.54f, 0f, 2.82f, -1.2f, 2.94f, -2.73f)
                curveToRelative(-1.33f, 0.17f, -3.4f, 0.4f, -5.79f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 7.13f)
                curveToRelative(-1.05f, -1.94f, -2.1f, -3.23f, -2.16f, -3.3f)
                curveToRelative(-0.12f, -0.15f, -0.28f, -0.26f, -0.46f, -0.32f)
                curveToRelative(-0.08f, -0.03f, -1.94f, -0.63f, -4.36f, -0.77f)
                curveToRelative(-0.27f, -0.01f, -1.02f, 0.12f, -1.06f, 1.0f)
                verticalLineToRelative(2.88f)
                curveToRelative(3.38f, 0.02f, 6.34f, 0.3f, 8.04f, 0.51f)
                close()
            }
        }.also { _TruckPickup = it}
