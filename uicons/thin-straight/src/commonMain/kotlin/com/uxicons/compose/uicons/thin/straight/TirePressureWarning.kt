package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TirePressureWarning: ImageVector? = null

val Icons.Ts.TirePressureWarning: ImageVector
    get() = _TirePressureWarning ?: UXIcon(name = "TirePressureWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 13f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 3f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 13f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 12.5f)
                curveToRelative(0f, -3.81f, -1.63f, -6.52f, -2.6f, -7.8f)
                curveToRelative(-0.86f, -1.13f, -1.4f, -2.93f, -1.4f, -4.7f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.0f, 0.6f, 3.98f, 1.6f, 5.3f)
                curveToRelative(0.9f, 1.18f, 2.4f, 3.68f, 2.4f, 7.2f)
                curveToRelative(0f, 5.15f, -3.94f, 8.02f, -4.65f, 8.5f)
                lineTo(5.65f, 21f)
                curveToRelative(-0.71f, -0.48f, -4.65f, -3.35f, -4.65f, -8.5f)
                curveToRelative(0f, -3.52f, 1.5f, -6.02f, 2.4f, -7.2f)
                curveToRelative(1.0f, -1.32f, 1.6f, -3.3f, 1.6f, -5.3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.76f, -0.54f, 3.56f, -1.4f, 4.7f)
                curveToRelative(-0.97f, 1.28f, -2.6f, 3.99f, -2.6f, 7.8f)
                curveToRelative(0f, 5.51f, 3.96f, 8.56f, 5f, 9.27f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.23f)
                curveToRelative(1.04f, -0.71f, 5f, -3.76f, 5f, -9.27f)
                close()
            }
        }.also { _TirePressureWarning = it}
