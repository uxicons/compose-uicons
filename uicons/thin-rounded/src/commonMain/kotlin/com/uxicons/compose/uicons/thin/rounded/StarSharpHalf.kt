package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Tr.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.6f, 0.07f)
                curveToRelative(-0.2f, -0.04f, -0.4f, -0.06f, -0.6f, -0.06f)
                curveToRelative(-1.0f, 0f, -2.23f, 0.52f, -2.69f, 1.97f)
                lineToRelative(-1.51f, 5.02f)
                lineTo(2.83f, 7.0f)
                curveToRelative(-1.52f, 0f, -2.38f, 1.01f, -2.69f, 1.95f)
                curveToRelative(-0.3f, 0.9f, -0.21f, 2.27f, 1.02f, 3.17f)
                lineToRelative(4.05f, 2.96f)
                lineToRelative(-1.54f, 5.21f)
                curveToRelative(-0.47f, 1.45f, 0.27f, 2.61f, 1.03f, 3.16f)
                curveToRelative(0.42f, 0.31f, 1.02f, 0.54f, 1.67f, 0.54f)
                curveToRelative(0.54f, 0f, 1.12f, -0.16f, 1.69f, -0.58f)
                lineToRelative(4.76f, -4.03f)
                curveToRelative(0.11f, -0.1f, 0.18f, -0.23f, 0.18f, -0.38f)
                lineTo(13.0f, 0.56f)
                curveToRelative(0f, -0.24f, -0.17f, -0.44f, -0.4f, -0.49f)
                close()
                moveTo(12f, 18.77f)
                lineToRelative(-4.56f, 3.86f)
                curveToRelative(-0.79f, 0.58f, -1.65f, 0.37f, -2.15f, 0.01f)
                curveToRelative(-0.5f, -0.36f, -0.97f, -1.11f, -0.66f, -2.06f)
                lineToRelative(1.65f, -5.56f)
                curveToRelative(0.06f, -0.2f, -0.01f, -0.42f, -0.18f, -0.55f)
                lineToRelative(-4.33f, -3.17f)
                curveToRelative(-0.79f, -0.58f, -0.85f, -1.46f, -0.66f, -2.05f)
                curveToRelative(0.2f, -0.61f, 0.76f, -1.26f, 1.74f, -1.26f)
                horizontalLineToRelative(5.33f)
                curveToRelative(0.22f, 0f, 0.41f, -0.14f, 0.48f, -0.35f)
                lineToRelative(1.62f, -5.37f)
                curveToRelative(0.38f, -1.18f, 1.43f, -1.27f, 1.74f, -1.27f)
                verticalLineToRelative(17.76f)
                close()
            }
        }.also { _StarSharpHalf = it}
