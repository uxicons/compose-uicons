package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Floor: ImageVector? = null

val Icons.Br.Floor: ImageVector
    get() = _Floor ?: UXIcon(name = "Floor") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.36f, 10.99f)
            lineToRelative(7.83f, 5.17f)
            curveToRelative(0.84f, 0.56f, 1.82f, 0.83f, 2.81f, 0.83f)
            reflectiveCurveToRelative(1.97f, -0.28f, 2.81f, -0.83f)
            lineToRelative(7.83f, -5.17f)
            curveToRelative(0.85f, -0.56f, 1.36f, -1.5f, 1.36f, -2.49f)
            reflectiveCurveToRelative(-0.51f, -1.93f, -1.36f, -2.49f)
            lineTo(14.81f, 0.84f)
            curveToRelative(-1.68f, -1.11f, -3.94f, -1.11f, -5.62f, 0f)
            lineTo(1.36f, 6.01f)
            curveToRelative(-0.85f, 0.56f, -1.36f, 1.5f, -1.36f, 2.49f)
            reflectiveCurveToRelative(0.51f, 1.93f, 1.36f, 2.49f)
            close()
            moveTo(13.15f, 13.66f)
            curveToRelative(-0.68f, 0.45f, -1.63f, 0.45f, -2.31f, 0f)
            lineToRelative(-2.49f, -1.64f)
            lineToRelative(4.83f, -3.17f)
            lineToRelative(3.63f, 2.39f)
            lineToRelative(-3.67f, 2.42f)
            close()
            moveTo(18.64f, 10.04f)
            lineToRelative(-3.63f, -2.38f)
            lineToRelative(2.36f, -1.55f)
            lineToRelative(3.62f, 2.38f)
            lineToRelative(-2.35f, 1.55f)
            close()
            moveTo(10.85f, 3.34f)
            curveToRelative(0.34f, -0.23f, 0.75f, -0.34f, 1.15f, -0.34f)
            reflectiveCurveToRelative(0.81f, 0.11f, 1.15f, 0.34f)
            lineToRelative(2.39f, 1.57f)
            lineToRelative(-4.89f, 3.21f)
            lineToRelative(-3.54f, -2.32f)
            lineToRelative(3.72f, -2.46f)
            close()
            moveTo(5.31f, 7.0f)
            lineToRelative(3.53f, 2.32f)
            lineToRelative(-2.3f, 1.51f)
            lineToRelative(-3.52f, -2.31f)
            lineToRelative(2.29f, -1.51f)
            close()
            moveTo(23.75f, 14.46f)
            curveToRelative(0.46f, 0.69f, 0.27f, 1.62f, -0.42f, 2.08f)
            lineToRelative(-8.52f, 5.63f)
            curveToRelative(-0.84f, 0.56f, -1.82f, 0.83f, -2.81f, 0.83f)
            reflectiveCurveToRelative(-1.97f, -0.28f, -2.81f, -0.83f)
            lineTo(0.67f, 16.54f)
            curveToRelative(-0.69f, -0.46f, -0.88f, -1.39f, -0.42f, -2.08f)
            curveToRelative(0.46f, -0.69f, 1.39f, -0.88f, 2.08f, -0.42f)
            lineToRelative(8.52f, 5.63f)
            curveToRelative(0.68f, 0.45f, 1.63f, 0.45f, 2.31f, 0f)
            lineToRelative(8.52f, -5.63f)
            curveToRelative(0.69f, -0.46f, 1.62f, -0.27f, 2.08f, 0.42f)
            close()
        }
    }.also { _Floor = it }
