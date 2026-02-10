package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Rs.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                lineTo(17f, 5f)
                lineTo(13.83f, 5f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineToRelative(-0.83f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(4f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(6f)
                lineTo(15f, 9f)
                lineTo(9f, 9f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                lineTo(6f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(17f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(7.97f, 20f)
                horizontalLineToRelative(8f)
                lineTo(15.97f, 14f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(9.97f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Sauce = it}
