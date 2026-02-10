package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Bs.Picnic: ImageVector
    get() = _Picnic ?: UXIcon(name = "Picnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 8f)
                lineTo(0.14f, 8f)
                lineToRelative(1.91f, 13.01f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.52f, 24f)
                lineTo(18.63f, 24f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, -2.99f)
                lineTo(24f, 8f)
                close()
                moveTo(12.06f, 3f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 5f)
                lineTo(6.15f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.06f, 3f)
                close()
                moveTo(19.12f, 20.57f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.43f)
                lineTo(5.52f, 21f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.43f)
                lineTo(3.62f, 11f)
                lineTo(9.06f, 11f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(5.5f, -5.5f)
                horizontalLineToRelative(0.47f)
                close()
            }
        }.also { _Picnic = it}
