package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _M: ImageVector? = null

val Icons.Sr.M: ImageVector
    get() = _M ?: UXIcon(name = "M") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3.49f)
                curveToRelative(0f, -0.86f, -0.59f, -1.31f, -1.14f, -1.44f)
                curveToRelative(-0.55f, -0.13f, -1.27f, 0.01f, -1.66f, 0.78f)
                lineToRelative(-6.31f, 12.62f)
                curveToRelative(-0.34f, 0.68f, -1.45f, 0.68f, -1.79f, 0f)
                lineTo(4.79f, 2.83f)
                curveToRelative(-0.39f, -0.77f, -1.11f, -0.91f, -1.66f, -0.78f)
                curveToRelative(-0.55f, 0.13f, -1.14f, 0.57f, -1.14f, 1.44f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(3.49f)
                curveTo(0f, 1.84f, 1.08f, 0.48f, 2.68f, 0.1f)
                curveToRelative(1.6f, -0.38f, 3.17f, 0.36f, 3.91f, 1.83f)
                lineToRelative(5.42f, 10.83f)
                lineTo(17.42f, 1.93f)
                curveToRelative(0.73f, -1.47f, 2.31f, -2.21f, 3.91f, -1.83f)
                curveToRelative(1.6f, 0.38f, 2.68f, 1.74f, 2.68f, 3.38f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _M = it}
