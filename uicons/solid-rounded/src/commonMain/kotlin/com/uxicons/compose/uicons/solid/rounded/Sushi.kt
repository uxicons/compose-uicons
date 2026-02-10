package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Sr.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 11f)
                curveToRelative(0.07f, 1.29f, 7.94f, 1.29f, 8f, 0f)
                curveTo(12.43f, 9.71f, 4.56f, 9.71f, 4.5f, 11f)
                close()
                moveTo(11.5f, 5f)
                curveToRelative(0.07f, 1.29f, 7.94f, 1.29f, 8f, 0f)
                curveTo(19.43f, 3.71f, 11.56f, 3.71f, 11.5f, 5f)
                close()
                moveTo(8.5f, 6f)
                curveTo(3.73f, 6f, 0f, 8.2f, 0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0.16f, 6.6f, 16.84f, 6.6f, 17f, 0f)
                lineTo(17f, 11f)
                curveTo(17f, 8.2f, 13.27f, 6f, 8.5f, 6f)
                close()
                moveTo(8.5f, 8f)
                curveToRelative(8.57f, 0.23f, 8.57f, 5.77f, 0f, 6f)
                curveTo(-0.07f, 13.77f, -0.07f, 8.23f, 8.5f, 8f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.06f, -2.02f, 3.8f, -5f, 4.57f)
                lineTo(19f, 11f)
                arcToRelative(5.35f, 5.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, -3.22f)
                curveTo(24.74f, 6.33f, 22.18f, 2.02f, 15.5f, 2f)
                curveToRelative(-2.96f, 0f, -5.22f, 0.94f, -6.1f, 2.03f)
                arcToRelative(15.81f, 15.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 0.03f)
                curveTo(8.81f, -1.6f, 23.83f, -1.26f, 24f, 5f)
                close()
            }
        }.also { _Sushi = it}
