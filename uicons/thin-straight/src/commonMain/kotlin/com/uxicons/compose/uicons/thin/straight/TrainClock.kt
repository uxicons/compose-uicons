package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Ts.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 15f)
                horizontalLineToRelative(4.59f)
                curveToRelative(-0.13f, 0.32f, -0.24f, 0.66f, -0.33f, 1f)
                horizontalLineToRelative(-4.26f)
                close()
                moveTo(18f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(17f, 18f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(12.5f, 14.79f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.42f)
                lineToRelative(1.98f, 1.98f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.69f, -1.69f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.26f)
                curveToRelative(-0.09f, -0.34f, -0.19f, -0.68f, -0.33f, -1f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.98f, -0.47f, -3.84f, -1.29f, -5.5f)
                horizontalLineToRelative(-21.71f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(7.44f, 0f, 13.5f, 6.06f, 13.5f, 13.5f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.97f)
                curveToRelative(-0.17f, -0.01f, -0.33f, -0.03f, -0.5f, -0.03f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(21.16f, 7f)
                curveToRelative(-1.95f, -3.19f, -5.28f, -5.43f, -9.16f, -5.9f)
                verticalLineToRelative(5.9f)
                close()
            }
        }.also { _TrainClock = it}
