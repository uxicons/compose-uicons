package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BugSlash: ImageVector? = null

val Icons.Ss.BugSlash: ImageVector
    get() = _BugSlash ?: UXIcon(name = "BugSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.43f, 20.65f)
                curveToRelative(-1.3f, 0.86f, -2.83f, 1.35f, -4.43f, 1.35f)
                curveToRelative(-2.95f, 0f, -5.53f, -1.61f, -6.92f, -4f)
                lineTo(3f, 18f)
                verticalLineToRelative(4f)
                lineTo(1f, 22f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.26f)
                curveToRelative(-0.17f, -0.64f, -0.26f, -1.31f, -0.26f, -2f)
                curveToRelative(0f, -0.29f, 0.04f, -0.63f, 0.1f, -1f)
                lineTo(1f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.58f)
                curveToRelative(0.16f, -0.55f, 0.34f, -1.12f, 0.53f, -1.68f)
                lineToRelative(11.33f, 11.33f)
                close()
                moveTo(23.95f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(6.68f, 5.26f)
                curveToRelative(1.02f, -1.99f, 3.07f, -3.26f, 5.32f, -3.26f)
                curveToRelative(2.39f, 0f, 4.54f, 1.41f, 5.5f, 3.6f)
                curveToRelative(0f, 0f, 0.07f, 0.16f, 0.16f, 0.4f)
                horizontalLineToRelative(3.34f)
                lineTo(21f, 2f)
                horizontalLineToRelative(2f)
                lineTo(23f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(0.33f, 0.91f, 0.7f, 1.98f, 0.99f, 3f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.1f)
                curveToRelative(0.06f, 0.37f, 0.1f, 0.71f, 0.1f, 1f)
                curveToRelative(0f, 0.68f, -0.11f, 1.35f, -0.27f, 2f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3.59f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(20.99f, 18f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(1.59f, 1.59f)
                verticalLineToRelative(-1.59f)
                close()
            }
        }.also { _BugSlash = it}
