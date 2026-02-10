package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Br.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 14f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(22.5f, 7.95f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(11.05f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            lineTo(5.5f, 21.0f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 9.39f)
            curveToRelative(0.76f, 0.39f, 1.61f, 0.6f, 2.5f, 0.6f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 7f)
            curveToRelative(-0.8f, 0f, -1.53f, -0.38f, -1.99f, -0.99f)
            curveToRelative(0.46f, -0.61f, 1.18f, -1.0f, 1.99f, -1.0f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 2f)
            curveTo(2.44f, 1.99f, -0.01f, 4.54f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(15f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            lineTo(24f, 9.45f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.82f, 8.67f)
            curveToRelative(0.38f, 0.38f, 0.99f, 0.38f, 1.37f, 0f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.61f, -0.61f, 0.18f, -1.65f, -0.69f, -1.65f)
            horizontalLineToRelative(-1.56f)
            lineTo(19.0f, 1.45f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(16.0f, 3.95f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-0.86f, 0f, -1.29f, 1.04f, -0.69f, 1.65f)
            lineToRelative(3.06f, 3.06f)
            close()
        }
    }.also { _WalletIncome = it }
