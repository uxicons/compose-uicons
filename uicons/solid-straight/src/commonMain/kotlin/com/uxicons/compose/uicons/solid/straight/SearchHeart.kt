package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Ss.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(277.26f, 196.88f)
                curveToRelative(0f, 22.87f, -34.07f, 58.96f, -63.88f, 82.63f)
                curveToRelative(-29.81f, -23.68f, -63.88f, -59.77f, -63.88f, -82.63f)
                curveToRelative(-1.06f, -12.9f, 8.41f, -24.27f, 21.29f, -25.55f)
                curveToRelative(10.99f, -0.77f, 20.52f, 7.52f, 21.29f, 18.51f)
                curveToRelative(0.06f, 0.93f, 0.06f, 1.85f, 0f, 2.78f)
                horizontalLineToRelative(42.58f)
                curveToRelative(-0.77f, -10.99f, 7.52f, -20.52f, 18.51f, -21.29f)
                curveToRelative(0.93f, -0.06f, 1.85f, -0.06f, 2.78f, 0f)
                curveTo(268.84f, 172.62f, 278.31f, 183.99f, 277.26f, 196.88f)
                close()
                moveTo(512f, 481.89f)
                lineTo(481.89f, 512f)
                lineTo(348.57f, 378.67f)
                curveToRelative(-91.18f, 74.55f, -225.53f, 61.07f, -300.09f, -30.11f)
                reflectiveCurveTo(-12.6f, 123.03f, 78.59f, 48.48f)
                reflectiveCurveToRelative(225.53f, -61.07f, 300.09f, 30.11f)
                curveToRelative(64.22f, 78.54f, 64.22f, 191.44f, 0f, 269.98f)
                lineTo(512f, 481.89f)
                close()
                moveTo(319.84f, 196.88f)
                curveToRelative(1.09f, -36.42f, -27.46f, -66.87f, -63.88f, -68.13f)
                curveToRelative(-15.91f, 0.07f, -31.17f, 6.3f, -42.58f, 17.37f)
                curveToRelative(-11.43f, -11.06f, -26.68f, -17.28f, -42.58f, -17.37f)
                curveToRelative(-36.42f, 1.25f, -64.97f, 31.71f, -63.88f, 68.13f)
                curveToRelative(0f, 58.38f, 84.51f, 119.85f, 94.15f, 126.66f)
                lineToRelative(12.31f, 8.71f)
                lineToRelative(12.28f, -8.71f)
                curveTo(235.31f, 316.73f, 319.84f, 255.26f, 319.84f, 196.88f)
                close()
            }
        }.also { _SearchHeart = it}
