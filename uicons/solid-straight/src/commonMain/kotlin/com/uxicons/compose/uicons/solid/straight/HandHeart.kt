package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHeart: ImageVector? = null

val Icons.Ss.HandHeart: ImageVector
    get() = _HandHeart ?: UXIcon(name = "HandHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(16f, 12f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(11f, 12f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 3.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(12.65f)
                lineToRelative(-2.6f, -2.65f)
                curveToRelative(-0.09f, -0.09f, -0.24f, -0.2f, -0.44f, -0.33f)
                curveToRelative(-0.84f, -0.47f, -1.95f, -0.28f, -2.58f, 0.56f)
                curveToRelative(-0.6f, 0.81f, -0.44f, 1.97f, 0.28f, 2.68f)
                lineToRelative(7.35f, 7.59f)
                lineTo(24f, 24.0f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15f, 22.2f)
                reflectiveCurveToRelative(-4f, -2.78f, -4f, -5.04f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.77f, 2f, 1.96f)
                curveToRelative(0f, -1.19f, 0.9f, -1.96f, 2f, -1.96f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                curveToRelative(0f, 2.26f, -4f, 5.04f, -4f, 5.04f)
                close()
            }
        }.also { _HandHeart = it}
