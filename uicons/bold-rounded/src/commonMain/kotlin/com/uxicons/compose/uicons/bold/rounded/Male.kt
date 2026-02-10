package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Male: ImageVector? = null

val Icons.Br.Male: ImageVector
    get() = _Male ?: UXIcon(name = "Male", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(437.46f, 0f)
            horizontalLineToRelative(-85.19f)
            curveToRelative(-17.64f, 0f, -31.95f, 14.3f, -31.95f, 31.95f)
            reflectiveCurveToRelative(14.3f, 31.95f, 31.95f, 31.95f)
            horizontalLineToRelative(50.67f)
            lineTo(285.18f, 181.64f)
            curveToRelative(-82.23f, -57.28f, -195.32f, -37.06f, -252.6f, 45.17f)
            reflectiveCurveTo(-4.48f, 422.14f, 77.75f, 479.42f)
            reflectiveCurveToRelative(195.32f, 37.06f, 252.6f, -45.17f)
            curveToRelative(43.42f, -62.33f, 43.42f, -145.1f, 0f, -207.43f)
            lineToRelative(117.75f, -117.75f)
            verticalLineToRelative(50.67f)
            curveToRelative(0f, 17.64f, 14.3f, 31.95f, 31.95f, 31.95f)
            reflectiveCurveTo(512f, 177.37f, 512f, 159.73f)
            verticalLineTo(74.54f)
            curveTo(512f, 33.37f, 478.63f, 0f, 437.46f, 0f)
            close()
            moveTo(181.89f, 447.24f)
            curveToRelative(-64.69f, 0f, -117.14f, -52.44f, -117.14f, -117.14f)
            reflectiveCurveToRelative(52.44f, -117.14f, 117.14f, -117.14f)
            reflectiveCurveToRelative(117.14f, 52.44f, 117.14f, 117.14f)
            curveTo(298.96f, 394.77f, 246.56f, 447.17f, 181.89f, 447.24f)
            close()
        }
    }.also { _Male = it }
