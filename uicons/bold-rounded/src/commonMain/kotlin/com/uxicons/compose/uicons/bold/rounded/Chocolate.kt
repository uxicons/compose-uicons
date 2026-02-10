package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chocolate: ImageVector? = null

val Icons.Br.Chocolate: ImageVector
    get() = _Chocolate ?: UXIcon(name = "Chocolate") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.45f, 5.57f)
            lineToRelative(-4f, -4f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, 0f)
            lineToRelative(-9.37f, 9.37f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.52f)
            lineToRelative(4f, 4f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 0f)
            lineToRelative(9.37f, -9.37f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.45f, 5.57f)
            close()
            moveTo(14.7f, 3.01f)
            arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 0.68f)
            lineToRelative(0.9f, 0.9f)
            lineTo(14.22f, 7.6f)
            lineTo(11.68f, 5.06f)
            lineToRelative(1.38f, -1.38f)
            arcTo(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.7f, 3.01f)
            close()
            moveTo(14.19f, 17.11f)
            lineTo(11.57f, 14.49f)
            lineToRelative(2.65f, -2.65f)
            lineToRelative(2.62f, 2.62f)
            close()
            moveTo(9.45f, 12.37f)
            lineTo(6.91f, 9.83f)
            lineToRelative(2.65f, -2.65f)
            lineTo(12.1f, 9.72f)
            close()
            moveTo(3.69f, 13.06f)
            lineTo(4.79f, 11.96f)
            lineTo(7.33f, 14.49f)
            lineTo(4.58f, 17.23f)
            lineTo(3.69f, 16.34f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.69f, 13.06f)
            close()
            moveTo(7.69f, 20.33f)
            lineTo(6.71f, 19.35f)
            lineTo(9.45f, 16.61f)
            lineTo(12.06f, 19.23f)
            lineTo(10.96f, 20.33f)
            arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.69f, 20.33f)
            close()
            moveTo(20.33f, 10.96f)
            lineTo(18.96f, 12.34f)
            lineTo(16.34f, 9.72f)
            lineToRelative(3.01f, -3.01f)
            lineToRelative(0.98f, 0.98f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.33f, 10.96f)
            close()
        }
    }.also { _Chocolate = it }
