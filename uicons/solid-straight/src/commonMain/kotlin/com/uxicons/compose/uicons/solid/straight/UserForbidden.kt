package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Ss.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-5.22f, -5.22f)
                curveToRelative(0.91f, -0.74f, 1.48f, -1.86f, 1.48f, -3.11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.23f, 0f, -2.35f, 0.57f, -3.1f, 1.49f)
                lineToRelative(-3.22f, -3.22f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-0.53f, 0.43f, -1.1f, 0.81f, -1.71f, 1.12f)
                lineToRelative(-4.86f, -4.86f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(0.98f)
                curveToRelative(-2.42f, -1.83f, -4f, -4.72f, -4f, -7.98f)
                close()
            }
        }.also { _UserForbidden = it}
