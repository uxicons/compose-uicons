package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Bs.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.98f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(16.5f, 12.98f)
                lineToRelative(-2.67f, 1.33f)
                curveToRelative(0.11f, 0.44f, 0.16f, 0.9f, 0.16f, 1.37f)
                curveToRelative(0f, 1.52f, -0.59f, 2.95f, -1.67f, 4.03f)
                curveToRelative(-1.81f, 1.81f, -8.12f, 3.31f, -10.01f, 3.73f)
                lineTo(0.03f, 23.96f)
                lineToRelative(0.51f, -2.3f)
                curveToRelative(0.42f, -1.89f, 1.93f, -8.2f, 3.73f, -10.01f)
                curveToRelative(1.08f, -1.08f, 2.51f, -1.67f, 4.03f, -1.67f)
                curveToRelative(0.47f, 0f, 0.93f, 0.06f, 1.37f, 0.17f)
                lineToRelative(1.33f, -2.66f)
                lineToRelative(1.69f, 1.69f)
                lineTo(21.86f, 0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-9.17f, 9.17f)
                lineToRelative(1.69f, 1.69f)
                close()
                moveTo(11f, 15.68f)
                curveToRelative(0f, -0.72f, -0.28f, -1.4f, -0.79f, -1.91f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.51f, -0.51f, -1.19f, -0.79f, -1.91f, -0.79f)
                reflectiveCurveToRelative(-1.4f, 0.28f, -1.91f, 0.79f)
                curveToRelative(-0.64f, 0.64f, -1.59f, 3.35f, -2.34f, 6.16f)
                curveToRelative(2.81f, -0.75f, 5.52f, -1.71f, 6.16f, -2.34f)
                curveToRelative(0.51f, -0.51f, 0.79f, -1.19f, 0.79f, -1.91f)
                close()
            }
        }.also { _BroomBall = it}
