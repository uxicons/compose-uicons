package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletBuyer: ImageVector? = null

val Icons.Rr.WalletBuyer: ImageVector
    get() = _WalletBuyer ?: UXIcon(name = "WalletBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21f, 4f)
                lineTo(5f, 4f)
                curveToRelative(-0.86f, 0f, -1.65f, -0.38f, -2.22f, -1.0f)
                curveToRelative(0.55f, -0.61f, 1.33f, -1.0f, 2.22f, -1.0f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                lineTo(2f, 5f)
                reflectiveCurveToRelative(0.0f, -0.0f, 0.01f, -0.0f)
                curveToRelative(0.85f, 0.64f, 1.9f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(19f, 19f)
                curveToRelative(-2.33f, 0f, -4.38f, 1.54f, -4.97f, 3.74f)
                curveToRelative(-0.14f, 0.53f, 0.17f, 1.08f, 0.71f, 1.23f)
                curveToRelative(0.53f, 0.14f, 1.08f, -0.17f, 1.23f, -0.71f)
                curveToRelative(0.36f, -1.33f, 1.6f, -2.26f, 3.03f, -2.26f)
                reflectiveCurveToRelative(2.68f, 0.93f, 3.03f, 2.26f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.74f, 0.96f, 0.74f)
                curveToRelative(0.09f, 0f, 0.17f, -0.01f, 0.26f, -0.04f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.23f)
                curveToRelative(-0.59f, -2.2f, -2.63f, -3.74f, -4.97f, -3.74f)
                close()
            }
        }.also { _WalletBuyer = it}
