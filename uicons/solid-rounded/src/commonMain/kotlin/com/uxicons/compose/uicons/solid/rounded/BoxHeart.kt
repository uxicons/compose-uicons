package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Sr.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.04f, 15.27f)
                curveToRelative(0f, 0.43f, -0.29f, 1.66f, -2.99f, 3.88f)
                curveToRelative(-2.72f, -2.22f, -3.01f, -3.45f, -3.01f, -3.88f)
                curveToRelative(0f, -0.68f, 0.45f, -1.24f, 1f, -1.24f)
                reflectiveCurveToRelative(1f, 0.55f, 1f, 1.24f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.68f, 0.45f, -1.24f, 1f, -1.24f)
                reflectiveCurveToRelative(1f, 0.55f, 1f, 1.24f)
                close()
                moveTo(23.0f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(-0.0f, 2.76f, -2.24f, 5.0f, -5f, 5f)
                lineTo(6f, 24f)
                curveToRelative(-2.76f, -0.0f, -5.0f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.04f, 15.27f)
                curveToRelative(0f, -1.78f, -1.35f, -3.23f, -3f, -3.23f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.31f, -2f, 0.83f)
                curveToRelative(-0.53f, -0.51f, -1.23f, -0.83f, -2f, -0.83f)
                curveToRelative(-1.65f, 0f, -3f, 1.45f, -3f, 3.23f)
                curveToRelative(0f, 1.6f, 1.23f, 3.37f, 3.75f, 5.43f)
                curveToRelative(0.36f, 0.3f, 0.81f, 0.44f, 1.25f, 0.44f)
                reflectiveCurveToRelative(0.89f, -0.15f, 1.25f, -0.44f)
                curveToRelative(2.52f, -2.06f, 3.75f, -3.83f, 3.75f, -5.43f)
                close()
                moveTo(19.22f, 0.01f)
                curveToRelative(-0.07f, -0.0f, -14.22f, -0.01f, -14.22f, -0.01f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.58f, 0.02f, 2.9f, -1.2f, 3f, -2.78f)
                curveTo(24.12f, 2.46f, 21.98f, 0.12f, 19.22f, 0.01f)
                close()
            }
        }.also { _BoxHeart = it}
