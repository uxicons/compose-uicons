package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watermelon: ImageVector? = null

val Icons.Ss.Watermelon: ImageVector
    get() = _Watermelon ?: UXIcon(name = "Watermelon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.05f, 0.75f)
                lineTo(19.34f, 0.04f)
                lineTo(0.04f, 19.34f)
                lineToRelative(0.71f, 0.71f)
                arcToRelative(13.65f, 13.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.3f, -19.3f)
                close()
                moveTo(9.63f, 19.67f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, -2.65f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0.88f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.63f, 19.67f)
                close()
                moveTo(14.65f, 18.67f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcTo(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.02f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0.88f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.65f, 18.66f)
                close()
                moveTo(17.66f, 15.65f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.01f, 13f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0.88f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.66f, 15.65f)
                close()
                moveTo(19.66f, 10.63f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, -2.65f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.65f, 0.88f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.66f, 10.63f)
                close()
            }
        }.also { _Watermelon = it}
