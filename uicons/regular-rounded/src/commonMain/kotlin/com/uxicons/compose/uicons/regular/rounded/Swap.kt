package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Rr.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.7f, 20.21f)
                lineToRelative(-3.17f, 3.13f)
                curveToRelative(-0.36f, 0.4f, -0.93f, 0.66f, -1.53f, 0.66f)
                reflectiveCurveToRelative(-1.17f, -0.26f, -1.57f, -0.7f)
                lineToRelative(-3.13f, -3.08f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(2.3f, 2.24f)
                verticalLineToRelative(-12.53f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(2.94f)
                lineToRelative(-2.3f, 2.27f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.38f, -1.41f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.02f, 0.01f, -1.41f)
                lineTo(3.47f, 0.66f)
                curveToRelative(0.36f, -0.4f, 0.93f, -0.66f, 1.53f, -0.66f)
                reflectiveCurveToRelative(1.17f, 0.26f, 1.57f, 0.7f)
                lineToRelative(3.13f, 3.08f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                lineToRelative(-2.3f, -2.24f)
                verticalLineToRelative(12.53f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(12.56f)
                lineToRelative(2.3f, -2.27f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.02f, -0.01f, 1.41f)
                close()
            }
        }.also { _Swap = it}
