package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartRate: ImageVector? = null

val Icons.Br.HeartRate: ImageVector
    get() = _HeartRate ?: UXIcon(name = "HeartRate") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 11.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.23f, 0f, -0.42f, 0.15f, -0.48f, 0.37f)
            curveToRelative(0f, 0f, -1.68f, 7.26f, -1.69f, 7.3f)
            curveToRelative(-0.25f, 0.8f, -1.0f, 1.33f, -1.83f, 1.33f)
            curveToRelative(-0.85f, -0.01f, -1.57f, -0.56f, -1.8f, -1.38f)
            lineToRelative(-2.82f, -12.13f)
            lineToRelative(-2.66f, 10.12f)
            curveToRelative(-0.27f, 0.84f, -0.95f, 1.36f, -1.75f, 1.39f)
            curveToRelative(-0.82f, 0.04f, -1.52f, -0.43f, -1.82f, -1.17f)
            curveToRelative(-0.02f, -0.05f, -1.64f, -5.58f, -1.64f, -5.58f)
            curveToRelative(-0.04f, -0.11f, -0.23f, -0.25f, -0.44f, -0.25f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.06f)
            curveToRelative(1.48f, 0f, 2.8f, 0.93f, 3.29f, 2.32f)
            lineToRelative(0.48f, 1.65f)
            lineToRelative(2.78f, -10.58f)
            curveToRelative(0.28f, -0.88f, 1.02f, -1.4f, 1.86f, -1.39f)
            curveToRelative(0.84f, 0.02f, 1.56f, 0.57f, 1.78f, 1.38f)
            lineToRelative(2.75f, 11.83f)
            lineToRelative(0.59f, -2.56f)
            curveToRelative(0.42f, -1.58f, 1.81f, -2.64f, 3.39f, -2.64f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HeartRate = it }
