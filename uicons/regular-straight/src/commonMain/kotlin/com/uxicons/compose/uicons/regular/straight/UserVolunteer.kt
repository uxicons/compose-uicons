package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Rs.UserVolunteer: ImageVector
    get() = _UserVolunteer ?: UXIcon(name = "UserVolunteer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 19.8f)
                curveToRelative(0f, 1.89f, -3.27f, 4.2f, -3.27f, 4.2f)
                curveToRelative(0f, 0f, -3.27f, -2.32f, -3.27f, -4.2f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                close()
                moveTo(6f, 6f)
                curveTo(6f, 2.69f, 8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(8f, 6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(16f, 14f)
                lineTo(8f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _UserVolunteer = it}
