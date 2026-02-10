package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Tr.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(22.75f, 8.34f)
                curveToRelative(-0.24f, -0.14f, -0.55f, -0.06f, -0.68f, 0.18f)
                curveToRelative(-0.14f, 0.25f, -0.05f, 0.57f, 0.21f, 0.7f)
                curveToRelative(0.49f, 0.24f, 0.72f, 0.82f, 0.72f, 1.37f)
                verticalLineToRelative(10.92f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.35f, 0.07f, -0.68f, 0.16f, -1.0f)
                curveToRelative(0.84f, 0.94f, 2.05f, 1.5f, 3.34f, 1.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 8f)
                curveToRelative(-1.15f, 0f, -2.21f, -0.57f, -2.86f, -1.5f)
                curveToRelative(0.63f, -0.9f, 1.68f, -1.5f, 2.86f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 4f)
                curveTo(2.02f, 4f, 0f, 6.01f, 0f, 8.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.89f, -0.48f, -1.72f, -1.25f, -2.17f)
                close()
                moveTo(16f, 4f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                lineToRelative(2.65f, -2.58f)
                verticalLineToRelative(7.22f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(20f, 1.31f)
                lineToRelative(2.65f, 2.55f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.19f, 0.71f, -0.01f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                lineToRelative(-2.81f, -2.69f)
                curveToRelative(-0.23f, -0.23f, -0.68f, -0.45f, -1.04f, -0.45f)
                reflectiveCurveToRelative(-0.83f, 0.2f, -1.07f, 0.44f)
                lineToRelative(-2.77f, 2.7f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                close()
            }
        }.also { _WalletArrow = it}
