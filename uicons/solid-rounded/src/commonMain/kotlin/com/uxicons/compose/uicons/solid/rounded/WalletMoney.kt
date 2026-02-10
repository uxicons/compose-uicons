package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletMoney: ImageVector? = null

val Icons.Sr.WalletMoney: ImageVector
    get() = _WalletMoney ?: UXIcon(name = "WalletMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-0.86f, 0f, -1.67f, -0.37f, -2.23f, -1f)
                curveToRelative(0.08f, -0.09f, 0.16f, -0.17f, 0.25f, -0.25f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.09f, -1.41f)
                curveToRelative(-0.37f, -0.41f, -1.0f, -0.45f, -1.41f, -0.09f)
                curveToRelative(-0.42f, 0.38f, -0.78f, 0.81f, -1.05f, 1.3f)
                curveToRelative(-0.42f, 0.74f, -0.64f, 1.58f, -0.64f, 2.45f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18.5f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15f, 3f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.11f, 0.0f, 2.15f, 0.38f, 3f, 1.03f)
                verticalLineToRelative(-4.03f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                close()
                moveTo(21f, 1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9f, 4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _WalletMoney = it}
