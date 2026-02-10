package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyePointer: ImageVector? = null

val Icons.Bs.BullseyePointer: ImageVector
    get() = _BullseyePointer ?: UXIcon(name = "BullseyePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.06f, 7.44f)
                curveToRelative(-0.53f, 0f, -1.04f, 0.09f, -1.54f, 0.27f)
                lineToRelative(-0.47f, 0.17f)
                curveToRelative(0.76f, -1.42f, 2.23f, -2.39f, 3.95f, -2.39f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.72f, -0.97f, 3.2f, -2.39f, 3.95f)
                lineToRelative(0.17f, -0.47f)
                curveToRelative(0.6f, -1.66f, 0.2f, -3.47f, -1.05f, -4.72f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.17f, -1.32f)
                close()
                moveTo(15.04f, 16.91f)
                lineToRelative(-1.12f, 3.08f)
                curveToRelative(0.03f, 0f, 0.06f, 0.0f, 0.09f, 0.0f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 0f, 14f, 0f)
                reflectiveCurveTo(4f, 4.49f, 4f, 10f)
                curveToRelative(0f, 0.03f, 0.0f, 0.06f, 0.0f, 0.08f)
                lineToRelative(3.08f, -1.12f)
                curveToRelative(0.5f, -3.37f, 3.41f, -5.96f, 6.92f, -5.96f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 3.51f, -2.6f, 6.41f, -5.96f, 6.92f)
                close()
                moveTo(0f, 13.67f)
                lineToRelative(11.2f, -4.07f)
                curveToRelative(0.92f, -0.33f, 1.93f, -0.11f, 2.62f, 0.58f)
                curveToRelative(0.69f, 0.69f, 0.92f, 1.7f, 0.58f, 2.62f)
                lineToRelative(-4.07f, 11.2f)
                lineToRelative(-4.11f, -4.11f)
                lineToRelative(-4.11f, 4.11f)
                lineTo(0f, 21.88f)
                lineToRelative(4.11f, -4.11f)
                lineTo(0f, 13.67f)
                close()
                moveTo(11.22f, 12.78f)
                lineToRelative(-5.76f, 2.1f)
                lineToRelative(3.67f, 3.67f)
                lineToRelative(2.1f, -5.76f)
                close()
            }
        }.also { _BullseyePointer = it}
