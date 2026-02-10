package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Sr.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveToRelative(-1.05f, 0f, -2.04f, -0.41f, -2.78f, -1.15f)
                lineToRelative(-3.92f, -3.88f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(3.93f, 3.88f)
                curveToRelative(0.74f, 0.74f, 2.0f, 0.73f, 2.73f, 0.0f)
                lineToRelative(3.94f, -3.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.74f, 0.74f, -1.72f, 1.15f, -2.77f, 1.15f)
                close()
                moveTo(12.71f, 13.67f)
                lineToRelative(6.0f, -5.96f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.0f)
                lineToRelative(-5.29f, 5.26f)
                lineTo(6.71f, 6.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.42f)
                lineToRelative(6.0f, 5.96f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.29f, 0.7f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.7f, -0.29f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
