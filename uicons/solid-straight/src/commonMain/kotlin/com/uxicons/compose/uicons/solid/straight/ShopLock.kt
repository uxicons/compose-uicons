package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShopLock: ImageVector? = null

val Icons.Ss.ShopLock: ImageVector
    get() = _ShopLock ?: UXIcon(name = "ShopLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.82f, -0.27f, 1.57f, -0.69f, 2.2f)
                curveToRelative(-1.01f, -1.9f, -3.01f, -3.2f, -5.3f, -3.2f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(-1.09f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.06f, -1f, -0.14f)
                verticalLineToRelative(5.14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                lineTo(4f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(1f, 10.62f)
                curveToRelative(-0.61f, -0.7f, -1f, -1.61f, -1f, -2.62f)
                lineToRelative(0.02f, -1.22f)
                lineTo(2.2f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 5f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(6f)
                lineTo(15f, 5f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(2.2f, 7f)
                close()
            }
        }.also { _ShopLock = it}
