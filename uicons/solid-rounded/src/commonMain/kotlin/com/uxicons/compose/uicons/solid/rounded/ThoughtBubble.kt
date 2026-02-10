package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Sr.ThoughtBubble: ImageVector
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
                moveTo(15.48f, 15.86f)
                curveToRelative(0.22f, -0.16f, 0.53f, -0.21f, 0.82f, -0.12f)
                curveToRelative(1.14f, 0.35f, 2.3f, 0.35f, 3.45f, -0.01f)
                curveToRelative(2.26f, -0.7f, 3.95f, -2.73f, 4.21f, -5.04f)
                curveToRelative(0.31f, -2.77f, -1.3f, -5.36f, -3.92f, -6.31f)
                curveToRelative(-0.29f, -0.1f, -0.52f, -0.3f, -0.63f, -0.55f)
                curveToRelative(-1.05f, -2.32f, -3.37f, -3.83f, -5.92f, -3.83f)
                curveToRelative(-1.69f, 0f, -3.29f, 0.65f, -4.51f, 1.83f)
                curveToRelative(-0.23f, 0.23f, -0.56f, 0.33f, -0.85f, 0.28f)
                curveToRelative(-0.85f, -0.17f, -1.72f, -0.14f, -2.58f, 0.06f)
                curveTo(3.26f, 2.72f, 1.47f, 4.66f, 1.08f, 6.99f)
                curveToRelative(-0.53f, 3.22f, 1.54f, 6.25f, 4.72f, 6.89f)
                curveToRelative(0.15f, 0.03f, 0.42f, 0.06f, 0.7f, 0.07f)
                curveToRelative(0.17f, 0.01f, 0.33f, 0.1f, 0.42f, 0.26f)
                curveToRelative(1.11f, 1.75f, 3.0f, 2.79f, 5.07f, 2.79f)
                curveToRelative(1.26f, 0f, 2.46f, -0.39f, 3.48f, -1.14f)
                close()
            }
        }.also { _ThoughtBubble = it}
