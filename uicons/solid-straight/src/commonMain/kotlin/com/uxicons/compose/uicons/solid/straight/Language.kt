package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Language: ImageVector? = null

val Icons.Ss.Language: ImageVector
    get() = _Language ?: UXIcon(name = "Language") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.99f, 9.4f)
                curveToRelative(-0.04f, 0f, -0.07f, 0.03f, -0.08f, 0.06f)
                lineToRelative(-0.81f, 3.44f)
                horizontalLineToRelative(1.76f)
                lineToRelative(-0.79f, -3.44f)
                curveToRelative(-0.01f, -0.04f, -0.04f, -0.06f, -0.08f, -0.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                lineTo(3f, 4f)
                curveTo(1.34f, 4f, 0f, 5.34f, 0f, 7f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(11f)
                lineTo(11f, 4f)
                close()
                moveTo(7.17f, 14.3f)
                horizontalLineToRelative(-2.41f)
                lineToRelative(-0.4f, 1.7f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(1.62f, -6.85f)
                curveToRelative(0.2f, -0.87f, 1.14f, -1.41f, 2.06f, -1.02f)
                curveToRelative(0.44f, 0.18f, 0.73f, 0.61f, 0.84f, 1.07f)
                lineToRelative(1.56f, 6.8f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(-0.39f, -1.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(11f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 10.25f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-0.12f, 1.27f, -0.62f, 2.73f, -1.61f, 3.87f)
                curveToRelative(0.66f, 0.4f, 1.49f, 0.67f, 2.54f, 0.67f)
                verticalLineToRelative(1.25f)
                curveToRelative(-1.46f, 0f, -2.6f, -0.42f, -3.49f, -1.05f)
                curveToRelative(-0.9f, 0.64f, -2.05f, 1.05f, -3.51f, 1.05f)
                verticalLineToRelative(-1.25f)
                curveToRelative(1.05f, 0f, 1.88f, -0.26f, 2.54f, -0.66f)
                curveToRelative(-0.55f, -0.64f, -0.96f, -1.37f, -1.22f, -2.12f)
                horizontalLineToRelative(1.34f)
                curveToRelative(0.2f, 0.47f, 0.49f, 0.92f, 0.85f, 1.32f)
                curveToRelative(0.82f, -0.92f, 1.19f, -2.11f, 1.3f, -3.07f)
                horizontalLineToRelative(-4.81f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(2.87f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.87f)
                verticalLineToRelative(1.25f)
                close()
            }
        }.also { _Language = it}
