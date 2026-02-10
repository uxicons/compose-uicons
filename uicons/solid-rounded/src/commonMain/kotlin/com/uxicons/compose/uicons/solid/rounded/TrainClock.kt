package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainClock: ImageVector? = null

val Icons.Sr.TrainClock: ImageVector
    get() = _TrainClock ?: UXIcon(name = "TrainClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.09f, 21f)
                lineTo(11.29f, 19.21f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.09f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
                moveTo(7f, 0f)
                horizontalLineToRelative(3.46f)
                curveToRelative(0.19f, 0f, 0.36f, 0.02f, 0.55f, 0.03f)
                verticalLineToRelative(5.97f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(13f, 0.24f)
                curveToRelative(3.76f, 0.72f, 6.57f, 3.0f, 8.48f, 5.76f)
                horizontalLineToRelative(-8.48f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                close()
                moveTo(23.22f, 14.36f)
                curveToRelative(-0.76f, 1.04f, -1.94f, 1.64f, -3.23f, 1.64f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-1.03f, -2.91f, -3.8f, -5f, -7.06f, -5f)
                reflectiveCurveToRelative(-6.03f, 2.09f, -7.06f, 5f)
                horizontalLineToRelative(-3.94f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(22.67f)
                curveToRelative(0.47f, 0.93f, 0.85f, 1.87f, 1.15f, 2.81f)
                curveToRelative(0.38f, 1.22f, 0.17f, 2.52f, -0.59f, 3.56f)
                close()
            }
        }.also { _TrainClock = it}
