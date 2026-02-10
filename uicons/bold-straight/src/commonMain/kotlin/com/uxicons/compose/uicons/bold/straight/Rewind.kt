package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rewind: ImageVector? = null

val Icons.Bs.Rewind: ImageVector
    get() = _Rewind ?: UXIcon(name = "Rewind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 23.8f)
                lineToRelative(-8f, -5.71f)
                verticalLineTo(23.8f)
                lineTo(1.82f, 14.39f)
                arcToRelative(3.28f, 3.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.33f)
                lineToRelative(0.04f, -0.03f)
                lineTo(15f, 0.32f)
                verticalLineTo(5.91f)
                lineTo(23f, 0.2f)
                close()
                moveTo(3.55f, 11.51f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 0.22f)
                arcToRelative(0.27f, 0.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 0.23f)
                lineTo(12f, 17.98f)
                verticalLineTo(12.26f)
                lineToRelative(8f, 5.71f)
                verticalLineTo(6.03f)
                lineTo(12f, 11.74f)
                verticalLineTo(5.91f)
                close()
            }
        }.also { _Rewind = it}
