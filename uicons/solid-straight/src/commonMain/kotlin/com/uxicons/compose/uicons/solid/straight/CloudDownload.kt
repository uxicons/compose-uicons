package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownload: ImageVector? = null

val Icons.Ss.CloudDownload: ImageVector
    get() = _CloudDownload ?: UXIcon(name = "CloudDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.79f, 7.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.79f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -15.79f)
                close()
                moveTo(16.75f, 20.28f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.49f, 0f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.53f, 2.54f)
                verticalLineToRelative(-8.2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.2f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _CloudDownload = it}
