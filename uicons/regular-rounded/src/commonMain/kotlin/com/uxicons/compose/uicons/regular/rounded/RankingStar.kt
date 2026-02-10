package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingStar: ImageVector? = null

val Icons.Rr.RankingStar: ImageVector
    get() = _RankingStar ?: UXIcon(name = "RankingStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 16f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9f, 12.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(2f, 20.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(22f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(8.04f, 2.86f)
                curveToRelative(0.1f, -0.26f, 0.35f, -0.44f, 0.63f, -0.44f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.71f, -1.99f)
                curveToRelative(0.1f, -0.26f, 0.35f, -0.43f, 0.62f, -0.43f)
                reflectiveCurveToRelative(0.53f, 0.17f, 0.62f, 0.43f)
                lineToRelative(0.71f, 1.99f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.28f, 0f, 0.53f, 0.17f, 0.63f, 0.44f)
                reflectiveCurveToRelative(0.02f, 0.56f, -0.2f, 0.74f)
                lineToRelative(-1.58f, 1.28f)
                lineToRelative(0.65f, 1.99f)
                curveToRelative(0.09f, 0.27f, -0.0f, 0.56f, -0.23f, 0.74f)
                curveToRelative(-0.23f, 0.17f, -0.53f, 0.18f, -0.77f, 0.03f)
                lineToRelative(-1.84f, -1.2f)
                lineToRelative(-1.8f, 1.21f)
                curveToRelative(-0.11f, 0.07f, -0.24f, 0.11f, -0.37f, 0.11f)
                curveToRelative(-0.14f, 0f, -0.28f, -0.04f, -0.4f, -0.13f)
                curveToRelative(-0.23f, -0.17f, -0.32f, -0.46f, -0.24f, -0.73f)
                lineToRelative(0.63f, -2.01f)
                lineToRelative(-1.58f, -1.29f)
                curveToRelative(-0.21f, -0.18f, -0.29f, -0.48f, -0.19f, -0.74f)
                close()
            }
        }.also { _RankingStar = it}
