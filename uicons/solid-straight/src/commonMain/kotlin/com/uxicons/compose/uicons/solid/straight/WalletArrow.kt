package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Ss.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(16f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 6.5f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.24f, -1.42f, 1.47f, -2.5f, 2.95f, -2.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(22.96f, 3.11f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, 0f)
                lineToRelative(-2.45f, 2.45f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                verticalLineToRelative(7.06f)
                horizontalLineToRelative(2f)
                lineTo(20f, 2.97f)
                lineToRelative(1.55f, 1.55f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _WalletArrow = it}
