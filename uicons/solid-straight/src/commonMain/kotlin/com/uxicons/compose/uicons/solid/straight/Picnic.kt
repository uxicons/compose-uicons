package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Ss.Picnic: ImageVector
    get() = _Picnic ?: UXIcon(name = "Picnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.93f, 8f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.07f, 8f)
                lineTo(0f, 8f)
                lineTo(1.91f, 21.43f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.88f, 24f)
                lineTo(19.12f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.96f, -2.58f)
                lineTo(24f, 8f)
                close()
                moveTo(12f, 2f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.92f, 6f)
                lineTo(5.08f, 8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(14f, 17.04f)
                lineTo(6.97f, 10f)
                lineTo(9.79f, 10f)
                lineTo(14f, 14.21f)
                lineTo(18.2f, 10f)
                horizontalLineToRelative(2.82f)
                close()
            }
        }.also { _Picnic = it}
