package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SiteAlt: ImageVector? = null

val Icons.Bs.SiteAlt: ImageVector
    get() = _SiteAlt ?: UXIcon(name = "SiteAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                lineToRelative(13f, 4.45f)
                lineToRelative(-5.82f, 2.74f)
                lineToRelative(-2.74f, 5.82f)
                lineToRelative(-4.45f, -13f)
                close()
                moveTo(11.84f, 19.64f)
                lineToRelative(1.47f, 4.28f)
                curveToRelative(-0.43f, 0.05f, -0.86f, 0.07f, -1.31f, 0.07f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 0.44f, -0.03f, 0.88f, -0.07f, 1.31f)
                lineToRelative(-2.94f, -1.01f)
                curveToRelative(0.0f, -0.1f, 0.01f, -0.2f, 0.01f, -0.3f)
                curveToRelative(0f, -3.85f, -2.43f, -7.14f, -5.84f, -8.43f)
                curveToRelative(1.03f, 1.9f, 2.11f, 4.54f, 2.3f, 7.52f)
                lineToRelative(-3.13f, -1.07f)
                curveToRelative(-0.41f, -2.44f, -1.48f, -4.56f, -2.33f, -5.92f)
                curveToRelative(-1.07f, 1.73f, -2.5f, 4.65f, -2.5f, 7.9f)
                lineToRelative(0.06f, 0.98f)
                curveToRelative(0.23f, 2.71f, 1.34f, 5.11f, 2.28f, 6.66f)
                close()
                moveTo(3.13f, 10.5f)
                horizontalLineToRelative(3.45f)
                curveToRelative(0.28f, -2.74f, 1.29f, -5.16f, 2.25f, -6.92f)
                curveToRelative(-2.95f, 1.11f, -5.17f, 3.74f, -5.71f, 6.92f)
                close()
                moveTo(8.83f, 20.42f)
                curveToRelative(-0.97f, -1.77f, -1.97f, -4.18f, -2.25f, -6.92f)
                horizontalLineToRelative(-3.45f)
                curveToRelative(0.54f, 3.19f, 2.75f, 5.81f, 5.71f, 6.92f)
                close()
            }
        }.also { _SiteAlt = it}
