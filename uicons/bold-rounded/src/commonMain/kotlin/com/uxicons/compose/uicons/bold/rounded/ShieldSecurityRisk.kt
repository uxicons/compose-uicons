package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Br.ShieldSecurityRisk: ImageVector
    get() = _ShieldSecurityRisk ?: UXIcon(name = "ShieldSecurityRisk") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(17f, 15f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            close()
            moveTo(18f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(10.96f, 23.17f)
            curveToRelative(-0.26f, 0.53f, -0.79f, 0.83f, -1.34f, 0.83f)
            curveToRelative(-0.23f, 0f, -0.45f, -0.05f, -0.67f, -0.16f)
            curveTo(6.85f, 22.79f, -0.0f, 18.86f, -0.0f, 12.34f)
            lineToRelative(0.0f, -5.3f)
            curveTo(0f, 4.77f, 1.45f, 2.75f, 3.62f, 2.04f)
            lineTo(9.53f, 0.08f)
            curveToRelative(0.31f, -0.1f, 0.64f, -0.1f, 0.94f, 0f)
            lineToRelative(5.91f, 1.96f)
            curveToRelative(2.16f, 0.72f, 3.62f, 2.73f, 3.62f, 5.01f)
            verticalLineToRelative(1.45f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.45f)
            curveToRelative(0f, -0.98f, -0.63f, -1.85f, -1.56f, -2.16f)
            lineToRelative(-5.44f, -1.8f)
            lineToRelative(-5.44f, 1.8f)
            curveToRelative(-0.93f, 0.31f, -1.56f, 1.18f, -1.56f, 2.16f)
            lineToRelative(-0.0f, 5.3f)
            curveToRelative(0f, 4.8f, 5.58f, 7.96f, 7.29f, 8.81f)
            curveToRelative(0.74f, 0.37f, 1.04f, 1.27f, 0.67f, 2.01f)
            close()
        }
    }.also { _ShieldSecurityRisk = it }
