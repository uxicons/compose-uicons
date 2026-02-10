package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateExclamation: ImageVector? = null

val Icons.Ts.RotateExclamation: ImageVector
    get() = _RotateExclamation ?: UXIcon(name = "RotateExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(4.03f, 0f, 7.72f, 1.97f, 9.96f, 5.3f)
                curveToRelative(0.03f, -0.09f, 0.04f, -0.19f, 0.04f, -0.3f)
                lineTo(22f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.02f)
                curveToRelative(-2.04f, -3.12f, -5.46f, -4.98f, -9.21f, -4.98f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                curveToRelative(-3.75f, 0f, -7.16f, -1.85f, -9.21f, -4.98f)
                curveToRelative(0.07f, -0.01f, 0.14f, -0.02f, 0.21f, -0.02f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                lineTo(3f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.1f, 0.02f, -0.2f, 0.04f, -0.3f)
                curveToRelative(2.24f, 3.33f, 5.92f, 5.3f, 9.96f, 5.3f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12.5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 5f)
                close()
                moveTo(11f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _RotateExclamation = it}
