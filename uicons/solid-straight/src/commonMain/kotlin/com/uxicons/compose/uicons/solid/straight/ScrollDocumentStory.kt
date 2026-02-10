package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollDocumentStory: ImageVector? = null

val Icons.Ss.ScrollDocumentStory: ImageVector
    get() = _ScrollDocumentStory ?: UXIcon(name = "ScrollDocumentStory") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 5f)
                lineTo(0f, 1.5f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20f, 10.69f)
                curveToRelative(-1.42f, 1.06f, -2.99f, 1.85f, -4.71f, 2.32f)
                lineToRelative(-1.43f, 0.39f)
                curveToRelative(-0.09f, 0.31f, -0.18f, 0.65f, -0.28f, 1.03f)
                lineToRelative(-0.14f, 0.57f)
                horizontalLineToRelative(-6.15f)
                lineToRelative(0.34f, -1.49f)
                curveToRelative(0.28f, -1.25f, 0.59f, -2.3f, 0.97f, -3.28f)
                curveToRelative(0.27f, -1.94f, 1.27f, -6.18f, 4.9f, -9.11f)
                horizontalLineToRelative(0f)
                curveToRelative(0.53f, -0.43f, 1.08f, -0.79f, 1.62f, -1.11f)
                lineTo(4.66f, 0.0f)
                curveToRelative(0.22f, 0.46f, 0.34f, 0.96f, 0.34f, 1.5f)
                verticalLineToRelative(19.86f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6.31f)
                close()
                moveTo(12f, 21.5f)
                curveToRelative(0f, 0.92f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(10.56f, 10.73f)
                curveToRelative(-0.3f, 0.77f, -0.53f, 1.53f, -0.72f, 2.27f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.14f, -0.51f, 0.3f, -1.01f, 0.5f, -1.51f)
                curveToRelative(1.12f, -3.02f, 3.97f, -6.64f, 7.59f, -8.65f)
                curveToRelative(-2.14f, 2.35f, -4.62f, 6.12f, -5.23f, 8.24f)
                curveToRelative(1.36f, -0.37f, 2.91f, -1.04f, 4.4f, -2.25f)
                curveTo(23.3f, 5.49f, 24f, 0.07f, 24f, 0.07f)
                curveToRelative(0f, 0f, -5.1f, -0.74f, -9.23f, 2.6f)
                curveToRelative(-3.22f, 2.6f, -4.01f, 6.47f, -4.21f, 8.06f)
                close()
            }
        }.also { _ScrollDocumentStory = it}
