package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProteinShake: ImageVector? = null

val Icons.Br.ProteinShake: ImageVector
    get() = _ProteinShake ?: UXIcon(name = "ProteinShake") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.56f, 4.94f)
            lineToRelative(-0.18f, -0.54f)
            curveToRelative(-0.48f, -1.43f, -1.81f, -2.39f, -3.32f, -2.39f)
            horizontalLineToRelative(-5.06f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-0.06f)
            curveToRelative(-1.51f, 0f, -2.84f, 0.96f, -3.32f, 2.4f)
            lineToRelative(-0.18f, 0.54f)
            curveToRelative(-0.34f, 1.02f, -0.47f, 2.1f, -0.44f, 3.17f)
            lineToRelative(0.74f, 10.78f)
            curveToRelative(0.2f, 2.87f, 2.61f, 5.12f, 5.49f, 5.12f)
            horizontalLineToRelative(3.53f)
            curveToRelative(2.88f, 0f, 5.29f, -2.25f, 5.49f, -5.12f)
            lineToRelative(0.74f, -10.78f)
            curveToRelative(0.04f, -1.07f, -0.09f, -2.15f, -0.44f, -3.17f)
            close()
            moveTo(13.77f, 21f)
            horizontalLineToRelative(-3.53f)
            curveToRelative(-1.2f, 0f, -2.2f, -0.86f, -2.44f, -2f)
            horizontalLineToRelative(0.71f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.94f)
            lineToRelative(-0.14f, -2f)
            horizontalLineToRelative(1.08f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.29f)
            lineToRelative(-0.21f, -3f)
            horizontalLineToRelative(9.97f)
            lineToRelative(-0.72f, 10.67f)
            curveToRelative(-0.09f, 1.31f, -1.19f, 2.33f, -2.49f, 2.33f)
            close()
        }
    }.also { _ProteinShake = it }
