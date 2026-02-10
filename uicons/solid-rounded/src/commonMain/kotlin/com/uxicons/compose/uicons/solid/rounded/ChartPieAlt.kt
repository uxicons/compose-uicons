package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Sr.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(399.21f, 256f)
                horizontalLineTo(298.67f)
                curveTo(275.1f, 256f, 256f, 236.9f, 256f, 213.33f)
                verticalLineTo(112.51f)
                curveToRelative(0.06f, -19.89f, -9.13f, -38.68f, -24.88f, -50.84f)
                curveToRelative(-14.92f, -11.81f, -34.47f, -16.02f, -52.93f, -11.39f)
                curveTo(52.77f, 81.42f, -23.67f, 208.34f, 7.46f, 333.77f)
                curveToRelative(21.94f, 88.37f, 93.14f, 155.99f, 182.53f, 173.34f)
                curveToRelative(122.11f, 23.37f, 241.26f, -52.55f, 271.66f, -173.1f)
                curveToRelative(4.65f, -18.48f, 0.44f, -38.07f, -11.37f, -53.01f)
                curveTo(437.98f, 265.29f, 419.17f, 256.08f, 399.21f, 256f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(504.55f, 158.85f)
                curveToRelative(-4.87f, -18.1f, -12.12f, -35.48f, -21.57f, -51.67f)
                curveToRelative(-28.41f, -48.74f, -74.82f, -84.38f, -129.24f, -99.24f)
                curveTo(350.17f, 6.97f, 342.14f, 6.4f, 342.14f, 6.4f)
                curveToRelative(-2.87f, 0f, -15.21f, 0f, -24.98f, 7.91f)
                curveToRelative(-14.36f, 11.3f, -16.62f, 24.15f, -16.83f, 25.15f)
                curveToRelative(-0.75f, 3.15f, -1.13f, 6.37f, -1.15f, 9.6f)
                verticalLineToRelative(100.27f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(100.67f)
                curveToRelative(13.36f, 0.04f, 25.93f, -6.3f, 33.83f, -17.07f)
                curveToRelative(5.85f, -7.89f, 8.86f, -17.52f, 8.53f, -27.33f)
                curveTo(506.05f, 165.52f, 505.49f, 162.14f, 504.55f, 158.85f)
                close()
            }
        }.also { _ChartPieAlt = it}
