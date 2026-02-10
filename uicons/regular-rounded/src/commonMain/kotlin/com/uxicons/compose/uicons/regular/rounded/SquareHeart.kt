package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareHeart: ImageVector? = null

val Icons.Rr.SquareHeart: ImageVector
    get() = _SquareHeart ?: UXIcon(name = "SquareHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                close()
                moveTo(12f, 17.84f)
                curveToRelative(-0.5f, 0f, -1f, -0.16f, -1.4f, -0.49f)
                curveToRelative(-2.1f, -1.68f, -4.6f, -4.2f, -4.6f, -6.6f)
                curveToRelative(0f, -2.07f, 1.57f, -3.75f, 3.5f, -3.75f)
                curveToRelative(0.98f, 0f, 1.86f, 0.43f, 2.5f, 1.13f)
                curveToRelative(0.64f, -0.7f, 1.52f, -1.13f, 2.5f, -1.13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.68f, 3.5f, 3.75f)
                curveToRelative(0f, 2.41f, -2.5f, 4.92f, -4.6f, 6.6f)
                curveToRelative(-0.41f, 0.33f, -0.9f, 0.49f, -1.4f, 0.49f)
                close()
                moveTo(9.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.79f, -1.5f, 1.75f)
                curveToRelative(0f, 1.2f, 1.48f, 3.14f, 3.85f, 5.04f)
                curveToRelative(0.09f, 0.07f, 0.21f, 0.07f, 0.3f, 0f)
                curveToRelative(2.38f, -1.91f, 3.85f, -3.84f, 3.85f, -5.04f)
                curveToRelative(0f, -0.96f, -0.67f, -1.75f, -1.5f, -1.75f)
                reflectiveCurveToRelative(-1.5f, 0.79f, -1.5f, 1.75f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.96f, -0.67f, -1.75f, -1.5f, -1.75f)
                close()
            }
        }.also { _SquareHeart = it}
