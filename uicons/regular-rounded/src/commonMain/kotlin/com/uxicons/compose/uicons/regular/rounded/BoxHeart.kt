package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxHeart: ImageVector? = null

val Icons.Rr.BoxHeart: ImageVector
    get() = _BoxHeart ?: UXIcon(name = "BoxHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineToRelative(10.78f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-10.78f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(10f)
                close()
                moveTo(10.79f, 19.7f)
                curveToRelative(0.36f, 0.3f, 0.81f, 0.44f, 1.25f, 0.44f)
                reflectiveCurveToRelative(0.89f, -0.15f, 1.25f, -0.44f)
                curveToRelative(2.52f, -2.06f, 3.75f, -3.83f, 3.75f, -5.43f)
                curveToRelative(0f, -1.78f, -1.35f, -3.23f, -3f, -3.23f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.31f, -2f, 0.83f)
                curveToRelative(-0.53f, -0.51f, -1.23f, -0.83f, -2f, -0.83f)
                curveToRelative(-1.65f, 0f, -3f, 1.45f, -3f, 3.23f)
                curveToRelative(0f, 1.6f, 1.23f, 3.37f, 3.75f, 5.43f)
                close()
                moveTo(10.04f, 13.04f)
                curveToRelative(0.55f, 0f, 1f, 0.55f, 1f, 1.24f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.68f, 0.45f, -1.24f, 1f, -1.24f)
                reflectiveCurveToRelative(1f, 0.55f, 1f, 1.24f)
                curveToRelative(0f, 0.43f, -0.29f, 1.66f, -2.99f, 3.88f)
                curveToRelative(-2.72f, -2.22f, -3.01f, -3.45f, -3.01f, -3.88f)
                curveToRelative(0f, -0.68f, 0.45f, -1.24f, 1f, -1.24f)
                close()
            }
        }.also { _BoxHeart = it}
