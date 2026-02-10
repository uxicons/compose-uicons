package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Bs.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 6f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(20f, 21f)
                lineTo(4f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveTo(7.5f, 13.47f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, 2.59f, -4.5f, 5.78f, -4.5f, 5.78f)
                curveToRelative(0f, 0f, -4.5f, -3.18f, -4.5f, -5.78f)
                close()
            }
        }.also { _BoxHeart = it}
