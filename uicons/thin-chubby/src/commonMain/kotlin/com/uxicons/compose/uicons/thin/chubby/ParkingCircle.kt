package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircle: ImageVector? = null

val Icons.Tc.ParkingCircle: ImageVector
    get() = _ParkingCircle ?: UXIcon(name = "ParkingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.5f, 0f, -11f, 3.5f, -11f, 11f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                curveToRelative(0f, -6.92f, 3.08f, -10f, 10f, -10f)
                curveToRelative(7.1f, 0f, 10f, 2.9f, 10f, 10f)
                reflectiveCurveToRelative(-2.9f, 10f, -10f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.61f, 5.5f)
                reflectiveCurveToRelative(-1.35f, -0.0f, -1.87f, 0.08f)
                curveToRelative(-0.22f, 0.04f, -0.39f, 0.21f, -0.42f, 0.43f)
                curveToRelative(-0.0f, 0.03f, -0.32f, 2.63f, -0.32f, 6.03f)
                curveToRelative(0f, 3.44f, 0.49f, 5.96f, 0.51f, 6.06f)
                curveToRelative(0.05f, 0.24f, 0.27f, 0.46f, 0.59f, 0.39f)
                curveToRelative(0.27f, -0.05f, 0.45f, -0.32f, 0.39f, -0.59f)
                curveToRelative(-0.0f, -0.02f, -0.36f, -1.85f, -0.46f, -4.45f)
                curveToRelative(0.5f, 0.04f, 1.0f, 0.05f, 1.58f, 0.05f)
                curveToRelative(2.32f, 0f, 5.39f, -0.41f, 5.39f, -4.0f)
                curveToRelative(0f, -3.55f, -2.88f, -4.0f, -5.39f, -4.0f)
                close()
                moveTo(10.61f, 12.51f)
                curveToRelative(-0.59f, 0f, -1.1f, -0.01f, -1.6f, -0.06f)
                curveToRelative(-0.0f, -0.14f, -0.0f, -0.27f, -0.0f, -0.41f)
                curveToRelative(0f, -2.57f, 0.19f, -4.67f, 0.27f, -5.51f)
                curveToRelative(0.33f, -0.03f, 1.33f, -0.02f, 1.33f, -0.02f)
                curveToRelative(3.16f, 0f, 4.39f, 0.84f, 4.39f, 3.0f)
                reflectiveCurveToRelative(-1.23f, 3.0f, -4.39f, 3.0f)
                close()
            }
        }.also { _ParkingCircle = it}
