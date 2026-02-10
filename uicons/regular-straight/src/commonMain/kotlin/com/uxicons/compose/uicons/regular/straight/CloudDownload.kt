package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownload: ImageVector? = null

val Icons.Rs.CloudDownload: ImageVector
    get() = _CloudDownload ?: UXIcon(name = "CloudDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.54f, 18.67f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.2f, 3.2f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.49f, 0f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.53f, 2.53f)
                verticalLineToRelative(-8.2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.2f)
                close()
                moveTo(17.79f, 7.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.79f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(4.64f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-2.64f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, -6.87f)
                lineToRelative(1.44f, -0.37f)
                lineToRelative(-0.88f, -1.19f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.18f, -3.56f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.76f)
                lineToRelative(0.76f, 0.1f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 9.25f)
                lineToRelative(1.43f, 1.43f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.64f, -12.53f)
                close()
            }
        }.also { _CloudDownload = it}
