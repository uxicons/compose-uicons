package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Sr.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.8f, 8.16f)
                lineToRelative(-3.41f, 10.4f)
                curveToRelative(-0.45f, 1.52f, -1.57f, 2.66f, -2.95f, 3.2f)
                curveToRelative(0.36f, -0.85f, 0.57f, -1.78f, 0.57f, -2.76f)
                lineTo(18.0f, 9f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                horizontalLineToRelative(-1.67f)
                curveTo(10.57f, 0.38f, 12.72f, -0.41f, 14.78f, 0.22f)
                lineToRelative(5.69f, 1.75f)
                curveToRelative(2.6f, 0.8f, 4.1f, 3.58f, 3.33f, 6.19f)
                close()
                moveTo(16.0f, 9f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5.0f, 24f)
                curveTo(2.25f, 24f, 0.0f, 21.76f, 0.0f, 19f)
                lineTo(0.0f, 9f)
                curveTo(0.0f, 6.24f, 2.25f, 4f, 5.0f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
            }
        }.also { _CardsBlank = it}
