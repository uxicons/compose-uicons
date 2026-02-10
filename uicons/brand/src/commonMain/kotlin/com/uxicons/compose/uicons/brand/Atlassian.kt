package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Atlassian: ImageVector? = null

val Icons.Brand.Atlassian: ImageVector
    get() = _Atlassian ?: UXIcon(name = "Atlassian") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.13f, 11.08f)
            curveToRelative(-0.36f, -0.4f, -0.91f, -0.36f, -1.16f, 0.11f)
            lineTo(0.07f, 22.98f)
            curveTo(-0.14f, 23.45f, 0.18f, 24f, 0.69f, 24f)
            horizontalLineToRelative(8.19f)
            curveToRelative(0.26f, 0f, 0.51f, -0.15f, 0.62f, -0.4f)
            curveTo(11.28f, 19.96f, 10.23f, 14.39f, 7.13f, 11.08f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.43f, 0.38f)
            curveToRelative(-3.27f, 5.2f, -3.06f, 10.99f, -0.91f, 15.32f)
            curveToRelative(2.18f, 4.33f, 3.82f, 7.68f, 3.97f, 7.9f)
            curveToRelative(0.11f, 0.26f, 0.36f, 0.4f, 0.62f, 0.4f)
            horizontalLineToRelative(8.19f)
            curveToRelative(0.51f, 0f, 0.87f, -0.55f, 0.62f, -1.02f)
            curveToRelative(0f, 0f, -11.03f, -22.05f, -11.32f, -22.6f)
            curveTo(12.38f, -0.13f, 11.76f, -0.13f, 11.43f, 0.38f)
            close()
        }
    }.also { _Atlassian = it }
