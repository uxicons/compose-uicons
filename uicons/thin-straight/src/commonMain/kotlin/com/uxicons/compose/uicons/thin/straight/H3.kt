package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H3: ImageVector? = null

val Icons.Ts.H3: ImageVector
    get() = _H3 ?: UXIcon(name = "H3") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.5f)
                lineTo(1f, 12.5f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 20f)
                lineTo(0f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(21.2f, 11.34f)
                curveToRelative(1.08f, -0.72f, 1.79f, -1.94f, 1.79f, -3.34f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.88f, -1.16f, -3.49f, -2.79f, -4.16f)
                close()
            }
        }.also { _H3 = it}
