package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Engine: ImageVector? = null

val Icons.Br.Engine: ImageVector
    get() = _Engine ?: UXIcon(name = "Engine") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 9f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-1.06f)
            curveToRelative(-1.04f, 0f, -2.02f, 0.46f, -2.69f, 1.26f)
            lineToRelative(-1.45f, 1.74f)
            horizontalLineToRelative(-0.3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.67f)
            curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.02f, 2.48f)
            lineToRelative(1.83f, 1.83f)
            curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
            horizontalLineToRelative(8.17f)
            curveToRelative(1.21f, 0f, 2.22f, -0.86f, 2.45f, -2f)
            horizontalLineToRelative(0.55f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(21f, 17f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-7.67f)
            curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
            lineToRelative(-1.83f, -1.83f)
            curveToRelative(-0.09f, -0.1f, -0.15f, -0.22f, -0.15f, -0.35f)
            verticalLineToRelative(-4.67f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.45f, 0f, 0.87f, -0.2f, 1.15f, -0.54f)
            lineToRelative(1.9f, -2.28f)
            curveToRelative(0.1f, -0.11f, 0.23f, -0.18f, 0.38f, -0.18f)
            horizontalLineToRelative(6.06f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.also { _Engine = it }
