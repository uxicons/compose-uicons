package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttentionDetail: ImageVector? = null

val Icons.Bs.AttentionDetail: ImageVector
    get() = _AttentionDetail ?: UXIcon(name = "AttentionDetail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 16f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.16f, 19.04f)
                curveToRelative(0.53f, -0.89f, 0.84f, -1.93f, 0.84f, -3.04f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.11f, 0f, 2.15f, -0.31f, 3.04f, -0.84f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.74f, -2.74f)
                close()
                moveTo(16f, 19f)
                curveToRelative(-2.77f, 0f, -4.12f, -2.23f, -4.5f, -3f)
                curveToRelative(0.39f, -0.78f, 1.73f, -3f, 4.5f, -3f)
                reflectiveCurveToRelative(4.12f, 2.22f, 4.5f, 3f)
                curveToRelative(-0.39f, 0.78f, -1.73f, 3f, -4.5f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.38f, 0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-0.26f)
                curveToRelative(-1.7f, -0.44f, -3.17f, -1.41f, -4.24f, -2.74f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2.34f)
                lineTo(14.38f, 0f)
                close()
            }
        }.also { _AttentionDetail = it}
