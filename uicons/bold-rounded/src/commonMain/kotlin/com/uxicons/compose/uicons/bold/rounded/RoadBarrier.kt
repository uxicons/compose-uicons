package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadBarrier: ImageVector? = null

val Icons.Br.RoadBarrier: ImageVector
    get() = _RoadBarrier ?: UXIcon(name = "RoadBarrier") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(3f, 4f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(0f, 20.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            lineTo(21f, 16f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(24f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(11.12f, 13f)
            lineToRelative(6f, -6f)
            horizontalLineToRelative(2.76f)
            lineToRelative(-6f, 6f)
            horizontalLineToRelative(-2.76f)
            close()
            moveTo(4.12f, 13f)
            lineToRelative(6f, -6f)
            horizontalLineToRelative(2.76f)
            lineToRelative(-6f, 6f)
            horizontalLineToRelative(-2.76f)
            close()
            moveTo(5.88f, 7f)
            lineToRelative(-2.88f, 2.88f)
            verticalLineToRelative(-2.88f)
            horizontalLineToRelative(2.88f)
            close()
            moveTo(18.12f, 13f)
            lineToRelative(2.88f, -2.88f)
            verticalLineToRelative(2.88f)
            horizontalLineToRelative(-2.88f)
            close()
        }
    }.also { _RoadBarrier = it }
