package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Sr.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 3f)
                verticalLineToRelative(3.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
                verticalLineToRelative(-3.06f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                close()
                moveTo(19.03f, 20.61f)
                curveToRelative(1.23f, -1.54f, 1.97f, -3.49f, 1.97f, -5.61f)
                curveToRelative(0f, -4.62f, -3.51f, -8.45f, -8f, -8.94f)
                verticalLineToRelative(8.53f)
                lineToRelative(6.03f, 6.03f)
                close()
                moveTo(3f, 15f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.12f, 0f, 4.07f, -0.74f, 5.62f, -1.97f)
                lineToRelative(-6.03f, -6.03f)
                curveToRelative(-0.37f, -0.37f, -0.59f, -0.89f, -0.59f, -1.41f)
                lineTo(11f, 6.06f)
                curveToRelative(-4.49f, 0.5f, -8f, 4.32f, -8f, 8.94f)
                close()
            }
        }.also { _Invest = it}
