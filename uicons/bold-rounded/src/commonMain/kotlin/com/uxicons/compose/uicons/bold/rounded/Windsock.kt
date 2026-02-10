package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Br.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.19f, 7.71f)
            lineTo(4.21f, 4.31f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4.49f)
            lineTo(1f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(4f, 19.73f)
            lineToRelative(17.19f, -3.44f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12.86f)
            lineTo(24f, 11.14f)
            arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.19f, 7.71f)
            close()
            moveTo(14f, 9.33f)
            lineToRelative(2f, 0.4f)
            verticalLineToRelative(4.54f)
            lineToRelative(-2f, 0.4f)
            close()
            moveTo(11f, 15.27f)
            lineTo(9f, 15.67f)
            lineTo(9f, 8.33f)
            lineToRelative(2f, 0.4f)
            close()
            moveTo(4f, 7.33f)
            lineToRelative(2f, 0.4f)
            verticalLineToRelative(8.54f)
            lineToRelative(-2f, 0.4f)
            close()
            moveTo(21f, 12.86f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.4f, 0.49f)
            lineToRelative(-1.6f, 0.32f)
            lineTo(19f, 10.33f)
            lineToRelative(1.6f, 0.32f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, 0.49f)
            close()
        }
    }.also { _Windsock = it }
