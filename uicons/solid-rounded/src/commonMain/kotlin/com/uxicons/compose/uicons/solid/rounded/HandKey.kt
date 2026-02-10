package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandKey: ImageVector? = null

val Icons.Sr.HandKey: ImageVector
    get() = _HandKey ?: UXIcon(name = "HandKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-1.37f, 0f, -2.46f, -1.26f, -2.16f, -2.69f)
                curveToRelative(0.19f, -0.93f, 1.0f, -1.6f, 1.94f, -1.73f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.55f, -0.08f, 0.93f, -0.58f, 0.85f, -1.13f)
                curveToRelative(-0.08f, -0.55f, -0.58f, -0.93f, -1.13f, -0.85f)
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.57f, 0.08f, -1.09f, 0.28f, -1.55f, 0.56f)
                curveToRelative(-1.27f, -1.34f, -3.07f, -2.18f, -5.06f, -2.18f)
                curveToRelative(-0.29f, 0f, -0.58f, 0.02f, -0.86f, 0.06f)
                lineTo(8.75f, 1.82f)
                curveToRelative(1.68f, -1.18f, 3.69f, -1.82f, 5.75f, -1.82f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(9.56f, 14.02f)
                curveToRelative(-0.54f, 1.21f, -1.54f, 2.17f, -2.79f, 2.65f)
                verticalLineToRelative(5.08f)
                curveToRelative(0f, 0.53f, -0.21f, 1.04f, -0.59f, 1.41f)
                lineToRelative(-0.55f, 0.55f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0.69f, -0.69f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0.71f, -0.71f)
                reflectiveCurveToRelative(-0.34f, -0.37f, -1.04f, -1.08f)
                curveToRelative(-0.16f, -0.16f, -0.25f, -0.34f, -0.32f, -0.49f)
                curveToRelative(-1.68f, -0.81f, -2.85f, -2.51f, -2.85f, -4.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.43f, 0f, 2.71f, 0.61f, 3.62f, 1.57f)
                curveToRelative(-0.39f, 0.64f, -0.62f, 1.38f, -0.62f, 2.18f)
                curveToRelative(0f, 1.32f, 0.61f, 2.49f, 1.56f, 3.27f)
                close()
                moveTo(6.5f, 10.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _HandKey = it}
