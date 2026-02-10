package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerQuarter: ImageVector? = null

val Icons.Tc.ThermometerQuarter: ImageVector
    get() = _ThermometerQuarter ?: UXIcon(name = "ThermometerQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 14.53f)
                verticalLineToRelative(-4.03f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.03f)
                curveToRelative(-1.36f, 0.15f, -2f, 0.94f, -2f, 2.47f)
                curveToRelative(0f, 1.71f, 0.79f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.79f, 2.5f, -2.5f)
                curveToRelative(0f, -1.53f, -0.64f, -2.32f, -2f, -2.47f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-1.15f, 0f, -1.5f, -0.35f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.35f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.35f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.35f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16f, 11.95f)
                verticalLineToRelative(-6.95f)
                curveToRelative(0f, -2.77f, -1.23f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.23f, -4f, 4f)
                verticalLineToRelative(6.95f)
                curveToRelative(-1.36f, 0.92f, -2f, 2.54f, -2f, 5.05f)
                curveToRelative(0f, 4.21f, 1.79f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.79f, 6f, -6f)
                curveToRelative(0f, -2.51f, -0.64f, -4.12f, -2f, -5.05f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.65f, 0f, -5f, -1.35f, -5f, -5f)
                curveToRelative(0f, -2.29f, 0.54f, -3.63f, 1.75f, -4.34f)
                curveToRelative(0.15f, -0.09f, 0.25f, -0.25f, 0.25f, -0.43f)
                verticalLineToRelative(-7.23f)
                curveToRelative(0f, -2.21f, 0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                verticalLineToRelative(7.23f)
                curveToRelative(0f, 0.18f, 0.1f, 0.34f, 0.25f, 0.43f)
                curveToRelative(1.21f, 0.71f, 1.75f, 2.04f, 1.75f, 4.34f)
                curveToRelative(0f, 3.65f, -1.35f, 5f, -5f, 5f)
                close()
            }
        }.also { _ThermometerQuarter = it}
