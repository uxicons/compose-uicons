package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Tr.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-2.85f, -2.85f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-1.52f, 0f, -2.93f, 0.77f, -3.76f, 2.03f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(20f, 19.29f)
                lineTo(4.46f, 3.76f)
                curveToRelative(0.62f, -1.09f, 1.78f, -1.76f, 3.04f, -1.76f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13.79f)
                close()
                moveTo(11.84f, 16.63f)
                curveToRelative(0.2f, 0.19f, 0.22f, 0.5f, 0.03f, 0.71f)
                lineToRelative(-4.83f, 5.26f)
                curveToRelative(-0.46f, 0.49f, -1.06f, 0.74f, -1.69f, 0.74f)
                curveToRelative(-0.29f, 0f, -0.59f, -0.06f, -0.88f, -0.17f)
                curveToRelative(-0.91f, -0.36f, -1.48f, -1.19f, -1.48f, -2.17f)
                lineTo(3f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 0.67f, 0.44f, 1.08f, 0.84f, 1.24f)
                curveToRelative(0.41f, 0.16f, 1.01f, 0.16f, 1.47f, -0.32f)
                lineToRelative(4.82f, -5.26f)
                curveToRelative(0.19f, -0.2f, 0.5f, -0.22f, 0.71f, -0.03f)
                close()
            }
        }.also { _BookmarkSlash = it}
