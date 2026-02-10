package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Br.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.06f, 10.61f)
            lineToRelative(-4.48f, -1.79f)
            lineToRelative(1.3f, -2.73f)
            curveToRelative(0.24f, -0.56f, 0.12f, -1.22f, -0.32f, -1.65f)
            reflectiveCurveToRelative(-1.09f, -0.56f, -1.65f, -0.32f)
            lineToRelative(-2.73f, 1.3f)
            lineTo(13.39f, 0.94f)
            curveToRelative(-0.23f, -0.57f, -0.78f, -0.94f, -1.39f, -0.94f)
            reflectiveCurveToRelative(-1.17f, 0.37f, -1.39f, 0.94f)
            lineToRelative(-1.79f, 4.48f)
            lineToRelative(-2.73f, -1.3f)
            curveToRelative(-0.56f, -0.24f, -1.22f, -0.12f, -1.65f, 0.32f)
            curveToRelative(-0.43f, 0.43f, -0.56f, 1.09f, -0.32f, 1.65f)
            lineToRelative(1.3f, 2.73f)
            lineTo(0.94f, 10.61f)
            curveToRelative(-0.57f, 0.23f, -0.94f, 0.78f, -0.94f, 1.39f)
            reflectiveCurveToRelative(0.37f, 1.17f, 0.94f, 1.39f)
            lineToRelative(4.5f, 1.8f)
            lineToRelative(-1.32f, 2.81f)
            curveToRelative(-0.24f, 0.56f, -0.12f, 1.22f, 0.32f, 1.65f)
            curveToRelative(0.43f, 0.43f, 1.09f, 0.56f, 1.65f, 0.32f)
            lineToRelative(2.74f, -1.35f)
            lineToRelative(1.77f, 4.44f)
            curveToRelative(0.23f, 0.57f, 0.78f, 0.94f, 1.39f, 0.94f)
            reflectiveCurveToRelative(1.17f, -0.37f, 1.39f, -0.94f)
            lineToRelative(1.79f, -4.48f)
            lineToRelative(2.73f, 1.3f)
            curveToRelative(0.19f, 0.08f, 0.39f, 0.12f, 0.59f, 0.12f)
            curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.43f, -0.43f, 0.56f, -1.09f, 0.32f, -1.65f)
            lineToRelative(-1.3f, -2.73f)
            lineToRelative(4.48f, -1.79f)
            curveToRelative(0.57f, -0.23f, 0.94f, -0.78f, 0.94f, -1.39f)
            reflectiveCurveToRelative(-0.37f, -1.17f, -0.94f, -1.39f)
            close()
            moveTo(12f, 18.46f)
            lineToRelative(-1.61f, -4.02f)
            curveToRelative(-0.15f, -0.38f, -0.45f, -0.68f, -0.83f, -0.84f)
            lineToRelative(-4.02f, -1.61f)
            lineToRelative(4.02f, -1.61f)
            curveToRelative(0.38f, -0.15f, 0.68f, -0.45f, 0.83f, -0.83f)
            lineToRelative(1.61f, -4.02f)
            lineToRelative(1.61f, 4.02f)
            curveToRelative(0.15f, 0.38f, 0.45f, 0.68f, 0.84f, 0.83f)
            lineToRelative(4.02f, 1.61f)
            lineToRelative(-4.02f, 1.61f)
            curveToRelative(-0.38f, 0.15f, -0.68f, 0.45f, -0.84f, 0.84f)
            lineToRelative(-1.61f, 4.02f)
            close()
        }
    }.also { _CardinalCompass = it }
