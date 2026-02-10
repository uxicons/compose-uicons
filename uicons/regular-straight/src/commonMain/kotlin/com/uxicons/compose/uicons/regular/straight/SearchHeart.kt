package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Rs.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(512f, 481.89f)
                lineTo(378.67f, 348.57f)
                curveToRelative(74.55f, -91.18f, 61.07f, -225.53f, -30.11f, -300.09f)
                reflectiveCurveTo(123.03f, -12.6f, 48.48f, 78.59f)
                reflectiveCurveToRelative(-61.07f, 225.53f, 30.11f, 300.09f)
                curveToRelative(78.54f, 64.22f, 191.44f, 64.22f, 269.98f, 0f)
                lineTo(481.89f, 512f)
                lineTo(512f, 481.89f)
                close()
                moveTo(213.92f, 384.25f)
                curveToRelative(-94.07f, 0f, -170.33f, -76.26f, -170.33f, -170.33f)
                reflectiveCurveTo(119.84f, 43.58f, 213.92f, 43.58f)
                reflectiveCurveTo(384.25f, 119.84f, 384.25f, 213.92f)
                curveTo(384.14f, 307.95f, 307.95f, 384.14f, 213.92f, 384.25f)
                close()
                moveTo(255.97f, 128.75f)
                curveToRelative(-15.5f, -0.19f, -30.53f, 5.32f, -42.24f, 15.48f)
                curveToRelative(-11.96f, -10.19f, -27.21f, -15.69f, -42.92f, -15.48f)
                curveToRelative(-36.42f, 1.25f, -64.97f, 31.71f, -63.88f, 68.13f)
                curveToRelative(0f, 58.38f, 84.51f, 119.85f, 94.15f, 126.66f)
                lineToRelative(12.31f, 8.71f)
                lineToRelative(12.28f, -8.71f)
                curveToRelative(9.65f, -6.81f, 94.17f, -68.28f, 94.17f, -126.66f)
                curveTo(320.93f, 160.46f, 292.38f, 130.01f, 255.97f, 128.75f)
                close()
                moveTo(213.38f, 279.52f)
                curveToRelative(-29.81f, -23.68f, -63.88f, -59.77f, -63.88f, -82.63f)
                curveToRelative(-1.06f, -12.9f, 8.41f, -24.27f, 21.29f, -25.55f)
                curveToRelative(11.29f, -0.75f, 21.05f, 7.79f, 21.8f, 19.08f)
                curveToRelative(0.05f, 0.74f, 0.06f, 1.48f, 0.03f, 2.21f)
                horizontalLineToRelative(42.58f)
                curveToRelative(-1f, -10.74f, 6.89f, -20.25f, 17.63f, -21.25f)
                curveToRelative(1.04f, -0.1f, 2.09f, -0.11f, 3.13f, -0.04f)
                curveToRelative(12.87f, 1.29f, 22.34f, 12.65f, 21.29f, 25.55f)
                curveTo(277.26f, 219.75f, 243.11f, 255.84f, 213.38f, 279.52f)
                lineTo(213.38f, 279.52f)
                close()
            }
        }.also { _SearchHeart = it}
