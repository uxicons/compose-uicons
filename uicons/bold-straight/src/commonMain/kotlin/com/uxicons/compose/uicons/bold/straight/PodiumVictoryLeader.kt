package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumVictoryLeader: ImageVector? = null

val Icons.Bs.PodiumVictoryLeader: ImageVector
    get() = _PodiumVictoryLeader ?: UXIcon(name = "PodiumVictoryLeader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 18f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(18f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(12f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.11f, 3.5f)
                lineToRelative(-2.23f, -2.01f)
                lineToRelative(-4.05f, 4.5f)
                horizontalLineToRelative(-3.66f)
                lineTo(6.12f, 1.5f)
                lineToRelative(-2.23f, 2.01f)
                lineToRelative(4.12f, 4.57f)
                verticalLineToRelative(7.92f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.92f)
                lineToRelative(4.12f, -4.57f)
                close()
            }
        }.also { _PodiumVictoryLeader = it}
