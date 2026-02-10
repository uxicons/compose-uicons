package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SplitScreen: ImageVector? = null

val Icons.Bs.SplitScreen: ImageVector
    get() = _SplitScreen ?: UXIcon(name = "SplitScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 16f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(13.5f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6.77f, 6f)
                horizontalLineToRelative(1.23f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-4.31f)
                lineToRelative(-0.92f, 0.95f)
                lineToRelative(-1.15f, -1.11f)
                close()
                moveTo(19.5f, 13f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -1.42f, 3f, -2.98f, 3f, -3.9f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                reflectiveCurveToRelative(-0.7f, 0.31f, -0.7f, 0.7f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.27f, 1.03f, -2.3f, 2.3f, -2.3f)
                reflectiveCurveToRelative(2.3f, 1.03f, 2.3f, 2.3f)
                curveToRelative(0f, 1.31f, -2.24f, 2.89f, -2.42f, 3.1f)
                horizontalLineToRelative(2.32f)
                close()
            }
        }.also { _SplitScreen = it}
