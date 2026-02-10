package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeDeciduous: ImageVector? = null

val Icons.Sr.TreeDeciduous: ImageVector
    get() = _TreeDeciduous ?: UXIcon(name = "TreeDeciduous") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18.48f, 5.16f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.32f, -0.07f, -0.59f, -0.37f, -0.7f, -0.77f)
                curveToRelative(-0.72f, -2.58f, -3.1f, -4.38f, -5.78f, -4.38f)
                reflectiveCurveTo(6.94f, 1.8f, 6.22f, 4.38f)
                curveToRelative(-0.11f, 0.4f, -0.39f, 0.7f, -0.7f, 0.77f)
                curveTo(2.22f, 5.87f, -0.1f, 8.84f, 0.0f, 12.21f)
                curveToRelative(0.11f, 3.74f, 3.36f, 6.79f, 7.25f, 6.79f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-3.71f, -3.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.71f, 3.71f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(2.78f)
                curveToRelative(4.64f, 0f, 8.1f, -2.85f, 8.21f, -6.79f)
                curveToRelative(0.1f, -3.38f, -2.22f, -6.35f, -5.51f, -7.06f)
                close()
            }
        }.also { _TreeDeciduous = it}
