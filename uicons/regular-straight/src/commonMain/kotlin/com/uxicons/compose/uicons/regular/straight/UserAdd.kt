package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Rs.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                close()
                moveTo(9f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                lineToRelative(0f, -3f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-3f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 14f)
                horizontalLineTo(4.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18.96f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                verticalLineTo(18.96f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, 16f)
                horizontalLineToRelative(8.09f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18.96f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(18.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 14f)
                close()
            }
        }.also { _UserAdd = it}
