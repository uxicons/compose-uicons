package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Ss.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.07f, 18f)
                horizontalLineTo(19.72f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, -4.02f)
                lineTo(19.69f, 6.09f)
                arcTo(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.68f, 0f)
                horizontalLineToRelative(0f)
                arcTo(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.55f, 6.52f)
                lineToRelative(-2.35f, 7.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, 18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.1f, 20f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.8f, 0f)
                close()
            }
        }.also { _Bell = it}
