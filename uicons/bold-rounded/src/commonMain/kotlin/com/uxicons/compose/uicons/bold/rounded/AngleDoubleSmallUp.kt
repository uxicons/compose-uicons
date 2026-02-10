package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallUp: ImageVector? = null

val Icons.Br.AngleDoubleSmallUp: ImageVector
    get() = _AngleDoubleSmallUp ?: UXIcon(name = "AngleDoubleSmallUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 20f)
            curveToRelative(-0.38f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-4.94f, -4.94f)
            lineToRelative(-4.94f, 4.94f)
            curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(6.0f, -6f)
            curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
            horizontalLineToRelative(0f)
            curveToRelative(0.4f, 0f, 0.78f, 0.16f, 1.06f, 0.44f)
            lineToRelative(6.0f, 6f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            close()
            moveTo(19.07f, 12.29f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            lineToRelative(-3.92f, -3.87f)
            curveToRelative(-0.84f, -0.84f, -1.95f, -1.3f, -3.13f, -1.3f)
            reflectiveCurveToRelative(-2.29f, 0.46f, -3.12f, 1.29f)
            lineToRelative(-3.93f, 3.88f)
            curveToRelative(-0.59f, 0.58f, -0.6f, 1.53f, -0.01f, 2.12f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            lineToRelative(3.94f, -3.89f)
            curveToRelative(0.54f, -0.54f, 1.47f, -0.55f, 2.02f, 0.01f)
            lineToRelative(3.93f, 3.88f)
            curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
            curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.07f, -0.45f)
            close()
        }
    }.also { _AngleDoubleSmallUp = it }
