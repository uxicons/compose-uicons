package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Tc.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.5f, 0f, -11f, 3.5f, -11f, 11f)
                curveToRelative(0f, 9.75f, 5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 3.29f, -0.62f, 5.68f, -2.0f, 7.29f)
                lineToRelative(-6.25f, -6.25f)
                curveToRelative(1.49f, -0.61f, 2.25f, -1.79f, 2.25f, -3.54f)
                curveToRelative(0f, -3.55f, -2.88f, -4.0f, -5.39f, -4.0f)
                curveToRelative(0f, 0f, -1.35f, -0.0f, -1.87f, 0.08f)
                curveToRelative(-0.22f, 0.04f, -0.39f, 0.21f, -0.42f, 0.43f)
                curveToRelative(-0.0f, 0.03f, -0.07f, 0.56f, -0.14f, 1.46f)
                lineToRelative(-3.41f, -3.41f)
                curveToRelative(1.63f, -1.4f, 4.02f, -2.07f, 7.23f, -2.07f)
                curveToRelative(7.1f, 0f, 10f, 2.9f, 10f, 10f)
                close()
                moveTo(9.12f, 8.41f)
                curveToRelative(0.05f, -0.84f, 0.12f, -1.5f, 0.15f, -1.89f)
                curveToRelative(0.33f, -0.03f, 1.33f, -0.02f, 1.33f, -0.02f)
                curveToRelative(3.16f, 0f, 4.39f, 0.84f, 4.39f, 3.0f)
                curveToRelative(0f, 1.47f, -0.65f, 2.35f, -2.03f, 2.76f)
                lineToRelative(-3.85f, -3.85f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -3.21f, 0.66f, -5.59f, 2.07f, -7.23f)
                lineToRelative(15.23f, 15.23f)
                curveToRelative(-1.61f, 1.38f, -4.0f, 2.0f, -7.29f, 2.0f)
                curveToRelative(-7.1f, 0f, -10f, -2.9f, -10f, -10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 12.5f)
                curveToRelative(-0.57f, 0f, -1.01f, -0.0f, -1.49f, -0.05f)
                curveToRelative(-0.01f, -0.31f, -0.01f, -0.63f, -0.01f, -0.95f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 3.43f, 0.54f, 6.46f, 0.56f, 6.59f)
                curveToRelative(0.04f, 0.24f, 0.25f, 0.41f, 0.49f, 0.41f)
                curveToRelative(0.03f, 0f, 0.06f, -0.0f, 0.09f, -0.01f)
                curveToRelative(0.27f, -0.05f, 0.45f, -0.31f, 0.4f, -0.58f)
                curveToRelative(-0.0f, -0.02f, -0.35f, -1.97f, -0.49f, -4.45f)
                curveToRelative(0.47f, 0.04f, 0.91f, 0.04f, 1.44f, 0.04f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
