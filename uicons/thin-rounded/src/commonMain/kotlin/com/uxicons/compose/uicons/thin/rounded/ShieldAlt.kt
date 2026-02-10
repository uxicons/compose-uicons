package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Tr.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.76f, 2.22f)
                lineTo(12.16f, 0.03f)
                reflectiveCurveToRelative(-0.13f, -0.03f, -0.16f, -0.03f)
                reflectiveCurveToRelative(-0.16f, 0.03f, -0.16f, 0.03f)
                lineToRelative(-6.61f, 2.19f)
                curveToRelative(-1.94f, 0.64f, -3.24f, 2.44f, -3.24f, 4.48f)
                verticalLineToRelative(5.24f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                curveToRelative(0f, 0f, 0.42f, 0.27f, 0.65f, 0.27f)
                reflectiveCurveToRelative(0.63f, -0.21f, 0.63f, -0.21f)
                curveToRelative(2.2f, -0.88f, 9.37f, -4.35f, 9.37f, -11.85f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -2.04f, -1.3f, -3.84f, -3.24f, -4.48f)
                close()
                moveTo(3f, 11.94f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -1.61f, 1.02f, -3.03f, 2.55f, -3.53f)
                lineToRelative(5.95f, -1.97f)
                verticalLineToRelative(21.49f)
                curveToRelative(-2.35f, -1.22f, -8.5f, -4.98f, -8.5f, -10.75f)
                close()
                moveTo(21f, 11.94f)
                curveToRelative(0f, 6.62f, -6.21f, 9.86f, -8.5f, 10.82f)
                lineTo(12.5f, 1.19f)
                lineToRelative(5.95f, 1.97f)
                curveToRelative(1.52f, 0.51f, 2.55f, 1.93f, 2.55f, 3.53f)
                verticalLineToRelative(5.24f)
                close()
            }
        }.also { _ShieldAlt = it}
