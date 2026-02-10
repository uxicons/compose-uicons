package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Sc.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 22.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-19.0f, -19f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
                reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(0.78f, -0.64f, 1.68f, -1.1f, 2.68f, -1.34f)
                curveToRelative(1.39f, -0.34f, 2.85f, -0.52f, 4.33f, -0.52f)
                curveToRelative(1.5f, 0.01f, 2.96f, 0.18f, 4.35f, 0.52f)
                curveToRelative(2.69f, 0.66f, 4.74f, 2.88f, 5.2f, 5.67f)
                curveToRelative(0.0f, 0.02f, 0.01f, 0.03f, 0.01f, 0.05f)
                curveToRelative(0.62f, 3.77f, 0.59f, 7.74f, -0.09f, 12.11f)
                lineToRelative(1.1f, 1.1f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
                close()
                moveTo(2f, 13.52f)
                curveToRelative(0f, 0.04f, 0.0f, 0.08f, 0.01f, 0.11f)
                curveToRelative(0.05f, 2.16f, 0.27f, 4.37f, 0.69f, 6.74f)
                curveToRelative(0.25f, 1.56f, 1.67f, 2.65f, 3.22f, 2.62f)
                curveToRelative(0.97f, 0f, 1.87f, -0.41f, 2.5f, -1.16f)
                curveToRelative(0.42f, -0.51f, 2.47f, -2.95f, 3.86f, -4.61f)
                lineToRelative(-9.85f, -9.85f)
                curveToRelative(-0.32f, 1.97f, -0.46f, 4.04f, -0.42f, 6.14f)
                close()
            }
        }.also { _BookmarkSlash = it}
