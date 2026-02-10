package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Br.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.11f)
            curveToRelative(0.76f, 0.39f, 1.61f, 0.6f, 2.5f, 0.6f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.8f, 0f, -1.53f, -0.38f, -1.99f, -0.99f)
            curveToRelative(0.46f, -0.61f, 1.18f, -1.0f, 1.99f, -1.0f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5f)
            curveTo(2.46f, 2f, 0f, 4.46f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(14.44f, 5.0f)
            horizontalLineToRelative(1.56f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.86f, 0f, 1.29f, -1.04f, 0.69f, -1.65f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.69f, 1.65f)
            close()
        }
    }.also { _WalletArrow = it }
