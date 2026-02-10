package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbidden: ImageVector? = null

val Icons.Ts.UserForbidden: ImageVector
    get() = _UserForbidden ?: UXIcon(name = "UserForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-6.01f, -6.01f)
                curveToRelative(1.16f, -0.72f, 1.9f, -2.01f, 1.9f, -3.4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.39f, 0f, -2.67f, 0.73f, -3.4f, 1.9f)
                lineTo(4.6f, 3.89f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                close()
                moveTo(13.37f, 12.66f)
                lineToRelative(-4.03f, -4.03f)
                curveToRelative(0.51f, -0.99f, 1.54f, -1.63f, 2.66f, -1.63f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.12f, -0.64f, 2.15f, -1.63f, 2.66f)
                close()
                moveTo(7f, 21.79f)
                verticalLineToRelative(-3.29f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.96f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-3.96f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.71f)
                curveToRelative(-3.01f, -1.97f, -5f, -5.36f, -5f, -9.21f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(15.52f, 15.52f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-1.8f, 0f, -3.5f, -0.44f, -5f, -1.21f)
                close()
            }
        }.also { _UserForbidden = it}
