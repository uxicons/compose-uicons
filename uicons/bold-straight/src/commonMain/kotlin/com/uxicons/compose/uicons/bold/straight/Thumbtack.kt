package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thumbtack: ImageVector? = null

val Icons.Bs.Thumbtack: ImageVector
    get() = _Thumbtack ?: UXIcon(name = "Thumbtack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.12f, 24f)
                lineToRelative(6.44f, -6.44f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, -8.17f)
                lineToRelative(3.34f, -3.35f)
                lineToRelative(0.49f, 0.49f)
                arcToRelative(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, 0.29f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -3.03f)
                lineTo(16.45f, 0.64f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.83f, 0.35f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.25f, 3.03f)
                lineToRelative(0.56f, 0.56f)
                lineTo(10.79f, 7.3f)
                lineToRelative(-0.06f, -0.02f)
                arcToRelative(8.48f, 8.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.11f, 2.2f)
                lineTo(1.55f, 10.54f)
                lineToRelative(4.9f, 4.9f)
                lineTo(0f, 21.88f)
                close()
                moveTo(9.88f, 10.15f)
                lineToRelative(1.73f, 0.56f)
                lineToRelative(4.64f, -4.65f)
                lineToRelative(1.68f, 1.68f)
                lineTo(13.3f, 12.39f)
                lineToRelative(0.53f, 1.64f)
                arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.51f, 4.02f)
                lineTo(5.94f, 10.69f)
                arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.88f, 10.15f)
                close()
            }
        }.also { _Thumbtack = it}
