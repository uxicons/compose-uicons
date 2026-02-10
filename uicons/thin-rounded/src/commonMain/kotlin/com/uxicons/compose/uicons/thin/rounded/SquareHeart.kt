package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareHeart: ImageVector? = null

val Icons.Tr.SquareHeart: ImageVector
    get() = _SquareHeart ?: UXIcon(name = "SquareHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.42f, 0f, -0.83f, -0.14f, -1.17f, -0.42f)
                curveToRelative(-1.8f, -1.49f, -4.83f, -4.37f, -4.83f, -6.97f)
                curveToRelative(0f, -1.99f, 1.46f, -3.61f, 3.25f, -3.61f)
                curveToRelative(1.16f, 0f, 2.17f, 0.67f, 2.75f, 1.69f)
                curveToRelative(0.58f, -1.01f, 1.59f, -1.69f, 2.75f, -1.69f)
                curveToRelative(1.79f, 0f, 3.25f, 1.62f, 3.25f, 3.61f)
                curveToRelative(0f, 2.6f, -3.03f, 5.48f, -4.83f, 6.97f)
                curveToRelative(-0.34f, 0.28f, -0.76f, 0.42f, -1.17f, 0.42f)
                close()
                moveTo(9.25f, 8f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.17f, -2.25f, 2.61f)
                curveToRelative(0f, 2.27f, 3.12f, 5.09f, 4.47f, 6.2f)
                curveToRelative(0.31f, 0.26f, 0.75f, 0.26f, 1.07f, 0f)
                curveToRelative(1.34f, -1.11f, 4.46f, -3.93f, 4.46f, -6.2f)
                curveToRelative(0f, -1.44f, -1.01f, -2.61f, -2.25f, -2.61f)
                reflectiveCurveToRelative(-2.25f, 1.17f, -2.25f, 2.61f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.44f, -1.01f, -2.61f, -2.25f, -2.61f)
                close()
            }
        }.also { _SquareHeart = it}
