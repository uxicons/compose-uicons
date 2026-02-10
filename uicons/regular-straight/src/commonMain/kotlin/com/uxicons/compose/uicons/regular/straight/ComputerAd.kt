package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerAd: ImageVector? = null

val Icons.Rs.ComputerAd: ImageVector
    get() = _ComputerAd ?: UXIcon(name = "ComputerAd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 15f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
                moveTo(8.24f, 10.53f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.26f, 1.47f)
                horizontalLineToRelative(1.49f)
                lineToRelative(-1.4f, -6.81f)
                curveToRelative(-0.12f, -0.67f, -0.59f, -1.19f, -1.35f, -1.19f)
                reflectiveCurveToRelative(-1.28f, 0.59f, -1.39f, 1.17f)
                lineToRelative(-1.37f, 6.83f)
                horizontalLineToRelative(1.47f)
                lineToRelative(0.28f, -1.47f)
                close()
                moveTo(9.24f, 5.71f)
                lineTo(9.87f, 9.0f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(0.62f, -3.29f)
                close()
                moveTo(17.6f, 9.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                close()
                moveTo(14.6f, 5.6f)
                reflectiveCurveToRelative(0.31f, 0f, 0.7f, 0f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0f, -0.7f, 0f)
                verticalLineToRelative(-4.8f)
                close()
            }
        }.also { _ComputerAd = it}
