package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Turkey: ImageVector? = null

val Icons.Ss.Turkey: ImageVector
    get() = _Turkey ?: UXIcon(name = "Turkey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.57f, 15.43f)
                arcToRelative(5.22f, 5.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.37f)
                curveToRelative(1.88f, -1.88f, 6.3f, -2.08f, 6.8f, -2.1f)
                lineToRelative(0.4f, -0.01f)
                lineToRelative(0.43f, 0.43f)
                lineToRelative(1.58f, -1.58f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.06f, -0.65f)
                arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.31f, 2.22f)
                lineTo(19.61f, 7.8f)
                lineToRelative(0.43f, 0.43f)
                lineToRelative(-0.01f, 0.4f)
                curveToRelative(-0.02f, 0.5f, -0.22f, 4.92f, -2.1f, 6.8f)
                arcToRelative(5.22f, 5.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.37f, 0f)
                close()
                moveTo(21.56f, 12.32f)
                arcToRelative(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.21f, 4.53f)
                arcTo(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.86f, 6.98f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 15.97f)
                verticalLineToRelative(6.85f)
                lineToRelative(0.83f, 0.14f)
                arcToRelative(82.08f, 82.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.16f, 1.01f)
                curveToRelative(5.6f, 0f, 15f, -0.78f, 15f, -6f)
                arcTo(8.84f, 8.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.56f, 12.32f)
                close()
                moveTo(9f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 4f)
                lineTo(5f, 4f)
                close()
            }
        }.also { _Turkey = it}
