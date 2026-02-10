package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgerHoney: ImageVector? = null

val Icons.Ss.BadgerHoney: ImageVector
    get() = _BadgerHoney ?: UXIcon(name = "BadgerHoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.38f, 11f)
                curveToRelative(-0.24f, 0.58f, -0.38f, 1.24f, -0.38f, 2f)
                lineTo(0f, 13f)
                curveToRelative(0f, -4.38f, 3.56f, -7f, 7f, -7f)
                lineToRelative(3.75f, 0.03f)
                curveToRelative(1.18f, 0f, 2.66f, -0.36f, 3.27f, -1.37f)
                curveToRelative(1.33f, -2.21f, 3.96f, -3.19f, 6.41f, -2.37f)
                lineToRelative(1.68f, 0.56f)
                curveToRelative(0.14f, 0.05f, 0.28f, 0.1f, 0.4f, 0.17f)
                curveToRelative(-2.66f, 0.05f, -4.18f, 0.34f, -5.31f, 1.89f)
                lineToRelative(-3.14f, 4.2f)
                curveToRelative(-1.01f, 1.21f, -2.49f, 1.9f, -4.06f, 1.9f)
                lineTo(2.38f, 11f)
                close()
                moveTo(23.96f, 5.0f)
                curveToRelative(-3.58f, 0.01f, -4.46f, 0.14f, -5.15f, 1.09f)
                lineToRelative(-3.18f, 4.25f)
                curveToRelative(-1.42f, 1.71f, -3.46f, 2.66f, -5.63f, 2.66f)
                lineTo(2f, 13.0f)
                lineToRelative(1.57f, 9f)
                horizontalLineToRelative(4.64f)
                lineToRelative(-0.71f, -4f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.28f)
                curveToRelative(0f, -1.81f, 0.2f, -4.44f, 1.15f, -6.63f)
                curveToRelative(0.54f, -1.25f, 1.5f, -2.31f, 2.7f, -2.97f)
                curveToRelative(1.33f, -0.73f, 2.15f, -2.13f, 2.15f, -3.65f)
                curveToRelative(0f, -0.16f, -0.01f, -0.31f, -0.04f, -0.47f)
                close()
            }
        }.also { _BadgerHoney = it}
