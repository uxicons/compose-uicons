package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Bs.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 13f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.5f, -9.88f)
                verticalLineToRelative(-3.12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.12f)
                arcToRelative(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.18f, 16.27f)
                lineToRelative(-2.42f, 2.57f)
                lineToRelative(2.19f, 2.05f)
                lineToRelative(2.48f, -2.64f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.86f, 0f)
                lineToRelative(2.48f, 2.64f)
                lineToRelative(2.19f, -2.05f)
                lineToRelative(-2.42f, -2.57f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, -6.4f)
                close()
                moveTo(5f, 13f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -7f)
                close()
                moveTo(13.5f, 11.05f)
                lineTo(15.91f, 12.52f)
                lineTo(14.32f, 15.06f)
                lineTo(10.5f, 12.71f)
                verticalLineToRelative(-4.71f)
                horizontalLineToRelative(3f)
                close()
                moveTo(2.51f, 5.67f)
                lineTo(0.02f, 4.01f)
                arcToRelative(15.17f, 15.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.44f, -3.96f)
                lineToRelative(1.6f, 2.53f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 3.09f)
                close()
                moveTo(17.95f, 2.59f)
                lineTo(19.55f, 0.06f)
                arcToRelative(15.17f, 15.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.44f, 3.96f)
                lineToRelative(-2.5f, 1.66f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, -3.09f)
                close()
            }
        }.also { _AlarmClock = it}
