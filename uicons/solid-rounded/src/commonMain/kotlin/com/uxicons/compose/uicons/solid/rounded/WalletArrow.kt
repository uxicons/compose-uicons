package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Sr.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.29f, 4.2f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.03f, 0.01f, -1.41f)
                lineToRelative(2.2f, -2.18f)
                curveToRelative(0.82f, -0.81f, 2.15f, -0.81f, 2.97f, 0.0f)
                lineToRelative(2.23f, 2.17f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.02f, 0.02f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.7f, -0.28f)
                lineToRelative(-1.3f, -1.27f)
                verticalLineToRelative(6.05f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(18.0f, 2.93f)
                lineToRelative(-1.3f, 1.28f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, -0.01f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.89f, 0.23f, -1.72f, 0.64f, -2.44f)
                curveToRelative(0.02f, -0.04f, 0.04f, -0.08f, 0.07f, -0.12f)
                curveToRelative(0.87f, -1.46f, 2.47f, -2.44f, 4.29f, -2.44f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.89f, 0f, -1.69f, 0.39f, -2.23f, 1.0f)
                curveToRelative(0.56f, 0.63f, 1.38f, 1.0f, 2.23f, 1.0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-0.82f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _WalletArrow = it}
