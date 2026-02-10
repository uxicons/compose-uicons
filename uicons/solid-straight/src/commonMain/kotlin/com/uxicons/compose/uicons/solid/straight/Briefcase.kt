package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Briefcase: ImageVector? = null

val Icons.Ss.Briefcase: ImageVector
    get() = _Briefcase ?: UXIcon(name = "Briefcase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14f)
                lineToRelative(0f, 2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-11f, 0f)
                lineToRelative(0f, 10f)
                lineToRelative(24f, 0f)
                lineToRelative(0f, -10f)
                lineToRelative(-11f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                verticalLineToRelative(5f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                close()
            }
        }.also { _Briefcase = it}
