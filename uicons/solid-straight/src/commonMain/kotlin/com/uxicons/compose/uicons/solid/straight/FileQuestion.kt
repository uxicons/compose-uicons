package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileQuestion: ImageVector? = null

val Icons.Ss.FileQuestion: ImageVector
    get() = _FileQuestion ?: UXIcon(name = "FileQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.42f, 11.73f)
                curveToRelative(-0.27f, -1.27f, -1.24f, -2.31f, -2.49f, -2.64f)
                curveToRelative(-1.07f, -0.28f, -2.18f, -0.06f, -3.05f, 0.61f)
                curveToRelative(-0.87f, 0.67f, -1.38f, 1.72f, -1.38f, 2.81f)
                verticalLineToRelative(0.49f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -0.47f, 0.23f, -0.93f, 0.6f, -1.22f)
                curveToRelative(0.38f, -0.29f, 0.85f, -0.38f, 1.32f, -0.26f)
                curveToRelative(0.51f, 0.13f, 0.93f, 0.59f, 1.04f, 1.11f)
                curveToRelative(0.16f, 0.78f, -0.27f, 1.4f, -0.77f, 1.66f)
                curveToRelative(-1.06f, 0.56f, -1.7f, 1.55f, -1.7f, 2.65f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -0.51f, 0.48f, -0.8f, 0.63f, -0.88f)
                curveToRelative(1.4f, -0.74f, 2.12f, -2.28f, 1.79f, -3.84f)
                close()
            }
        }.also { _FileQuestion = it}
