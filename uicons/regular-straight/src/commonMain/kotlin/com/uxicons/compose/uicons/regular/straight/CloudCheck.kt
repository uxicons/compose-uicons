package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudCheck: ImageVector? = null

val Icons.Rs.CloudCheck: ImageVector
    get() = _CloudCheck ?: UXIcon(name = "CloudCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineToRelative(-0.24f)
                lineToRelative(2.42f, -2.42f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.38f, -11.53f)
                lineToRelative(-0.76f, -0.1f)
                lineToRelative(-0.1f, -0.76f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.94f, 0.8f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 3.56f)
                lineToRelative(0.88f, 1.19f)
                lineToRelative(-1.44f, 0.37f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.87f, 6.87f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-2.12f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, -10.33f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -3.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.79f, -1.79f)
                arcToRelative(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.21f, 7.79f)
                close()
                moveTo(13.81f, 22.12f)
                lineTo(19.47f, 16.47f)
                lineTo(18.05f, 15.05f)
                lineTo(12.4f, 20.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-3.39f, -3.38f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.38f, 3.38f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                close()
            }
        }.also { _CloudCheck = it}
