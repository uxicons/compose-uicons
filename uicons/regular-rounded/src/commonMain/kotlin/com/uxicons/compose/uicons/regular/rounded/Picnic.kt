package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Rr.Picnic: ImageVector
    get() = _Picnic ?: UXIcon(name = "Picnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.28f, 9.03f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.93f, 8f)
                curveTo(19.5f, -2.6f, 4.49f, -2.59f, 3.07f, 8f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, 11.43f)
                lineToRelative(1.06f, 7.42f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.04f, 24f)
                horizontalLineToRelative(9.96f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.93f, -5.15f)
                lineToRelative(1.06f, -7.42f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.28f, 9.03f)
                close()
                moveTo(12f, 2f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.91f, 6f)
                lineTo(5.09f, 8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(18.2f, 10f)
                lineTo(14.35f, 13.86f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineTo(9.79f, 10f)
                close()
                moveTo(20.95f, 18.57f)
                arcTo(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.99f, 22f)
                lineTo(7.04f, 22f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.96f, -3.44f)
                lineTo(2.02f, 11.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 10f)
                lineTo(6.97f, 10f)
                lineToRelative(5.26f, 5.27f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.53f, 0f)
                lineTo(21.03f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, 1.14f)
                close()
            }
        }.also { _Picnic = it}
