package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Bs.PlateUtensils: ImageVector
    get() = _PlateUtensils ?: UXIcon(name = "PlateUtensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12f)
                curveToRelative(0f, -3.91f, 2.51f, -7.23f, 6f, -8.47f)
                verticalLineTo(0.4f)
                curveTo(3.83f, 1.73f, 0f, 6.42f, 0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(0.69f, 0f, 1.35f, -0.08f, 2f, -0.2f)
                verticalLineToRelative(-3.04f)
                curveToRelative(-0.64f, 0.15f, -1.31f, 0.24f, -2f, 0.24f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(0f, -1.01f, 0.38f, -1.91f, 1f, -2.61f)
                verticalLineToRelative(-3.69f)
                curveToRelative(-2.36f, 1.12f, -4f, 3.52f, -4f, 6.31f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                curveToRelative(0.7f, 0f, 1.36f, -0.12f, 2f, -0.31f)
                verticalLineToRelative(-3.27f)
                curveToRelative(-0.59f, 0.35f, -1.26f, 0.57f, -2f, 0.57f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
            }
        }.also { _PlateUtensils = it}
