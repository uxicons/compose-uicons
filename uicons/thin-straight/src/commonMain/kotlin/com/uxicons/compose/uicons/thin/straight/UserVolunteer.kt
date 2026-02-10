package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Ts.UserVolunteer: ImageVector
    get() = _UserVolunteer ?: UXIcon(name = "UserVolunteer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(15.75f, 19.3f)
                curveToRelative(-0.12f, 2.35f, -3.15f, 4.25f, -3.75f, 4.7f)
                curveToRelative(-0.59f, -0.44f, -3.68f, -2.35f, -3.8f, -4.7f)
                curveToRelative(0f, -1.27f, 0.96f, -2.3f, 2.14f, -2.3f)
                curveToRelative(0.62f, 0f, 1.24f, 0.23f, 1.66f, 0.67f)
                curveToRelative(0.41f, -0.44f, 1.02f, -0.67f, 1.62f, -0.67f)
                curveToRelative(1.18f, 0f, 2.14f, 1.03f, 2.14f, 2.3f)
                close()
                moveTo(14.75f, 19.3f)
                curveToRelative(0f, -0.72f, -0.51f, -1.3f, -1.14f, -1.3f)
                curveToRelative(-0.51f, 0f, -1.11f, 0.26f, -1.11f, 1.0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0f, -0.79f, -0.76f, -1f, -1.16f, -1f)
                curveToRelative(-0.63f, 0f, -1.14f, 0.58f, -1.14f, 1.3f)
                curveToRelative(0f, 1.19f, 1.84f, 2.78f, 2.79f, 3.48f)
                curveToRelative(0.97f, -0.71f, 2.75f, -2.28f, 2.75f, -3.48f)
                close()
                moveTo(6f, 6f)
                curveTo(6f, 2.69f, 8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                close()
            }
        }.also { _UserVolunteer = it}
