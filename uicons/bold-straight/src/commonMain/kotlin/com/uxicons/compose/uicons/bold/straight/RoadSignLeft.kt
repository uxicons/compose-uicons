package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadSignLeft: ImageVector? = null

val Icons.Bs.RoadSignLeft: ImageVector
    get() = _RoadSignLeft ?: UXIcon(name = "RoadSignLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.02f, 13.51f)
                verticalLineToRelative(0.86f)
                lineToRelative(-3.01f, 3.01f)
                verticalLineToRelative(-3.87f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.51f)
                verticalLineToRelative(2.54f)
                lineToRelative(-3.17f, -3.24f)
                curveToRelative(-0.46f, -0.46f, -0.46f, -1.2f, 0f, -1.66f)
                lineToRelative(3.17f, -3.24f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(2.51f)
                curveToRelative(1.94f, 0f, 3.51f, 1.57f, 3.51f, 3.51f)
                close()
                moveTo(22.93f, 14.57f)
                lineToRelative(-8.36f, 8.36f)
                curveToRelative(-0.69f, 0.69f, -1.6f, 1.07f, -2.58f, 1.07f)
                reflectiveCurveToRelative(-1.89f, -0.38f, -2.58f, -1.07f)
                lineTo(1.07f, 14.57f)
                curveToRelative(-1.42f, -1.42f, -1.42f, -3.73f, 0f, -5.15f)
                lineTo(9.42f, 1.06f)
                curveToRelative(1.42f, -1.42f, 3.73f, -1.42f, 5.15f, 0f)
                lineToRelative(8.36f, 8.36f)
                curveToRelative(1.42f, 1.42f, 1.42f, 3.73f, 0f, 5.15f)
                close()
                moveTo(20.81f, 11.54f)
                lineTo(12.46f, 3.19f)
                curveToRelative(-0.25f, -0.25f, -0.66f, -0.25f, -0.91f, 0f)
                lineTo(3.19f, 11.54f)
                curveToRelative(-0.25f, 0.25f, -0.25f, 0.66f, 0f, 0.91f)
                lineToRelative(8.36f, 8.36f)
                curveToRelative(0.16f, 0.16f, 0.35f, 0.19f, 0.46f, 0.19f)
                reflectiveCurveToRelative(0.29f, -0.02f, 0.46f, -0.19f)
                lineToRelative(8.36f, -8.36f)
                curveToRelative(0.25f, -0.25f, 0.25f, -0.66f, 0f, -0.91f)
                close()
            }
        }.also { _RoadSignLeft = it}
