package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Sr.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                curveToRelative(0f, 2.63f, -3.39f, 5.4f, -5.07f, 6.69f)
                curveToRelative(-0.55f, 0.42f, -1.31f, 0.42f, -1.85f, 0f)
                curveToRelative(-1.68f, -1.28f, -5.07f, -4.06f, -5.07f, -6.69f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(12f, 15.42f)
                curveToRelative(0.77f, 0f, 1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(2.74f, -2.74f)
                curveToRelative(-0.35f, -0.12f, -0.69f, -0.3f, -1.0f, -0.53f)
                curveToRelative(-3.94f, -3.01f, -5.86f, -5.72f, -5.86f, -8.28f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.81f, 0f, -3.38f, 0.97f, -4.26f, 2.41f)
                lineToRelative(9.13f, 9.13f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                close()
                moveTo(20.55f, 10.95f)
                lineTo(15.54f, 15.96f)
                curveToRelative(-0.97f, 0.97f, -2.25f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineToRelative(-8.42f, -8.42f)
                curveToRelative(-0.01f, 0.15f, -0.05f, 0.3f, -0.05f, 0.46f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11.33f)
                curveToRelative(-0.86f, 1.06f, -2.01f, 2.15f, -3.45f, 3.28f)
                close()
            }
        }.also { _EmailHeart = it}
