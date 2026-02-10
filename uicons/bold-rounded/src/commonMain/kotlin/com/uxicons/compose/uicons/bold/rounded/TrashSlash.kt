package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Br.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.82f, 18.7f)
            curveToRelative(0.0f, -0.02f, 1.06f, -12.7f, 1.06f, -12.7f)
            horizontalLineToRelative(0.62f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.76f)
            curveToRelative(-0.62f, -1.75f, -2.29f, -3f, -4.24f, -3f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.96f, 0f, -3.62f, 1.25f, -4.24f, 3f)
            horizontalLineToRelative(-1.14f)
            lineTo(2.56f, 0.44f)
            curveTo(1.98f, -0.15f, 1.02f, -0.15f, 0.44f, 0.44f)
            reflectiveCurveTo(-0.15f, 1.98f, 0.44f, 2.56f)
            lineToRelative(21f, 21f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-2.74f, -2.74f)
            close()
            moveTo(18.04f, 15.92f)
            lineTo(8.12f, 6f)
            horizontalLineToRelative(10.75f)
            lineToRelative(-0.83f, 9.92f)
            close()
            moveTo(16f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5.82f)
            curveToRelative(-2.84f, 0f, -5.25f, -2.21f, -5.48f, -5.04f)
            lineToRelative(-0.61f, -7.33f)
            curveToRelative(-0.07f, -0.83f, 0.54f, -1.55f, 1.37f, -1.62f)
            curveToRelative(0.83f, -0.05f, 1.55f, 0.55f, 1.62f, 1.37f)
            lineToRelative(0.61f, 7.33f)
            curveToRelative(0.11f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
            horizontalLineToRelative(5.82f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _TrashSlash = it }
