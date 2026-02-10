package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareO: ImageVector? = null

val Icons.Sr.SquareO: ImageVector
    get() = _SquareO ?: UXIcon(name = "SquareO") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.99f, 11.05f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 2.27f, -1.75f, 4.05f, -3.99f, 4.05f)
                curveToRelative(-2.21f, 0f, -4.01f, -1.82f, -4.01f, -4.05f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -2.23f, 1.8f, -4.05f, 4.01f, -4.05f)
                curveToRelative(2.24f, 0f, 3.99f, 1.78f, 3.99f, 4.05f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(17.99f, 11.05f)
                curveToRelative(0f, -3.34f, -2.69f, -6.05f, -5.99f, -6.05f)
                reflectiveCurveToRelative(-6.01f, 2.72f, -6.01f, 6.05f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 3.34f, 2.7f, 6.05f, 6.01f, 6.05f)
                reflectiveCurveToRelative(5.99f, -2.72f, 5.99f, -6.05f)
                verticalLineToRelative(-1.89f)
                close()
            }
        }.also { _SquareO = it}
