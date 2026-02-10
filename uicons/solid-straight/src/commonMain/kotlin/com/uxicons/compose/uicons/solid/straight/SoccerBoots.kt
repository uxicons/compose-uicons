package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SoccerBoots: ImageVector? = null

val Icons.Ss.SoccerBoots: ImageVector
    get() = _SoccerBoots ?: UXIcon(name = "SoccerBoots") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.39f, 9.03f)
                lineToRelative(-2.05f, 3.08f)
                lineToRelative(-1.66f, -1.11f)
                lineToRelative(2.11f, -3.17f)
                curveToRelative(-0.62f, -0.43f, -1.25f, -0.84f, -1.86f, -1.22f)
                lineToRelative(-2.26f, 3.39f)
                lineToRelative(-1.66f, -1.11f)
                lineToRelative(2.2f, -3.3f)
                curveToRelative(-1.75f, -0.99f, -2.37f, -1.28f, -3.57f, -1.89f)
                curveToRelative(-0.93f, 1.59f, -2.89f, 4.22f, -4.63f, 4.3f)
                curveToRelative(-2.93f, -0.17f, -4.6f, -2.59f, -5.04f, -3.0f)
                lineToRelative(-1.97f, 0.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.59f, -1.6f, -3.36f, -3.61f, -4.97f)
                close()
            }
        }.also { _SoccerBoots = it}
