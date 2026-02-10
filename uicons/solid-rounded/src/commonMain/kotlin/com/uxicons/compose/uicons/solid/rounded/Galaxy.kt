package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Sr.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.09f, 6.48f)
                curveToRelative(-1.21f, -0.31f, -2.38f, -0.31f, -3.47f, -0.09f)
                curveToRelative(-0.4f, 0.08f, -0.72f, -0.3f, -0.6f, -0.68f)
                curveToRelative(0.41f, -1.29f, 0.98f, -2.48f, 1.82f, -3.5f)
                curveToRelative(0.4f, -0.48f, 0.05f, -1.2f, -0.58f, -1.2f)
                curveToRelative(-3.64f, 0.0f, -6.88f, 2.38f, -7.77f, 5.91f)
                curveToRelative(-0.31f, 1.21f, -0.31f, 2.38f, -0.09f, 3.47f)
                curveToRelative(0.08f, 0.4f, -0.3f, 0.72f, -0.68f, 0.6f)
                curveToRelative(-1.29f, -0.41f, -2.48f, -0.98f, -3.5f, -1.82f)
                curveToRelative(-0.48f, -0.4f, -1.2f, -0.05f, -1.2f, 0.58f)
                curveToRelative(0.0f, 3.64f, 2.38f, 6.88f, 5.91f, 7.77f)
                curveToRelative(1.21f, 0.3f, 2.38f, 0.31f, 3.47f, 0.09f)
                curveToRelative(0.4f, -0.08f, 0.73f, 0.29f, 0.6f, 0.68f)
                curveToRelative(-0.41f, 1.29f, -0.98f, 2.48f, -1.82f, 3.5f)
                curveToRelative(-0.39f, 0.48f, -0.05f, 1.19f, 0.56f, 1.2f)
                curveToRelative(3.62f, -0.03f, 6.9f, -2.4f, 7.79f, -5.91f)
                curveToRelative(0.31f, -1.21f, 0.31f, -2.38f, 0.09f, -3.47f)
                curveToRelative(-0.08f, -0.4f, 0.3f, -0.72f, 0.68f, -0.6f)
                curveToRelative(1.29f, 0.41f, 2.48f, 0.98f, 3.5f, 1.82f)
                curveToRelative(0.48f, 0.4f, 1.2f, 0.05f, 1.2f, -0.58f)
                curveToRelative(-0.0f, -3.64f, -2.38f, -6.88f, -5.91f, -7.77f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Galaxy = it}
