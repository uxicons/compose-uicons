package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeySticks: ImageVector? = null

val Icons.Sr.HockeySticks: ImageVector
    get() = _HockeySticks ?: UXIcon(name = "HockeySticks") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.27f, 24f)
                lineTo(5.5f, 24f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 17.96f)
                arcTo(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.69f, 13f)
                horizontalLineToRelative(6.54f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, -2.84f)
                lineTo(18.63f, 1.57f)
                arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.46f, 0.1f)
                horizontalLineToRelative(0f)
                arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.9f, 2.88f)
                lineToRelative(-4.07f, 14.03f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.27f, 24f)
                close()
                moveTo(20.25f, -0.31f)
                horizontalLineToRelative(0f)
                close()
                moveTo(21.73f, 14.11f)
                lineTo(20.76f, 17.46f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.93f, 24f)
                lineTo(18.5f, 24f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, -6.04f)
                arcTo(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.73f, 14.11f)
                close()
                moveTo(3.54f, 11.3f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.69f, 11f)
                lineTo(8.3f, 11f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.36f, -0.84f)
                lineTo(5.37f, 1.57f)
                arcTo(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, 2.88f)
                close()
            }
        }.also { _HockeySticks = it}
