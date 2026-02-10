package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThoughtBubble: ImageVector? = null

val Icons.Sc.ThoughtBubble: ImageVector
    get() = _ThoughtBubble ?: UXIcon(name = "ThoughtBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 21f)
                curveToRelative(-1.07f, 0f, -1.5f, -0.43f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.43f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.43f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.43f, 1.5f, -1.5f, 1.5f)
                moveToRelative(-3.5f, 2f)
                curveToRelative(0.71f, 0f, 1f, -0.29f, 1f, -1f)
                reflectiveCurveToRelative(-0.29f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.29f, -1f, 1f)
                reflectiveCurveToRelative(0.29f, 1f, 1f, 1f)
                moveToRelative(14.04f, -8.1f)
                curveToRelative(0.45f, 0.07f, 0.93f, 0.1f, 1.46f, 0.1f)
                curveToRelative(3.75f, 0f, 5.5f, -1.75f, 5.5f, -5.5f)
                curveToRelative(0f, -3.39f, -1.42f, -5.13f, -4.46f, -5.44f)
                curveToRelative(-1.02f, -2.73f, -3.61f, -3.06f, -5.54f, -3.06f)
                curveToRelative(-1.62f, 0f, -3.81f, 0.23f, -5.04f, 2.1f)
                curveToRelative(-0.45f, -0.07f, -0.93f, -0.1f, -1.46f, -0.1f)
                curveToRelative(-3.75f, 0f, -5.5f, 1.75f, -5.5f, 5.5f)
                curveToRelative(0f, 3.39f, 1.42f, 5.13f, 4.46f, 5.44f)
                curveToRelative(1.02f, 2.73f, 3.61f, 3.06f, 5.54f, 3.06f)
                curveToRelative(1.62f, 0f, 3.81f, -0.23f, 5.04f, -2.1f)
                close()
            }
        }.also { _ThoughtBubble = it}
