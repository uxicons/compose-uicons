package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bold: ImageVector? = null

val Icons.Ss.Bold: ImageVector
    get() = _Bold ?: UXIcon(name = "Bold") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.95f, 10.66f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 24f)
                lineTo(15f, 24f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -13.34f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                lineTo(7f, 10f)
                close()
                moveTo(15f, 20f)
                lineTo(7f, 20f)
                lineTo(7f, 14f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _Bold = it}
