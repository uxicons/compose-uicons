package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmClock: ImageVector? = null

val Icons.Rs.AlarmClock: ImageVector
    get() = _AlarmClock ?: UXIcon(name = "AlarmClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13f)
                arcToRelative(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, -10.95f)
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
                arcToRelative(10.95f, 10.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.94f, -7.46f)
                close()
                moveTo(12f, 22f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                close()
            }
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
                moveToRelative(11f, 7f)
                verticalLineToRelative(5.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                close()
            }
        }.also { _AlarmClock = it}
