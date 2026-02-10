package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Rr.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 14.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 9f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(0.85f, 0.64f, 1.9f, 1.0f, 3.0f, 1.0f)
                lineTo(13f, 10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 8f)
                curveToRelative(-0.86f, 0f, -1.65f, -0.38f, -2.22f, -1.0f)
                curveToRelative(0.55f, -0.61f, 1.33f, -1.0f, 2.22f, -1.0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 4f)
                curveTo(2.22f, 3.99f, 0.02f, 6.3f, 0f, 9f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(21f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(17.5f, 9.38f)
                curveToRelative(0.81f, 0.81f, 2.15f, 0.82f, 2.96f, 0.01f)
                lineToRelative(2.24f, -2.18f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                lineToRelative(-1.3f, 1.27f)
                lineTo(20f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(18f, 7.07f)
                lineToRelative(-1.3f, -1.28f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.38f, 1.03f, 0.01f, 1.41f)
                lineToRelative(2.2f, 2.17f)
                close()
            }
        }.also { _WalletIncome = it}
