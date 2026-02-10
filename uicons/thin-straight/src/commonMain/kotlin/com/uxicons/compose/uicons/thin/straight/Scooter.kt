package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Ts.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-0.06f, 0f, -0.12f, 0.01f, -0.18f, 0.02f)
                lineTo(16.86f, 1.9f)
                curveToRelative(-0.28f, -1.12f, -1.27f, -1.9f, -2.43f, -1.9f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.43f)
                curveToRelative(0.69f, 0f, 1.29f, 0.47f, 1.46f, 1.14f)
                lineToRelative(2.62f, 10.67f)
                lineToRelative(-4.25f, 5.19f)
                lineTo(0f, 18f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.78f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(8.52f)
                lineToRelative(4.07f, -4.98f)
                lineToRelative(1.03f, 4.21f)
                curveToRelative(-1.08f, 0.45f, -1.84f, 1.52f, -1.84f, 2.77f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(21f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Scooter = it}
