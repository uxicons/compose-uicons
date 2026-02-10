package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PremiumAccount: ImageVector? = null

val Icons.Ss.PremiumAccount: ImageVector
    get() = _PremiumAccount ?: UXIcon(name = "PremiumAccount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                lineToRelative(2f, 2.23f)
                lineToRelative(2f, -2.23f)
                lineToRelative(2f, 2.23f)
                lineToRelative(2f, -2.23f)
                close()
                moveTo(10f, 10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.3f)
                curveToRelative(1.25f, 0.45f, 2.6f, 0.7f, 4f, 0.7f)
                reflectiveCurveToRelative(2.75f, -0.26f, 4f, -0.7f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(18f, 1.62f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(0.84f, 0.73f, 1.38f, 1.8f, 1.38f, 3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.2f, 0.54f, -2.27f, 1.38f, -3f)
                horizontalLineToRelative(-3.38f)
                verticalLineToRelative(-5.38f)
                curveToRelative(-3.58f, 2.08f, -6f, 5.95f, -6f, 10.38f)
                reflectiveCurveToRelative(2.42f, 8.3f, 6f, 10.38f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3.38f)
                curveToRelative(3.58f, -2.08f, 6f, -5.95f, 6f, -10.38f)
                reflectiveCurveToRelative(-2.42f, -8.3f, -6f, -10.38f)
                close()
            }
        }.also { _PremiumAccount = it}
