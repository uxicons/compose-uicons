package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropperHalf: ImageVector? = null

val Icons.Ss.EyeDropperHalf: ImageVector
    get() = _EyeDropperHalf ?: UXIcon(name = "EyeDropperHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.02f)
                curveToRelative(0f, 0.81f, -0.31f, 1.57f, -0.89f, 2.14f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(-1.34f, 1.34f, -1.37f, 3.46f, -0.07f, 4.84f)
                lineToRelative(-1.44f, 1.39f)
                lineTo(9.2f, 5.8f)
                lineToRelative(1.39f, -1.44f)
                curveToRelative(1.38f, 1.3f, 3.5f, 1.27f, 4.84f, -0.07f)
                lineToRelative(3.41f, -3.41f)
                curveToRelative(1.14f, -1.14f, 3.13f, -1.14f, 4.28f, 0f)
                curveToRelative(0.57f, 0.57f, 0.89f, 1.33f, 0.89f, 2.14f)
                close()
                moveTo(3.59f, 16f)
                lineToRelative(-1.68f, 1.68f)
                curveToRelative(-0.59f, 0.59f, -0.91f, 1.37f, -0.91f, 2.2f)
                curveToRelative(0f, 0.48f, 0.12f, 0.95f, 0.33f, 1.37f)
                lineToRelative(-1.33f, 1.33f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(0.42f, 0.21f, 0.89f, 0.33f, 1.37f, 0.33f)
                curveToRelative(0.83f, 0f, 1.61f, -0.32f, 2.2f, -0.91f)
                lineToRelative(6.09f, -6.09f)
                lineTo(3.59f, 16f)
                close()
                moveTo(5.59f, 14f)
                horizontalLineToRelative(8.74f)
                lineToRelative(-4.37f, -4.37f)
                lineToRelative(-4.37f, 4.37f)
                close()
            }
        }.also { _EyeDropperHalf = it}
