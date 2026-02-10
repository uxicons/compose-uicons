package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Ss.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(16f, 1f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                horizontalLineToRelative(-2f)
                verticalLineTo(13f)
                horizontalLineToRelative(-5.83f)
                lineToRelative(3.83f, 9f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-3.69f, -9f)
                horizontalLineToRelative(-1.61f)
                lineTo(2.32f, 22f)
                horizontalLineTo(0f)
                lineTo(5.5f, 10.12f)
                curveToRelative(0.7f, -1.31f, 2.05f, -2.12f, 3.53f, -2.12f)
                horizontalLineToRelative(6.97f)
                verticalLineTo(1f)
                close()
            }
        }.also { _YogaMoon = it}
