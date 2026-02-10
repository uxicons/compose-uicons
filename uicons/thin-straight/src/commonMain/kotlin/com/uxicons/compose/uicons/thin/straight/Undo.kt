package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Ts.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(7.97f, 0f, 4.21f, 2.04f, 2f, 5.37f)
                verticalLineTo(0f)
                horizontalLineTo(1f)
                verticalLineTo(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2.78f)
                curveTo(4.8f, 2.9f, 8.28f, 1f, 12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.07f, 1f, 12f)
                horizontalLineTo(0f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _Undo = it}
