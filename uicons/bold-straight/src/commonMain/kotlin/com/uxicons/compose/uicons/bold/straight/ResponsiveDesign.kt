package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResponsiveDesign: ImageVector? = null

val Icons.Bs.ResponsiveDesign: ImageVector
    get() = _ResponsiveDesign ?: UXIcon(name = "ResponsiveDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                close()
                moveTo(20.5f, 7f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.41f, -2.5f, 1.05f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.09f, -0.11f, 0.22f, -0.18f, 0.37f, -0.18f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5f, 5f)
                verticalLineToRelative(5f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(7f, 7f)
                lineToRelative(-1.44f, 1.44f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-7f, -7f)
                lineToRelative(1.44f, -1.44f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ResponsiveDesign = it}
