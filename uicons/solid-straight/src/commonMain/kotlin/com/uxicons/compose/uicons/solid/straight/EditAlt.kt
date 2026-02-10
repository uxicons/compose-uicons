package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditAlt: ImageVector? = null

val Icons.Ss.EditAlt: ImageVector
    get() = _EditAlt ?: UXIcon(name = "EditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.41f)
                lineToRelative(4.41f, -4.41f)
                lineToRelative(-4.41f, 0f)
                lineToRelative(0f, 4.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.42f, 1.57f)
                arcToRelative(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, 0.08f)
                lineToRelative(-8.76f, 9.7f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.46f, 2.09f)
                lineToRelative(9.12f, -9.12f)
                arcTo(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.42f, 1.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.98f, 15.58f)
                quadTo(15f, 15.79f, 15f, 16f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.97f, -2.33f)
                curveToRelative(0.45f, -2.73f, 2.31f, -7.26f, 6.4f, -7.64f)
                lineTo(19.11f, 0.31f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.42f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineToRelative(7f)
                verticalLineTo(6.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                reflectiveCurveToRelative(1f, -6f, 5f, -6f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
            }
        }.also { _EditAlt = it}
