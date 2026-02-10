package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillRockslide: ImageVector? = null

val Icons.Rs.HillRockslide: ImageVector
    get() = _HillRockslide ?: UXIcon(name = "HillRockslide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.43f, 24f)
                horizontalLineToRelative(-20.41f)
                curveToRelative(-1.66f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-20.41f)
                close()
                moveTo(2.02f, 5.41f)
                verticalLineToRelative(15.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15.59f)
                close()
                moveTo(21.54f, 15f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(-2.41f, -2.47f)
                verticalLineToRelative(-2.69f)
                lineToRelative(2.77f, -2.84f)
                horizontalLineToRelative(3.24f)
                lineToRelative(2.97f, 4.13f)
                lineToRelative(-2.46f, 3.87f)
                close()
                moveTo(18.27f, 13f)
                horizontalLineToRelative(2.18f)
                lineToRelative(1.14f, -1.8f)
                lineToRelative(-1.58f, -2.2f)
                horizontalLineToRelative(-1.37f)
                lineToRelative(-1.62f, 1.66f)
                verticalLineToRelative(1.06f)
                close()
                moveTo(12.87f, 7f)
                horizontalLineToRelative(-3.75f)
                lineToRelative(-2.1f, -2.15f)
                verticalLineToRelative(-2.38f)
                lineToRelative(2.41f, -2.47f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.59f, 3.6f)
                close()
                moveTo(9.96f, 5f)
                horizontalLineToRelative(1.8f)
                lineToRelative(0.84f, -1.32f)
                lineToRelative(-1.2f, -1.68f)
                horizontalLineToRelative(-1.14f)
                lineToRelative(-1.25f, 1.28f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(17.02f, 2.75f)
                lineTo(18.24f, 4f)
                horizontalLineToRelative(2.22f)
                lineToRelative(1.2f, -1.89f)
                lineToRelative(-1.52f, -2.11f)
                horizontalLineToRelative(-1.66f)
                lineToRelative(-1.46f, 1.5f)
                close()
            }
        }.also { _HillRockslide = it}
