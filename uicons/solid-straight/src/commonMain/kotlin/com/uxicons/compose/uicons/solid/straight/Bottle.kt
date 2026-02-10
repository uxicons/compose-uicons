package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bottle: ImageVector? = null

val Icons.Ss.Bottle: ImageVector
    get() = _Bottle ?: UXIcon(name = "Bottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                lineTo(10f, 17f)
                lineTo(10f, 15f)
                horizontalLineToRelative(4f)
                close()
                moveTo(20f, 11.35f)
                lineTo(20f, 24f)
                lineTo(4f, 24f)
                lineTo(4f, 11.35f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.89f, 8.57f)
                lineTo(9f, 7.32f)
                lineTo(9f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(8f)
                lineTo(16f, 2f)
                lineTo(15f, 2f)
                lineTo(15f, 7.32f)
                lineToRelative(3.11f, 1.25f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11.35f)
                close()
                moveTo(16f, 13f)
                lineTo(8f, 13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Bottle = it}
