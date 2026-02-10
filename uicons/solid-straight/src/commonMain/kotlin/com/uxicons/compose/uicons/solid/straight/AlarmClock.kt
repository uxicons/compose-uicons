package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Ss.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.52f, 1.75f)
                lineToRelative(-1.07f, -1.69f)
                arcToRelative(15.17f, 15.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, 3.96f)
                lineToRelative(1.66f, 1.11f)
                arcToRelative(13.14f, 13.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, -3.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 5.12f)
                lineToRelative(1.66f, -1.11f)
                arcToRelative(15.17f, 15.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.44f, -3.96f)
                lineToRelative(-1.07f, 1.69f)
                arcToRelative(13.14f, 13.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, 3.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.05f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                arcToRelative(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 18.41f)
                lineToRelative(-1.93f, 2.12f)
                lineToRelative(1.48f, 1.35f)
                lineToRelative(1.93f, -2.12f)
                arcToRelative(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.15f, 0f)
                lineToRelative(1.93f, 2.13f)
                lineToRelative(1.48f, -1.35f)
                lineToRelative(-1.93f, -2.12f)
                arcToRelative(10.98f, 10.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, -18.41f)
                close()
                moveTo(14.29f, 15.71f)
                lineTo(11f, 12.41f)
                verticalLineToRelative(-5.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.59f)
                lineToRelative(2.71f, 2.71f)
                close()
            }
        }.also { _AlarmClock = it}
