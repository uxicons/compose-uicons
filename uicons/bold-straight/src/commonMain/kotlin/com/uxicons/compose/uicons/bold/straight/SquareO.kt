package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareO: ImageVector? = null

val Icons.Bs.SquareO: ImageVector
    get() = _SquareO ?: UXIcon(name = "SquareO") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-3.31f, 0f, -6.01f, 2.71f, -6.01f, 6.05f)
                verticalLineToRelative(1.9f)
                curveToRelative(0f, 3.33f, 2.7f, 6.05f, 6.01f, 6.05f)
                reflectiveCurveToRelative(5.99f, -2.71f, 5.99f, -6.05f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -3.33f, -2.69f, -6.05f, -5.99f, -6.05f)
                close()
                moveTo(14.99f, 12.95f)
                curveToRelative(0f, 1.71f, -1.31f, 3.05f, -2.99f, 3.05f)
                curveToRelative(-1.66f, 0f, -3.01f, -1.37f, -3.01f, -3.05f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -1.68f, 1.35f, -3.05f, 3.01f, -3.05f)
                curveToRelative(1.68f, 0f, 2.99f, 1.34f, 2.99f, 3.05f)
                verticalLineToRelative(1.9f)
                close()
            }
        }.also { _SquareO = it}
