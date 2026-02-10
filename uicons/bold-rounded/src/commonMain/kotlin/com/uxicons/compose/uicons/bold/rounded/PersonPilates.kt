package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPilates: ImageVector? = null

val Icons.Br.PersonPilates: ImageVector
    get() = _PersonPilates ?: UXIcon(name = "PersonPilates") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 20.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(9.52f)
            curveToRelative(-0.66f, -0.13f, -1.29f, -0.45f, -1.8f, -0.96f)
            lineTo(2.46f, 12.12f)
            curveToRelative(-0.45f, -0.51f, -0.61f, -1.18f, -0.61f, -1.85f)
            curveToRelative(0f, -2.12f, 2.38f, -2.27f, 2.43f, -2.27f)
            horizontalLineTo(13.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5.35f)
            lineToRelative(3.48f, 3.79f)
            lineToRelative(3.26f, -3.38f)
            curveToRelative(0.11f, -0.11f, 0.23f, -0.21f, 0.37f, -0.28f)
            lineToRelative(5.52f, -2.96f)
            curveToRelative(0.73f, -0.39f, 1.64f, -0.12f, 2.03f, 0.61f)
            curveToRelative(0.39f, 0.73f, 0.12f, 1.64f, -0.61f, 2.03f)
            lineToRelative(-5.32f, 2.85f)
            reflectiveCurveToRelative(-3.67f, 3.88f, -4.21f, 4.35f)
            curveToRelative(-0.84f, 0.82f, -1.25f, 0.87f, -1.82f, 0.98f)
            horizontalLineToRelative(11.63f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(3.5f, 7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveTo(1f, 3.12f, 1f, 4.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _PersonPilates = it }
