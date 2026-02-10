package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Bs.ThoughtBubble: ImageVector
    get() = _ThoughtBubble ?: UXIcon(name = "ThoughtBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(24f, 10.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                curveToRelative(-0.7f, 0f, -1.39f, -0.12f, -2.06f, -0.35f)
                curveToRelative(-1.13f, 0.88f, -2.49f, 1.35f, -3.94f, 1.35f)
                curveToRelative(-2.25f, 0f, -4.31f, -1.16f, -5.49f, -3.02f)
                curveToRelative(-3.36f, -0.25f, -6.01f, -3.06f, -6.01f, -6.48f)
                curveTo(0f, 4.92f, 2.92f, 2f, 6.5f, 2f)
                curveToRelative(0.49f, 0f, 0.98f, 0.06f, 1.45f, 0.16f)
                curveToRelative(1.31f, -1.37f, 3.13f, -2.16f, 5.05f, -2.16f)
                curveToRelative(2.85f, 0f, 5.39f, 1.73f, 6.46f, 4.32f)
                curveToRelative(2.68f, 0.84f, 4.54f, 3.31f, 4.54f, 6.18f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(0f, -1.71f, -1.23f, -3.16f, -2.94f, -3.44f)
                lineToRelative(-0.96f, -0.16f)
                lineToRelative(-0.25f, -0.94f)
                curveToRelative(-0.47f, -1.75f, -2.05f, -2.97f, -3.86f, -2.97f)
                curveToRelative(-1.31f, 0f, -2.54f, 0.65f, -3.29f, 1.75f)
                lineToRelative(-0.7f, 1.02f)
                lineToRelative(-1.14f, -0.49f)
                curveToRelative(-0.44f, -0.19f, -0.9f, -0.28f, -1.38f, -0.28f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.12f, -0.02f, 1.36f, -0.12f, 1.36f, -0.12f)
                lineToRelative(0.42f, 0.99f)
                curveToRelative(0.55f, 1.29f, 1.81f, 2.13f, 3.22f, 2.13f)
                curveToRelative(0.97f, 0f, 1.87f, -0.4f, 2.54f, -1.13f)
                lineToRelative(0.79f, -0.85f)
                lineToRelative(1.02f, 0.55f)
                curveToRelative(0.54f, 0.29f, 1.09f, 0.44f, 1.65f, 0.44f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _ThoughtBubble = it}
