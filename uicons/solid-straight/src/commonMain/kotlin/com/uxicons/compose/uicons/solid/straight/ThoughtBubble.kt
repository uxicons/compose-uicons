package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Ss.ThoughtBubble: ImageVector
    get() = _ThoughtBubble ?: UXIcon(name = "ThoughtBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(6f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15.85f, 15.58f)
                curveToRelative(0.7f, 0.28f, 1.42f, 0.42f, 2.15f, 0.42f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -2.73f, -1.82f, -5.07f, -4.42f, -5.77f)
                curveToRelative(-0.94f, -2.52f, -3.36f, -4.23f, -6.08f, -4.23f)
                curveToRelative(-1.88f, 0f, -3.65f, 0.82f, -4.88f, 2.22f)
                curveToRelative(-0.52f, -0.15f, -1.07f, -0.22f, -1.62f, -0.22f)
                curveTo(3.69f, 2f, 1f, 4.69f, 1f, 8f)
                curveToRelative(0f, 3.24f, 2.58f, 5.89f, 5.8f, 6.0f)
                curveToRelative(1.06f, 1.84f, 3.03f, 3.0f, 5.2f, 3.0f)
                curveToRelative(1.43f, 0f, 2.77f, -0.5f, 3.85f, -1.42f)
                close()
            }
        }.also { _ThoughtBubble = it}
