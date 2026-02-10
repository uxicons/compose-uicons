package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Rr.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                lineToRelative(-2.71f, -2.71f)
                lineTo(21f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(8f, 1f)
                curveToRelative(-1.49f, 0f, -2.88f, 0.66f, -3.82f, 1.77f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11.59f)
                lineTo(5.61f, 4.19f)
                curveToRelative(0.56f, -0.74f, 1.45f, -1.19f, 2.39f, -1.19f)
                close()
                moveTo(12.24f, 17.17f)
                lineToRelative(-4.51f, 4.95f)
                curveToRelative(-0.54f, 0.57f, -1.26f, 0.87f, -2.0f, 0.87f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.06f, -1.01f, -0.2f)
                curveToRelative(-1.05f, -0.42f, -1.72f, -1.41f, -1.72f, -2.54f)
                verticalLineToRelative(-11.27f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11.27f)
                curveToRelative(0f, 0.45f, 0.32f, 0.62f, 0.46f, 0.68f)
                curveToRelative(0.14f, 0.06f, 0.49f, 0.15f, 0.8f, -0.18f)
                lineToRelative(4.5f, -4.94f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.44f, 1.41f, -0.07f)
                curveToRelative(0.41f, 0.37f, 0.44f, 1.0f, 0.07f, 1.41f)
                close()
            }
        }.also { _BookmarkSlash = it}
