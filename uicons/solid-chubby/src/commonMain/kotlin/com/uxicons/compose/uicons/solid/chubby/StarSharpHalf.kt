package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Sc.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2f)
                verticalLineToRelative(17.05f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-0.25f, 0f, -0.49f, 0.08f, -0.69f, 0.23f)
                curveToRelative(-0.1f, 0.08f, -2.24f, 1.99f, -2.35f, 2.06f)
                curveToRelative(-0.61f, 0.44f, -1.31f, 0.66f, -2.0f, 0.66f)
                curveToRelative(-0.67f, 0f, -1.31f, -0.21f, -1.85f, -0.62f)
                curveToRelative(-0.98f, -0.75f, -1.32f, -2.02f, -0.91f, -3.4f)
                lineToRelative(0.84f, -3.4f)
                curveToRelative(0.14f, -0.61f, -0.01f, -0.85f, -0.34f, -1.1f)
                curveToRelative(-0.81f, -0.6f, -1.61f, -1.21f, -2.42f, -1.83f)
                curveToRelative(-1.2f, -0.93f, -1.61f, -2.56f, -1.01f, -3.96f)
                curveToRelative(0.47f, -1.11f, 1.62f, -1.83f, 2.89f, -1.78f)
                curveToRelative(0.96f, 0.03f, 1.94f, 0.06f, 2.85f, 0.07f)
                curveToRelative(0.53f, 0.05f, 0.93f, -0.25f, 1.07f, -0.73f)
                curveToRelative(0.3f, -0.96f, 0.6f, -2.18f, 0.9f, -3.13f)
                curveToRelative(0.41f, -1.3f, 1.59f, -2.14f, 3.01f, -2.14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _StarSharpHalf = it}
