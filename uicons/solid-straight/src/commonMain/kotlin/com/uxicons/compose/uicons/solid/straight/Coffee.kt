package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Ss.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 6f)
                lineTo(1f, 6f)
                lineTo(1f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                horizontalLineToRelative(0.17f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
                lineTo(17f, 0f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 2f)
                lineTo(20f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(10f, 16f)
                curveToRelative(0.1f, 3.95f, 3.9f, 3.95f, 4f, 0f)
                curveTo(13.9f, 12.05f, 10.11f, 12.05f, 10f, 16f)
                close()
                moveTo(8.08f, 15f)
                curveToRelative(0.89f, -5.29f, 6.95f, -5.28f, 7.84f, 0f)
                horizontalLineToRelative(5.09f)
                lineToRelative(0.88f, -7f)
                lineTo(2.12f, 8f)
                lineToRelative(0.88f, 7f)
                close()
                moveTo(15.92f, 17f)
                curveToRelative(-0.89f, 5.29f, -6.95f, 5.28f, -7.84f, 0f)
                lineTo(3.24f, 17f)
                lineToRelative(0.88f, 7f)
                lineTo(19.88f, 24f)
                lineToRelative(0.88f, -7f)
                close()
            }
        }.also { _Coffee = it}
