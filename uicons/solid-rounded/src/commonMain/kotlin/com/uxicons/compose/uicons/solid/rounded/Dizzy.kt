package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dizzy: ImageVector? = null

val Icons.Sr.Dizzy: ImageVector
    get() = _Dizzy ?: UXIcon(name = "Dizzy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 12f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, -1.71f)
                lineTo(6.59f, 9f)
                lineTo(5.29f, 7.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.71f, 6.29f)
                lineTo(8f, 7.59f)
                lineTo(9.29f, 6.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineTo(9.41f, 9f)
                lineToRelative(1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(8f, 10.41f)
                lineTo(6.71f, 11.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
                moveTo(12f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
                moveTo(18.71f, 10.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(16f, 10.41f)
                lineToRelative(-1.29f, 1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineTo(14.59f, 9f)
                lineTo(13.29f, 7.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineTo(16f, 7.59f)
                lineToRelative(1.29f, -1.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineTo(17.41f, 9f)
                close()
            }
        }.also { _Dizzy = it}
