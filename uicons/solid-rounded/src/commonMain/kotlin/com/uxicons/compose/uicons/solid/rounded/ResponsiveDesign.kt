package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResponsiveDesign: ImageVector? = null

val Icons.Sr.ResponsiveDesign: ImageVector
    get() = _ResponsiveDesign ?: UXIcon(name = "ResponsiveDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.26f, 24f)
                horizontalLineToRelative(-6.26f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.33f, 0f, -4.27f, 1.6f, -4.83f, 3.76f)
                lineToRelative(-3.76f, -3.76f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.59f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(7.59f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.1f, 1.13f, 0.55f, 2.17f, 1.23f, 3f)
                close()
                moveTo(20f, 7f)
                horizontalLineToRelative(-4.41f)
                curveToRelative(-1.98f, 0f, -3.59f, 1.6f, -3.59f, 3.59f)
                reflectiveCurveToRelative(6f, 6f, 6f, 6f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-4.59f, -4.59f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.98f, 1.6f, 3.59f, 3.59f, 3.59f)
                horizontalLineToRelative(4.83f)
                curveToRelative(1.98f, 0f, 3.59f, -1.6f, 3.59f, -3.59f)
                verticalLineToRelative(-9.41f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _ResponsiveDesign = it}
