package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Br.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.65f, 10.27f)
            lineToRelative(3.09f, 3.09f)
            lineToRelative(-2.38f, 2.38f)
            curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
            horizontalLineToRelative(-0.79f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.79f)
            curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
            lineToRelative(2.38f, -2.38f)
            close()
            moveTo(13.78f, 7.14f)
            lineToRelative(-1.01f, 1.01f)
            lineToRelative(3.09f, 3.09f)
            lineToRelative(1.01f, -1.01f)
            curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
            reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
            close()
            moveTo(24.0f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21.0f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _PenCircle = it }
