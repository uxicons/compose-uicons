package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Sr.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.35f, -0.6f, -2.61f, -1.64f, -3.47f)
                curveToRelative(-0.43f, -0.35f, -0.49f, -0.98f, -0.13f, -1.41f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.14f)
                curveToRelative(1.5f, 1.24f, 2.36f, 3.07f, 2.36f, 5.01f)
                close()
                moveTo(3.64f, 11.97f)
                curveToRelative(-1.04f, -0.86f, -1.64f, -2.12f, -1.64f, -3.47f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(6.5f)
                curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
                curveToRelative(0f, 1.95f, 0.86f, 3.77f, 2.36f, 5.01f)
                curveToRelative(0.19f, 0.15f, 0.41f, 0.23f, 0.64f, 0.23f)
                curveToRelative(0.29f, 0f, 0.57f, -0.12f, 0.77f, -0.36f)
                curveToRelative(0.35f, -0.43f, 0.29f, -1.06f, -0.13f, -1.41f)
                close()
            }
        }.also { _LinkHorizontal = it}
