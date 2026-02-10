package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Br.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.25f)
            curveToRelative(2.34f, 0f, 4.25f, -1.91f, 4.25f, -4.25f)
            reflectiveCurveToRelative(-1.91f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-2.46f)
            curveToRelative(-1.17f, -0.46f, -5.43f, -2.23f, -8.5f, -4.77f)
            curveTo(7.9f, 0f, 6.7f, -0.15f, 5.67f, 0.34f)
            curveToRelative(-1.03f, 0.48f, -1.67f, 1.5f, -1.67f, 2.64f)
            verticalLineToRelative(8.1f)
            curveToRelative(0f, 1.14f, 0.64f, 2.15f, 1.67f, 2.64f)
            curveToRelative(0.4f, 0.19f, 0.83f, 0.28f, 1.25f, 0.28f)
            curveToRelative(0.67f, 0f, 1.32f, -0.23f, 1.87f, -0.68f)
            curveToRelative(3.21f, -2.65f, 7.73f, -4.47f, 8.65f, -4.82f)
            horizontalLineToRelative(2.32f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-2.25f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-6.5f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(7f, 10.91f)
            lineTo(7f, 3.15f)
            curveToRelative(2.02f, 1.65f, 4.42f, 2.97f, 6.3f, 3.88f)
            curveToRelative(-1.89f, 0.91f, -4.28f, 2.23f, -6.3f, 3.88f)
            close()
            moveTo(5f, 20.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(5f, 21f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.also { _Gramophone = it }
