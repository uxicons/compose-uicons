package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PremiumAccount: ImageVector? = null

val Icons.Rs.PremiumAccount: ImageVector
    get() = _PremiumAccount ?: UXIcon(name = "PremiumAccount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(12f, 8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(16f, 5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                lineToRelative(2f, 2.23f)
                lineToRelative(2f, -2.23f)
                lineToRelative(2f, 2.23f)
                lineToRelative(2f, -2.23f)
                close()
                moveTo(18f, 1.62f)
                verticalLineToRelative(2.4f)
                curveToRelative(2.42f, 1.83f, 4f, 4.72f, 4f, 7.98f)
                reflectiveCurveToRelative(-1.58f, 6.15f, -4f, 7.98f)
                verticalLineToRelative(-0.98f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.98f)
                curveToRelative(-2.42f, -1.83f, -4f, -4.72f, -4f, -7.98f)
                reflectiveCurveToRelative(1.58f, -6.15f, 4f, -7.98f)
                verticalLineToRelative(-2.4f)
                curveToRelative(-3.58f, 2.08f, -6f, 5.95f, -6f, 10.38f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -4.43f, -2.42f, -8.3f, -6f, -10.38f)
                close()
                moveTo(8f, 21.16f)
                verticalLineToRelative(-2.16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.16f)
                curveToRelative(-1.23f, 0.54f, -2.58f, 0.84f, -4f, 0.84f)
                reflectiveCurveToRelative(-2.77f, -0.3f, -4f, -0.84f)
                close()
            }
        }.also { _PremiumAccount = it}
