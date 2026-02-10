package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Br.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.73f, 12.09f)
            lineToRelative(-8.73f, -6.32f)
            verticalLineToRelative(-1.77f)
            horizontalLineToRelative(1f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.77f)
            lineTo(2.27f, 12.09f)
            reflectiveCurveToRelative(-0.0f, 0.0f, -0.0f, 0.0f)
            curveToRelative(-1.42f, 1.03f, -2.27f, 2.69f, -2.27f, 4.45f)
            verticalLineToRelative(2.46f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-2.46f)
            curveToRelative(0f, -1.75f, -0.85f, -3.42f, -2.27f, -4.45f)
            close()
            moveTo(12f, 16f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-9.36f)
            lineToRelative(4f, -2.89f)
            lineToRelative(4f, 2.89f)
            verticalLineToRelative(9.36f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(3f, 19f)
            verticalLineToRelative(-2.46f)
            curveToRelative(0f, -0.8f, 0.39f, -1.55f, 1.03f, -2.02f)
            lineToRelative(0.97f, -0.7f)
            verticalLineToRelative(7.19f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            close()
            moveTo(21f, 19f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            verticalLineToRelative(-7.19f)
            lineToRelative(0.97f, 0.7f)
            curveToRelative(0.65f, 0.47f, 1.03f, 1.23f, 1.03f, 2.02f)
            verticalLineToRelative(2.46f)
            close()
        }
    }.also { _Church = it }
