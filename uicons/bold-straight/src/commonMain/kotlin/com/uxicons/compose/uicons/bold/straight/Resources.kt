package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Bs.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(12f, 3f)
                lineTo(12f, 5.27f)
                lineTo(10.97f, 3.49f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 0f)
                lineTo(0f, 15f)
                lineTo(7.18f, 15f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.64f, 0f)
                lineTo(24f, 15f)
                close()
                moveTo(5.2f, 12f)
                lineTo(8.81f, 5.74f)
                lineToRelative(2.65f, 4.59f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.82f, 12f)
                close()
                moveTo(13.5f, 20f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 16.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 20f)
                close()
                moveTo(21f, 12f)
                lineTo(18.18f, 12f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.18f)
                lineTo(15f, 6f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Resources = it}
