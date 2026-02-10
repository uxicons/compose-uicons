package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Rr.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                reflectiveCurveToRelative(0f, -0.0f, 0f, -0.01f)
                curveToRelative(0.85f, 0.64f, 1.9f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 8f)
                curveToRelative(-0.86f, 0f, -1.65f, -0.38f, -2.22f, -1.0f)
                curveToRelative(0.55f, -0.61f, 1.33f, -1.0f, 2.22f, -1.0f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3f, 0f, -5f, 2.5f, -5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.7f, 4.21f)
                lineToRelative(1.3f, -1.28f)
                verticalLineToRelative(6.07f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(20f, 2.95f)
                lineToRelative(1.3f, 1.27f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.72f, -0.3f)
                curveToRelative(0.39f, -0.4f, 0.38f, -1.03f, -0.02f, -1.41f)
                lineToRelative(-2.23f, -2.17f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, -0.0f)
                lineToRelative(-2.2f, 2.18f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.42f, 0.01f)
                close()
            }
        }.also { _WalletArrow = it}
