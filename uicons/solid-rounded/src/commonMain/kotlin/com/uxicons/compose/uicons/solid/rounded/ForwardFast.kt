package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Sr.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6.59f)
                lineToRelative(-6.18f, -4.85f)
                curveToRelative(-1.16f, -0.85f, -2.67f, -0.97f, -3.95f, -0.33f)
                curveToRelative(-1.28f, 0.65f, -2.06f, 1.89f, -2.07f, 3.33f)
                lineToRelative(-3.77f, -3.0f)
                curveToRelative(-1.18f, -0.86f, -2.65f, -0.98f, -3.95f, -0.33f)
                curveToRelative(-1.3f, 0.66f, -2.07f, 1.92f, -2.07f, 3.38f)
                verticalLineToRelative(10.42f)
                curveToRelative(0f, 1.46f, 0.78f, 2.72f, 2.07f, 3.38f)
                curveToRelative(1.28f, 0.65f, 2.79f, 0.53f, 3.98f, -0.35f)
                lineToRelative(3.74f, -2.98f)
                curveToRelative(0.02f, 1.44f, 0.79f, 2.68f, 2.07f, 3.33f)
                curveToRelative(0.53f, 0.27f, 1.12f, 0.41f, 1.71f, 0.41f)
                curveToRelative(0.81f, 0f, 1.58f, -0.25f, 2.26f, -0.76f)
                lineToRelative(6.16f, -4.84f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ForwardFast = it}
