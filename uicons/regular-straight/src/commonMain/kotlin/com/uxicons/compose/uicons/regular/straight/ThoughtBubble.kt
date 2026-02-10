package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Rs.ThoughtBubble: ImageVector
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
                moveTo(24f, 10f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-0.73f, 0f, -1.46f, -0.14f, -2.15f, -0.42f)
                curveToRelative(-1.08f, 0.92f, -2.42f, 1.42f, -3.85f, 1.42f)
                curveToRelative(-2.17f, 0f, -4.14f, -1.16f, -5.2f, -3.0f)
                curveToRelative(-3.22f, -0.1f, -5.8f, -2.75f, -5.8f, -6.0f)
                curveTo(1f, 4.69f, 3.69f, 2f, 7f, 2f)
                curveToRelative(0.55f, 0f, 1.1f, 0.07f, 1.62f, 0.22f)
                curveToRelative(1.23f, -1.4f, 3.0f, -2.22f, 4.88f, -2.22f)
                curveToRelative(2.73f, 0f, 5.15f, 1.71f, 6.08f, 4.23f)
                curveToRelative(2.59f, 0.7f, 4.42f, 3.04f, 4.42f, 5.77f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0f, -1.96f, -1.41f, -3.61f, -3.35f, -3.93f)
                lineToRelative(-0.64f, -0.1f)
                lineToRelative(-0.17f, -0.63f)
                curveToRelative(-0.52f, -1.97f, -2.31f, -3.34f, -4.34f, -3.34f)
                curveToRelative(-1.48f, 0f, -2.86f, 0.74f, -3.71f, 1.97f)
                lineToRelative(-0.46f, 0.68f)
                lineToRelative(-0.76f, -0.33f)
                curveToRelative(-0.5f, -0.21f, -1.03f, -0.32f, -1.57f, -0.32f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.04f, 0f, 1.04f, -0.09f, 1.04f, -0.09f)
                lineToRelative(0.28f, 0.66f)
                curveToRelative(0.63f, 1.48f, 2.07f, 2.43f, 3.68f, 2.43f)
                curveToRelative(1.11f, 0f, 2.14f, -0.46f, 2.91f, -1.29f)
                lineToRelative(0.53f, -0.57f)
                lineToRelative(0.68f, 0.37f)
                curveToRelative(0.61f, 0.33f, 1.24f, 0.49f, 1.88f, 0.49f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _ThoughtBubble = it}
