package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Invest: ImageVector? = null

val Icons.Rr.Invest: ImageVector
    get() = _Invest ?: UXIcon(name = "Invest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 7.21f)
                curveToRelative(-0.48f, -0.28f, -1.09f, -0.11f, -1.37f, 0.36f)
                curveToRelative(-0.28f, 0.48f, -0.11f, 1.09f, 0.36f, 1.37f)
                curveToRelative(2.16f, 1.25f, 3.5f, 3.57f, 3.5f, 6.06f)
                curveToRelative(0f, 1.57f, -0.52f, 3.02f, -1.4f, 4.19f)
                lineToRelative(-4.6f, -4.6f)
                lineTo(13f, 3f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-2.29f, -2.29f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(3.06f)
                curveToRelative(-4.49f, 0.5f, -8f, 4.32f, -8f, 8.94f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.2f, -1.72f, -6.19f, -4.5f, -7.79f)
                close()
                moveTo(5f, 15f)
                curveToRelative(0f, -3.52f, 2.61f, -6.44f, 6f, -6.93f)
                verticalLineToRelative(6.51f)
                curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(4.6f, 4.6f)
                curveToRelative(-1.17f, 0.88f, -2.62f, 1.4f, -4.19f, 1.4f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _Invest = it}
