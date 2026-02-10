package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Sc.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.91f, 6.3f)
                curveToRelative(0.1f, -2.75f, 0.4f, -4.17f, 0.41f, -4.24f)
                curveToRelative(0.1f, -0.45f, 0.49f, -0.74f, 0.93f, -0.76f)
                curveToRelative(1.03f, -0.21f, 2.12f, -0.26f, 4.24f, -0.29f)
                curveToRelative(4.23f, 0f, 6.43f, 1.04f, 6.67f, 1.16f)
                curveToRelative(0.74f, 0.37f, 1.04f, 1.27f, 0.67f, 2.01f)
                curveToRelative(-0.37f, 0.75f, -1.29f, 1.04f, -2.01f, 0.67f)
                curveToRelative(-0.01f, -0.0f, -1.67f, -0.76f, -4.89f, -0.83f)
                curveToRelative(0.06f, 0.61f, 0.11f, 1.38f, 0.14f, 2.29f)
                curveToRelative(-0.94f, -0.19f, -1.96f, -0.3f, -3.08f, -0.3f)
                reflectiveCurveToRelative(-2.15f, 0.1f, -3.08f, 0.3f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, 2.56f, -0.49f, 5.37f, -0.52f, 5.49f)
                curveToRelative(-0.07f, 0.38f, -0.35f, 0.69f, -0.72f, 0.79f)
                curveToRelative(-0.11f, 0.03f, -2.66f, 0.72f, -6.77f, 0.72f)
                reflectiveCurveToRelative(-6.66f, -0.69f, -6.77f, -0.72f)
                curveToRelative(-0.37f, -0.1f, -0.65f, -0.41f, -0.72f, -0.79f)
                curveToRelative(-0.02f, -0.12f, -0.52f, -2.93f, -0.52f, -5.49f)
                curveToRelative(0f, -5.53f, 2.47f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 2.47f, 8f, 8f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PumpMedical = it}
