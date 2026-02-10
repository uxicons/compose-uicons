package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Happy: ImageVector? = null

val Icons.Bs.Happy: ImageVector
    get() = _Happy ?: UXIcon(name = "Happy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(17.5f, 15.82f)
                lineTo(15.51f, 13.58f)
                arcTo(6.15f, 6.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.5f, -1.42f)
                lineToRelative(-2f, 2.24f)
                arcTo(9.17f, 9.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(9.17f, 9.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 15.82f)
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
        }.also { _Happy = it}
