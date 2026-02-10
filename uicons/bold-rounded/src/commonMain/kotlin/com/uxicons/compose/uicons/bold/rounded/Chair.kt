package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Br.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 13.26f)
            lineTo(19f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            lineTo(5f, 13.26f)
            curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.96f, -1.25f, -3.62f, -3f, -4.24f)
            close()
            moveTo(16f, 5f)
            lineTo(16f, 13f)
            horizontalLineToRelative(-2.5f)
            lineTo(13.5f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(10f, 3f)
            horizontalLineToRelative(0.5f)
            lineTo(10.5f, 13f)
            horizontalLineToRelative(-2.5f)
            lineTo(8f, 5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
        }
    }.also { _Chair = it }
