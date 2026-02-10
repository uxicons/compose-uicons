package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Ss.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                moveToRelative(-6f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 14f)
                horizontalLineTo(4.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.96f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                verticalLineTo(18.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 14f)
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
