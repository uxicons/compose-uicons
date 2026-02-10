package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbHead: ImageVector? = null

val Icons.Ss.LightbulbHead: ImageVector
    get() = _LightbulbHead ?: UXIcon(name = "LightbulbHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.13f, 3.83f)
                curveToRelative(0.42f, -1.82f, 1.87f, -3.27f, 3.69f, -3.69f)
                curveToRelative(1.52f, -0.35f, 3.09f, -0.01f, 4.29f, 0.95f)
                curveToRelative(1.2f, 0.95f, 1.89f, 2.38f, 1.89f, 3.92f)
                curveToRelative(0f, 1.59f, -0.76f, 3.06f, -2.03f, 4f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(-1.61f, -1.19f, -2.36f, -3.19f, -1.9f, -5.17f)
                close()
                moveTo(17f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-0.0f, -2f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(15f, 15f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0f, -0.55f, -0.23f, -1.07f, -0.63f, -1.45f)
                curveToRelative(-1.84f, -1.71f, -2.76f, -4.35f, -2.19f, -6.82f)
                curveToRelative(0.29f, -1.27f, 0.94f, -2.41f, 1.84f, -3.31f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.52f, -0.14f, -3.02f, 0.01f, -4.46f, 0.49f)
                curveToRelative(-2.15f, 0.71f, -4f, 2.05f, -5.34f, 3.84f)
                curveToRelative(-1.2f, 1.49f, -2.32f, 4.04f, -3.5f, 6.74f)
                curveToRelative(-0.21f, 0.49f, -0.73f, 1.66f, -0.73f, 1.66f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(2.33f)
                lineToRelative(0.45f, 3.39f)
                curveToRelative(0.2f, 1.49f, 1.47f, 2.61f, 2.97f, 2.61f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.48f, 0.19f, -0.94f, 0.5f, -1.31f)
                curveToRelative(0.75f, -0.91f, 1.32f, -1.92f, 1.74f, -2.98f)
                horizontalLineToRelative(-8.24f)
                close()
            }
        }.also { _LightbulbHead = it}
