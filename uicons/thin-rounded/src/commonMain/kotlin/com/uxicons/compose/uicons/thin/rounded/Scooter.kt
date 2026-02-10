package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scooter: ImageVector? = null

val Icons.Tr.Scooter: ImageVector
    get() = _Scooter ?: UXIcon(name = "Scooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-0.06f, 0f, -0.12f, 0.01f, -0.18f, 0.02f)
                lineToRelative(-3.59f, -14.59f)
                curveToRelative(-0.49f, -2.02f, -2.29f, -3.43f, -4.37f, -3.43f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.36f)
                curveToRelative(1.61f, 0f, 3.01f, 1.1f, 3.4f, 2.67f)
                lineToRelative(2.25f, 9.14f)
                lineToRelative(-3.2f, 3.91f)
                curveToRelative(-0.67f, 0.82f, -1.66f, 1.28f, -2.71f, 1.28f)
                lineTo(0.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.28f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                horizontalLineToRelative(6.38f)
                curveToRelative(1.35f, 0f, 2.62f, -0.6f, 3.48f, -1.65f)
                lineToRelative(2.72f, -3.33f)
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
