package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneMegaphone: ImageVector? = null

val Icons.Bs.PhoneMegaphone: ImageVector
    get() = _PhoneMegaphone ?: UXIcon(name = "PhoneMegaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13f)
                close()
                moveTo(8f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23f, 10.41f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1f, -0.5f, -2f, -2f, -2f)
                horizontalLineToRelative(-1.45f)
                lineToRelative(0.83f, 2f)
                curveToRelative(0.2f, 0.44f, 0.15f, 0.94f, -0.11f, 1.34f)
                reflectiveCurveToRelative(-0.7f, 0.64f, -1.18f, 0.64f)
                horizontalLineToRelative(-0.72f)
                lineToRelative(-2.21f, -5.19f)
                curveToRelative(-0.11f, -0.24f, -0.17f, -0.51f, -0.17f, -0.8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.5f, 0f, 2f, -1f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.59f)
                curveToRelative(0.58f, 0.21f, 1f, 0.76f, 1f, 1.41f)
                reflectiveCurveToRelative(-0.42f, 1.2f, -1f, 1.41f)
                close()
            }
        }.also { _PhoneMegaphone = it}
