package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Ss.UserVolunteer: ImageVector
    get() = _UserVolunteer ?: UXIcon(name = "UserVolunteer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                lineTo(8f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                lineTo(21f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(11.98f, 22.5f)
                reflectiveCurveToRelative(-3.27f, -2.32f, -3.27f, -4.2f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, 1.89f, -3.27f, 4.2f, -3.27f, 4.2f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _UserVolunteer = it}
