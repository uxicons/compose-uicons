package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Ss.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 11.51f)
                curveToRelative(0.35f, -0.53f, 1.06f, -0.67f, 1.58f, -0.32f)
                lineToRelative(1.91f, 1.26f)
                curveToRelative(0.53f, 0.35f, 0.67f, 1.06f, 0.32f, 1.58f)
                lineToRelative(-4.67f, 7.17f)
                curveToRelative(-1.23f, 1.75f, -3.23f, 2.79f, -5.36f, 2.79f)
                horizontalLineToRelative(-1.21f)
                curveToRelative(-2.51f, 0f, -4.57f, -2.04f, -4.57f, -4.55f)
                curveToRelative(-0.0f, -3.59f, 0.62f, -5.91f, 1.14f, -8.45f)
                lineToRelative(7.12f, 0.01f)
                curveToRelative(0.31f, 1.51f, 0.66f, 2.79f, 0.89f, 4.34f)
                lineToRelative(2.85f, -3.84f)
                close()
                moveTo(22.65f, 0f)
                curveToRelative(-1.01f, 0f, -1.95f, 0.5f, -2.5f, 1.35f)
                lineToRelative(-5.41f, 8.21f)
                lineToRelative(1.67f, 1.1f)
                lineTo(21.82f, 2.45f)
                curveToRelative(0.19f, -0.28f, 0.5f, -0.45f, 0.83f, -0.45f)
                horizontalLineToRelative(1.35f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1.35f)
                close()
            }
        }.also { _PipeSmoking = it}
