package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Rr.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.99f, 24f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.02f, -0.65f, -0.07f)
                curveTo(3.93f, 22.75f, 0f, 17.74f, 0f, 12f)
                reflectiveCurveTo(3.93f, 1.25f, 9.33f, 0.07f)
                curveToRelative(0.9f, -0.2f, 1.83f, 0.02f, 2.55f, 0.6f)
                curveToRelative(0.71f, 0.57f, 1.12f, 1.42f, 1.12f, 2.33f)
                lineTo(13f, 21f)
                curveToRelative(0f, 0.91f, -0.41f, 1.76f, -1.12f, 2.33f)
                curveToRelative(-0.54f, 0.44f, -1.21f, 0.67f, -1.9f, 0.67f)
                close()
                moveTo(9.99f, 2f)
                curveToRelative(-0.07f, 0f, -0.15f, 0f, -0.22f, 0.02f)
                curveTo(5.34f, 2.99f, 2f, 7.28f, 2f, 12f)
                reflectiveCurveToRelative(3.34f, 9.01f, 7.76f, 9.98f)
                curveToRelative(0.31f, 0.07f, 0.62f, 0f, 0.87f, -0.2f)
                curveToRelative(0.14f, -0.11f, 0.37f, -0.36f, 0.37f, -0.77f)
                lineTo(11f, 3f)
                curveToRelative(0f, -0.41f, -0.23f, -0.66f, -0.37f, -0.77f)
                curveToRelative(-0.18f, -0.15f, -0.41f, -0.23f, -0.64f, -0.23f)
                close()
            }
        }.also { _CircleHalf = it}
