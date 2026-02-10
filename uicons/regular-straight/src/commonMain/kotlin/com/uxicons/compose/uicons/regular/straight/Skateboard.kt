package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skateboard: ImageVector? = null

val Icons.Rs.Skateboard: ImageVector
    get() = _Skateboard ?: UXIcon(name = "Skateboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.84f, 2.17f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.45f, 0f)
                lineToRelative(-9.22f, 9.22f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.45f, 10.45f)
                lineToRelative(9.22f, -9.22f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -10.45f)
                close()
                moveTo(20.42f, 11.2f)
                lineTo(11.2f, 20.42f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.62f, -7.62f)
                lineToRelative(9.22f, -9.22f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.62f, 7.62f)
                close()
                moveTo(18.29f, 8.29f)
                lineTo(19.71f, 9.71f)
                lineTo(16.71f, 12.71f)
                lineTo(15.29f, 11.29f)
                lineTo(16.09f, 10.5f)
                lineTo(13.5f, 7.91f)
                lineTo(12.71f, 8.71f)
                lineTo(11.29f, 7.29f)
                lineTo(14.29f, 4.29f)
                lineTo(15.71f, 5.71f)
                lineTo(14.91f, 6.5f)
                lineTo(17.5f, 9.09f)
                close()
                moveTo(11.29f, 15.29f)
                lineTo(12.71f, 16.71f)
                lineTo(9.71f, 19.71f)
                lineTo(8.29f, 18.29f)
                lineTo(9.09f, 17.5f)
                lineTo(6.5f, 14.91f)
                lineTo(5.71f, 15.71f)
                lineTo(4.29f, 14.29f)
                lineTo(7.29f, 11.29f)
                lineTo(8.71f, 12.71f)
                lineTo(7.91f, 13.5f)
                lineTo(10.5f, 16.09f)
                close()
            }
        }.also { _Skateboard = it}
