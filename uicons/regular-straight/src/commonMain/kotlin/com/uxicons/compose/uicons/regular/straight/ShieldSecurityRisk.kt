package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Rs.ShieldSecurityRisk: ImageVector
    get() = _ShieldSecurityRisk ?: UXIcon(name = "ShieldSecurityRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9.11f, 21.32f)
                curveToRelative(0.48f, 0.87f, 1.1f, 1.64f, 1.82f, 2.31f)
                curveToRelative(-0.04f, 0.02f, -0.09f, 0.04f, -0.13f, 0.06f)
                lineToRelative(-0.84f, 0.34f)
                lineToRelative(-0.81f, -0.4f)
                curveTo(7.0f, 22.54f, 0f, 18.53f, 0f, 11.96f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0f, -1.73f, 1.1f, -3.25f, 2.74f, -3.8f)
                lineTo(10f, 0.01f)
                lineToRelative(7.26f, 2.41f)
                curveToRelative(1.64f, 0.54f, 2.74f, 2.07f, 2.74f, 3.8f)
                verticalLineToRelative(2.31f)
                curveToRelative(-0.64f, -0.23f, -1.3f, -0.39f, -2f, -0.46f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0f, -0.86f, -0.55f, -1.63f, -1.37f, -1.9f)
                lineToRelative(-6.63f, -2.2f)
                lineToRelative(-6.63f, 2.2f)
                curveToRelative(-0.82f, 0.27f, -1.37f, 1.03f, -1.37f, 1.9f)
                verticalLineToRelative(5.75f)
                curveToRelative(0f, 4.71f, 4.65f, 7.96f, 7.11f, 9.36f)
                close()
            }
        }.also { _ShieldSecurityRisk = it}
