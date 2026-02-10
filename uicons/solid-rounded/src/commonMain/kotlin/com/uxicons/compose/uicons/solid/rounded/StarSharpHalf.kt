package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Sr.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.63f, 23.23f)
                curveToRelative(-0.75f, 0f, -1.43f, -0.27f, -1.92f, -0.62f)
                curveToRelative(-0.88f, -0.63f, -1.72f, -1.96f, -1.18f, -3.61f)
                lineToRelative(1.35f, -4.18f)
                lineToRelative(-3.56f, -2.6f)
                curveTo(-0.07f, 11.19f, -0.17f, 9.62f, 0.17f, 8.6f)
                curveToRelative(0.33f, -1.02f, 1.33f, -2.22f, 3.06f, -2.22f)
                horizontalLineToRelative(4.37f)
                lineToRelative(1.33f, -4.14f)
                curveToRelative(0.53f, -1.65f, 1.99f, -2.24f, 3.07f, -2.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(17.79f)
                curveToRelative(0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f)
                lineToRelative(-4.08f, 3.0f)
                curveToRelative(-0.62f, 0.46f, -1.27f, 0.64f, -1.88f, 0.64f)
                close()
            }
        }.also { _StarSharpHalf = it}
