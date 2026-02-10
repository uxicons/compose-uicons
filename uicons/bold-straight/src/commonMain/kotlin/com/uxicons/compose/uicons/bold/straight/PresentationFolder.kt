package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PresentationFolder: ImageVector? = null

val Icons.Bs.PresentationFolder: ImageVector
    get() = _PresentationFolder ?: UXIcon(name = "PresentationFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.51f)
                curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1f, -1.99f)
                verticalLineToRelative(-1.51f)
                horizontalLineToRelative(6f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(16f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.59f)
                lineToRelative(1.41f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PresentationFolder = it}
