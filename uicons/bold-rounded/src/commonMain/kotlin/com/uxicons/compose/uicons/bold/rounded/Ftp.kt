package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ftp: ImageVector? = null

val Icons.Br.Ftp: ImageVector
    get() = _Ftp ?: UXIcon(name = "Ftp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 19f)
            horizontalLineToRelative(-7.35f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.65f)
            verticalLineToRelative(-2.35f)
            horizontalLineToRelative(3f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, -4.5f)
            verticalLineToRelative(-5f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
            horizontalLineToRelative(-5.03f)
            lineToRelative(-2.53f, -1.74f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, -0.26f)
            horizontalLineToRelative(-2.59f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
            verticalLineToRelative(7f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 4.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.35f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 1.65f)
            horizontalLineToRelative(-7.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(7.35f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
            horizontalLineToRelative(7.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(7.5f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            close()
        }
    }.also { _Ftp = it }
