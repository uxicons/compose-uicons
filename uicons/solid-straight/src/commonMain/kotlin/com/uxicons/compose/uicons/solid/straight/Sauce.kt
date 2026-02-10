package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Ss.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 5f)
                horizontalLineToRelative(3.17f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(0.83f, 5f)
                lineTo(17f, 5f)
                close()
                moveTo(13.97f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(20f, 13f)
                lineTo(20f, 24f)
                lineTo(4f, 24f)
                lineTo(4f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                lineTo(17f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 13f)
                close()
                moveTo(15.97f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Sauce = it}
