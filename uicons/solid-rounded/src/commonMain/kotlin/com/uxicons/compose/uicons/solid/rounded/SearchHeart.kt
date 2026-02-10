package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchHeart: ImageVector? = null

val Icons.Sr.SearchHeart: ImageVector
    get() = _SearchHeart ?: UXIcon(name = "SearchHeart", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(506.02f, 475.9f)
                lineTo(378.86f, 348.74f)
                curveToRelative(74.59f, -91.23f, 61.1f, -225.65f, -30.12f, -300.24f)
                reflectiveCurveTo(123.1f, -12.6f, 48.5f, 78.63f)
                reflectiveCurveToRelative(-61.1f, 225.65f, 30.12f, 300.24f)
                curveToRelative(78.58f, 64.25f, 191.54f, 64.25f, 270.12f, 0f)
                lineTo(475.9f, 506.02f)
                curveToRelative(8.46f, 8.17f, 21.95f, 7.94f, 30.12f, -0.52f)
                curveTo(513.99f, 497.24f, 513.99f, 484.15f, 506.02f, 475.9f)
                close()
                moveTo(240.57f, 312.85f)
                curveToRelative(-15.53f, 12.37f, -37.55f, 12.37f, -53.09f, 0f)
                curveToRelative(-36.49f, -29.31f, -79.97f, -73.26f, -79.97f, -115.86f)
                curveToRelative(-1.09f, -36.44f, 27.48f, -66.91f, 63.91f, -68.17f)
                curveToRelative(15.91f, 0.07f, 31.18f, 6.3f, 42.6f, 17.38f)
                curveToRelative(11.42f, -11.08f, 26.69f, -17.31f, 42.6f, -17.38f)
                curveToRelative(36.43f, 1.26f, 65f, 31.73f, 63.91f, 68.17f)
                curveTo(320.54f, 239.59f, 277.06f, 283.54f, 240.57f, 312.85f)
                close()
                moveTo(277.93f, 196.98f)
                curveToRelative(0f, 19.17f, -24.54f, 50.91f, -63.78f, 82.65f)
                curveToRelative(-39.49f, -31.74f, -64.04f, -63.48f, -64.04f, -82.65f)
                curveToRelative(-1.06f, -12.91f, 8.42f, -24.28f, 21.3f, -25.56f)
                curveToRelative(12.89f, 1.28f, 22.37f, 12.66f, 21.3f, 25.56f)
                curveToRelative(0f, 11.77f, 9.54f, 21.3f, 21.3f, 21.3f)
                curveToRelative(11.77f, 0f, 21.3f, -9.54f, 21.3f, -21.3f)
                curveToRelative(-1.06f, -12.91f, 8.42f, -24.28f, 21.3f, -25.56f)
                curveTo(269.52f, 172.7f, 279f, 184.08f, 277.93f, 196.98f)
                close()
            }
        }.also { _SearchHeart = it}
