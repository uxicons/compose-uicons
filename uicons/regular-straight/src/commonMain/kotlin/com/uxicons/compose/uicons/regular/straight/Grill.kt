package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Rs.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                lineTo(24f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 7f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.15f, 17.47f)
                lineTo(2.88f, 24f)
                lineTo(5.12f, 24f)
                lineToRelative(2.85f, -5.7f)
                arcTo(11.89f, 11.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.96f)
                lineTo(11f, 24f)
                horizontalLineToRelative(2f)
                lineTo(13f, 18.96f)
                arcToRelative(11.89f, 11.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.03f, -0.66f)
                lineTo(18.88f, 24f)
                horizontalLineToRelative(2.24f)
                lineToRelative(-3.26f, -6.53f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7f)
                close()
                moveTo(12f, 17f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 8f)
                horizontalLineToRelative(19.9f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                close()
                moveTo(13f, 4f)
                lineTo(11f, 4f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 0f)
                lineTo(9f, 0f)
                close()
            }
        }.also { _Grill = it}
