package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Sr.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 11f)
                verticalLineToRelative(-5f)
                curveTo(0f, 2.69f, 2.69f, 0f, 6f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(5f)
                lineTo(0f, 11f)
                close()
                moveTo(12.26f, 21.33f)
                curveToRelative(-0.79f, -1.07f, -1.26f, -2.4f, -1.26f, -3.83f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.43f, 0f, 2.75f, 0.47f, 3.83f, 1.26f)
                lineToRelative(-9.07f, 9.07f)
                close()
                moveTo(13.67f, 22.74f)
                curveToRelative(1.07f, 0.79f, 2.4f, 1.26f, 3.83f, 1.26f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -1.43f, -0.47f, -2.75f, -1.26f, -3.83f)
                lineToRelative(-9.07f, 9.07f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, -1.66f, 0.48f, -3.19f, 1.3f, -4.5f)
                lineTo(0f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.72f, 0f, 3.27f, -0.73f, 4.36f, -1.89f)
                curveToRelative(-0.86f, -1.33f, -1.36f, -2.91f, -1.36f, -4.61f)
                close()
            }
        }.also { _Pills = it}
