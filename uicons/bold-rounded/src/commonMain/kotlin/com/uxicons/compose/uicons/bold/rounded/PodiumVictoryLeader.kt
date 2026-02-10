package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumVictoryLeader: ImageVector? = null

val Icons.Br.PodiumVictoryLeader: ImageVector
    get() = _PodiumVictoryLeader ?: UXIcon(name = "PodiumVictoryLeader") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 20f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(4.5f, 20f)
            lineTo(1.5f, 20f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(12f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(20.11f, 3.5f)
            curveToRelative(0.55f, -0.62f, 0.5f, -1.56f, -0.11f, -2.12f)
            reflectiveCurveToRelative(-1.56f, -0.51f, -2.12f, 0.11f)
            lineToRelative(-4.05f, 4.5f)
            horizontalLineToRelative(-3.66f)
            lineTo(6.12f, 1.5f)
            curveToRelative(-0.55f, -0.62f, -1.5f, -0.67f, -2.12f, -0.11f)
            curveToRelative(-0.62f, 0.55f, -0.67f, 1.5f, -0.11f, 2.12f)
            lineToRelative(4.12f, 4.57f)
            verticalLineToRelative(7.42f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.42f)
            lineToRelative(4.12f, -4.57f)
            close()
        }
    }.also { _PodiumVictoryLeader = it }
