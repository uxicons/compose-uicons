package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletBuyer: ImageVector? = null

val Icons.Tr.WalletBuyer: ImageVector
    get() = _WalletBuyer ?: UXIcon(name = "WalletBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(4.5f, 5f)
                curveToRelative(-1.28f, 0f, -2.49f, -0.56f, -3.34f, -1.5f)
                curveToRelative(-0.1f, 0.32f, -0.16f, 0.65f, -0.16f, 1.0f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 20f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-1.19f, 0f, -2.23f, 0.6f, -2.86f, 1.5f)
                curveToRelative(0.65f, 0.93f, 1.72f, 1.5f, 2.86f, 1.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(19f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(19f, 17f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(19f, 19f)
                curveToRelative(-2.56f, 0f, -4.71f, 1.91f, -5.0f, 4.44f)
                curveToRelative(-0.03f, 0.27f, 0.17f, 0.52f, 0.44f, 0.55f)
                curveToRelative(0.27f, 0.03f, 0.52f, -0.17f, 0.55f, -0.44f)
                curveToRelative(0.23f, -2.03f, 1.95f, -3.56f, 4.0f, -3.56f)
                reflectiveCurveToRelative(3.77f, 1.53f, 4.0f, 3.56f)
                curveToRelative(0.03f, 0.26f, 0.24f, 0.44f, 0.5f, 0.44f)
                curveToRelative(0.02f, 0f, 0.04f, 0f, 0.06f, -0.0f)
                curveToRelative(0.27f, -0.03f, 0.47f, -0.28f, 0.44f, -0.55f)
                curveToRelative(-0.29f, -2.53f, -2.44f, -4.44f, -5.0f, -4.44f)
                close()
            }
        }.also { _WalletBuyer = it}
