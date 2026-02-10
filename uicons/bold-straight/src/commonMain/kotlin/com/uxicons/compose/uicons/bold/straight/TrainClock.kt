package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Bs.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 14f)
                horizontalLineToRelative(6.01f)
                curveToRelative(-0.66f, 0.87f, -1.13f, 1.89f, -1.36f, 3f)
                horizontalLineToRelative(-4.65f)
                close()
                moveTo(24f, 15.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4.65f)
                curveToRelative(-0.23f, -1.11f, -0.7f, -2.13f, -1.36f, -3f)
                horizontalLineToRelative(2.92f)
                curveToRelative(-0.22f, -1.82f, -0.84f, -3.51f, -1.75f, -5f)
                horizontalLineToRelative(-19.16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.5f)
                curveToRelative(8.55f, 0f, 15.5f, 6.95f, 15.5f, 15.5f)
                close()
                moveTo(12f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.6f)
                curveToRelative(-1.33f, -1.13f, -2.88f, -2.0f, -4.6f, -2.5f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.98f)
                curveToRelative(-0.17f, -0.01f, -0.33f, -0.02f, -0.5f, -0.02f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(17.5f, 18.5f)
                curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.46f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.46f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.46f, 5.5f, 5.5f)
                close()
                moveTo(15.21f, 20.29f)
                lineTo(13f, 18.09f)
                verticalLineToRelative(-3.09f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.91f)
                lineToRelative(2.79f, 2.79f)
                close()
            }
        }.also { _TrainClock = it}
