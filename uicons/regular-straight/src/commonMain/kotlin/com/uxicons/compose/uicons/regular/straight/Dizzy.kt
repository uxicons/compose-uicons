package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dizzy: ImageVector? = null

val Icons.Rs.Dizzy: ImageVector
    get() = _Dizzy ?: UXIcon(name = "Dizzy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(15f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                close()
                moveTo(18.98f, 7.43f)
                lineTo(17.41f, 9f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(16f, 10.41f)
                lineToRelative(-1.57f, 1.57f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(14.59f, 9f)
                lineTo(13.02f, 7.43f)
                lineToRelative(1.41f, -1.41f)
                lineTo(16f, 7.59f)
                lineToRelative(1.57f, -1.57f)
                close()
                moveTo(8f, 10.41f)
                lineTo(6.43f, 11.98f)
                lineTo(5.02f, 10.57f)
                lineTo(6.59f, 9f)
                lineTo(5.02f, 7.43f)
                lineTo(6.43f, 6.02f)
                lineTo(8f, 7.59f)
                lineTo(9.57f, 6.02f)
                lineToRelative(1.41f, 1.41f)
                lineTo(9.41f, 9f)
                lineToRelative(1.57f, 1.57f)
                lineTo(9.57f, 11.98f)
                close()
            }
        }.also { _Dizzy = it}
