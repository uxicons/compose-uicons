package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Recipe: ImageVector? = null

val Icons.Bs.Recipe: ImageVector
    get() = _Recipe ?: UXIcon(name = "Recipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(14.84f)
                lineToRelative(-5.62f, 5.66f)
                lineTo(4f, 24f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(14f, 0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10f, 9f)
                verticalLineToRelative(-4.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.68f, 0f, -1.3f, 0.28f, -1.75f, 0.72f)
                curveToRelative(-0.45f, -0.44f, -1.07f, -0.72f, -1.75f, -0.72f)
                reflectiveCurveToRelative(-1.3f, 0.28f, -1.75f, 0.72f)
                curveToRelative(-0.45f, -0.44f, -1.07f, -0.72f, -1.75f, -0.72f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(8f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Recipe = it}
