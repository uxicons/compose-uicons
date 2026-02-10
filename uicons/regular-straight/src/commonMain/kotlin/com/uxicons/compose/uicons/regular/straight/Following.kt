package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Rs.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                close()
                moveTo(9f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                horizontalLineTo(16f)
                verticalLineTo(18.96f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 16f)
                horizontalLineTo(4.96f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18.96f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(18.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, 14f)
                horizontalLineToRelative(8.09f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7.88f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.2f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.2f)
                arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.2f)
                curveToRelative(0f, 2.3f, 4f, 5.13f, 4f, 5.13f)
                reflectiveCurveToRelative(4f, -2.83f, 4f, -5.13f)
                arcTo(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 7.88f)
                close()
            }
        }.also { _Following = it}
