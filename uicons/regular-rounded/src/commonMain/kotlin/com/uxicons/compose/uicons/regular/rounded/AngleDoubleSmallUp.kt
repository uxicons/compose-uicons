package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Rr.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.42f)
                lineToRelative(6.0f, -5.96f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(6.0f, 5.96f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.4f, -1.41f, 0.0f)
                lineToRelative(-5.29f, -5.26f)
                lineToRelative(-5.3f, 5.26f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.7f, 0.29f)
                close()
                moveTo(18.71f, 11.44f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.03f, -0.01f, -1.41f)
                lineToRelative(-3.92f, -3.88f)
                curveToRelative(-0.74f, -0.74f, -1.73f, -1.15f, -2.78f, -1.15f)
                reflectiveCurveToRelative(-2.04f, 0.41f, -2.77f, 1.15f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.4f, 1.41f, 0.01f)
                lineToRelative(3.94f, -3.88f)
                curveToRelative(0.73f, -0.73f, 1.99f, -0.73f, 2.73f, 0.0f)
                lineToRelative(3.93f, 3.88f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.71f, -0.3f)
                close()
            }
        }.also { _AngleDoubleSmallUp = it}
