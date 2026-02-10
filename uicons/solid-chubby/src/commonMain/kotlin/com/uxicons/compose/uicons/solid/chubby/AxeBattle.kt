package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Sc.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 14f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.25f, 2.14f)
                curveToRelative(-0.47f, -0.56f, -0.95f, -1.14f, -1.75f, -1.14f)
                curveToRelative(-2.65f, 0f, -5.5f, 3.06f, -5.5f, 8f)
                curveToRelative(0f, 5.01f, 2.8f, 8f, 5.5f, 8f)
                curveToRelative(0.8f, 0f, 1.28f, -0.58f, 1.75f, -1.14f)
                curveToRelative(0.51f, -0.61f, 1.1f, -1.52f, 2.25f, -1.86f)
                verticalLineToRelative(-10f)
                curveToRelative(-1.15f, -0.34f, -1.74f, -1.25f, -2.25f, -1.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 1f)
                curveToRelative(-0.8f, 0f, -1.28f, 0.58f, -1.75f, 1.14f)
                curveToRelative(-0.51f, 0.61f, -1.1f, 1.52f, -2.25f, 1.86f)
                verticalLineToRelative(10f)
                curveToRelative(1.15f, 0.34f, 1.74f, 1.25f, 2.25f, 1.86f)
                curveToRelative(0.47f, 0.56f, 0.95f, 1.14f, 1.75f, 1.14f)
                curveToRelative(2.7f, 0f, 5.5f, -2.99f, 5.5f, -8f)
                curveToRelative(0f, -4.94f, -2.85f, -8f, -5.5f, -8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _AxeBattle = it}
