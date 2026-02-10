package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScoreBoard: ImageVector? = null

val Icons.Bs.ScoreBoard: ImageVector
    get() = _ScoreBoard ?: UXIcon(name = "ScoreBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(13.5f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(12f)
                close()
                moveTo(17.25f, 11f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(17.9f, 16.75f)
                curveToRelative(0f, 0.36f, -0.29f, 0.65f, -0.65f, 0.65f)
                reflectiveCurveToRelative(-0.65f, -0.29f, -0.65f, -0.65f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.36f, 0.29f, -0.65f, 0.65f, -0.65f)
                reflectiveCurveToRelative(0.65f, 0.29f, 0.65f, 0.65f)
                close()
                moveTo(6.1f, 12.6f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(0.65f)
                curveToRelative(1.24f, 0f, 2.25f, 1.01f, 2.25f, 2.25f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.16f, 0f, -2.1f, -0.88f, -2.23f, -2f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.1f, 0.23f, 0.33f, 0.4f, 0.6f, 0.4f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.36f, 0f, 0.65f, -0.29f, 0.65f, -0.65f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.36f, -0.29f, -0.65f, -0.65f, -0.65f)
                curveToRelative(-0.17f, 0f, -1.35f, 0.0f, -2.25f, 0.01f)
                verticalLineToRelative(-4.11f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.9f)
                close()
            }
        }.also { _ScoreBoard = it}
