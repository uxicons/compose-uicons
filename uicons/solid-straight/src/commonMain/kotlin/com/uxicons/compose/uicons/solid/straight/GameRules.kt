package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameRules: ImageVector? = null

val Icons.Ss.GameRules: ImageVector
    get() = _GameRules ?: UXIcon(name = "GameRules") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22.67f)
                curveToRelative(0f, 0.73f, -0.59f, 1.33f, -1.33f, 1.33f)
                curveToRelative(-1.13f, 0f, -3.32f, -2.13f, -4.28f, -4f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-0.96f, 1.87f, -3.15f, 4f, -4.28f, 4f)
                curveToRelative(-0.73f, 0f, -1.33f, -0.59f, -1.33f, -1.33f)
                curveToRelative(0f, -0.77f, 0.38f, -4.05f, 1.58f, -7.27f)
                curveToRelative(0.31f, -0.84f, 1.12f, -1.4f, 2.01f, -1.4f)
                horizontalLineToRelative(0.41f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.41f)
                curveToRelative(0.9f, 0f, 1.7f, 0.56f, 2.01f, 1.4f)
                curveToRelative(1.2f, 3.22f, 1.58f, 6.51f, 1.58f, 7.27f)
                close()
                moveTo(8.7f, 14.7f)
                curveToRelative(-1.3f, 3.5f, -1.7f, 7.07f, -1.7f, 7.97f)
                curveToRelative(0f, 0.47f, 0.1f, 0.92f, 0.28f, 1.33f)
                horizontalLineToRelative(-7.28f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1.33f)
                curveToRelative(-1.04f, 0.44f, -1.89f, 1.28f, -2.3f, 2.37f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(9f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GameRules = it}
