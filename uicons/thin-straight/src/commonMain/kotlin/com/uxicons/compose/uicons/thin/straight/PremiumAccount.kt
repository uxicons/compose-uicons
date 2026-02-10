package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PremiumAccount: ImageVector? = null

val Icons.Ts.PremiumAccount: ImageVector
    get() = _PremiumAccount ?: UXIcon(name = "PremiumAccount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                lineToRelative(-2.0f, 1.82f)
                lineToRelative(-2.0f, -1.82f)
                lineToRelative(-2.0f, 1.82f)
                lineToRelative(-2.0f, -1.82f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.74f)
                lineToRelative(1.0f, 0.92f)
                lineToRelative(2.0f, -1.81f)
                lineToRelative(2.0f, 1.81f)
                lineToRelative(1.0f, -0.92f)
                close()
                moveTo(12f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(12f, 7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(18f, 1.62f)
                verticalLineToRelative(1.17f)
                curveToRelative(3.01f, 1.97f, 5f, 5.36f, 5f, 9.21f)
                reflectiveCurveToRelative(-1.99f, 7.24f, -5f, 9.21f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.71f)
                curveToRelative(-3.01f, -1.97f, -5f, -5.36f, -5f, -9.21f)
                reflectiveCurveToRelative(1.99f, -7.24f, 5f, -9.21f)
                verticalLineToRelative(-1.17f)
                curveToRelative(-3.58f, 2.08f, -6f, 5.95f, -6f, 10.38f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -4.43f, -2.42f, -8.3f, -6f, -10.38f)
                close()
                moveTo(7f, 21.79f)
                verticalLineToRelative(-3.29f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.29f)
                curveToRelative(-1.5f, 0.77f, -3.2f, 1.21f, -5f, 1.21f)
                reflectiveCurveToRelative(-3.5f, -0.44f, -5f, -1.21f)
                close()
            }
        }.also { _PremiumAccount = it}
