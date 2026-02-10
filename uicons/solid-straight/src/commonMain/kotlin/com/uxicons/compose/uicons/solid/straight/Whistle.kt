package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Ss.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(5.83f)
                lineToRelative(-7.21f, 1.31f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16.15f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 3.29f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.29f, 23.9f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.98f, -8.6f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.23f, 8f)
                close()
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                close()
                moveTo(11f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16.32f, 2.06f)
                lineTo(14.56f, 1.1f)
                lineTo(12.15f, 5.47f)
                lineTo(13.9f, 6.44f)
                close()
                moveTo(7.88f, 5.47f)
                lineTo(5.46f, 1.1f)
                lineToRelative(-1.75f, 0.97f)
                lineTo(6.12f, 6.44f)
                close()
            }
        }.also { _Whistle = it}
