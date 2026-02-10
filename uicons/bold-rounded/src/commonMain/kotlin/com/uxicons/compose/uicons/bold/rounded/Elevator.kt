package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Elevator: ImageVector? = null

val Icons.Br.Elevator: ImageVector
    get() = _Elevator ?: UXIcon(name = "Elevator") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 6f)
            lineTo(5.5f, 6f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 0.82f, -0.39f, 1.54f, -1f, 2.0f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            curveToRelative(-0.61f, -0.46f, -1f, -1.18f, -1f, -2.0f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(10f, 13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(19f, 13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(4.5f, 2.68f)
            lineTo(6.95f, 0.23f)
            curveToRelative(0.3f, -0.3f, 0.79f, -0.3f, 1.1f, 0f)
            lineToRelative(2.45f, 2.45f)
            curveToRelative(0.49f, 0.49f, 0.14f, 1.32f, -0.55f, 1.32f)
            horizontalLineToRelative(-4.9f)
            curveToRelative(-0.69f, 0f, -1.04f, -0.83f, -0.55f, -1.32f)
            close()
            moveTo(13.5f, 1.32f)
            curveToRelative(-0.49f, -0.49f, -0.14f, -1.32f, 0.55f, -1.32f)
            horizontalLineToRelative(4.9f)
            curveToRelative(0.69f, 0f, 1.04f, 0.83f, 0.55f, 1.32f)
            lineToRelative(-2.45f, 2.45f)
            curveToRelative(-0.3f, 0.3f, -0.79f, 0.3f, -1.1f, 0f)
            lineToRelative(-2.45f, -2.45f)
            close()
        }
    }.also { _Elevator = it }
