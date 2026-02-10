package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Sr.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(3f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(4.18f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
                lineTo(17f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 2f)
                lineTo(21f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                close()
                moveTo(10f, 16f)
                curveToRelative(0.1f, 3.95f, 3.9f, 3.95f, 4f, 0f)
                curveTo(13.9f, 12.05f, 10.11f, 12.05f, 10f, 16f)
                close()
                moveTo(8.08f, 15f)
                curveToRelative(0.89f, -5.29f, 6.95f, -5.28f, 7.84f, 0f)
                horizontalLineToRelative(5.09f)
                lineToRelative(0.73f, -5.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 8f)
                lineTo(3.25f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, 1.12f)
                lineTo(2.99f, 15f)
                close()
                moveTo(15.92f, 17f)
                curveToRelative(-0.89f, 5.29f, -6.95f, 5.28f, -7.84f, 0f)
                lineTo(3.24f, 17f)
                lineToRelative(0.33f, 2.62f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 24f)
                horizontalLineToRelative(6.94f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.96f, -4.38f)
                lineTo(20.76f, 17f)
                close()
            }
        }.also { _Coffee = it}
