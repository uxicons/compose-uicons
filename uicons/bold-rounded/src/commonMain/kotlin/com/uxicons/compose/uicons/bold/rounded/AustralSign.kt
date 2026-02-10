package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Br.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.9f, 21.96f)
            lineToRelative(-1.55f, -3.96f)
            horizontalLineToRelative(0.16f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.34f)
            lineToRelative(-0.79f, -2f)
            horizontalLineToRelative(2.12f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.3f)
            lineToRelative(-2.73f, -6.95f)
            curveTo(15.74f, 1.2f, 13.99f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-3.74f, 1.19f, -4.46f, 3.04f)
            lineToRelative(-2.73f, 6.95f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(3.62f)
            lineToRelative(-0.79f, 2f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.16f)
            lineTo(0.1f, 21.96f)
            curveToRelative(-0.3f, 0.77f, 0.08f, 1.64f, 0.85f, 1.95f)
            curveToRelative(0.77f, 0.3f, 1.64f, -0.08f, 1.95f, -0.85f)
            lineToRelative(1.99f, -5.05f)
            horizontalLineToRelative(14.23f)
            lineToRelative(1.99f, 5.05f)
            curveToRelative(0.23f, 0.59f, 0.8f, 0.95f, 1.4f, 0.95f)
            curveToRelative(0.18f, 0f, 0.37f, -0.03f, 0.55f, -0.1f)
            curveToRelative(0.77f, -0.3f, 1.15f, -1.17f, 0.85f, -1.95f)
            close()
            moveTo(10.33f, 4.14f)
            curveToRelative(0.42f, -1.06f, 1.38f, -1.14f, 1.67f, -1.14f)
            reflectiveCurveToRelative(1.26f, 0.08f, 1.67f, 1.14f)
            lineToRelative(2.3f, 5.86f)
            horizontalLineToRelative(-7.95f)
            lineToRelative(2.3f, -5.86f)
            close()
            moveTo(6.06f, 15f)
            lineToRelative(0.79f, -2f)
            horizontalLineToRelative(10.3f)
            lineToRelative(0.79f, 2f)
            horizontalLineTo(6.06f)
            close()
        }
    }.also { _AustralSign = it }
