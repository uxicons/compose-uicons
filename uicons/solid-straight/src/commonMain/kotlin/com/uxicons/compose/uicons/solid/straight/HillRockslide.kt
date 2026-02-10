package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillRockslide: ImageVector? = null

val Icons.Ss.HillRockslide: ImageVector
    get() = _HillRockslide ?: UXIcon(name = "HillRockslide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 24.05f)
                horizontalLineToRelative(-20.41f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-20.41f)
                close()
                moveTo(21.53f, 15f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(-2.41f, -2.47f)
                verticalLineToRelative(-2.69f)
                lineToRelative(2.77f, -2.84f)
                horizontalLineToRelative(3.24f)
                lineToRelative(2.97f, 4.13f)
                lineToRelative(-2.46f, 3.87f)
                close()
                moveTo(7f, 4.12f)
                lineTo(8.83f, 6f)
                horizontalLineToRelative(3.33f)
                lineToRelative(1.8f, -2.83f)
                lineToRelative(-2.28f, -3.17f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(-2.2f, 2.25f)
                close()
                moveTo(17f, 2.75f)
                lineTo(18.22f, 4f)
                horizontalLineToRelative(2.22f)
                lineToRelative(1.2f, -1.89f)
                lineToRelative(-1.52f, -2.11f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-1.46f, 1.5f)
                close()
            }
        }.also { _HillRockslide = it}
