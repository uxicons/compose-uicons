package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Rs.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, -0.01f)
                lineTo(0.41f, 19.6f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, 24f)
                lineTo(21.08f, 24f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.51f, -4.4f)
                close()
                moveTo(9f, 22f)
                lineToRelative(3f, -5.08f)
                lineTo(15f, 22f)
                close()
                moveTo(21.88f, 21.54f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, 0.46f)
                lineTo(17.33f, 22f)
                lineTo(12f, 12.99f)
                lineTo(6.67f, 22f)
                lineTo(2.92f, 22f)
                arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, -1.38f)
                lineTo(12f, 3.92f)
                lineToRelative(9.87f, 16.7f)
                arcTo(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.88f, 21.54f)
                close()
            }
        }.also { _Camping = it}
