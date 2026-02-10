package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Ts.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 4.85f)
                lineTo(18.85f, 0.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.85f, 1.85f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(5.91f)
                curveToRelative(0f, -0.4f, -0.16f, -0.78f, -0.44f, -1.06f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineTo(12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(1f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineToRelative(13f)
                horizontalLineTo(1f)
                close()
                moveTo(21.5f, 7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineTo(3.71f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.09f, 0.09f, 0.15f, 0.22f, 0.15f, 0.35f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.also { _GasPump = it}
