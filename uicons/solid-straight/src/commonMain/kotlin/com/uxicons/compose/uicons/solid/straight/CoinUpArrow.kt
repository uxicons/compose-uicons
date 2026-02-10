package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoinUpArrow: ImageVector? = null

val Icons.Ss.CoinUpArrow: ImageVector
    get() = _CoinUpArrow ?: UXIcon(name = "CoinUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 4f)
                curveToRelative(0f, -2.21f, 3.36f, -4f, 7.5f, -4f)
                reflectiveCurveToRelative(7.5f, 1.79f, 7.5f, 4f)
                reflectiveCurveToRelative(-3.36f, 4f, -7.5f, 4f)
                reflectiveCurveToRelative(-7.5f, -1.79f, -7.5f, -4f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                reflectiveCurveToRelative(-7.5f, -1.79f, -7.5f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 3.36f, 4f, 7.5f, 4f)
                close()
                moveTo(6f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(7f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2.69f, -2.69f)
                curveToRelative(0.42f, -0.42f, 1.09f, -0.42f, 1.51f, 0f)
                lineToRelative(2.69f, 2.69f)
                horizontalLineToRelative(-2.43f)
                close()
                moveTo(16.5f, 22.05f)
                curveToRelative(-1.2f, 0f, -2.34f, -0.15f, -3.35f, -0.42f)
                curveToRelative(-0.3f, 0.59f, -0.67f, 1.15f, -1.1f, 1.64f)
                curveToRelative(1.24f, 0.49f, 2.78f, 0.78f, 4.44f, 0.78f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
                moveTo(16.5f, 14.05f)
                curveToRelative(-1.45f, 0f, -2.81f, -0.22f, -3.96f, -0.6f)
                curveToRelative(0.49f, 0.69f, 0.87f, 1.47f, 1.12f, 2.31f)
                curveToRelative(0.88f, 0.19f, 1.83f, 0.3f, 2.83f, 0.3f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
                moveTo(16.5f, 18.05f)
                curveToRelative(-0.88f, 0f, -1.72f, -0.08f, -2.5f, -0.23f)
                curveToRelative(0.0f, 0.08f, 0.0f, 0.15f, 0.0f, 0.23f)
                curveToRelative(0f, 0.6f, -0.07f, 1.18f, -0.19f, 1.74f)
                curveToRelative(0.83f, 0.17f, 1.74f, 0.27f, 2.69f, 0.27f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
            }
        }.also { _CoinUpArrow = it}
