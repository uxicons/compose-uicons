package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Rs.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.92f, 1.7f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.46f, -0.65f)
                lineToRelative(-6.18f, 1.12f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.46f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.72f, 2.17f)
                lineTo(3.54f, 1.05f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 20.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 4f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.92f, 1.7f)
                close()
                moveTo(11f, 20.8f)
                lineTo(2f, 19.17f)
                lineTo(2f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, -0.98f)
                lineTo(9.36f, 4.14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.11f)
                close()
                moveTo(22f, 19.16f)
                lineTo(13f, 20.8f)
                lineTo(13f, 6.11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 4.14f)
                lineToRelative(6.18f, -1.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                close()
            }
        }.also { _BookAlt = it}
