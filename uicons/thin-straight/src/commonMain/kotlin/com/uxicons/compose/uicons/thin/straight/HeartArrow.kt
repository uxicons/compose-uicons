package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Ts.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 18f)
                verticalLineToRelative(4.29f)
                lineToRelative(-5.25f, -5.25f)
                curveToRelative(2.19f, -2.23f, 4.25f, -5.02f, 4.25f, -7.59f)
                curveToRelative(0f, -3.0f, -2.24f, -5.45f, -5f, -5.45f)
                curveToRelative(-2.26f, 0f, -3.79f, 1.76f, -4.5f, 2.81f)
                curveToRelative(-0.71f, -1.04f, -2.24f, -2.81f, -4.5f, -2.81f)
                curveToRelative(-0.93f, 0f, -1.79f, 0.28f, -2.54f, 0.76f)
                lineTo(0.76f, 0.06f)
                lineTo(0.06f, 0.76f)
                lineToRelative(4.62f, 4.62f)
                curveToRelative(-1.03f, 1.0f, -1.68f, 2.45f, -1.68f, 4.07f)
                curveToRelative(0f, 5.15f, 8.27f, 11.15f, 9.21f, 11.82f)
                lineToRelative(0.29f, 0.2f)
                lineToRelative(0.29f, -0.2f)
                curveToRelative(0.42f, -0.3f, 2.3f, -1.66f, 4.25f, -3.53f)
                lineToRelative(5.25f, 5.25f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12.5f, 20.25f)
                curveToRelative(-3.29f, -2.39f, -8.5f, -7.13f, -8.5f, -10.8f)
                curveToRelative(0f, -2.45f, 1.79f, -4.45f, 4f, -4.45f)
                curveToRelative(2.52f, 0f, 4.04f, 2.97f, 4.05f, 3.0f)
                lineToRelative(0.45f, 0.89f)
                lineToRelative(0.45f, -0.89f)
                curveToRelative(0.01f, -0.03f, 1.54f, -3.0f, 4.05f, -3.0f)
                curveToRelative(2.21f, 0f, 4f, 2.0f, 4f, 4.45f)
                curveToRelative(0f, 3.67f, -5.21f, 8.41f, -8.5f, 10.8f)
                close()
            }
        }.also { _HeartArrow = it}
