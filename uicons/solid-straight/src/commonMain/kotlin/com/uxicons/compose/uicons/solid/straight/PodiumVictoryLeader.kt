package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumVictoryLeader: ImageVector? = null

val Icons.Ss.PodiumVictoryLeader: ImageVector
    get() = _PodiumVictoryLeader ?: UXIcon(name = "PodiumVictoryLeader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(9f, 7.94f)
                lineTo(4.26f, 2.67f)
                lineToRelative(1.49f, -1.34f)
                lineToRelative(4.2f, 4.67f)
                horizontalLineToRelative(4.11f)
                lineToRelative(4.2f, -4.67f)
                lineToRelative(1.49f, 1.34f)
                lineToRelative(-4.74f, 5.27f)
                verticalLineToRelative(8.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                lineTo(9.0f, 7.94f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(4.5f, 20f)
                lineTo(1.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 21f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _PodiumVictoryLeader = it}
