package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sad: ImageVector? = null

val Icons.Bs.Sad: ImageVector
    get() = _Sad ?: UXIcon(name = "Sad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(17.5f, 15.18f)
                arcTo(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcToRelative(9.16f, 9.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 2.18f)
                lineToRelative(1.99f, 2.24f)
                arcTo(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcToRelative(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.51f, 1.42f)
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
            }
        }.also { _Sad = it}
