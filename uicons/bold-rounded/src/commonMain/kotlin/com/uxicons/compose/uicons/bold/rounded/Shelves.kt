package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shelves: ImageVector? = null

val Icons.Br.Shelves: ImageVector
    get() = _Shelves ?: UXIcon(name = "Shelves") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 0f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(3.5f)
            lineTo(3f, 7f)
            lineTo(3f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(0f, 0.67f, 0f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17f, 3.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(3f, 15.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(3.5f)
            lineTo(3f, 19f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(14f, 19f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(3.5f)
            close()
            moveTo(17f, 19f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.74f, 0f, -1.43f, 0.23f, -2f, 0.63f)
            curveToRelative(-0.57f, -0.4f, -1.26f, -0.63f, -2f, -0.63f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.04f)
            verticalLineToRelative(-2.04f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.also { _Shelves = it }
