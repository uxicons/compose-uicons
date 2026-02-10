package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Bs.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                lineTo(20f, 7.31f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.69f, 2f)
                lineTo(13.5f, 2f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                lineTo(9.31f, 2f)
                arcTo(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.77f, 12.4f)
                lineToRelative(2.73f, 0.75f)
                lineTo(10.5f, 19f)
                lineTo(9.31f, 19f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16.69f)
                lineTo(7f, 16f)
                lineTo(4f, 16f)
                verticalLineToRelative(0.69f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.31f, 22f)
                lineTo(10.5f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 22f)
                horizontalLineToRelative(1.19f)
                arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, -10.4f)
                lineTo(13.5f, 10.86f)
                lineTo(13.5f, 5f)
                horizontalLineToRelative(1.19f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7.31f)
                lineTo(17f, 8f)
                close()
                moveTo(15.38f, 14.48f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 4.52f)
                lineTo(13.5f, 19f)
                lineTo(13.5f, 13.96f)
                close()
                moveTo(10.5f, 10.04f)
                lineTo(8.62f, 9.52f)
                arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.31f, 5f)
                lineTo(10.5f, 5f)
                close()
            }
        }.also { _Dollar = it}
