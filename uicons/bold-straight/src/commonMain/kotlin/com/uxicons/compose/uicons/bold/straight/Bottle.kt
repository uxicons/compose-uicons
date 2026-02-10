package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Bs.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.81f, 7.84f)
                lineTo(16f, 6.15f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(6.15f)
                lineTo(5.18f, 7.84f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.7f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                verticalLineTo(11.7f)
                arcTo(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.81f, 7.84f)
                close()
                moveTo(18f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(11.7f)
                arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, -1.29f)
                lineTo(11f, 7.85f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.85f)
                lineToRelative(4.27f, 2.56f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11.7f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineTo(8f)
                close()
            }
        }.also { _Bottle = it}
