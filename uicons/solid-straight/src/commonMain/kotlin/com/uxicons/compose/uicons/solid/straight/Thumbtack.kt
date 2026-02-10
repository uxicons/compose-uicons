package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thumbtack: ImageVector? = null

val Icons.Ss.Thumbtack: ImageVector
    get() = _Thumbtack ?: UXIcon(name = "Thumbtack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.54f, 17.9f)
                lineTo(1.71f, 23.71f)
                lineTo(0.29f, 22.29f)
                lineToRelative(5.83f, -5.81f)
                close()
                moveTo(13.84f, 20.66f)
                arcToRelative(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -7.15f)
                lineToRelative(-0.31f, -1.28f)
                lineToRelative(3.62f, -3.64f)
                lineToRelative(0.57f, 0.57f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.29f, 0.35f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -3.81f)
                lineTo(18.34f, 0.79f)
                arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.05f, 0.44f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.32f, 3.81f)
                lineToRelative(0.65f, 0.65f)
                lineToRelative(-3.62f, 3.64f)
                lineTo(10.49f, 8.22f)
                arcToRelative(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.15f, 1.94f)
                lineToRelative(-0.35f, 0.35f)
                lineToRelative(10.5f, 10.5f)
                close()
            }
        }.also { _Thumbtack = it}
