package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SoccerBoots: ImageVector? = null

val Icons.Bs.SoccerBoots: ImageVector
    get() = _SoccerBoots ?: UXIcon(name = "SoccerBoots") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                curveToRelative(0f, -4.14f, -9.09f, -8.6f, -11.88f, -9.87f)
                lineToRelative(-1.31f, -0.59f)
                curveToRelative(-0.71f, 1.53f, -2.27f, 4.36f, -3.81f, 4.46f)
                curveToRelative(-1.86f, -0.15f, -3.47f, -2.0f, -4.3f, -3f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3f, 9.46f)
                curveToRelative(1.09f, 0.8f, 2.5f, 1.54f, 4f, 1.54f)
                curveToRelative(2.33f, 0f, 4.13f, -2.12f, 5.09f, -3.56f)
                curveToRelative(0.79f, 0.39f, 1.57f, 0.8f, 2.31f, 1.21f)
                lineToRelative(-1.21f, 2.11f)
                lineToRelative(2.6f, 1.49f)
                lineToRelative(1.17f, -2.05f)
                curveToRelative(2.4f, 1.57f, 4.03f, 3.04f, 4.03f, 3.81f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-6.54f)
                close()
            }
        }.also { _SoccerBoots = it}
