package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResponsiveDesign: ImageVector? = null

val Icons.Ts.ResponsiveDesign: ImageVector
    get() = _ResponsiveDesign ?: UXIcon(name = "ResponsiveDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 23f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21.5f, 7f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.07f, 0f, -1.98f, 0.68f, -2.33f, 1.63f)
                lineToRelative(0.84f, 0.84f)
                curveToRelative(0.02f, -0.81f, 0.68f, -1.47f, 1.5f, -1.47f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.29f)
                lineToRelative(11.29f, 11.29f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.29f)
                lineToRelative(-11.29f, -11.29f)
                horizontalLineToRelative(4.29f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ResponsiveDesign = it}
