package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DictionaryAlt: ImageVector? = null

val Icons.Ss.DictionaryAlt: ImageVector
    get() = _DictionaryAlt ?: UXIcon(name = "DictionaryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.53f, 9.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(24f, 4f)
                lineTo(24f, 20.83f)
                lineToRelative(-12f, 2.18f)
                lineTo(0f, 20.83f)
                lineTo(0f, 4f)
                curveTo(-0.02f, 2.15f, 1.72f, 0.7f, 3.54f, 1.05f)
                lineToRelative(4.24f, 1.03f)
                curveToRelative(1.88f, 0.36f, 3.23f, 2.01f, 3.23f, 3.92f)
                verticalLineToRelative(14.8f)
                lineToRelative(1f, 0.18f)
                lineToRelative(1f, -0.18f)
                lineTo(13f, 6f)
                curveToRelative(0f, -1.93f, 1.38f, -3.59f, 3.28f, -3.94f)
                lineToRelative(4.12f, -1f)
                curveToRelative(1.79f, -0.4f, 3.64f, 1.1f, 3.59f, 2.94f)
                close()
                moveTo(8.36f, 15f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(1.67f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-4.55f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-2.56f, 3.69f)
                verticalLineToRelative(1.72f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.56f)
                lineToRelative(2.56f, -3.69f)
                verticalLineToRelative(-1.72f)
                close()
            }
        }.also { _DictionaryAlt = it}
