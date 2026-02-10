package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareO: ImageVector? = null

val Icons.Rs.SquareO: ImageVector
    get() = _SquareO ?: UXIcon(name = "SquareO") {
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
                moveTo(12f, 5f)
                curveToRelative(-3.31f, 0f, -6.01f, 2.72f, -6.01f, 6.05f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 3.34f, 2.7f, 6.05f, 6.01f, 6.05f)
                reflectiveCurveToRelative(5.99f, -2.72f, 5.99f, -6.05f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -3.34f, -2.69f, -6.05f, -5.99f, -6.05f)
                close()
                moveTo(15.99f, 12.95f)
                curveToRelative(0f, 2.27f, -1.75f, 4.05f, -3.99f, 4.05f)
                curveToRelative(-2.21f, 0f, -4.01f, -1.82f, -4.01f, -4.05f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -2.23f, 1.8f, -4.05f, 4.01f, -4.05f)
                curveToRelative(2.24f, 0f, 3.99f, 1.78f, 3.99f, 4.05f)
                verticalLineToRelative(1.89f)
                close()
            }
        }.also { _SquareO = it}
