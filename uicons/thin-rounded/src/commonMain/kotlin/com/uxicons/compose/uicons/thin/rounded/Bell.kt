package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Tr.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 13.66f)
                lineToRelative(-1.9f, -6.84f)
                curveTo(19.84f, 2.81f, 16.15f, 0f, 11.98f, 0f)
                curveTo(7.58f, 0f, 3.83f, 3.0f, 2.88f, 7.28f)
                lineToRelative(-1.77f, 6.63f)
                curveToRelative(-0.33f, 1.49f, 0.03f, 3.02f, 0.98f, 4.21f)
                curveToRelative(0.95f, 1.19f, 2.38f, 1.87f, 3.9f, 1.87f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.47f, 2.31f, 2.48f, 4f, 4.88f, 4f)
                reflectiveCurveToRelative(4.41f, -1.7f, 4.88f, -4f)
                horizontalLineToRelative(1.16f)
                curveToRelative(1.58f, 0f, 3.03f, -0.72f, 3.98f, -1.98f)
                curveToRelative(0.95f, -1.25f, 1.26f, -2.84f, 0.84f, -4.36f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-1.85f, 0f, -3.41f, -1.26f, -3.86f, -3f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-0.45f, 1.74f, -2.01f, 3f, -3.86f, 3f)
                close()
                moveTo(21.23f, 17.42f)
                curveToRelative(-0.76f, 1.0f, -1.92f, 1.58f, -3.19f, 1.58f)
                lineTo(6f, 19f)
                curveToRelative(-1.22f, 0f, -2.36f, -0.55f, -3.12f, -1.5f)
                curveToRelative(-0.76f, -0.95f, -1.05f, -2.18f, -0.79f, -3.35f)
                lineToRelative(1.77f, -6.64f)
                curveTo(4.71f, 3.68f, 8.05f, 1f, 11.98f, 1f)
                curveToRelative(3.72f, 0f, 7.02f, 2.51f, 8.02f, 6.09f)
                lineToRelative(1.9f, 6.84f)
                curveToRelative(0.34f, 1.22f, 0.09f, 2.49f, -0.67f, 3.49f)
                close()
            }
        }.also { _Bell = it}
