package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletIncome: ImageVector? = null

val Icons.Tr.WalletIncome: ImageVector
    get() = _WalletIncome ?: UXIcon(name = "WalletIncome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(23.66f, 9.25f)
                curveToRelative(-0.14f, -0.24f, -0.45f, -0.32f, -0.68f, -0.18f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.44f, -0.18f, 0.68f)
                curveToRelative(0.13f, 0.23f, 0.2f, 0.49f, 0.2f, 0.75f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 8.5f)
                curveToRelative(0f, -0.35f, 0.07f, -0.68f, 0.16f, -1.0f)
                curveToRelative(0.84f, 0.94f, 2.05f, 1.5f, 3.34f, 1.5f)
                lineTo(15f, 9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 8f)
                curveToRelative(-1.15f, 0f, -2.21f, -0.57f, -2.86f, -1.5f)
                curveToRelative(0.63f, -0.9f, 1.68f, -1.5f, 2.86f, -1.5f)
                lineTo(13.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 4f)
                curveToRelative(-2.5f, -0.0f, -4.48f, 2.07f, -4.5f, 4.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                lineTo(21.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 10.5f)
                curveToRelative(0f, -0.44f, -0.12f, -0.87f, -0.34f, -1.25f)
                close()
                moveTo(18.42f, 8.55f)
                curveToRelative(0.58f, 0.56f, 1.53f, 0.56f, 2.11f, 0.01f)
                lineToRelative(2.81f, -2.7f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-2.65f, 2.55f)
                lineTo(20f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(19f, 7.72f)
                lineToRelative(-2.65f, -2.58f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.77f, 2.7f)
                close()
            }
        }.also { _WalletIncome = it}
