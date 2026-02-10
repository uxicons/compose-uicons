package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveUser: ImageVector? = null

val Icons.Ts.RemoveUser: ImageVector
    get() = _RemoveUser ?: UXIcon(name = "RemoveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 6f)
                curveTo(15f, 2.68f, 12.3f, -0.03f, 8.97f, -0.03f)
                reflectiveCurveTo(2.95f, 2.68f, 2.95f, 6f)
                reflectiveCurveToRelative(2.7f, 6.03f, 6.03f, 6.03f)
                reflectiveCurveToRelative(6.03f, -2.7f, 6.03f, -6.03f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, 2.77f, -2.25f, 5.03f, -5.03f, 5.03f)
                reflectiveCurveToRelative(-5.03f, -2.25f, -5.03f, -5.03f)
                reflectiveCurveTo(6.2f, 0.97f, 8.97f, 0.97f)
                reflectiveCurveToRelative(5.03f, 2.25f, 5.03f, 5.03f)
                close()
                moveTo(18f, 18.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _RemoveUser = it}
