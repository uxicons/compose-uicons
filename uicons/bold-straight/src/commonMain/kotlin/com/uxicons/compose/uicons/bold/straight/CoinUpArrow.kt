package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoinUpArrow: ImageVector? = null

val Icons.Bs.CoinUpArrow: ImageVector
    get() = _CoinUpArrow ?: UXIcon(name = "CoinUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                curveToRelative(-4.28f, 0f, -7.5f, 1.94f, -7.5f, 4.5f)
                verticalLineToRelative(4.88f)
                curveToRelative(2.26f, 0.69f, 4.11f, 2.31f, 5.14f, 4.41f)
                curveToRelative(0.74f, 0.14f, 1.53f, 0.22f, 2.36f, 0.22f)
                curveToRelative(1.72f, 0f, 3.26f, -0.32f, 4.5f, -0.86f)
                verticalLineToRelative(1.36f)
                curveToRelative(0f, 0.37f, -1.6f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.62f, 0f, -1.17f, -0.06f, -1.66f, -0.14f)
                curveToRelative(0.1f, 0.53f, 0.16f, 1.08f, 0.16f, 1.64f)
                curveToRelative(0f, 0.47f, -0.05f, 0.94f, -0.12f, 1.39f)
                curveToRelative(0.52f, 0.07f, 1.06f, 0.11f, 1.62f, 0.11f)
                curveToRelative(1.72f, 0f, 3.26f, -0.32f, 4.5f, -0.86f)
                verticalLineToRelative(1.36f)
                curveToRelative(0f, 0.37f, -1.6f, 1.5f, -4.5f, 1.5f)
                curveToRelative(-0.83f, 0f, -1.54f, -0.1f, -2.15f, -0.24f)
                curveToRelative(-0.41f, 0.98f, -1f, 1.87f, -1.73f, 2.62f)
                curveToRelative(1.12f, 0.39f, 2.44f, 0.61f, 3.88f, 0.61f)
                curveToRelative(4.28f, 0f, 7.5f, -1.94f, 7.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.56f, -3.23f, -4.5f, -7.5f, -4.5f)
                close()
                moveTo(16.5f, 3f)
                curveToRelative(2.9f, 0f, 4.5f, 1.13f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.6f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.13f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.6f, -1.5f, 4.5f, -1.5f)
                close()
                moveTo(16.5f, 11f)
                curveToRelative(-2.9f, 0f, -4.5f, -1.13f, -4.5f, -1.5f)
                verticalLineToRelative(-1.36f)
                curveToRelative(1.24f, 0.54f, 2.78f, 0.86f, 4.5f, 0.86f)
                reflectiveCurveToRelative(3.26f, -0.32f, 4.5f, -0.86f)
                verticalLineToRelative(1.36f)
                curveToRelative(0f, 0.37f, -1.6f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(6.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(8f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _CoinUpArrow = it}
