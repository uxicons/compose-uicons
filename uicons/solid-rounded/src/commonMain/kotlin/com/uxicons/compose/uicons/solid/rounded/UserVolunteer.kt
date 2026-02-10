package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVolunteer: ImageVector? = null

val Icons.Sr.UserVolunteer: ImageVector
    get() = _UserVolunteer ?: UXIcon(name = "UserVolunteer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(20f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(12.73f, 22.14f)
                curveToRelative(-0.44f, 0.37f, -1.07f, 0.37f, -1.51f, 0f)
                curveToRelative(-0.97f, -0.81f, -2.52f, -2.62f, -2.52f, -3.92f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, -0.99f, 0.73f, -1.8f, 1.64f, -1.8f)
                reflectiveCurveToRelative(1.64f, 0.81f, 1.64f, 1.8f)
                curveToRelative(0f, 1.3f, -1.55f, 3.11f, -2.52f, 3.92f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _UserVolunteer = it}
