package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileLoop: ImageVector? = null

val Icons.Bs.FileLoop: ImageVector
    get() = _FileLoop ?: UXIcon(name = "FileLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.18f, 21f)
                curveToRelative(0.27f, 1.15f, 0.82f, 2.18f, 1.59f, 3f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(14.38f, 0f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(7.35f)
                curveToRelative(-0.1f, -0.01f, -0.21f, -0.02f, -0.31f, -0.02f)
                curveToRelative(-0.97f, 0f, -1.87f, 0.24f, -2.69f, 0.63f)
                verticalLineToRelative(-5.63f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 21f)
                horizontalLineToRelative(3.18f)
                close()
                moveTo(24f, 19.5f)
                curveToRelative(0f, 2.48f, -1.94f, 4.5f, -4.31f, 4.5f)
                curveToRelative(-1.6f, 0f, -2.83f, -0.92f, -3.69f, -1.86f)
                curveToRelative(-0.85f, 0.94f, -2.09f, 1.86f, -3.69f, 1.86f)
                curveToRelative(-2.38f, 0f, -4.31f, -2.02f, -4.31f, -4.5f)
                reflectiveCurveToRelative(1.94f, -4.5f, 4.31f, -4.5f)
                curveToRelative(1.6f, 0f, 2.83f, 0.92f, 3.69f, 1.86f)
                curveToRelative(0.85f, -0.94f, 2.09f, -1.86f, 3.69f, -1.86f)
                curveToRelative(2.38f, 0f, 4.31f, 2.02f, 4.31f, 4.5f)
                close()
                moveTo(14.26f, 19.5f)
                curveToRelative(-0.48f, -0.7f, -1.23f, -1.5f, -1.95f, -1.5f)
                reflectiveCurveToRelative(-1.31f, 0.67f, -1.31f, 1.5f)
                reflectiveCurveToRelative(0.59f, 1.5f, 1.31f, 1.5f)
                reflectiveCurveToRelative(1.48f, -0.81f, 1.95f, -1.5f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, -0.83f, -0.59f, -1.5f, -1.31f, -1.5f)
                reflectiveCurveToRelative(-1.48f, 0.81f, -1.95f, 1.5f)
                curveToRelative(0.48f, 0.7f, 1.23f, 1.5f, 1.95f, 1.5f)
                reflectiveCurveToRelative(1.31f, -0.67f, 1.31f, -1.5f)
                close()
            }
        }.also { _FileLoop = it}
