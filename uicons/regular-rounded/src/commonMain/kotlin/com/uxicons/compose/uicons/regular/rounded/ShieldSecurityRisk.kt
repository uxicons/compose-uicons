package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Rr.ShieldSecurityRisk: ImageVector
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
                moveTo(16f, 16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(18.5f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10.39f, 23.45f)
                curveToRelative(-0.17f, 0.35f, -0.53f, 0.55f, -0.9f, 0.55f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.03f, -0.45f, -0.1f)
                curveToRelative(-1.51f, -0.76f, -9.05f, -4.87f, -9.05f, -11.7f)
                verticalLineToRelative(-5.32f)
                curveTo(0f, 4.71f, 1.38f, 2.81f, 3.43f, 2.13f)
                lineTo(9.69f, 0.05f)
                curveToRelative(0.2f, -0.07f, 0.42f, -0.07f, 0.63f, 0f)
                lineToRelative(6.26f, 2.08f)
                curveToRelative(2.05f, 0.68f, 3.43f, 2.59f, 3.43f, 4.75f)
                verticalLineToRelative(0.13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.13f)
                curveToRelative(0f, -1.29f, -0.83f, -2.44f, -2.06f, -2.85f)
                lineToRelative(-5.94f, -1.97f)
                lineToRelative(-5.94f, 1.97f)
                curveToRelative(-1.23f, 0.41f, -2.06f, 1.55f, -2.06f, 2.85f)
                verticalLineToRelative(5.32f)
                curveToRelative(0f, 5.65f, 6.62f, 9.25f, 7.95f, 9.91f)
                curveToRelative(0.49f, 0.25f, 0.69f, 0.85f, 0.45f, 1.34f)
                close()
            }
        }.also { _ShieldSecurityRisk = it}
