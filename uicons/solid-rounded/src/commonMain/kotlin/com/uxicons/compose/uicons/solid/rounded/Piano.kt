package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Sr.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 16f)
                verticalLineToRelative(-7.35f)
                curveTo(0f, 3.88f, 3.88f, 0f, 8.65f, 0f)
                curveToRelative(3.99f, 0f, 7.38f, 2.72f, 8.24f, 6.62f)
                lineToRelative(0.23f, 1.04f)
                curveToRelative(0.23f, 1.05f, 1.19f, 1.82f, 2.27f, 1.82f)
                curveToRelative(2.55f, 0f, 4.62f, 2.07f, 4.62f, 4.62f)
                verticalLineToRelative(1.91f)
                lineTo(0f, 16f)
                close()
                moveTo(19f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Piano = it}
