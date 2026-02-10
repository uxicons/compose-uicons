package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothbrush: ImageVector? = null

val Icons.Ss.Toothbrush: ImageVector
    get() = _Toothbrush ?: UXIcon(name = "Toothbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(7f, 2f)
                curveTo(3.14f, 2f, 0f, 5.14f, 0f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.26f)
                curveToRelative(1.81f, -1.27f, 3f, -3.36f, 3f, -5.74f)
                close()
                moveTo(11f, 10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                curveToRelative(0.69f, 0f, 1.37f, -0.1f, 2f, -0.29f)
                verticalLineToRelative(8.29f)
                close()
            }
        }.also { _Toothbrush = it}
