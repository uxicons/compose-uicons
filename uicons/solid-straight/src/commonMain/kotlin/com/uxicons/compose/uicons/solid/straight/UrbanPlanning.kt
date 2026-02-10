package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UrbanPlanning: ImageVector? = null

val Icons.Ss.UrbanPlanning: ImageVector
    get() = _UrbanPlanning ?: UXIcon(name = "UrbanPlanning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 7f)
                verticalLineToRelative(3.26f)
                curveToRelative(-0.64f, 0.22f, -1.24f, 0.56f, -1.75f, 1.07f)
                lineToRelative(-4.25f, 4.25f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -1.5f, -1.5f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-21.0f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(23.26f, 12.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -0.83f, 0.74f, -1.79f)
                curveToRelative(0f, -0.68f, -0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }.also { _UrbanPlanning = it}
