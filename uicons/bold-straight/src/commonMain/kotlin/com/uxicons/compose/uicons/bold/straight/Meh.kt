package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meh: ImageVector? = null

val Icons.Bs.Meh: ImageVector
    get() = _Meh ?: UXIcon(name = "Meh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(6f, 9.67f)
                lineTo(6f, 11f)
                horizontalLineToRelative(5f)
                lineTo(11f, 9.67f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 7f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9.67f)
                close()
                moveTo(13f, 9.67f)
                lineTo(13f, 11f)
                horizontalLineToRelative(5f)
                lineTo(18f, 9.67f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 7f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.67f)
                close()
                moveTo(16f, 14f)
                lineTo(8f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Meh = it}
