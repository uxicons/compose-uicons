package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keynote: ImageVector? = null

val Icons.Bs.Keynote: ImageVector
    get() = _Keynote ?: UXIcon(name = "Keynote") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.02f, 18.02f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2.31f, -6.02f)
                horizontalLineTo(5.98f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.46f, 0.61f, 1.18f, 1f, 2f, 1f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.82f, 0f, -1.54f, 0.39f, -2f, 1f)
                horizontalLineToRelative(-0.75f)
                curveTo(5.45f, 1f, 2.98f, 3.47f, 2.98f, 6.5f)
                verticalLineToRelative(3.77f)
                lineToRelative(-1.83f, 4.75f)
                horizontalLineTo(0.02f)
                verticalLineToRelative(3f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2.98f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.98f)
                horizontalLineToRelative(10.52f)
                close()
                moveTo(5.53f, 12f)
                horizontalLineToRelative(12.94f)
                lineToRelative(1.16f, 3.02f)
                horizontalLineTo(4.37f)
                lineToRelative(1.16f, -3.02f)
                close()
            }
        }.also { _Keynote = it}
