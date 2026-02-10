package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clip: ImageVector? = null

val Icons.Rs.Clip: ImageVector
    get() = _Clip ?: UXIcon(name = "Clip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.98f, 24.01f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.02f, 12.05f)
                lineToRelative(10.6f, -10.59f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.09f, 7.08f)
                lineTo(9.11f, 19.13f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.25f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.25f)
                lineTo(14.75f, 5.01f)
                lineToRelative(1.42f, 1.42f)
                lineTo(6.27f, 16.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.41f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 0f)
                lineTo(18.3f, 7.13f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.25f, -4.25f)
                lineTo(3.44f, 13.47f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.09f, 7.08f)
                lineToRelative(12.02f, -12f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(-12.02f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.98f, 24.01f)
                close()
            }
        }.also { _Clip = it}
