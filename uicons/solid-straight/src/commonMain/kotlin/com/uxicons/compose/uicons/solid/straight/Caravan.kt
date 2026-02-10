package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Ss.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                horizontalLineToRelative(3f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
                moveTo(8f, 8f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                close()
                moveTo(24f, 19f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(17.34f)
                curveTo(8.89f, 12.79f, 1.47f, 15.43f, 2.02f, 21f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(19f)
                close()
                moveTo(10f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                close()
                moveTo(7.5f, 17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 17f)
                close()
            }
        }.also { _Caravan = it}
