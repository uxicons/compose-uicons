package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeySticks: ImageVector? = null

val Icons.Ss.HockeySticks: ImageVector
    get() = _HockeySticks ?: UXIcon(name = "HockeySticks") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.27f, 24f)
                lineTo(5.5f, 24f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.03f, 17.96f)
                arcTo(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.69f, 13f)
                horizontalLineToRelative(7.13f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, -2.84f)
                lineTo(19.09f, 2.13f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.96f, 0f)
                horizontalLineToRelative(2.01f)
                lineTo(18.84f, 16.91f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.27f, 24f)
                close()
                moveTo(21.77f, 14.15f)
                lineTo(20.75f, 17.49f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.92f, 24f)
                lineTo(18.5f, 24f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, -6.04f)
                arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.77f, 14.15f)
                close()
                moveTo(5.69f, 11f)
                lineTo(7.68f, 11f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -0.84f)
                lineTo(4.87f, 2.13f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(0.03f, 0f)
                lineToRelative(3.44f, 11.33f)
                arcTo(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.69f, 11f)
                close()
            }
        }.also { _HockeySticks = it}
