package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Ts.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 23.48f)
                reflectiveCurveToRelative(-0.96f, -0.69f, -1.12f, -0.8f)
                curveTo(4.1f, 17.42f, 0f, 12.36f, 0f, 8.06f)
                curveToRelative(-0.07f, -1.96f, 0.61f, -3.84f, 1.87f, -5.16f)
                curveToRelative(1.2f, -1.24f, 2.8f, -1.9f, 4.64f, -1.9f)
                curveToRelative(2.28f, 0.05f, 4.37f, 1.31f, 5.47f, 3.29f)
                curveToRelative(0.01f, 0f, 1.02f, 1.44f, 1.02f, 3.75f)
                verticalLineToRelative(15.43f)
                close()
                moveTo(6.5f, 2f)
                curveToRelative(-1.55f, 0f, -2.91f, 0.55f, -3.91f, 1.59f)
                curveToRelative(-1.08f, 1.12f, -1.66f, 2.74f, -1.59f, 4.44f)
                curveToRelative(0f, 3.84f, 3.9f, 8.62f, 11f, 13.51f)
                verticalLineTo(8.05f)
                curveToRelative(0f, -1.98f, -0.85f, -3.21f, -0.86f, -3.22f)
                curveToRelative(-0.96f, -1.72f, -2.72f, -2.79f, -4.63f, -2.83f)
                close()
            }
        }.also { _HeartHalf = it}
