package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Ss.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
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
        }.also { _UserAdd = it}
