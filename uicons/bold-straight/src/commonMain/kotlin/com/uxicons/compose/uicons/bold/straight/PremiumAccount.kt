package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PremiumAccount: ImageVector? = null

val Icons.Bs.PremiumAccount: ImageVector
    get() = _PremiumAccount ?: UXIcon(name = "PremiumAccount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(16f, 0f)
                lineTo(14f, 2.23f)
                lineTo(12f, 0f)
                lineTo(10f, 2.23f)
                lineTo(8f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                curveToRelative(0f, -4.43f, 2.42f, -8.3f, 6f, -10.38f)
                verticalLineToRelative(3.69f)
                curveToRelative(-1.84f, 1.65f, -3f, 4.03f, -3f, 6.69f)
                reflectiveCurveToRelative(1.16f, 5.04f, 3f, 6.69f)
                curveToRelative(0f, -2.19f, 1.5f, -3.69f, 3.5f, -3.69f)
                horizontalLineToRelative(5f)
                curveToRelative(2.0f, -0.01f, 3.5f, 1.5f, 3.5f, 3.69f)
                curveToRelative(1.84f, -1.65f, 3f, -4.03f, 3f, -6.69f)
                reflectiveCurveToRelative(-1.16f, -5.04f, -3f, -6.69f)
                verticalLineToRelative(-3.69f)
                curveToRelative(3.58f, 2.08f, 6f, 5.95f, 6f, 10.38f)
                close()
                moveTo(12f, 21f)
                curveToRelative(1.05f, 0f, 2.06f, -0.19f, 3f, -0.53f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.98f)
                curveToRelative(0.94f, 0.33f, 1.95f, 0.53f, 3f, 0.53f)
                close()
            }
        }.also { _PremiumAccount = it}
