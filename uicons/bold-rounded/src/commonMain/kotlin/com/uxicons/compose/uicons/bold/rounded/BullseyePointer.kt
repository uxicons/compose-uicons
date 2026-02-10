package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyePointer: ImageVector? = null

val Icons.Br.BullseyePointer: ImageVector
    get() = _BullseyePointer ?: UXIcon(name = "BullseyePointer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 10.0f)
            curveToRelative(-0.21f, -8.62f, -12.44f, -9.49f, -13.91f, -1.06f)
            lineToRelative(-3.09f, 1.12f)
            curveTo(3.96f, 4.53f, 8.47f, 0f, 14f, 0.0f)
            curveToRelative(13.29f, 0.51f, 13.22f, 19.58f, -0.06f, 20.0f)
            lineToRelative(1.12f, -3.09f)
            curveToRelative(3.36f, -0.51f, 5.94f, -3.41f, 5.94f, -6.91f)
            close()
            moveTo(14.31f, 9.69f)
            curveToRelative(1.18f, 1.18f, 1.74f, 2.78f, 1.58f, 4.38f)
            curveToRelative(1.53f, -0.72f, 2.61f, -2.26f, 2.61f, -4.07f)
            curveToRelative(0.02f, -4.79f, -6.64f, -6.19f, -8.58f, -1.88f)
            curveToRelative(1.61f, -0.2f, 3.23f, 0.42f, 4.39f, 1.57f)
            close()
            moveTo(0.44f, 21.44f)
            lineToRelative(2.65f, -2.65f)
            lineToRelative(-1.67f, -1.67f)
            curveToRelative(-0.64f, -0.64f, -0.91f, -1.55f, -0.71f, -2.44f)
            curveToRelative(0.2f, -0.89f, 0.82f, -1.6f, 1.68f, -1.91f)
            lineToRelative(6.84f, -2.49f)
            curveToRelative(1.29f, -0.47f, 2.7f, -0.16f, 3.67f, 0.81f)
            curveToRelative(0.97f, 0.97f, 1.28f, 2.38f, 0.81f, 3.67f)
            lineToRelative(-2.49f, 6.84f)
            curveToRelative(-0.31f, 0.85f, -1.02f, 1.48f, -1.91f, 1.68f)
            curveToRelative(-0.87f, 0.2f, -1.8f, -0.07f, -2.44f, -0.71f)
            lineToRelative(-1.67f, -1.67f)
            lineToRelative(-2.65f, 2.65f)
            curveToRelative(-1.39f, 1.38f, -3.5f, -0.73f, -2.12f, -2.12f)
            close()
            moveTo(8.6f, 20.06f)
            lineToRelative(2.29f, -6.31f)
            curveToRelative(0.1f, -0.26f, -0.03f, -0.44f, -0.12f, -0.52f)
            curveToRelative(-0.08f, -0.09f, -0.26f, -0.21f, -0.52f, -0.12f)
            lineToRelative(-6.31f, 2.29f)
            lineToRelative(4.66f, 4.66f)
            close()
        }
    }.also { _BullseyePointer = it }
