package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Ss.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                horizontalLineToRelative(9f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(9f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(2f)
                horizontalLineTo(13f)
                verticalLineTo(8.95f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                reflectiveCurveToRelative(-0.67f, -0.02f, -1f, -0.05f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                horizontalLineTo(6.13f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                horizontalLineTo(6f)
                curveToRelative(0f, 2.88f, 1.97f, 4.31f, 4.15f, 4.8f)
                arcTo(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcToRelative(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.15f, 3.8f)
                curveTo(16.03f, 6.31f, 18f, 4.88f, 18f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.13f, 5f)
                horizontalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                close()
                moveTo(11f, 3f)
                arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.01f)
                arcTo(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                close()
            }
        }.also { _Gift = it}
