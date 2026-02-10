package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Rr.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 2.63f, -3.39f, 5.4f, -5.07f, 6.69f)
                curveToRelative(-0.55f, 0.42f, -1.31f, 0.42f, -1.85f, 0f)
                curveToRelative(-1.68f, -1.28f, -5.07f, -4.06f, -5.07f, -6.69f)
                close()
                moveTo(23f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9.93f)
                lineToRelative(6.46f, 6.46f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f)
                curveToRelative(1.29f, 0f, 2.58f, -0.49f, 3.57f, -1.48f)
                lineToRelative(1.71f, -1.83f)
                curveToRelative(0.38f, -0.4f, 0.35f, -1.04f, -0.05f, -1.41f)
                curveToRelative(-0.4f, -0.38f, -1.04f, -0.36f, -1.41f, 0.05f)
                lineToRelative(-1.68f, 1.8f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0f)
                lineToRelative(-7.52f, -7.52f)
                curveToRelative(0.5f, -0.95f, 1.49f, -1.6f, 2.64f, -1.6f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _EmailHeart = it}
