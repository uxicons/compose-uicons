package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Rs.Picnic: ImageVector
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
                moveTo(18.2f, 10f)
                lineTo(14f, 14.21f)
                lineTo(9.79f, 10f)
                close()
                moveTo(20.11f, 21.14f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, 0.86f)
                lineTo(4.88f, 22f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, -0.86f)
                lineTo(2.3f, 10f)
                lineTo(6.97f, 10f)
                lineTo(14f, 17.04f)
                lineTo(21.02f, 10f)
                lineTo(21.7f, 10f)
                close()
            }
        }.also { _Picnic = it}
