package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Rs.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 14.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22f, 8f)
                verticalLineToRelative(14f)
                lineTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-10.68f)
                curveToRelative(0.31f, 0.11f, 0.65f, 0.18f, 1f, 0.18f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                lineTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                lineTo(3f, 4f)
                curveToRelative(-1.48f, 0f, -3f, 1f, -3f, 3f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(20.5f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18f, 2.94f)
                verticalLineToRelative(7.06f)
                horizontalLineToRelative(2f)
                lineTo(20f, 2.97f)
                lineToRelative(1.76f, 1.76f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.71f, -2.71f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, 0f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.78f, -1.78f)
                close()
            }
        }.also { _WalletArrow = it}
