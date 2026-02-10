package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Summer: ImageVector? = null

val Icons.Bs.Summer: ImageVector
    get() = _Summer ?: UXIcon(name = "Summer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, -2.58f)
                lineTo(14.5f, 8.04f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.42f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.04f)
                close()
                moveTo(24f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -5.27f)
                lineTo(10f, 6.04f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                verticalLineToRelative(4.69f)
                arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(21f, 16f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.59f)
                lineTo(19f, 11.97f)
                lineTo(19f, 6.04f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(5.93f)
                lineToRelative(-0.46f, 0.44f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(10f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 2.7f)
                arcToRelative(5.92f, 5.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 0.65f)
                lineTo(3.55f, 1.43f)
                lineTo(1.43f, 3.55f)
                lineTo(3.34f, 5.46f)
                arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(3f)
                lineTo(2.7f, 10f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, 1.54f)
                lineTo(1.43f, 13.45f)
                lineTo(3.55f, 15.57f)
                lineToRelative(3.18f, -3.18f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10.02f)
                lineTo(8f, 6.04f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0.76f)
                close()
            }
        }.also { _Summer = it}
