package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothbrush: ImageVector? = null

val Icons.Sr.Toothbrush: ImageVector
    get() = _Toothbrush ?: UXIcon(name = "Toothbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(-0.41f)
                curveToRelative(0f, -0.63f, -0.37f, -1.19f, -0.95f, -1.44f)
                curveToRelative(-0.57f, -0.24f, -1.22f, -0.13f, -1.67f, 0.3f)
                curveToRelative(-0.37f, 0.36f, -0.86f, 0.55f, -1.38f, 0.55f)
                lineTo(6.69f, 2.0f)
                curveTo(3.8f, 2f, 1.24f, 3.74f, 0.18f, 6.43f)
                curveToRelative(-0.31f, 0.79f, -0.21f, 1.69f, 0.27f, 2.41f)
                curveToRelative(0.49f, 0.73f, 1.31f, 1.16f, 2.19f, 1.16f)
                horizontalLineToRelative(0.35f)
                verticalLineToRelative(8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.26f)
                curveToRelative(1.81f, -1.27f, 3f, -3.36f, 3f, -5.74f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.69f, 0f, 1.36f, -0.1f, 2.0f, -0.29f)
                verticalLineToRelative(8.29f)
                close()
            }
        }.also { _Toothbrush = it}
