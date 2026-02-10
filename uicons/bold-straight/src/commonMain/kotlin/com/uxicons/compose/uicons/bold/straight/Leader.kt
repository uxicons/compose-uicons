package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leader: ImageVector? = null

val Icons.Bs.Leader: ImageVector
    get() = _Leader ?: UXIcon(name = "Leader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                lineTo(2f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.59f)
                lineTo(0.98f, 2.6f)
                lineTo(3.02f, 0.4f)
                lineToRelative(6.07f, 5.6f)
                horizontalLineToRelative(4.41f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                close()
                moveTo(11f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Leader = it}
