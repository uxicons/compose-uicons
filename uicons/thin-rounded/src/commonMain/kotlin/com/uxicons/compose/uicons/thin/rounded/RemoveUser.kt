package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoveUser: ImageVector? = null

val Icons.Tr.RemoveUser: ImageVector
    get() = _RemoveUser ?: UXIcon(name = "RemoveUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(2.95f, 6f)
                curveTo(2.95f, 2.68f, 5.65f, -0.03f, 8.97f, -0.03f)
                reflectiveCurveToRelative(6.03f, 2.7f, 6.03f, 6.03f)
                reflectiveCurveToRelative(-2.7f, 6.03f, -6.03f, 6.03f)
                reflectiveCurveToRelative(-6.03f, -2.7f, -6.03f, -6.03f)
                close()
                moveTo(3.95f, 6f)
                curveToRelative(0f, 2.77f, 2.25f, 5.03f, 5.03f, 5.03f)
                reflectiveCurveToRelative(5.03f, -2.25f, 5.03f, -5.03f)
                reflectiveCurveTo(11.75f, 0.97f, 8.97f, 0.97f)
                reflectiveCurveTo(3.95f, 3.23f, 3.95f, 6f)
                close()
                moveTo(9f, 14f)
                curveTo(4.04f, 14f, 0f, 18.04f, 0f, 23f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
            }
        }.also { _RemoveUser = it}
