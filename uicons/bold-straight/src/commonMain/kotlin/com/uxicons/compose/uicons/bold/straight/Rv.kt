package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rv: ImageVector? = null

val Icons.Bs.Rv: ImageVector
    get() = _Rv ?: UXIcon(name = "Rv") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 1f)
                lineTo(4.5f, 1f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
                lineTo(0f, 15.62f)
                lineToRelative(4f, 4f)
                lineTo(4f, 20.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.95f, 20f)
                horizontalLineToRelative(7.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                lineTo(24f, 20f)
                lineTo(24f, 14.56f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, -2.73f)
                lineTo(21.66f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(13f, 9.5f)
                lineTo(13f, 17f)
                lineTo(5.62f, 17f)
                lineTo(3f, 14.38f)
                lineTo(3f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4f)
                horizontalLineToRelative(15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
                lineTo(21f, 6f)
                lineTo(16.5f, 6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.5f)
                close()
                moveTo(16f, 14f)
                lineTo(16f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(1.7f)
                lineToRelative(2.47f, 4.32f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, 0.68f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                lineTo(5f, 11f)
                close()
            }
        }.also { _Rv = it}
