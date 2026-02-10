package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Rs.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.11f, 8.57f)
                lineTo(15f, 7.32f)
                lineTo(15f, 2f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 7.32f)
                lineTo(5.89f, 8.57f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 11.35f)
                lineTo(4f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 11.35f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.11f, 8.57f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                lineTo(6f, 11.35f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -0.93f)
                lineTo(11f, 8.68f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 8.68f)
                lineToRelative(4.37f, 1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, 0.93f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                lineTo(16f, 13f)
                lineTo(8f, 13f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(10f, 17f)
                close()
            }
        }.also { _Bottle = it}
