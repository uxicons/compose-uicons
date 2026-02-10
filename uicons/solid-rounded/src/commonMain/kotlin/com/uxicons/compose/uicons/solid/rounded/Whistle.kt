package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Sr.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                close()
                moveTo(24f, 10.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.05f, 2.46f)
                lineToRelative(-5.16f, 0.94f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16.15f)
                arcToRelative(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 3.29f)
                arcTo(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.29f, 23.9f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.98f, -8.6f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.23f, 8f)
                lineTo(21.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.5f)
                close()
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                close()
                moveTo(11f, 4f)
                lineTo(11f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 1f)
                lineTo(9f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(14.4f, 5.45f)
                lineTo(15.9f, 2.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, -0.89f)
                lineToRelative(-1.5f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.79f, 0.89f)
                close()
                moveTo(6.97f, 5.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, -1.34f)
                lineToRelative(-1.52f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.79f, 0.9f)
                lineToRelative(1.52f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.52f, 6f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.97f, 5.89f)
                close()
            }
        }.also { _Whistle = it}
