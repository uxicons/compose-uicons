package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Sr.Picnic: ImageVector
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
                moveTo(5.09f, 8f)
                curveTo(6.36f, 0.06f, 17.65f, 0.07f, 18.91f, 8f)
                close()
                moveTo(20.32f, 11.71f)
                lineTo(15.76f, 16.27f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.53f, 0f)
                lineTo(7.67f, 11.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(4.56f, 4.56f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0f)
                lineToRelative(4.56f, -4.56f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.32f, 11.71f)
                close()
            }
        }.also { _Picnic = it}
