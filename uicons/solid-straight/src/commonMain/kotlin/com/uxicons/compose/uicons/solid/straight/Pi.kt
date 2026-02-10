package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Ss.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.84f, 0f, -3.35f, 0.58f, -4.48f, 1.72f)
                curveTo(-0.01f, 3.77f, 0f, 6.88f, 0f, 7.01f)
                lineToRelative(2f, -0.02f)
                curveToRelative(0f, -0.02f, 0.01f, -2.43f, 1.45f, -3.88f)
                curveToRelative(0.75f, -0.75f, 1.75f, -1.12f, 3.05f, -1.12f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(13.87f)
                curveToRelative(0f, 4.08f, -2.66f, 6.63f, -2.68f, 6.66f)
                lineToRelative(1.36f, 1.47f)
                curveToRelative(0.14f, -0.13f, 3.32f, -3.14f, 3.32f, -8.12f)
                verticalLineTo(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineTo(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Pi = it}
