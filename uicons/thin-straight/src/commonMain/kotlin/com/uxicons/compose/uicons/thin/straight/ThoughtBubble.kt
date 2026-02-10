package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Ts.ThoughtBubble: ImageVector
    get() = _ThoughtBubble ?: UXIcon(name = "ThoughtBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(5.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 10f)
                curveToRelative(0f, 3.7f, -3.4f, 6.66f, -7.19f, 5.88f)
                curveToRelative(-1.23f, 1.35f, -2.97f, 2.12f, -4.81f, 2.12f)
                curveToRelative(-2.21f, 0f, -4.28f, -1.14f, -5.47f, -3f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveTo(2.92f, 2f, 6.5f, 2f)
                curveToRelative(0.48f, 0f, 0.96f, 0.06f, 1.44f, 0.17f)
                curveToRelative(1.32f, -1.38f, 3.15f, -2.17f, 5.06f, -2.17f)
                curveToRelative(2.79f, 0f, 5.27f, 1.63f, 6.4f, 4.17f)
                curveToRelative(2.68f, 0.64f, 4.6f, 3.05f, 4.6f, 5.83f)
                close()
                moveTo(23f, 10f)
                curveToRelative(0f, -2.4f, -1.71f, -4.46f, -4.06f, -4.91f)
                lineToRelative(-0.27f, -0.05f)
                lineToRelative(-0.1f, -0.26f)
                curveToRelative(-0.92f, -2.3f, -3.1f, -3.79f, -5.57f, -3.79f)
                curveToRelative(-1.73f, 0f, -3.37f, 0.75f, -4.51f, 2.06f)
                lineToRelative(-0.21f, 0.24f)
                lineToRelative(-0.3f, -0.09f)
                curveToRelative(-0.49f, -0.14f, -0.99f, -0.21f, -1.48f, -0.21f)
                curveTo(3.47f, 3f, 1f, 5.47f, 1f, 8.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(0.06f, 0f, 0.49f, -0.03f, 0.49f, -0.03f)
                lineToRelative(0.24f, 0.27f)
                curveToRelative(0.98f, 1.71f, 2.81f, 2.77f, 4.77f, 2.77f)
                curveToRelative(1.65f, 0f, 3.19f, -0.73f, 4.24f, -2.0f)
                lineToRelative(0.2f, -0.24f)
                lineToRelative(0.31f, 0.08f)
                curveToRelative(3.29f, 0.85f, 6.25f, -1.67f, 6.25f, -4.84f)
                close()
            }
        }.also { _ThoughtBubble = it}
