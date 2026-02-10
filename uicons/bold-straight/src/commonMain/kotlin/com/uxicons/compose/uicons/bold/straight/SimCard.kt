package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Bs.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 4.56f)
                lineToRelative(-3.24f, -3.24f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.74f)
                curveToRelative(0f, -1.2f, -0.47f, -2.33f, -1.32f, -3.18f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.76f)
                curveToRelative(0.4f, 0f, 0.78f, 0.16f, 1.06f, 0.44f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                verticalLineToRelative(13.26f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SimCard = it}
