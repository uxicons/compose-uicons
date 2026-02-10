package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Rs.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.18f)
                lineTo(4.84f, 5.35f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 5.82f)
                lineTo(2f, 24f)
                lineTo(4f, 24f)
                lineTo(4f, 19.82f)
                lineToRelative(20f, -4f)
                close()
                moveTo(12f, 8.82f)
                lineToRelative(2f, 0.4f)
                verticalLineToRelative(6.56f)
                lineToRelative(-2f, 0.4f)
                close()
                moveTo(10f, 16.58f)
                lineTo(8f, 16.98f)
                lineTo(8f, 8.02f)
                lineToRelative(2f, 0.4f)
                close()
                moveTo(16f, 9.62f)
                lineTo(18f, 10.02f)
                verticalLineToRelative(4.96f)
                lineToRelative(-2f, 0.4f)
                close()
                moveTo(3f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                close()
                moveTo(4f, 7.22f)
                lineToRelative(2f, 0.4f)
                verticalLineToRelative(9.76f)
                lineToRelative(-2f, 0.4f)
                close()
                moveTo(22f, 14.18f)
                lineTo(20f, 14.58f)
                lineTo(20f, 10.42f)
                lineToRelative(2f, 0.4f)
                close()
            }
        }.also { _Windsock = it}
