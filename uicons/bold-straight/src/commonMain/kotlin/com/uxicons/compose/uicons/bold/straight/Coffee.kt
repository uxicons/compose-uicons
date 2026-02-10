package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Bs.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.24f, -3.26f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
                lineTo(5.5f, 0f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, 2.24f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
                lineTo(0f, 8f)
                lineTo(1.62f, 8f)
                lineTo(3.68f, 24f)
                lineTo(20.32f, 24f)
                lineTo(22.38f, 8f)
                lineTo(24f, 8f)
                close()
                moveTo(5f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(19f, 5f)
                lineTo(5f, 5f)
                close()
                moveTo(6.32f, 21f)
                lineToRelative(-0.65f, -5f)
                horizontalLineToRelative(3.51f)
                curveToRelative(0.9f, 3.96f, 4.73f, 3.96f, 5.63f, 0f)
                horizontalLineToRelative(3.51f)
                lineToRelative(-0.65f, 5f)
                close()
                moveTo(18.71f, 13f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.9f, -3.96f, -4.73f, -3.96f, -5.63f, 0f)
                horizontalLineToRelative(-3.9f)
                lineTo(4.64f, 8f)
                lineTo(19.36f, 8f)
                close()
            }
        }.also { _Coffee = it}
