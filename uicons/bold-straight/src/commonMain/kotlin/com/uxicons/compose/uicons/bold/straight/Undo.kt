package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Bs.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 6f)
                lineTo(11.17f, 6f)
                lineTo(11.17f, 0.21f)
                lineTo(1.1f, 8.95f)
                lineToRelative(-0.08f, 0.07f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(10.15f, 8.81f)
                lineTo(11.17f, 17f)
                lineTo(14.5f, 17f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 23.48f)
                horizontalLineToRelative(0f)
                lineTo(21f, 24f)
                horizontalLineToRelative(3f)
                lineTo(24f, 15.5f)
                arcTo(9.51f, 9.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 6f)
                close()
                moveTo(14.5f, 14f)
                lineTo(8.17f, 14f)
                verticalLineToRelative(2.21f)
                lineTo(3.12f, 11.83f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.66f)
                lineTo(8.17f, 6.79f)
                lineTo(8.17f, 9f)
                lineTo(14.5f, 9f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15.5f)
                verticalLineToRelative(1.08f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 14f)
                close()
            }
        }.also { _Undo = it}
