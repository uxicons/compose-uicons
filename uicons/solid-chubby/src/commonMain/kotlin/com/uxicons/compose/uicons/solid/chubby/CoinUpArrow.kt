package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoinUpArrow: ImageVector? = null

val Icons.Sc.CoinUpArrow: ImageVector
    get() = _CoinUpArrow ?: UXIcon(name = "CoinUpArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 11f)
                curveToRelative(4.15f, 0f, 6f, 1.85f, 6f, 6f)
                reflectiveCurveToRelative(-1.85f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.85f, -6f, -6f)
                reflectiveCurveToRelative(1.85f, -6f, 6f, -6f)
                close()
                moveTo(6.47f, 13.68f)
                curveToRelative(-0.73f, 0.55f, -1.38f, 1.19f, -1.93f, 1.93f)
                curveToRelative(-0.44f, 0.54f, 0.0f, 1.42f, 0.7f, 1.4f)
                horizontalLineToRelative(0.75f)
                reflectiveCurveToRelative(0f, 2f, 0f, 2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                reflectiveCurveToRelative(0.75f, 0f, 0.75f, 0f)
                curveToRelative(0.7f, 0.02f, 1.14f, -0.85f, 0.7f, -1.4f)
                curveToRelative(-0.55f, -0.73f, -1.2f, -1.38f, -1.93f, -1.93f)
                curveToRelative(-0.31f, -0.23f, -0.74f, -0.23f, -1.05f, 0f)
                close()
                moveTo(17f, 6.97f)
                curveToRelative(3.38f, -0.01f, 5.92f, -0.73f, 6f, -2.99f)
                curveToRelative(-0.07f, -2.17f, -2.63f, -2.98f, -6f, -2.99f)
                curveToRelative(-3.38f, 0.01f, -5.92f, 0.77f, -6f, 2.99f)
                curveToRelative(0.08f, 2.25f, 2.63f, 2.98f, 6f, 2.99f)
                close()
                moveTo(23f, 7.56f)
                curveToRelative(-1.31f, 0.91f, -3.31f, 1.38f, -6.0f, 1.39f)
                curveToRelative(-2.68f, -0.01f, -4.69f, -0.47f, -6.0f, -1.38f)
                verticalLineToRelative(1.41f)
                curveToRelative(0.08f, 2.25f, 2.63f, 2.98f, 6f, 2.99f)
                curveToRelative(3.38f, -0.01f, 5.92f, -0.73f, 6f, -2.99f)
                verticalLineToRelative(-1.42f)
                close()
                moveTo(14.87f, 18.85f)
                curveToRelative(-0.16f, 1.1f, -0.49f, 2.05f, -0.95f, 2.85f)
                curveToRelative(0.89f, 0.2f, 1.94f, 0.29f, 3.08f, 0.29f)
                curveToRelative(3.38f, -0.01f, 5.92f, -0.73f, 6f, -2.99f)
                verticalLineToRelative(-1.42f)
                curveToRelative(-1.31f, 0.91f, -3.31f, 1.38f, -6.0f, 1.39f)
                curveToRelative(-0.77f, -0.0f, -1.48f, -0.05f, -2.13f, -0.12f)
                close()
                moveTo(17.0f, 13.97f)
                curveToRelative(-0.89f, -0.0f, -1.7f, -0.06f, -2.44f, -0.16f)
                curveToRelative(0.28f, 0.9f, 0.42f, 1.93f, 0.43f, 3.08f)
                curveToRelative(0.62f, 0.07f, 1.29f, 0.11f, 2.0f, 0.11f)
                curveToRelative(3.38f, -0.01f, 5.92f, -0.73f, 6f, -2.99f)
                verticalLineToRelative(-1.42f)
                curveToRelative(-1.31f, 0.91f, -3.31f, 1.38f, -6.0f, 1.39f)
                close()
            }
        }.also { _CoinUpArrow = it}
