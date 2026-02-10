package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Br.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.23f, 9.22f)
            lineToRelative(-3.22f, -5.5f)
            curveToRelative(-0.98f, -1.68f, -2.8f, -2.72f, -4.75f, -2.72f)
            horizontalLineToRelative(-6.55f)
            curveToRelative(-1.94f, 0f, -3.76f, 1.04f, -4.75f, 2.72f)
            lineTo(0.74f, 9.22f)
            curveToRelative(-1.0f, 1.72f, -1.0f, 3.85f, 0f, 5.56f)
            lineToRelative(3.22f, 5.5f)
            curveToRelative(0.98f, 1.68f, 2.8f, 2.72f, 4.75f, 2.72f)
            horizontalLineToRelative(6.55f)
            curveToRelative(1.94f, 0f, 3.76f, -1.04f, 4.75f, -2.72f)
            lineToRelative(3.22f, -5.5f)
            curveToRelative(1.0f, -1.72f, 1.0f, -3.85f, 0f, -5.56f)
            close()
            moveTo(20.64f, 13.26f)
            lineToRelative(-3.22f, 5.5f)
            curveToRelative(-0.45f, 0.76f, -1.27f, 1.24f, -2.16f, 1.24f)
            horizontalLineToRelative(-6.55f)
            curveToRelative(-0.88f, 0f, -1.71f, -0.47f, -2.16f, -1.24f)
            lineToRelative(-3.22f, -5.5f)
            curveToRelative(-0.46f, -0.78f, -0.46f, -1.75f, 0f, -2.53f)
            lineToRelative(3.22f, -5.5f)
            curveToRelative(0.45f, -0.76f, 1.27f, -1.24f, 2.16f, -1.24f)
            horizontalLineToRelative(6.55f)
            curveToRelative(0.88f, 0f, 1.71f, 0.47f, 2.16f, 1.24f)
            lineToRelative(3.22f, 5.5f)
            curveToRelative(0.46f, 0.78f, 0.46f, 1.75f, 0f, 2.53f)
            close()
            moveTo(13.5f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13.5f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HexagonExclamation = it }
