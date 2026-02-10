package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudCheck: ImageVector? = null

val Icons.Ss.CloudCheck: ImageVector
    get() = _CloudCheck ?: UXIcon(name = "CloudCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.79f, 7.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.79f, 1.79f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -15.79f)
                close()
                moveTo(13.81f, 19.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineToRelative(-3.38f, -3.38f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.38f, 3.38f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(5.65f, -5.65f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _CloudCheck = it}
