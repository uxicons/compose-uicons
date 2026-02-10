package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyePointer: ImageVector? = null

val Icons.Sr.BullseyePointer: ImageVector
    get() = _BullseyePointer ?: UXIcon(name = "BullseyePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.29f, 23.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(1.08f, -1.08f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.24f, 0.24f, 0.59f, 0.34f, 0.92f, 0.27f)
                curveToRelative(0.33f, -0.07f, 0.61f, -0.31f, 0.72f, -0.64f)
                lineToRelative(3.26f, -8.97f)
                curveToRelative(0.27f, -0.74f, 0.09f, -1.54f, -0.47f, -2.1f)
                curveToRelative(-0.55f, -0.56f, -1.36f, -0.73f, -2.1f, -0.46f)
                lineTo(0.68f, 15.06f)
                curveToRelative(-0.32f, 0.12f, -0.56f, 0.39f, -0.64f, 0.72f)
                curveToRelative(-0.07f, 0.33f, 0.03f, 0.68f, 0.27f, 0.92f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(-1.73f, 1.73f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(14.99f, 15.0f)
                curveToRelative(-0.21f, -0.51f, 0.03f, -1.1f, 0.54f, -1.31f)
                curveToRelative(4.0f, -1.64f, 2.79f, -7.71f, -1.53f, -7.7f)
                curveToRelative(-1.63f, 0f, -3.08f, 0.97f, -3.7f, 2.47f)
                curveToRelative(-0.21f, 0.51f, -0.8f, 0.75f, -1.31f, 0.54f)
                curveToRelative(-0.51f, -0.21f, -0.75f, -0.8f, -0.54f, -1.31f)
                curveToRelative(0.93f, -2.25f, 3.11f, -3.71f, 5.55f, -3.71f)
                curveToRelative(6.51f, 0.03f, 8.3f, 9.03f, 2.3f, 11.54f)
                curveToRelative(-0.12f, 0.05f, -0.26f, 0.08f, -0.38f, 0.08f)
                curveToRelative(-0.39f, 0f, -0.76f, -0.23f, -0.92f, -0.62f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(10.59f, -0.38f, 10.59f, -15.63f, 0f, -16f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveTo(4f, 4.49f, 8.49f, 0f, 14f, 0f)
                curveToRelative(13.25f, 0.5f, 13.24f, 19.5f, 0f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _BullseyePointer = it}
