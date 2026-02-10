package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuillPenStory: ImageVector? = null

val Icons.Bs.QuillPenStory: ImageVector
    get() = _QuillPenStory ?: UXIcon(name = "QuillPenStory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 2.67f)
                curveToRelative(-3.2f, 2.27f, -4.58f, 5.49f, -5.15f, 7.33f)
                curveToRelative(-0.51f, 0.91f, -0.89f, 1.91f, -1.12f, 3.0f)
                horizontalLineToRelative(-2.23f)
                verticalLineToRelative(2.48f)
                lineToRelative(-2.44f, 0.97f)
                curveToRelative(-1.62f, 0.65f, -2.52f, 2.41f, -2.1f, 4.1f)
                lineToRelative(0.86f, 3.44f)
                horizontalLineToRelative(13.34f)
                lineToRelative(0.86f, -3.44f)
                curveToRelative(0.42f, -1.69f, -0.48f, -3.45f, -2.1f, -4.1f)
                lineToRelative(-2.44f, -0.97f)
                verticalLineToRelative(-2.48f)
                horizontalLineToRelative(-1.74f)
                curveToRelative(1.59f, -4.9f, 5.97f, -8.92f, 9.51f, -9.33f)
                curveToRelative(-3.15f, 2.23f, -5.32f, 5.23f, -6.69f, 7.63f)
                curveToRelative(1.94f, -0.28f, 4.29f, -0.95f, 6.42f, -2.47f)
                curveTo(23.21f, 5.49f, 24f, 0.07f, 24f, 0.07f)
                curveToRelative(0f, 0f, -5.8f, -0.74f, -10.5f, 2.6f)
                close()
                moveTo(12.32f, 19.24f)
                curveToRelative(0.23f, 0.09f, 0.36f, 0.34f, 0.3f, 0.59f)
                lineToRelative(-0.29f, 1.17f)
                lineTo(3.67f, 21f)
                lineToRelative(-0.29f, -1.17f)
                curveToRelative(-0.06f, -0.24f, 0.07f, -0.49f, 0.3f, -0.58f)
                lineToRelative(4.32f, -1.73f)
                lineToRelative(4.32f, 1.73f)
                close()
            }
        }.also { _QuillPenStory = it}
