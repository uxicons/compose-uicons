package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Tr.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 14.5f)
                lineTo(11.5f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(22f, 6.59f)
                lineToRelative(-0.0f, 5.35f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                curveToRelative(0f, 0f, -0.42f, 0.21f, -0.63f, 0.21f)
                reflectiveCurveToRelative(-0.65f, -0.27f, -0.65f, -0.27f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                lineToRelative(0.0f, -5.35f)
                curveToRelative(0f, -1.94f, 1.24f, -3.66f, 3.08f, -4.27f)
                lineTo(11.84f, 0.08f)
                curveToRelative(0.1f, -0.03f, 0.21f, -0.03f, 0.31f, 0f)
                lineToRelative(6.76f, 2.24f)
                curveToRelative(1.84f, 0.61f, 3.08f, 2.33f, 3.08f, 4.27f)
                close()
                moveTo(21f, 6.59f)
                curveToRelative(0f, -1.51f, -0.96f, -2.85f, -2.4f, -3.32f)
                lineToRelative(-6.6f, -2.19f)
                lineToRelative(-6.6f, 2.19f)
                curveToRelative(-1.44f, 0.48f, -2.4f, 1.81f, -2.4f, 3.32f)
                lineToRelative(-0.0f, 5.35f)
                curveToRelative(0f, 6.04f, 6.74f, 9.87f, 8.8f, 10.9f)
                lineToRelative(0.22f, 0.11f)
                lineToRelative(0.23f, -0.09f)
                curveToRelative(2.05f, -0.82f, 8.74f, -4.05f, 8.74f, -10.92f)
                lineToRelative(0.0f, -5.35f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ShieldExclamation = it}
