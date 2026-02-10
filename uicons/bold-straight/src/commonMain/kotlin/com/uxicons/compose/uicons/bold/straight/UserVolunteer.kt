package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Bs.UserVolunteer: ImageVector
    get() = _UserVolunteer ?: UXIcon(name = "UserVolunteer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(15.03f, 0f, 12f, 0f)
                reflectiveCurveTo(6.5f, 2.47f, 6.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15.25f, 19.8f)
                curveToRelative(0f, 1.89f, -3.27f, 4.2f, -3.27f, 4.2f)
                curveToRelative(0f, 0f, -3.27f, -2.32f, -3.27f, -4.2f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                close()
                moveTo(21f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(8f, 16f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                lineTo(3f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _UserVolunteer = it}
