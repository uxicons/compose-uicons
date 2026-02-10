package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Sr.ShieldSecurityRisk: ImageVector
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
                moveTo(11.96f, 23.24f)
                curveToRelative(-0.46f, 0.23f, -0.87f, 0.4f, -1.17f, 0.52f)
                curveToRelative(0f, 0f, -0.29f, 0.24f, -0.79f, 0.24f)
                reflectiveCurveToRelative(-0.85f, -0.31f, -0.85f, -0.31f)
                curveTo(7.0f, 22.62f, 0f, 18.61f, 0f, 12.04f)
                verticalLineToRelative(-5.17f)
                curveTo(0f, 4.71f, 1.38f, 2.81f, 3.43f, 2.13f)
                lineTo(9.69f, 0.05f)
                curveToRelative(0.2f, -0.07f, 0.42f, -0.07f, 0.63f, 0f)
                lineToRelative(6.26f, 2.08f)
                curveToRelative(2.05f, 0.68f, 3.43f, 2.59f, 3.43f, 4.75f)
                verticalLineToRelative(3.39f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 2.0f, 0.74f, 3.83f, 1.96f, 5.24f)
                close()
            }
        }.also { _ShieldSecurityRisk = it}
