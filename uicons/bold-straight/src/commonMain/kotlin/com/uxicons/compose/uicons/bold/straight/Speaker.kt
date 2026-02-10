package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Bs.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(3f, 24f)
                lineTo(21f, 24f)
                lineTo(21f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 3f)
                lineTo(18f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.5f, 15f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                close()
                moveTo(12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.5f)
                close()
            }
        }.also { _Speaker = it}
