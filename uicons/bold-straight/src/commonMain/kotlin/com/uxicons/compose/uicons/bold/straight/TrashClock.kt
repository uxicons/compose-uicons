package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Bs.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.03f, 24f)
                horizontalLineToRelative(-5.69f)
                curveToRelative(-1.81f, 0f, -3.34f, -1.41f, -3.49f, -3.21f)
                lineTo(1.62f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-0.28f, 3.41f)
                curveToRelative(-0.82f, -0.26f, -1.69f, -0.41f, -2.6f, -0.41f)
                curveToRelative(-0.13f, 0f, -0.26f, 0.0f, -0.38f, 0.01f)
                lineToRelative(0.25f, -3.01f)
                lineTo(4.63f, 6f)
                lineToRelative(1.21f, 14.54f)
                curveToRelative(0.02f, 0.26f, 0.23f, 0.46f, 0.5f, 0.46f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.53f, 1.16f, 1.31f, 2.19f, 2.27f, 3f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(20.9f, 18.78f)
                lineToRelative(-1.9f, -1.9f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.12f)
                lineToRelative(2.78f, 2.78f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _TrashClock = it}
