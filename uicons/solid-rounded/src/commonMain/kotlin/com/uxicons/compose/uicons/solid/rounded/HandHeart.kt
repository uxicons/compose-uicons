package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHeart: ImageVector? = null

val Icons.Sr.HandHeart: ImageVector
    get() = _HandHeart ?: UXIcon(name = "HandHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(16f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(14f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(11f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(9f, 3.58f)
                curveToRelative(0f, -0.75f, -0.51f, -1.44f, -1.25f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(12.65f)
                lineToRelative(-2.6f, -2.65f)
                curveToRelative(-0.09f, -0.09f, -0.24f, -0.2f, -0.44f, -0.33f)
                curveToRelative(-0.84f, -0.47f, -1.95f, -0.28f, -2.58f, 0.56f)
                curveToRelative(-0.6f, 0.81f, -0.44f, 1.97f, 0.28f, 2.68f)
                lineToRelative(5.0f, 5.16f)
                curveToRelative(1.51f, 1.55f, 3.58f, 2.43f, 5.75f, 2.43f)
                horizontalLineToRelative(7.61f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.62f, 20.78f)
                curveToRelative(-0.36f, 0.29f, -0.88f, 0.29f, -1.24f, 0f)
                curveToRelative(-1.12f, -0.9f, -3.38f, -2.85f, -3.38f, -4.58f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, 1.73f, -2.26f, 3.68f, -3.38f, 4.58f)
                close()
            }
        }.also { _HandHeart = it}
