package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuillPenStory: ImageVector? = null

val Icons.Sr.QuillPenStory: ImageVector
    get() = _QuillPenStory ?: UXIcon(name = "QuillPenStory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 2.67f)
                curveToRelative(-3.2f, 2.27f, -4.58f, 5.49f, -5.15f, 7.33f)
                curveToRelative(-0.67f, 1.18f, -1.1f, 2.5f, -1.29f, 4.0f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.3f)
                lineToRelative(-3.11f, 1.12f)
                curveToRelative(-1.39f, 0.55f, -2.16f, 2.06f, -1.8f, 3.51f)
                lineToRelative(0.01f, 0.03f)
                curveToRelative(0.45f, 1.78f, 2.04f, 3.03f, 3.88f, 3.03f)
                horizontalLineToRelative(8.04f)
                curveToRelative(1.83f, 0f, 3.43f, -1.25f, 3.88f, -3.03f)
                lineToRelative(0.01f, -0.04f)
                curveToRelative(0.36f, -1.45f, -0.41f, -2.96f, -1.83f, -3.52f)
                lineToRelative(-3.08f, -1.11f)
                verticalLineToRelative(-1.3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(0.05f, -0.34f, 0.11f, -0.68f, 0.2f, -1f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(1.59f, -4.9f, 5.97f, -8.92f, 9.51f, -9.33f)
                curveToRelative(-3.15f, 2.23f, -5.32f, 5.23f, -6.69f, 7.63f)
                curveToRelative(1.94f, -0.28f, 4.29f, -0.95f, 6.42f, -2.47f)
                curveToRelative(3.21f, -2.28f, 4.89f, -5.53f, 5.45f, -7.36f)
                curveToRelative(0.22f, -0.74f, -0.33f, -1.47f, -1.09f, -1.47f)
                curveToRelative(-2.02f, 0f, -6.09f, 0.35f, -9.36f, 2.67f)
                close()
            }
        }.also { _QuillPenStory = it}
