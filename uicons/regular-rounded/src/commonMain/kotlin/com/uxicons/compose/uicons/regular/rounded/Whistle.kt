package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Rr.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                close()
                moveTo(8f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                close()
                moveTo(21.5f, 8f)
                lineTo(8.23f, 8f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.02f, 15.39f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.01f, 24f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.28f, -0.1f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.91f, -4.46f)
                arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.79f, -1.01f)
                lineToRelative(5.16f, -0.94f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.75f)
                lineTo(24f, 10.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 8f)
                close()
                moveTo(22f, 11.75f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, 0.49f)
                lineToRelative(-5.16f, 0.94f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.11f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, 2.46f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.38f, -3.03f)
                arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.23f, 10f)
                lineTo(21.5f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(9f, 4f)
                lineTo(9f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                close()
                moveTo(12.61f, 4.55f)
                lineTo(14.11f, 1.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.79f, 0.89f)
                lineToRelative(-1.5f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.79f, -0.89f)
                close()
                moveTo(4.11f, 2.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.79f, -0.9f)
                lineToRelative(1.52f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.78f, 0.9f)
                close()
            }
        }.also { _Whistle = it}
