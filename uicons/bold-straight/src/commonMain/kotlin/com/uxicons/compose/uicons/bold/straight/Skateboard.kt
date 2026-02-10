package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skateboard: ImageVector? = null

val Icons.Bs.Skateboard: ImageVector
    get() = _Skateboard ?: UXIcon(name = "Skateboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.69f, 2.31f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.16f, 0f)
                lineToRelative(-8.22f, 8.22f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.16f, 11.16f)
                lineToRelative(8.22f, -8.22f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.16f)
                close()
                moveTo(19.57f, 11.35f)
                lineTo(11.35f, 19.57f)
                arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.92f, -6.92f)
                lineToRelative(8.22f, -8.22f)
                arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.92f, 6.92f)
                close()
                moveTo(17.94f, 6.94f)
                lineTo(20.06f, 9.06f)
                lineTo(16.06f, 13.06f)
                lineTo(13.94f, 10.94f)
                lineTo(14.88f, 10f)
                lineTo(14f, 9.12f)
                lineTo(13.06f, 10.06f)
                lineTo(10.94f, 7.94f)
                lineTo(14.94f, 3.94f)
                lineTo(17.06f, 6.06f)
                lineTo(16.12f, 7f)
                lineTo(17f, 7.88f)
                close()
                moveTo(10.94f, 13.94f)
                lineTo(13.06f, 16.06f)
                lineTo(9.02f, 20.11f)
                lineTo(6.9f, 17.98f)
                lineTo(7.88f, 17f)
                lineTo(7f, 16.12f)
                lineTo(6.02f, 17.11f)
                lineTo(3.9f, 14.98f)
                lineTo(7.94f, 10.94f)
                lineTo(10.07f, 13.06f)
                lineTo(9.12f, 14f)
                lineTo(10f, 14.88f)
                close()
            }
        }.also { _Skateboard = it}
