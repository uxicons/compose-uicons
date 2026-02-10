package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputText: ImageVector? = null

val Icons.Br.InputText: ImageVector
    get() = _InputText ?: UXIcon(name = "InputText") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 2f)
            lineTo(5.5f, 2f)
            curveTo(2.47f, 2f, 0f, 4.47f, 0f, 7.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 16.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 19f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(10.32f, 8.66f)
            curveToRelative(-0.23f, -0.99f, -1.06f, -1.67f, -2.08f, -1.67f)
            reflectiveCurveToRelative(-1.86f, 0.67f, -2.08f, 1.67f)
            lineToRelative(-1.62f, 7.12f)
            curveToRelative(-0.12f, 0.54f, 0.21f, 1.07f, 0.75f, 1.2f)
            curveToRelative(0.54f, 0.13f, 1.07f, -0.21f, 1.2f, -0.75f)
            lineToRelative(0.28f, -1.22f)
            horizontalLineToRelative(2.96f)
            lineToRelative(0.28f, 1.22f)
            curveToRelative(0.1f, 0.46f, 0.52f, 0.78f, 0.97f, 0.78f)
            curveToRelative(0.07f, 0f, 0.15f, -0.01f, 0.22f, -0.03f)
            curveToRelative(0.54f, -0.12f, 0.88f, -0.66f, 0.75f, -1.2f)
            lineToRelative(-1.62f, -7.12f)
            close()
            moveTo(7.21f, 13f)
            lineToRelative(0.89f, -3.9f)
            curveToRelative(0.01f, -0.05f, 0.02f, -0.11f, 0.14f, -0.11f)
            reflectiveCurveToRelative(0.12f, 0.06f, 0.14f, 0.11f)
            lineToRelative(0.89f, 3.9f)
            horizontalLineToRelative(-2.04f)
            close()
        }
    }.also { _InputText = it }
