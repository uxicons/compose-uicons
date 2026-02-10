package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Br.UserVolunteer: ImageVector
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
            curveToRelative(0f, 1.28f, -1.51f, 3.09f, -2.48f, 3.91f)
            curveToRelative(-0.46f, 0.39f, -1.13f, 0.39f, -1.59f, 0f)
            curveToRelative(-0.97f, -0.82f, -2.48f, -2.63f, -2.48f, -3.91f)
            curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
            reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
            curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
            reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
            close()
            moveTo(21f, 22f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            close()
        }
    }.also { _UserVolunteer = it }
