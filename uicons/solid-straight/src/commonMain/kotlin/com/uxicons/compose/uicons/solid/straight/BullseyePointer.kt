package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyePointer: ImageVector? = null

val Icons.Ss.BullseyePointer: ImageVector
    get() = _BullseyePointer ?: UXIcon(name = "BullseyePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.79f, 0f, -3.3f, 1.2f, -3.8f, 2.83f)
                lineToRelative(-2.18f, 0.79f)
                curveToRelative(0.2f, -3.13f, 2.8f, -5.62f, 5.98f, -5.62f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.18f, -2.49f, 5.78f, -5.62f, 5.98f)
                lineToRelative(0.79f, -2.18f)
                curveToRelative(1.63f, -0.51f, 2.83f, -2.01f, 2.83f, -3.8f)
                close()
                moveTo(14f, 0f)
                curveTo(8.49f, 0f, 4f, 4.49f, 4f, 10f)
                curveToRelative(0f, 0.36f, 0.02f, 0.71f, 0.06f, 1.06f)
                lineToRelative(1.96f, -0.71f)
                curveToRelative(-0.01f, -0.12f, -0.02f, -0.23f, -0.02f, -0.35f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                curveToRelative(-0.12f, 0f, -0.23f, -0.01f, -0.35f, -0.02f)
                lineToRelative(-0.71f, 1.96f)
                curveToRelative(0.35f, 0.04f, 0.7f, 0.06f, 1.06f, 0.06f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 0f, 14f, 0f)
                close()
                moveTo(9.22f, 24f)
                lineToRelative(-3.9f, -3.9f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.79f, -2.79f)
                lineTo(0f, 14.78f)
                lineToRelative(10.46f, -3.8f)
                curveToRelative(0.73f, -0.27f, 1.55f, -0.08f, 2.1f, 0.47f)
                curveToRelative(0.56f, 0.55f, 0.73f, 1.35f, 0.47f, 2.1f)
                lineToRelative(-3.81f, 10.46f)
                close()
            }
        }.also { _BullseyePointer = it}
