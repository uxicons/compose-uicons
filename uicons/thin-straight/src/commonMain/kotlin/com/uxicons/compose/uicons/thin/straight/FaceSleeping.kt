package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSleeping: ImageVector? = null

val Icons.Ts.FaceSleeping: ImageVector
    get() = _FaceSleeping ?: UXIcon(name = "FaceSleeping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 1.25f)
                lineToRelative(-3.67f, 2.75f)
                horizontalLineToRelative(3.67f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.25f)
                lineToRelative(3.67f, -2.75f)
                horizontalLineToRelative(-3.67f)
                lineTo(19f, 0f)
                horizontalLineToRelative(5f)
                lineTo(24f, 1.25f)
                close()
                moveTo(10.78f, 11.77f)
                curveToRelative(-0.88f, 0.89f, -1.9f, 1.26f, -2.87f, 1.26f)
                curveToRelative(-1.12f, 0f, -2.18f, -0.48f, -2.94f, -1.23f)
                lineToRelative(0.7f, -0.71f)
                curveToRelative(1.07f, 1.06f, 2.98f, 1.41f, 4.4f, -0.02f)
                lineToRelative(0.71f, 0.7f)
                close()
                moveTo(22.89f, 7f)
                curveToRelative(0.7f, 1.52f, 1.1f, 3.21f, 1.1f, 5f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(1.79f, 0f, 3.48f, 0.4f, 5f, 1.1f)
                verticalLineToRelative(1.11f)
                curveToRelative(-1.5f, -0.77f, -3.2f, -1.21f, -5f, -1.21f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -1.8f, -0.44f, -3.5f, -1.21f, -5f)
                horizontalLineToRelative(1.11f)
                close()
                moveTo(12.0f, 7.75f)
                lineToRelative(3.67f, -2.75f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.25f)
                lineToRelative(-3.67f, 2.75f)
                horizontalLineToRelative(3.67f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(16.13f, 13.02f)
                curveToRelative(-0.98f, 0f, -2.0f, -0.37f, -2.87f, -1.26f)
                lineToRelative(0.71f, -0.7f)
                curveToRelative(1.42f, 1.43f, 3.32f, 1.08f, 4.39f, 0.03f)
                lineToRelative(0.7f, 0.71f)
                curveToRelative(-0.75f, 0.74f, -1.82f, 1.22f, -2.93f, 1.22f)
                close()
            }
        }.also { _FaceSleeping = it}
