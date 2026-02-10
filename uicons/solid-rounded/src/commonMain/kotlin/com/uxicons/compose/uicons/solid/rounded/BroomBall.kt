package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Sr.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(14.47f, 10.94f)
                lineTo(23.71f, 1.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-9.23f, 9.23f)
                lineToRelative(-1.16f, -1.16f)
                curveToRelative(-0.61f, -0.61f, -1.63f, -0.44f, -2.01f, 0.33f)
                lineToRelative(-0.7f, 2.59f)
                curveToRelative(-0.54f, -0.17f, -1.1f, -0.29f, -1.69f, -0.29f)
                curveToRelative(-1.47f, 0f, -2.85f, 0.57f, -3.89f, 1.61f)
                curveTo(1.93f, 14.29f, 0.36f, 20.13f, 0.07f, 21.29f)
                curveToRelative(-0.19f, 0.75f, 0.02f, 1.53f, 0.57f, 2.08f)
                curveToRelative(0.41f, 0.41f, 0.96f, 0.64f, 1.53f, 0.64f)
                curveToRelative(0.18f, 0f, 0.37f, -0.02f, 0.55f, -0.07f)
                curveToRelative(1.15f, -0.29f, 6.99f, -1.85f, 8.68f, -3.54f)
                curveToRelative(1.04f, -1.04f, 1.61f, -2.42f, 1.61f, -3.89f)
                curveToRelative(0f, -0.59f, -0.12f, -1.15f, -0.29f, -1.69f)
                lineToRelative(2.59f, -0.7f)
                curveToRelative(0.77f, -0.38f, 0.93f, -1.41f, 0.33f, -2.01f)
                lineToRelative(-1.15f, -1.15f)
                close()
            }
        }.also { _BroomBall = it}
