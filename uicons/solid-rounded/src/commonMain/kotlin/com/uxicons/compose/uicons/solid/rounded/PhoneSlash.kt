package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Sr.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 1.71f)
                lineToRelative(-22f, 22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 22.29f)
                lineToRelative(5.04f, -5.04f)
                curveTo(1.15f, 12.59f, -2.24f, 6.32f, 1.78f, 1.87f)
                lineToRelative(1.15f, -1f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.26f, 0.91f)
                curveToRelative(0.03f, 0.03f, 1.88f, 2.44f, 1.88f, 2.44f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 4.28f)
                lineToRelative(-1.6f, 1.9f)
                arcTo(14.2f, 14.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.65f, 12.94f)
                lineTo(22.29f, 0.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.71f, 1.71f)
                close()
                moveTo(20.66f, 14.86f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.01f)
                lineTo(14.47f, 16.47f)
                curveToRelative(-0.4f, -0.17f, -0.79f, -0.36f, -1.16f, -0.56f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.16f, 0.18f)
                lineTo(9.09f, 19.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 1.51f)
                curveToRelative(4.41f, 2.98f, 9.11f, 5.04f, 12.99f, 1.51f)
                lineToRelative(0.91f, -1.05f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.38f)
                curveTo(23.06f, 16.71f, 20.66f, 14.86f, 20.66f, 14.86f)
                close()
            }
        }.also { _PhoneSlash = it}
