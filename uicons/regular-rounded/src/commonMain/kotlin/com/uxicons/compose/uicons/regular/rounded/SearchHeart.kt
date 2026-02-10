package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Rr.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(506.02f, 475.74f)
                lineTo(378.86f, 348.59f)
                curveToRelative(74.59f, -91.23f, 61.1f, -225.65f, -30.12f, -300.24f)
                reflectiveCurveTo(123.1f, -12.76f, 48.5f, 78.47f)
                reflectiveCurveTo(-12.6f, 304.12f, 78.63f, 378.71f)
                curveToRelative(78.58f, 64.25f, 191.54f, 64.25f, 270.12f, 0f)
                lineToRelative(127.15f, 127.15f)
                curveToRelative(8.46f, 8.17f, 21.95f, 7.94f, 30.12f, -0.52f)
                curveTo(513.99f, 497.09f, 513.99f, 484f, 506.02f, 475.74f)
                close()
                moveTo(43.6f, 213.87f)
                curveToRelative(0f, -94.12f, 76.3f, -170.42f, 170.42f, -170.42f)
                reflectiveCurveToRelative(170.42f, 76.3f, 170.42f, 170.42f)
                reflectiveCurveToRelative(-76.3f, 170.42f, -170.42f, 170.42f)
                curveTo(119.95f, 384.18f, 43.71f, 307.95f, 43.6f, 213.87f)
                close()
                moveTo(256.63f, 128.66f)
                curveToRelative(-15.91f, 0.07f, -31.18f, 6.3f, -42.6f, 17.38f)
                curveToRelative(-11.42f, -11.08f, -26.69f, -17.31f, -42.6f, -17.38f)
                curveToRelative(-36.43f, 1.26f, -65f, 31.73f, -63.91f, 68.17f)
                curveToRelative(0f, 42.6f, 43.48f, 86.55f, 79.97f, 115.89f)
                curveToRelative(15.53f, 12.37f, 37.55f, 12.37f, 53.09f, 0f)
                curveToRelative(36.49f, -29.33f, 79.97f, -73.28f, 79.97f, -115.89f)
                curveTo(321.63f, 160.39f, 293.06f, 129.92f, 256.63f, 128.66f)
                close()
                moveTo(214.15f, 279.48f)
                curveToRelative(-39.49f, -31.74f, -64.04f, -63.48f, -64.04f, -82.65f)
                curveToRelative(-1.06f, -12.91f, 8.42f, -24.28f, 21.3f, -25.56f)
                curveToRelative(12.89f, 1.28f, 22.37f, 12.66f, 21.3f, 25.56f)
                curveToRelative(0f, 11.77f, 9.54f, 21.3f, 21.3f, 21.3f)
                curveToRelative(11.77f, 0f, 21.3f, -9.54f, 21.3f, -21.3f)
                curveToRelative(-1.06f, -12.91f, 8.42f, -24.28f, 21.3f, -25.56f)
                curveToRelative(12.89f, 1.28f, 22.37f, 12.66f, 21.3f, 25.56f)
                curveTo(277.93f, 216f, 253.39f, 247.74f, 214.15f, 279.48f)
                lineTo(214.15f, 279.48f)
                close()
            }
        }.also { _SearchHeart = it}
