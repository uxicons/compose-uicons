package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletMoney: ImageVector? = null

val Icons.Tr.WalletMoney: ImageVector
    get() = _WalletMoney ?: UXIcon(name = "WalletMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.6f, 0.86f, -3.1f, 2.25f, -3.9f)
                curveToRelative(0.24f, -0.14f, 0.55f, -0.06f, 0.68f, 0.18f)
                curveToRelative(0.14f, 0.24f, 0.06f, 0.55f, -0.18f, 0.68f)
                curveToRelative(-0.45f, 0.26f, -0.83f, 0.62f, -1.12f, 1.03f)
                curveToRelative(0.65f, 0.93f, 1.73f, 1.5f, 2.87f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(5.05f)
                curveToRelative(-0.03f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.17f, -0.02f, 0.33f, -0.05f, 0.5f)
                horizontalLineToRelative(3.55f)
                curveToRelative(0.56f, 0f, 1.08f, 0.2f, 1.5f, 0.51f)
                verticalLineToRelative(-4.01f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(16.94f, 8f)
                curveToRelative(0.04f, -0.17f, 0.06f, -0.34f, 0.06f, -0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.16f, 0.03f, 0.33f, 0.06f, 0.5f)
                close()
                moveTo(23f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.29f, 0f, -2.51f, -0.56f, -3.35f, -1.5f)
                curveToRelative(-0.1f, 0.32f, -0.15f, 0.66f, -0.15f, 1f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WalletMoney = it}
