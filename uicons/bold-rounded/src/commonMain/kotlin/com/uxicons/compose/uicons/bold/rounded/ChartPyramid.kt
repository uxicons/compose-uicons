package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Br.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(501.31f, 377.01f)
            lineTo(339.69f, 51.85f)
            curveTo(316.73f, 5.63f, 260.67f, -13.23f, 214.45f, 9.73f)
            curveToRelative(-18.26f, 9.07f, -33.05f, 23.86f, -42.12f, 42.12f)
            lineTo(10.71f, 377.01f)
            curveToRelative(-22.97f, 46.22f, -4.11f, 102.31f, 42.1f, 125.27f)
            curveToRelative(12.92f, 6.42f, 27.16f, 9.76f, 41.59f, 9.76f)
            horizontalLineToRelative(323.21f)
            curveToRelative(51.61f, 0f, 93.45f, -41.83f, 93.46f, -93.44f)
            curveTo(511.08f, 404.17f, 507.73f, 389.94f, 501.31f, 377.01f)
            close()
            moveTo(396.54f, 309.77f)
            horizontalLineTo(115.49f)
            lineToRelative(42.33f, -85.17f)
            horizontalLineTo(354.25f)
            lineTo(396.54f, 309.77f)
            close()
            moveTo(256.01f, 63.85f)
            curveToRelative(11.26f, -0.12f, 21.59f, 6.27f, 26.49f, 16.42f)
            lineToRelative(39.99f, 80.46f)
            horizontalLineTo(189.54f)
            lineToRelative(39.99f, -80.46f)
            curveTo(234.43f, 70.14f, 244.75f, 63.74f, 256.01f, 63.85f)
            close()
            moveTo(442.76f, 434.16f)
            curveToRelative(-5.34f, 8.77f, -14.88f, 14.09f, -25.15f, 14.01f)
            horizontalLineTo(94.41f)
            curveToRelative(-16.33f, 0f, -29.58f, -13.24f, -29.58f, -29.57f)
            curveToRelative(0f, -4.57f, 1.06f, -9.07f, 3.09f, -13.16f)
            lineToRelative(15.8f, -31.79f)
            horizontalLineToRelative(344.59f)
            lineToRelative(15.8f, 31.79f)
            curveTo(448.75f, 414.58f, 448.24f, 425.49f, 442.76f, 434.16f)
            lineTo(442.76f, 434.16f)
            close()
        }
    }.also { _ChartPyramid = it }
