package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Sr.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.99f, 24f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.02f, -0.65f, -0.07f)
                curveTo(3.93f, 22.75f, 0f, 17.74f, 0f, 12f)
                reflectiveCurveTo(3.93f, 1.25f, 9.33f, 0.07f)
                curveToRelative(0.9f, -0.2f, 1.83f, 0.02f, 2.55f, 0.6f)
                curveToRelative(0.71f, 0.57f, 1.12f, 1.42f, 1.12f, 2.33f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.91f, -0.41f, 1.76f, -1.12f, 2.33f)
                curveToRelative(-0.54f, 0.44f, -1.21f, 0.67f, -1.9f, 0.67f)
                close()
            }
        }.also { _CircleHalf = it}
