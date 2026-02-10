package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerAd: ImageVector? = null

val Icons.Ss.ComputerAd: ImageVector
    get() = _ComputerAd ?: UXIcon(name = "ComputerAd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16f, 5.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0f, -0.7f, 0f)
                verticalLineToRelative(-4.8f)
                reflectiveCurveToRelative(0.31f, 0f, 0.7f, 0f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                close()
                moveTo(9.24f, 4.71f)
                lineTo(9.87f, 8f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(0.62f, -3.29f)
                close()
                moveTo(21f, 1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(10.51f, 11.0f)
                lineTo(10.25f, 9.53f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-0.28f, 1.47f)
                horizontalLineToRelative(-1.47f)
                lineToRelative(1.37f, -6.83f)
                curveToRelative(0.1f, -0.58f, 0.63f, -1.17f, 1.39f, -1.17f)
                reflectiveCurveToRelative(1.23f, 0.52f, 1.35f, 1.19f)
                lineToRelative(1.4f, 6.81f)
                horizontalLineToRelative(-1.49f)
                close()
                moveTo(17.6f, 8.7f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.27f, 0f, 2.3f, 1.03f, 2.3f, 2.3f)
                close()
            }
        }.also { _ComputerAd = it}
