package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoinUpArrow: ImageVector? = null

val Icons.Sr.CoinUpArrow: ImageVector
    get() = _CoinUpArrow ?: UXIcon(name = "CoinUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(0f, 14.69f, 0f, 18f)
                close()
                moveTo(7.24f, 15.0f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.39f, 0.26f, 0.62f)
                curveToRelative(0f, 0.11f, -0.02f, 0.23f, -0.07f, 0.34f)
                curveToRelative(-0.14f, 0.33f, -0.46f, 0.54f, -0.81f, 0.54f)
                horizontalLineToRelative(-1.12f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.21f, -0.81f, -0.54f)
                curveToRelative(-0.14f, -0.33f, -0.06f, -0.71f, 0.19f, -0.96f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 1.8f, -0.69f, 2.48f, 0f)
                close()
                moveTo(9f, 3.95f)
                curveTo(9f, 1.74f, 12.36f, -0.05f, 16.5f, -0.05f)
                reflectiveCurveToRelative(7.5f, 1.79f, 7.5f, 4f)
                reflectiveCurveToRelative(-3.36f, 4f, -7.5f, 4f)
                reflectiveCurveToRelative(-7.5f, -1.79f, -7.5f, -4f)
                close()
                moveTo(16.5f, 11.95f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                reflectiveCurveToRelative(-7.5f, -1.79f, -7.5f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 3.36f, 4f, 7.5f, 4f)
                close()
                moveTo(16.5f, 22f)
                curveToRelative(-1.2f, 0f, -2.34f, -0.15f, -3.35f, -0.42f)
                curveToRelative(-0.3f, 0.59f, -0.67f, 1.15f, -1.1f, 1.64f)
                curveToRelative(1.24f, 0.49f, 2.78f, 0.78f, 4.44f, 0.78f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
                moveTo(16.5f, 14f)
                curveToRelative(-1.45f, 0f, -2.81f, -0.22f, -3.96f, -0.6f)
                curveToRelative(0.49f, 0.69f, 0.87f, 1.47f, 1.12f, 2.31f)
                curveToRelative(0.88f, 0.19f, 1.83f, 0.3f, 2.83f, 0.3f)
                curveToRelative(4.14f, 0f, 7.5f, -1.79f, 7.5f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 2.21f, -3.36f, 4f, -7.5f, 4f)
                close()
                moveTo(16.5f, 18f)
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
