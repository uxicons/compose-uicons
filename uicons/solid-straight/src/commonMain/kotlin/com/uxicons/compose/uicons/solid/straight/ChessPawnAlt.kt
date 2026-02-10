package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Ss.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(8.56f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                close()
                moveTo(22f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineTo(22f)
                close()
                moveTo(15.07f, 10f)
                horizontalLineTo(8.93f)
                curveTo(8.56f, 15.26f, 6.77f, 18f, 5f, 18f)
                horizontalLineTo(19f)
                curveTo(17.23f, 18f, 15.44f, 15.26f, 15.07f, 10f)
                close()
            }
        }.also { _ChessPawnAlt = it}
