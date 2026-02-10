package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coins: ImageVector? = null

val Icons.Sr.Coins: ImageVector
    get() = _Coins ?: UXIcon(name = "Coins") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                curveToRelative(0f, -2.21f, 3.36f, -4f, 7.5f, -4f)
                reflectiveCurveToRelative(7.5f, 1.79f, 7.5f, 4f)
                reflectiveCurveToRelative(-3.36f, 4f, -7.5f, 4f)
                reflectiveCurveToRelative(-7.5f, -1.79f, -7.5f, -4f)
                close()
                moveTo(16.5f, 10f)
                curveToRelative(-1.03f, 0f, -2.0f, -0.12f, -2.89f, -0.32f)
                curveToRelative(-1.36f, -1.02f, -3.59f, -1.69f, -6.11f, -1.69f)
                curveToRelative(-4.14f, 0f, -7.5f, 1.79f, -7.5f, 4f)
                reflectiveCurveToRelative(3.36f, 4f, 7.5f, 4f)
                reflectiveCurveToRelative(7.5f, -1.79f, 7.5f, -4f)
                curveToRelative(0f, -0.03f, -0.01f, -0.06f, -0.01f, -0.09f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(2.09f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                reflectiveCurveTo(0f, 16.21f, 0f, 14f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 3.36f, 4f, 7.5f, 4f)
                reflectiveCurveToRelative(7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                reflectiveCurveTo(0f, 20.21f, 0f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 3.36f, 4f, 7.5f, 4f)
                reflectiveCurveToRelative(7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-0.08f)
                curveToRelative(0.48f, 0.05f, 0.99f, 0.08f, 1.5f, 0.08f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.12f, -3.09f, 3.85f, -7f, 3.99f)
                verticalLineToRelative(-2f)
                curveToRelative(3.91f, -0.14f, 7f, -1.87f, 7f, -3.99f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.12f, -3.09f, 3.85f, -7f, 3.99f)
                verticalLineToRelative(-2f)
                curveToRelative(3.91f, -0.14f, 7f, -1.87f, 7f, -3.99f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
            }
        }.also { _Coins = it}
