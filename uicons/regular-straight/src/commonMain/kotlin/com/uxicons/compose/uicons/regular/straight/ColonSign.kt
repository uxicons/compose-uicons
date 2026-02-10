package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ColonSign: ImageVector? = null

val Icons.Rs.ColonSign: ImageVector
    get() = _ColonSign ?: UXIcon(name = "ColonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.18f, 20f)
                horizontalLineToRelative(-0.46f)
                lineToRelative(4.56f, -14.51f)
                curveToRelative(0.66f, 0.55f, 1.21f, 1.24f, 1.61f, 2.05f)
                lineToRelative(1.79f, -0.89f)
                curveToRelative(-0.65f, -1.31f, -1.62f, -2.38f, -2.77f, -3.17f)
                lineToRelative(1.09f, -3.47f)
                horizontalLineToRelative(-2.11f)
                lineToRelative(-0.8f, 2.54f)
                curveToRelative(-0.69f, -0.26f, -1.42f, -0.42f, -2.18f, -0.49f)
                lineToRelative(0.64f, -2.05f)
                horizontalLineToRelative(-2.11f)
                lineToRelative(-0.63f, 2f)
                horizontalLineToRelative(-0.46f)
                curveTo(6.75f, 2f, 3f, 5.75f, 3f, 10.36f)
                verticalLineToRelative(3.27f)
                curveToRelative(0f, 2.63f, 1.22f, 4.97f, 3.12f, 6.51f)
                lineToRelative(-1.21f, 3.85f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.87f, -2.77f)
                curveToRelative(0.67f, 0.31f, 1.38f, 0.53f, 2.13f, 0.65f)
                lineToRelative(-0.67f, 2.12f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.63f, -2f)
                horizontalLineToRelative(1.09f)
                curveToRelative(3.14f, 0f, 5.99f, -1.74f, 7.43f, -4.53f)
                lineToRelative(-1.78f, -0.92f)
                curveToRelative(-1.1f, 2.13f, -3.27f, 3.45f, -5.66f, 3.45f)
                close()
                moveTo(5f, 13.64f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -3.45f, 2.76f, -6.26f, 6.19f, -6.35f)
                lineToRelative(-4.41f, 14.04f)
                curveToRelative(-1.1f, -1.14f, -1.78f, -2.7f, -1.78f, -4.41f)
                close()
                moveTo(8.49f, 19.31f)
                lineTo(13.3f, 4.01f)
                curveToRelative(0.77f, 0.01f, 1.51f, 0.17f, 2.2f, 0.44f)
                lineToRelative(-4.87f, 15.51f)
                curveToRelative(-0.76f, -0.09f, -1.48f, -0.31f, -2.13f, -0.64f)
                close()
            }
        }.also { _ColonSign = it}
