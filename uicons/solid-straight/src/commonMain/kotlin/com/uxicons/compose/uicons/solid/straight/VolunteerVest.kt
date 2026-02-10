package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolunteerVest: ImageVector? = null

val Icons.Ss.VolunteerVest: ImageVector
    get() = _VolunteerVest ?: UXIcon(name = "VolunteerVest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.35f, 0.01f)
                lineToRelative(-3.35f, 9.1f)
                lineTo(8.65f, 0.01f)
                curveTo(8.97f, -0.01f, 15.03f, -0.01f, 15.35f, 0.01f)
                close()
                moveTo(5.2f, 0.5f)
                curveToRelative(-1.3f, 0.35f, -2.2f, 1.54f, -2.2f, 2.9f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 0.93f, -1.32f, 2.83f, -2f, 3.63f)
                verticalLineToRelative(12.37f)
                lineTo(11f, 24f)
                lineTo(11f, 12.18f)
                lineTo(6.59f, 0.21f)
                curveToRelative(-0.45f, 0.07f, -0.92f, 0.16f, -1.39f, 0.29f)
                close()
                moveTo(23f, 11.63f)
                verticalLineToRelative(12.37f)
                lineTo(13f, 24f)
                lineTo(13f, 12.18f)
                lineTo(17.41f, 0.21f)
                curveToRelative(0.45f, 0.07f, 0.92f, 0.16f, 1.39f, 0.29f)
                curveToRelative(1.3f, 0.35f, 2.2f, 1.54f, 2.2f, 2.9f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 0.97f, 1.43f, 2.96f, 2f, 3.63f)
                close()
                moveTo(21.09f, 15.54f)
                curveToRelative(0f, -0.85f, -0.63f, -1.54f, -1.4f, -1.54f)
                reflectiveCurveToRelative(-1.4f, 0.69f, -1.4f, 1.54f)
                curveToRelative(0f, -0.85f, -0.63f, -1.54f, -1.4f, -1.54f)
                reflectiveCurveToRelative(-1.4f, 0.69f, -1.4f, 1.54f)
                curveToRelative(0f, 1.61f, 2.79f, 3.59f, 2.79f, 3.59f)
                curveToRelative(0f, 0f, 2.79f, -1.98f, 2.79f, -3.59f)
                close()
            }
        }.also { _VolunteerVest = it}
