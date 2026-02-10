package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whistle: ImageVector? = null

val Icons.Rs.Whistle: ImageVector
    get() = _Whistle ?: UXIcon(name = "Whistle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16f)
                close()
                moveTo(10f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 16f)
                close()
                moveTo(8.23f, 8f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.02f, 15.39f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.01f, 24f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.28f, -0.1f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.91f, -4.46f)
                arcTo(7.9f, 7.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.79f, -1.01f)
                lineTo(24f, 13.84f)
                lineTo(24f, 8f)
                close()
                moveTo(22f, 12.17f)
                lineToRelative(-5.57f, 1.01f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.11f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, 2.46f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.38f, -3.03f)
                arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.23f, 10f)
                lineTo(22f, 10f)
                close()
                moveTo(11f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.9f, 6.44f)
                lineTo(12.15f, 5.47f)
                lineTo(14.56f, 1.1f)
                lineToRelative(1.75f, 0.97f)
                close()
                moveTo(6.13f, 6.44f)
                lineTo(3.71f, 2.06f)
                lineTo(5.46f, 1.1f)
                lineTo(7.88f, 5.47f)
                close()
            }
        }.also { _Whistle = it}
