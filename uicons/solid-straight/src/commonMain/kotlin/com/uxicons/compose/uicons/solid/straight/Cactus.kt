package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cactus: ImageVector? = null

val Icons.Ss.Cactus: ImageVector
    get() = _Cactus ?: UXIcon(name = "Cactus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 5f)
                curveTo(17f, 2.08f, 14.48f, -0.27f, 11.5f, 0.02f)
                curveToRelative(-2.6f, 0.25f, -4.5f, 2.59f, -4.5f, 5.2f)
                verticalLineToRelative(4.78f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(0f, 6.12f, 0f, 7.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Cactus = it}
