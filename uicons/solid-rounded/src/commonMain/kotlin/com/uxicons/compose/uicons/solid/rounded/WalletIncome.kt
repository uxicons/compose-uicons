package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Sr.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.3f, 7.21f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                lineToRelative(1.3f, 1.28f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(20f, 7.05f)
                lineToRelative(1.3f, -1.27f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.02f)
                curveToRelative(0.39f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                lineToRelative(-2.24f, 2.18f)
                curveToRelative(-0.81f, 0.81f, -2.15f, 0.81f, -2.96f, -0.01f)
                lineToRelative(-2.2f, -2.17f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9f)
                curveTo(-0.01f, 6.29f, 2.22f, 4.0f, 5f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(5f, 6f)
                curveToRelative(-0.89f, 0f, -1.69f, 0.39f, -2.23f, 1.0f)
                curveToRelative(0.56f, 0.63f, 1.38f, 1.0f, 2.23f, 1.0f)
                lineTo(13.42f, 8f)
                curveToRelative(0.13f, 0.23f, 0.28f, 0.44f, 0.47f, 0.63f)
                lineToRelative(2.19f, 2.17f)
                curveToRelative(1.5f, 1.58f, 4.27f, 1.59f, 5.77f, 0.03f)
                lineToRelative(1.59f, -1.55f)
                curveToRelative(0.34f, 0.49f, 0.55f, 1.08f, 0.55f, 1.72f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WalletIncome = it}
