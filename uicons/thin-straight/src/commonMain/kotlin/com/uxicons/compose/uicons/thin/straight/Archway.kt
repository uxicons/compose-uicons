package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Ts.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.65f)
                verticalLineTo(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(1.65f)
                lineToRelative(2f, 3f)
                verticalLineTo(22f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5.65f)
                lineToRelative(2f, -3f)
                close()
                moveTo(1f, 2f)
                horizontalLineTo(23f)
                verticalLineToRelative(0.35f)
                lineToRelative(-1.77f, 2.65f)
                horizontalLineTo(2.77f)
                lineTo(1f, 2.35f)
                verticalLineToRelative(-0.35f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(6f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Archway = it}
