package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanClock: ImageVector? = null

val Icons.Bs.TrashCanClock: ImageVector
    get() = _TrashCanClock ?: UXIcon(name = "TrashCanClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.02f, 24f)
                horizontalLineToRelative(-7.52f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 6f)
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
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.37f)
                curveToRelative(-0.79f, -0.24f, -1.63f, -0.37f, -2.5f, -0.37f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.01f, -0.5f, 0.01f)
                verticalLineToRelative(-3.02f)
                lineTo(5f, 6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(4.75f)
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
                moveTo(10f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.01f, -0.17f, -0.01f, -0.33f, -0.01f, -0.5f)
                curveToRelative(0f, -1.45f, 0.36f, -2.81f, 1f, -4.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _TrashCanClock = it}
