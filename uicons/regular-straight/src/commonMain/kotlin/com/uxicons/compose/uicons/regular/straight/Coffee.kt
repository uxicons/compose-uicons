package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Rs.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-0.17f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                lineTo(7f, 0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.17f, 2f)
                lineTo(4f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                lineTo(1f, 8f)
                lineTo(2.12f, 8f)
                lineToRelative(2f, 16f)
                lineTo(19.88f, 24f)
                lineToRelative(2f, -16f)
                lineTo(23f, 8f)
                close()
                moveTo(3f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                lineTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(18f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(21f, 6f)
                lineTo(3f, 6f)
                close()
                moveTo(5.88f, 22f)
                lineToRelative(-0.75f, -6f)
                lineTo(8.08f, 16f)
                curveToRelative(0.89f, 5.29f, 6.95f, 5.28f, 7.84f, 0f)
                horizontalLineToRelative(2.95f)
                lineToRelative(-0.75f, 6f)
                close()
                moveTo(10f, 15f)
                curveToRelative(0.1f, -3.95f, 3.9f, -3.95f, 4f, 0f)
                curveTo(13.9f, 18.95f, 10.11f, 18.95f, 10f, 15f)
                close()
                moveTo(19.12f, 14f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.89f, -5.29f, -6.95f, -5.28f, -7.84f, 0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.75f, -6f)
                lineTo(19.87f, 8f)
                close()
            }
        }.also { _Coffee = it}
