package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowArrow: ImageVector? = null

val Icons.Rr.BowArrow: ImageVector
    get() = _BowArrow ?: UXIcon(name = "BowArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(18f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2.59f)
                lineTo(17.36f, 5.22f)
                arcTo(13.4f, 13.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 4.14f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 2.29f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, 9f)
                lineToRelative(6.33f, 6.33f)
                lineTo(4.59f, 18f)
                lineTo(1f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(2.59f, 20f)
                lineTo(1.29f, 21.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(4f, 21.41f)
                lineTo(4f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(6f, 19.41f)
                lineToRelative(2.67f, -2.67f)
                lineTo(15f, 23.07f)
                arcTo(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.23f, 24f)
                arcToRelative(2.92f, 2.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.34f, -0.02f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, -1.4f)
                arcTo(13.4f, 13.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.77f, 6.64f)
                lineTo(22f, 3.41f)
                lineTo(22f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(2.34f, 7.59f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.94f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.83f)
                arcTo(11.26f, 11.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.64f, 4.01f)
                arcToRelative(11.38f, 11.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 2.63f)
                lineTo(8.67f, 13.92f)
                close()
                moveTo(18.18f, 21.49f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 0.5f)
                arcToRelative(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.94f, -0.33f)
                lineToRelative(-6.33f, -6.33f)
                lineToRelative(7.28f, -7.27f)
                arcTo(11.39f, 11.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.18f, 21.49f)
                close()
            }
        }.also { _BowArrow = it}
