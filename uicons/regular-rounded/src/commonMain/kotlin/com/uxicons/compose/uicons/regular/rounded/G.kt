package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Rr.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.07f, 24f)
                curveToRelative(-5.58f, 0f, -10.07f, -4.49f, -10.07f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2.08f, -0.51f, 16.24f, -3.83f, 20.96f, 5.55f)
                curveToRelative(0.25f, 0.49f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.5f, 0.24f, -1.09f, 0.04f, -1.34f, -0.45f)
                curveTo(15.44f, -1.07f, 4.02f, 1.62f, 4f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveToRelative(2.98f, -0.0f, 5.64f, -1.48f, 7.17f, -3.96f)
                curveToRelative(0.38f, -0.62f, 0.39f, -1.36f, 0.04f, -2.0f)
                curveToRelative(-0.36f, -0.65f, -1.02f, -1.03f, -1.76f, -1.03f)
                horizontalLineToRelative(-4.45f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(4.45f)
                curveToRelative(1.47f, 0f, 2.78f, 0.77f, 3.5f, 2.06f)
                curveToRelative(0.71f, 1.28f, 0.69f, 2.78f, -0.08f, 4.03f)
                curveToRelative(-1.9f, 3.08f, -5.19f, 4.91f, -8.8f, 4.92f)
                close()
            }
        }.also { _G = it}
