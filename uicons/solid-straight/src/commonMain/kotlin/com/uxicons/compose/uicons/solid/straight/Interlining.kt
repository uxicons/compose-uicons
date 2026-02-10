package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interlining: ImageVector? = null

val Icons.Ss.Interlining: ImageVector
    get() = _Interlining ?: UXIcon(name = "Interlining") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6f)
                lineTo(4.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(0f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                lineToRelative(3.29f, 3.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineTo(8f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Interlining = it}
