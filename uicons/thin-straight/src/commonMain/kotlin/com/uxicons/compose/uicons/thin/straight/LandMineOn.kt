package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandMineOn: ImageVector? = null

val Icons.Ts.LandMineOn: ImageVector
    get() = _LandMineOn ?: UXIcon(name = "LandMineOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.43f, 23f)
                lineToRelative(-0.69f, -4.85f)
                curveToRelative(-0.17f, -1.22f, -1.24f, -2.15f, -2.48f, -2.15f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(-4f)
                lineTo(7f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.24f, 0f, -2.3f, 0.92f, -2.48f, 2.15f)
                lineToRelative(-0.69f, 4.85f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.57f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 16f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3.0f, 20f)
                horizontalLineToRelative(12.99f)
                verticalLineToRelative(-1f)
                lineTo(3.15f, 19f)
                lineToRelative(0.1f, -0.71f)
                curveToRelative(0.1f, -0.73f, 0.74f, -1.29f, 1.48f, -1.29f)
                horizontalLineToRelative(14.53f)
                curveToRelative(0.74f, 0f, 1.38f, 0.55f, 1.48f, 1.29f)
                lineToRelative(0.1f, 0.71f)
                horizontalLineToRelative(-2.85f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.43f, 3f)
                lineTo(2.58f, 23f)
                lineToRelative(0.43f, -3f)
                close()
                moveTo(12.5f, 7f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 7f)
                close()
                moveTo(17.85f, 8.85f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5f, -5f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-5f, 5f)
                close()
                moveTo(6.15f, 8.85f)
                lineTo(1.15f, 3.85f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5f, 5f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _LandMineOn = it}
