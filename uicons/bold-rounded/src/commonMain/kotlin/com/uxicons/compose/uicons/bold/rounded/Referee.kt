package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Referee: ImageVector? = null

val Icons.Br.Referee: ImageVector
    get() = _Referee ?: UXIcon(name = "Referee") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 21f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.57f, -0.6f, -3.14f, -1.53f, -4.01f)
            lineToRelative(-0.47f, 0.5f)
            reflectiveCurveToRelative(0.0f, 0.01f, 0.0f, 0.01f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.89f)
            curveToRelative(-0.28f, 0.25f, -0.64f, 0.39f, -1.01f, 0.39f)
            curveToRelative(-0.37f, -0.0f, -0.72f, -0.15f, -0.99f, -0.39f)
            verticalLineToRelative(1.89f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.07f)
            lineToRelative(-0.37f, -0.39f)
            curveToRelative(-0.98f, 0.86f, -1.63f, 2.47f, -1.63f, 3.96f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -2.34f, 0.99f, -4.72f, 2.58f, -6.21f)
            curveToRelative(0.59f, -0.55f, 1.35f, -0.83f, 2.16f, -0.79f)
            curveToRelative(0.81f, 0.04f, 1.58f, 0.41f, 2.11f, 1.01f)
            lineToRelative(2.17f, 2.31f)
            lineToRelative(2.28f, -2.36f)
            curveToRelative(0.49f, -0.56f, 1.26f, -0.92f, 2.07f, -0.96f)
            curveToRelative(0.81f, -0.03f, 1.57f, 0.24f, 2.15f, 0.79f)
            curveToRelative(1.53f, 1.43f, 2.47f, 3.81f, 2.47f, 6.2f)
            close()
            moveTo(6f, 6f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            close()
            moveTo(9f, 6f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            close()
        }
    }.also { _Referee = it }
