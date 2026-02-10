package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Arrows: ImageVector? = null

val Icons.Ts.Arrows: ImageVector
    get() = _Arrows ?: UXIcon(name = "Arrows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.68f, 7.7f)
                lineTo(0.44f, 10.94f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.1f, -3.1f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(10.24f)
                lineToRelative(-3.1f, -3.1f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(3.24f, -3.24f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.1f, 3.1f)
                verticalLineTo(12.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(-3.1f, 3.1f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.24f, -3.24f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.1f, 3.1f)
                horizontalLineTo(12.5f)
                verticalLineTo(1.29f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(0.71f, -0.71f)
                lineTo(13.06f, 0.44f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-3.24f, 3.24f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.1f, -3.1f)
                verticalLineTo(11.5f)
                horizontalLineTo(1.29f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _Arrows = it}
