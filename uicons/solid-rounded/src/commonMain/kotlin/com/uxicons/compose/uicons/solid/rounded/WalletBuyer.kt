package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletBuyer: ImageVector? = null

val Icons.Sr.WalletBuyer: ImageVector
    get() = _WalletBuyer ?: UXIcon(name = "WalletBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(23f, 24f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.31f, 0f, -0.6f, -0.14f, -0.79f, -0.39f)
                curveToRelative(-0.19f, -0.25f, -0.25f, -0.57f, -0.17f, -0.87f)
                curveToRelative(0.59f, -2.2f, 2.63f, -3.74f, 4.97f, -3.74f)
                reflectiveCurveToRelative(4.38f, 1.54f, 4.97f, 3.74f)
                curveToRelative(0.08f, 0.3f, 0.02f, 0.62f, -0.17f, 0.87f)
                curveToRelative(-0.19f, 0.25f, -0.48f, 0.39f, -0.79f, 0.39f)
                close()
                moveTo(24f, 15.5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 4f)
                curveToRelative(-0.86f, 0f, -1.67f, -0.37f, -2.23f, -1.0f)
                curveToRelative(0.55f, -0.61f, 1.35f, -1.0f, 2.23f, -1.0f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, -0f)
                curveTo(3.18f, 0f, 1.58f, 0.98f, 0.71f, 2.44f)
                curveToRelative(-0.03f, 0.04f, -0.05f, 0.08f, -0.07f, 0.12f)
                curveToRelative(-0.41f, 0.72f, -0.64f, 1.56f, -0.64f, 2.44f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8.16f)
                curveToRelative(0.57f, -0.8f, 1.3f, -1.45f, 2.13f, -1.96f)
                curveToRelative(-0.5f, -0.72f, -0.8f, -1.6f, -0.8f, -2.54f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                horizontalLineToRelative(0.5f)
                close()
            }
        }.also { _WalletBuyer = it}
