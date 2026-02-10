package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletMoney: ImageVector? = null

val Icons.Br.WalletMoney: ImageVector
    get() = _WalletMoney ?: UXIcon(name = "WalletMoney") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 8f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.79f, 0f, -1.53f, -0.38f, -2f, -1f)
            curveToRelative(0.1f, -0.14f, 0.22f, -0.26f, 0.35f, -0.38f)
            curveToRelative(0.62f, -0.55f, 0.68f, -1.5f, 0.13f, -2.12f)
            curveToRelative(-0.55f, -0.62f, -1.5f, -0.68f, -2.12f, -0.13f)
            curveToRelative(-1.18f, 1.04f, -1.86f, 2.55f, -1.86f, 4.12f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(21f, 20.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-15f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8.1f)
            curveToRelative(0.76f, 0.39f, 1.62f, 0.6f, 2.5f, 0.6f)
            horizontalLineToRelative(15f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            close()
            moveTo(19f, 16f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(21f, 0f)
            horizontalLineToRelative(-12f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.33f, 0f, 2.55f, 0.47f, 3.5f, 1.26f)
            verticalLineToRelative(-4.26f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(9f, 4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(21f, 4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _WalletMoney = it }
