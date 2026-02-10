package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyePointer: ImageVector? = null

val Icons.Ts.BullseyePointer: ImageVector
    get() = _BullseyePointer ?: UXIcon(name = "BullseyePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.51f, 11.49f)
                curveToRelative(-0.44f, -0.45f, -1.1f, -0.59f, -1.69f, -0.38f)
                lineTo(0.09f, 15.02f)
                lineToRelative(4.09f, 4.09f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(4.09f, 4.09f)
                lineToRelative(3.9f, -10.73f)
                curveToRelative(0.22f, -0.59f, 0.07f, -1.24f, -0.37f, -1.69f)
                close()
                moveTo(11.94f, 12.84f)
                lineToRelative(-3.36f, 9.25f)
                lineTo(1.91f, 15.42f)
                lineToRelative(9.25f, -3.36f)
                curveToRelative(0.23f, -0.08f, 0.47f, -0.03f, 0.64f, 0.14f)
                curveToRelative(0.17f, 0.17f, 0.23f, 0.41f, 0.14f, 0.64f)
                close()
                moveTo(24f, 10f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.02f, -1.06f, -0.06f)
                lineToRelative(0.35f, -0.97f)
                curveToRelative(0.23f, 0.02f, 0.47f, 0.03f, 0.71f, 0.03f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                reflectiveCurveTo(18.97f, 1f, 14f, 1f)
                reflectiveCurveTo(5f, 5.03f, 5f, 10f)
                curveToRelative(0f, 0.24f, 0.01f, 0.47f, 0.03f, 0.71f)
                lineToRelative(-0.97f, 0.35f)
                curveToRelative(-0.04f, -0.35f, -0.06f, -0.7f, -0.06f, -1.06f)
                curveTo(4f, 4.49f, 8.49f, 0f, 14f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
                moveTo(19f, 10f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(-2.5f, 0f, -4.58f, 1.84f, -4.94f, 4.24f)
                lineToRelative(-1.04f, 0.38f)
                curveToRelative(0.2f, -3.13f, 2.8f, -5.62f, 5.98f, -5.62f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.18f, -2.49f, 5.78f, -5.62f, 5.98f)
                lineToRelative(0.38f, -1.04f)
                curveToRelative(2.4f, -0.36f, 4.24f, -2.44f, 4.24f, -4.94f)
                close()
            }
        }.also { _BullseyePointer = it}
