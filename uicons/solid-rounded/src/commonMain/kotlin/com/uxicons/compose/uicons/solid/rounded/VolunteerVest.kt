package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolunteerVest: ImageVector? = null

val Icons.Sr.VolunteerVest: ImageVector
    get() = _VolunteerVest ?: UXIcon(name = "VolunteerVest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.35f, 0.01f)
                lineToRelative(-3.35f, 9.1f)
                lineTo(8.65f, 0.01f)
                curveToRelative(0.21f, -0.01f, 0.34f, -0.01f, 0.35f, -0.01f)
                horizontalLineToRelative(6f)
                curveToRelative(0.01f, 0f, 0.14f, 0f, 0.35f, 0.01f)
                close()
                moveTo(3f, 5.07f)
                verticalLineToRelative(2.94f)
                curveToRelative(0f, 0.56f, -0.41f, 1.47f, -1.12f, 2.5f)
                curveToRelative(-0.58f, 0.83f, -0.88f, 1.81f, -0.88f, 2.83f)
                verticalLineToRelative(5.67f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                lineTo(11f, 12.18f)
                lineTo(6.61f, 0.27f)
                curveToRelative(-2.11f, 0.6f, -3.61f, 2.53f, -3.61f, 4.8f)
                close()
                moveTo(23f, 13.33f)
                verticalLineToRelative(5.67f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-5f)
                lineTo(13f, 12.18f)
                lineTo(17.39f, 0.26f)
                curveToRelative(2.11f, 0.6f, 3.61f, 2.53f, 3.61f, 4.8f)
                verticalLineToRelative(2.94f)
                curveToRelative(0f, 0.56f, 0.41f, 1.47f, 1.12f, 2.5f)
                curveToRelative(0.58f, 0.83f, 0.88f, 1.81f, 0.88f, 2.83f)
                close()
                moveTo(21.09f, 14.54f)
                curveToRelative(0f, -0.85f, -0.63f, -1.54f, -1.4f, -1.54f)
                reflectiveCurveToRelative(-1.4f, 0.69f, -1.4f, 1.54f)
                curveToRelative(0f, -0.85f, -0.63f, -1.54f, -1.4f, -1.54f)
                reflectiveCurveToRelative(-1.4f, 0.69f, -1.4f, 1.54f)
                curveToRelative(0f, 1.08f, 1.27f, 2.5f, 2.1f, 3.21f)
                curveToRelative(0.4f, 0.34f, 1.0f, 0.34f, 1.4f, 0f)
                curveToRelative(0.83f, -0.7f, 2.1f, -2.12f, 2.1f, -3.21f)
                close()
            }
        }.also { _VolunteerVest = it}
