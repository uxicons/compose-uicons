package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Sr.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.07f, 24f)
                curveToRelative(-5.58f, 0f, -10.07f, -4.49f, -10.07f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                curveToRelative(3.82f, 0f, 7.26f, 2.13f, 8.96f, 5.55f)
                curveToRelative(0.25f, 0.49f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.5f, 0.24f, -1.09f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveToRelative(2.98f, -0.0f, 5.64f, -1.48f, 7.17f, -3.96f)
                curveToRelative(0.38f, -0.62f, 0.39f, -1.36f, 0.04f, -2.0f)
                curveToRelative(-0.36f, -0.65f, -1.02f, -1.03f, -1.76f, -1.03f)
                horizontalLineToRelative(-4.45f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.45f)
                curveToRelative(1.47f, 0f, 2.78f, 0.77f, 3.5f, 2.06f)
                curveToRelative(0.71f, 1.28f, 0.69f, 2.78f, -0.08f, 4.03f)
                curveToRelative(-1.9f, 3.08f, -5.19f, 4.91f, -8.8f, 4.92f)
                close()
            }
        }.also { _G = it}
