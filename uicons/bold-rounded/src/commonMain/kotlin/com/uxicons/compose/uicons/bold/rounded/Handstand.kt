package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handstand: ImageVector? = null

val Icons.Br.Handstand: ImageVector
    get() = _Handstand ?: UXIcon(name = "Handstand") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 21.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(19.21f, 23.82f)
            curveToRelative(-0.72f, 0.39f, -1.64f, 0.12f, -2.03f, -0.62f)
            lineToRelative(-3.31f, -6.21f)
            horizontalLineToRelative(-3.73f)
            lineToRelative(-3.31f, 6.21f)
            curveToRelative(-0.39f, 0.74f, -1.31f, 1.0f, -2.03f, 0.62f)
            curveToRelative(-0.73f, -0.39f, -1.01f, -1.3f, -0.62f, -2.03f)
            lineToRelative(3.82f, -7.17f)
            verticalLineToRelative(-13.12f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(13.12f)
            lineToRelative(3.82f, 7.17f)
            curveToRelative(0.39f, 0.73f, 0.11f, 1.64f, -0.62f, 2.03f)
            close()
            moveTo(11f, 9f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-5f)
            close()
        }
    }.also { _Handstand = it }
