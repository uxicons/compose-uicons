package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Bs.ShieldSecurityRisk: ImageVector
    get() = _ShieldSecurityRisk ?: UXIcon(name = "ShieldSecurityRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.41f, 20.52f)
                curveToRelative(0.32f, 0.97f, 0.82f, 1.86f, 1.47f, 2.63f)
                curveToRelative(-0.36f, 0.17f, -0.67f, 0.3f, -0.92f, 0.4f)
                lineToRelative(-1.02f, 0.41f)
                lineToRelative(-0.98f, -0.49f)
                curveTo(6.85f, 22.41f, 0f, 18.48f, 0f, 11.96f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -1.46f, 0.93f, -2.75f, 2.32f, -3.21f)
                lineTo(10f, 0.04f)
                lineToRelative(7.68f, 2.54f)
                curveToRelative(1.39f, 0.46f, 2.32f, 1.75f, 2.32f, 3.21f)
                verticalLineToRelative(4.46f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.03f, -1f, 0.07f)
                verticalLineToRelative(-4.27f)
                curveToRelative(0f, -0.17f, -0.1f, -0.31f, -0.27f, -0.36f)
                lineToRelative(-6.73f, -2.23f)
                lineToRelative(-6.73f, 2.23f)
                curveToRelative(-0.16f, 0.05f, -0.27f, 0.2f, -0.27f, 0.36f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 4.6f, 5.14f, 7.7f, 7.07f, 8.7f)
                curveToRelative(0.1f, -0.04f, 0.22f, -0.1f, 0.34f, -0.15f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _ShieldSecurityRisk = it}
