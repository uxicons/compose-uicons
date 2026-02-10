package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speaker: ImageVector? = null

val Icons.Ss.Speaker: ImageVector
    get() = _Speaker ?: UXIcon(name = "Speaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                lineTo(18f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(12f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.5f)
                close()
                moveTo(18f, 16f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16f)
                close()
                moveTo(16f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
                moveTo(13f, 15f)
                lineTo(11f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Speaker = it}
