package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Sr.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineTo(6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.49f, 0f, -2.88f, 0.66f, -3.82f, 1.77f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(18.99f, 18.99f)
                curveToRelative(0.01f, 0.01f, 0.01f, 0.01f, 0.02f, 0.02f)
                lineToRelative(2.99f, 2.99f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(4.7f, 8.79f)
                curveToRelative(-0.29f, -0.28f, -0.72f, -0.37f, -1.09f, -0.21f)
                curveToRelative(-0.37f, 0.15f, -0.61f, 0.52f, -0.61f, 0.92f)
                verticalLineToRelative(10.77f)
                curveToRelative(0f, 1.13f, 0.68f, 2.12f, 1.72f, 2.54f)
                curveToRelative(0.33f, 0.13f, 0.67f, 0.19f, 1.01f, 0.19f)
                curveToRelative(0.74f, 0f, 1.46f, -0.3f, 2f, -0.88f)
                lineToRelative(4.28f, -4.76f)
                curveToRelative(0.36f, -0.4f, 0.34f, -1.0f, -0.04f, -1.38f)
                lineToRelative(-7.27f, -7.19f)
                close()
            }
        }.also { _BookmarkSlash = it}
