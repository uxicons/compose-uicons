package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Ss.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.85f, 17.47f)
                lineTo(21.12f, 24f)
                lineTo(18.88f, 24f)
                lineToRelative(-2.85f, -5.71f)
                arcTo(11.85f, 11.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.95f)
                lineTo(13f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 18.95f)
                arcToRelative(11.85f, 11.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.03f, -0.66f)
                lineTo(5.12f, 24f)
                lineTo(2.88f, 24f)
                lineToRelative(3.27f, -6.53f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                lineTo(0f, 6f)
                lineTo(24f, 6f)
                lineTo(24f, 7f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.85f, 17.47f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                close()
            }
        }.also { _Grill = it}
