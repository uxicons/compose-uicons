package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeatherPointed: ImageVector? = null

val Icons.Br.FeatherPointed: ImageVector
    get() = _FeatherPointed ?: UXIcon(name = "FeatherPointed") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.18f, 0.82f)
            curveToRelative(-0.63f, -0.63f, -1.53f, -0.92f, -2.42f, -0.79f)
            curveToRelative(-3.51f, 0.53f, -10.19f, 2.21f, -15.47f, 7.5f)
            curveToRelative(-1.57f, 1.57f, -2.41f, 3.75f, -2.31f, 5.97f)
            curveToRelative(0.07f, 1.46f, 0.54f, 2.86f, 1.34f, 4.06f)
            lineToRelative(-3.88f, 3.88f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(3.86f, -3.86f)
            curveToRelative(1.31f, 0.9f, 2.84f, 1.34f, 4.38f, 1.34f)
            curveToRelative(2.15f, 0f, 4.31f, -0.85f, 5.93f, -2.53f)
            curveToRelative(5.28f, -5.45f, 6.82f, -12.51f, 7.23f, -15.29f)
            curveToRelative(0.13f, -0.89f, -0.15f, -1.77f, -0.79f, -2.4f)
            close()
            moveTo(5.97f, 13.37f)
            curveToRelative(-0.06f, -1.39f, 0.46f, -2.74f, 1.44f, -3.72f)
            horizontalLineToRelative(0f)
            curveToRelative(4.55f, -4.57f, 10.35f, -6.1f, 13.55f, -6.62f)
            curveToRelative(-0.18f, 1.15f, -0.56f, 2.93f, -1.29f, 4.97f)
            horizontalLineToRelative(-3.93f)
            curveToRelative(-1.2f, 0f, -2.33f, 0.47f, -3.18f, 1.32f)
            lineToRelative(-6.06f, 6.06f)
            curveToRelative(-0.31f, -0.62f, -0.49f, -1.3f, -0.53f, -2.01f)
            close()
            moveTo(17.25f, 13f)
            horizontalLineToRelative(-4.13f)
            lineToRelative(1.56f, -1.56f)
            curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
            horizontalLineToRelative(2.65f)
            curveToRelative(-0.34f, 0.67f, -0.71f, 1.33f, -1.13f, 2f)
            close()
            moveTo(8.61f, 17.51f)
            lineToRelative(1.51f, -1.51f)
            horizontalLineToRelative(4.85f)
            curveToRelative(-0.13f, 0.14f, -0.25f, 0.29f, -0.39f, 0.42f)
            curveToRelative(-1.62f, 1.67f, -4.07f, 2.06f, -5.97f, 1.09f)
            close()
        }
    }.also { _FeatherPointed = it }
