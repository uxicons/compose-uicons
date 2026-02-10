package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TipCoin: ImageVector? = null

val Icons.Ss.TipCoin: ImageVector
    get() = _TipCoin ?: UXIcon(name = "TipCoin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.3f, 19.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(4.4f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.64f, 0.81f, -3.09f, 2.03f, -4f)
                horizontalLineToRelative(10.94f)
                curveToRelative(0.69f, 0.52f, 1.25f, 1.2f, 1.6f, 2f)
                horizontalLineToRelative(-7.27f)
                verticalLineToRelative(5.6f)
                close()
                moveTo(9.3f, 17.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15.03f, 0.05f)
                curveToRelative(-1.64f, 0f, -2.98f, 1.33f, -2.98f, 2.98f)
                reflectiveCurveToRelative(1.33f, 2.98f, 2.98f, 2.98f)
                reflectiveCurveToRelative(2.98f, -1.33f, 2.98f, -2.98f)
                reflectiveCurveTo(16.67f, 0.05f, 15.03f, 0.05f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22.4f, 18.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                close()
            }
        }.also { _TipCoin = it}
