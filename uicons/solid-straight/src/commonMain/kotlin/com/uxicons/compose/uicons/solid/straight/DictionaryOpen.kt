package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DictionaryOpen: ImageVector? = null

val Icons.Ss.DictionaryOpen: ImageVector
    get() = _DictionaryOpen ?: UXIcon(name = "DictionaryOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.17f, 5.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(23f, 3f)
                lineTo(23f, 15f)
                lineTo(14.85f, 15f)
                lineToRelative(-2.85f, 2.28f)
                lineToRelative(-2.85f, -2.28f)
                lineTo(1f, 15f)
                lineTo(1f, 3f)
                curveTo(1f, 1.35f, 2.35f, 0f, 4f, 0f)
                lineTo(20f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(10f, 11f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(1.67f)
                close()
                moveTo(13f, 6.4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(19.05f, 4f)
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
                moveTo(16.89f, 19f)
                curveToRelative(-2.78f, 0f, -4.24f, 1.33f, -4.94f, 2.75f)
                curveToRelative(-0.7f, -1.41f, -2.17f, -2.75f, -4.94f, -2.75f)
                lineTo(0f, 19f)
                verticalLineToRelative(5f)
                lineTo(24f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7.11f)
                close()
            }
        }.also { _DictionaryOpen = it}
