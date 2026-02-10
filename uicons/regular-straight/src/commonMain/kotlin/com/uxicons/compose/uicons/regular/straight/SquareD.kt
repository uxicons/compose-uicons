package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareD: ImageVector? = null

val Icons.Rs.SquareD: ImageVector
    get() = _SquareD ?: UXIcon(name = "SquareD") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(11.86f, 5f)
                horizontalLineToRelative(-3.86f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3.86f)
                curveToRelative(3.39f, 0f, 6.14f, -2.76f, 6.14f, -6.14f)
                verticalLineToRelative(-1.71f)
                curveToRelative(0f, -3.39f, -2.76f, -6.14f, -6.14f, -6.14f)
                close()
                moveTo(16f, 12.86f)
                curveToRelative(0f, 2.29f, -1.86f, 4.14f, -4.14f, 4.14f)
                horizontalLineToRelative(-3.86f)
                lineTo(8f, 7f)
                reflectiveCurveToRelative(3.86f, 0f, 3.86f, 0f)
                curveToRelative(2.28f, 0f, 4.14f, 1.86f, 4.14f, 4.14f)
                verticalLineToRelative(1.71f)
                close()
            }
        }.also { _SquareD = it}
