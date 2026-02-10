package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Ss.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 19f)
                verticalLineToRelative(4.3f)
                curveToRelative(-1.25f, 0.45f, -2.6f, 0.7f, -4f, 0.7f)
                reflectiveCurveToRelative(-2.75f, -0.26f, -4f, -0.7f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(18f, 22.38f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3.38f)
                curveTo(2.42f, 20.3f, 0f, 16.43f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 4.43f, -2.42f, 8.3f, -6f, 10.38f)
                close()
                moveTo(16f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _CircleUser = it}
