package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResponsiveDesign: ImageVector? = null

val Icons.Ss.ResponsiveDesign: ImageVector
    get() = _ResponsiveDesign ?: UXIcon(name = "ResponsiveDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-10.59f)
                lineToRelative(4.59f, 4.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.59f)
                lineToRelative(-6f, -6f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(10f, 19f)
                verticalLineToRelative(-7.59f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(3.76f, 3.76f)
                curveToRelative(0.55f, -2.16f, 2.5f, -3.76f, 4.83f, -3.76f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _ResponsiveDesign = it}
