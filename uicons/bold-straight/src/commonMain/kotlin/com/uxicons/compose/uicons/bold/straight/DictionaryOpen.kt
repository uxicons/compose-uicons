package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DictionaryOpen: ImageVector? = null

val Icons.Bs.DictionaryOpen: ImageVector
    get() = _DictionaryOpen ?: UXIcon(name = "DictionaryOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.03f, 3.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(9.5f, 11f)
                lineTo(3f, 11f)
                lineTo(3f, 2f)
                curveTo(3f, 0.9f, 3.9f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(21f, 11f)
                horizontalLineToRelative(-6.5f)
                lineToRelative(-2.5f, 2f)
                lineToRelative(-2.5f, -2f)
                close()
                moveTo(14.45f, 9f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.56f)
                lineToRelative(2.56f, -3.69f)
                verticalLineToRelative(-1.72f)
                horizontalLineToRelative(-4.55f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-2.56f, 3.69f)
                verticalLineToRelative(1.72f)
                close()
                moveTo(11.5f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(9.19f, 8.99f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                close()
                moveTo(17.5f, 19f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-3.03f, 0f, -4.74f, 1.7f, -5.5f, 3.55f)
                curveToRelative(-0.77f, -1.85f, -2.47f, -3.55f, -5.5f, -3.55f)
                lineTo(0f, 16f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 19f)
                curveToRelative(1.88f, 0f, 2.59f, 1.09f, 2.85f, 2f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(24f, 24f)
                verticalLineToRelative(-3f)
                lineTo(14.64f, 21f)
                curveToRelative(0.25f, -0.89f, 0.95f, -2f, 2.85f, -2f)
                close()
            }
        }.also { _DictionaryOpen = it}
