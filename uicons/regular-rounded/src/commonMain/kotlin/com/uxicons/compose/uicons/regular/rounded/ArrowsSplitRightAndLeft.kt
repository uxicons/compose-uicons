package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsSplitRightAndLeft: ImageVector? = null

val Icons.Rr.ArrowsSplitRightAndLeft: ImageVector
    get() = _ArrowsSplitRightAndLeft ?: UXIcon(name = "ArrowsSplitRightAndLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6f)
                curveToRelative(0f, 0.76f, -0.29f, 1.47f, -0.83f, 2.01f)
                lineToRelative(-3.67f, 3.69f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                lineToRelative(3.27f, -3.3f)
                horizontalLineToRelative(-3.35f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(12f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineTo(2.65f)
                lineToRelative(3.27f, 3.3f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, -0.01f, 1.41f)
                curveToRelative(-0.2f, 0.19f, -0.45f, 0.29f, -0.7f, 0.29f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.71f, -0.3f)
                lineTo(0.83f, 8.01f)
                curveToRelative(-0.53f, -0.53f, -0.83f, -1.25f, -0.83f, -2.01f)
                reflectiveCurveToRelative(0.29f, -1.47f, 0.83f, -2.01f)
                lineTo(4.5f, 0.3f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                lineToRelative(-3.27f, 3.3f)
                horizontalLineToRelative(3.35f)
                curveToRelative(2.55f, 0f, 4.78f, 1.37f, 6f, 3.41f)
                curveToRelative(1.23f, -2.04f, 3.45f, -3.41f, 6f, -3.41f)
                horizontalLineToRelative(3.35f)
                lineToRelative(-3.27f, -3.3f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.41f, 0.01f)
                lineToRelative(3.67f, 3.7f)
                curveToRelative(0.53f, 0.53f, 0.83f, 1.25f, 0.83f, 2.01f)
                close()
            }
        }.also { _ArrowsSplitRightAndLeft = it}
