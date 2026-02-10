package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bomb: ImageVector? = null

val Icons.Bs.Bomb: ImageVector
    get() = _Bomb ?: UXIcon(name = "Bomb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 8f)
                lineToRelative(-1.33f, -2.67f)
                lineTo(0f, 4f)
                lineToRelative(2.67f, -1.33f)
                lineTo(4f, 0f)
                lineToRelative(1.33f, 2.67f)
                lineToRelative(2.67f, 1.33f)
                lineToRelative(-2.67f, 1.33f)
                lineToRelative(-1.33f, 2.67f)
                close()
                moveTo(21.9f, 1.68f)
                curveTo(20.78f, 0.56f, 19.24f, -0.06f, 17.68f, 0.0f)
                curveToRelative(-4.96f, 0.17f, -8.65f, 0.94f, -8.81f, 0.97f)
                lineToRelative(0.62f, 2.94f)
                curveToRelative(0.04f, -0.01f, 3.59f, -0.75f, 8.29f, -0.91f)
                curveToRelative(0.75f, -0.03f, 1.47f, 0.27f, 2f, 0.8f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.78f, 0f, 1.08f)
                lineToRelative(-0.31f, 0.31f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.31f, -0.31f)
                curveToRelative(1.47f, -1.47f, 1.47f, -3.85f, 0f, -5.32f)
                close()
                moveTo(21.6f, 9.53f)
                lineToRelative(-1.51f, 1.51f)
                curveToRelative(0.6f, 1.23f, 0.91f, 2.57f, 0.91f, 3.96f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                reflectiveCurveTo(7.04f, 6f, 12f, 6f)
                curveToRelative(1.38f, 0f, 2.72f, 0.31f, 3.94f, 0.91f)
                lineToRelative(1.51f, -1.51f)
                lineToRelative(4.14f, 4.14f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _Bomb = it}
