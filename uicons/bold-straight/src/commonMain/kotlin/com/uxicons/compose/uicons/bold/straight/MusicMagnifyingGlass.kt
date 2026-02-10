package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MusicMagnifyingGlass: ImageVector? = null

val Icons.Bs.MusicMagnifyingGlass: ImageVector
    get() = _MusicMagnifyingGlass ?: UXIcon(name = "MusicMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                verticalLineToRelative(-3.55f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                verticalLineToRelative(-3.55f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.05f, 15.93f)
                curveToRelative(1.23f, -1.66f, 1.96f, -3.71f, 1.96f, -5.92f)
                curveTo(20.01f, 4.49f, 15.52f, 0.01f, 10.01f, 0.01f)
                reflectiveCurveTo(0.01f, 4.49f, 0.01f, 10.01f)
                curveToRelative(0f, 0.69f, 0.07f, 1.36f, 0.2f, 2.01f)
                curveToRelative(0.43f, -1.55f, 1.53f, -2.81f, 2.96f, -3.49f)
                curveToRelative(0.68f, -3.15f, 3.49f, -5.52f, 6.84f, -5.52f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 2.38f, -1.19f, 4.47f, -3.01f, 5.74f)
                verticalLineToRelative(3.42f)
                curveToRelative(0.69f, -0.3f, 1.33f, -0.68f, 1.93f, -1.12f)
                lineToRelative(5.94f, 5.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-5.95f, -5.95f)
                close()
            }
        }.also { _MusicMagnifyingGlass = it}
