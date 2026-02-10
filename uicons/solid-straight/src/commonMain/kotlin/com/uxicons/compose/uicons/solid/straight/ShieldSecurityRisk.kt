package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSecurityRisk: ImageVector? = null

val Icons.Ss.ShieldSecurityRisk: ImageVector
    get() = _ShieldSecurityRisk ?: UXIcon(name = "ShieldSecurityRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(11.93f, 23.2f)
                curveToRelative(-0.89f, 0.43f, -1.52f, 0.64f, -1.61f, 0.68f)
                lineToRelative(-0.37f, 0.12f)
                lineToRelative(-0.35f, -0.16f)
                curveToRelative(-0.39f, -0.17f, -9.59f, -4.33f, -9.59f, -11.85f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineTo(10f, 0f)
                lineToRelative(7.94f, 2.63f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                verticalLineToRelative(4.78f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.99f, 0.73f, 3.8f, 1.93f, 5.2f)
                close()
            }
        }.also { _ShieldSecurityRisk = it}
