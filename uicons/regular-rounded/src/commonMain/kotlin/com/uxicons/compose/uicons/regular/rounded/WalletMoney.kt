package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletMoney: ImageVector? = null

val Icons.Rr.WalletMoney: ImageVector
    get() = _WalletMoney ?: UXIcon(name = "WalletMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-16f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.87f, 0.23f, -1.71f, 0.64f, -2.45f)
                curveToRelative(0.27f, -0.49f, 0.62f, -0.92f, 1.05f, -1.3f)
                curveToRelative(0.41f, -0.36f, 1.05f, -0.33f, 1.41f, 0.09f)
                curveToRelative(0.36f, 0.41f, 0.33f, 1.05f, -0.09f, 1.41f)
                curveToRelative(-0.09f, 0.08f, -0.17f, 0.16f, -0.25f, 0.25f)
                curveToRelative(0.56f, 0.63f, 1.38f, 1f, 2.23f, 1f)
                verticalLineToRelative(-4f)
                curveToRelative(-0.0f, -2.21f, 1.79f, -4f, 4.0f, -4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.35f, 0f, 0.69f, 0.07f, 1f, 0.18f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-16f)
                curveToRelative(-1.1f, 0f, -2.15f, -0.36f, -3f, -1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _WalletMoney = it}
