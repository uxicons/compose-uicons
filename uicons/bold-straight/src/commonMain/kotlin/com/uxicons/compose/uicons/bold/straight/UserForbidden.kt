package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Bs.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
                lineToRelative(-5.65f, -5.65f)
                curveToRelative(1.08f, -0.6f, 1.82f, -1.73f, 1.82f, -3.05f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.32f, 0f, -2.46f, 0.74f, -3.05f, 1.82f)
                lineToRelative(-2.15f, -2.15f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
                moveTo(9f, 20.48f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.55f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.19f)
                curveToRelative(-1.84f, -1.65f, -3f, -4.03f, -3f, -6.69f)
                curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
                lineToRelative(12.53f, 12.53f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-1.05f, 0f, -2.06f, -0.19f, -3f, -0.53f)
                close()
            }
        }.also { _UserForbidden = it}
