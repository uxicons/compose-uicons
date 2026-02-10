package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePivot: ImageVector? = null

val Icons.Br.TablePivot: ImageVector
    get() = _TablePivot ?: UXIcon(name = "TablePivot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7f)
            lineTo(0.03f, 7f)
            curveTo(0.26f, 4.37f, 2.37f, 2.26f, 5f, 2.02f)
            lineTo(5f, 7f)
            close()
            moveTo(21f, 8.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(8f, 2f)
            lineTo(8f, 7f)
            horizontalLineToRelative(13f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(10.5f, 19f)
            lineTo(5.5f, 19f)
            curveToRelative(-0.17f, 0f, -0.34f, -0.02f, -0.5f, -0.05f)
            lineTo(5f, 10f)
            lineTo(0f, 10f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(23.8f, 13.57f)
            lineToRelative(-2.08f, -2.08f)
            curveToRelative(-0.65f, -0.65f, -1.69f, -0.65f, -2.34f, 0f)
            lineToRelative(-2.08f, 2.08f)
            curveToRelative(-0.53f, 0.53f, -0.15f, 1.43f, 0.59f, 1.43f)
            horizontalLineToRelative(1.11f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1.16f)
            curveToRelative(0f, -0.75f, -0.9f, -1.12f, -1.43f, -0.59f)
            lineToRelative(-2.08f, 2.08f)
            curveToRelative(-0.65f, 0.65f, -0.65f, 1.69f, 0f, 2.34f)
            lineToRelative(2.08f, 2.08f)
            curveToRelative(0.53f, 0.53f, 1.43f, 0.15f, 1.43f, -0.59f)
            verticalLineToRelative(-1.16f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(1.2f)
            curveToRelative(0.75f, 0f, 1.12f, -0.91f, 0.59f, -1.43f)
            close()
        }
    }.also { _TablePivot = it }
