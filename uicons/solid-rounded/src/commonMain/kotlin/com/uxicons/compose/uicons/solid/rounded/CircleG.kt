package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Sr.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.89f, 14.66f)
                curveToRelative(-0.72f, 2.05f, -2.82f, 3.59f, -4.89f, 3.59f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.43f, 0f, 2.8f, 0.62f, 3.75f, 1.69f)
                curveToRelative(0.36f, 0.41f, 0.33f, 1.05f, -0.09f, 1.41f)
                curveToRelative(-0.41f, 0.36f, -1.05f, 0.33f, -1.41f, -0.09f)
                curveToRelative(-0.57f, -0.65f, -1.39f, -1.02f, -2.25f, -1.02f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.22f, 0f, 2.56f, -1.01f, 3.0f, -2.25f)
                lineToRelative(-2.0f, 0.01f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.67f, 0f, 1.29f, 0.33f, 1.68f, 0.87f)
                curveToRelative(0.38f, 0.53f, 0.47f, 1.18f, 0.26f, 1.79f)
                close()
            }
        }.also { _CircleG = it}
