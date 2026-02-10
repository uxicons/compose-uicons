package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H3: ImageVector? = null

val Icons.Rs.H3: ImageVector
    get() = _H3 ?: UXIcon(name = "H3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(2f, 13f)
                verticalLineToRelative(7f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                close()
                moveTo(21.8f, 10.86f)
                curveToRelative(0.74f, -0.73f, 1.2f, -1.74f, 1.2f, -2.86f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.72f, -0.88f, -3.24f, -2.2f, -4.14f)
                close()
            }
        }.also { _H3 = it}
