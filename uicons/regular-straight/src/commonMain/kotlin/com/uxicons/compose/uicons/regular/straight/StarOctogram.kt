package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOctogram: ImageVector? = null

val Icons.Rs.StarOctogram: ImageVector
    get() = _StarOctogram ?: UXIcon(name = "StarOctogram", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(512f, 256f)
                lineToRelative(-74.99f, 74.99f)
                verticalLineToRelative(106.02f)
                horizontalLineTo(330.99f)
                lineTo(256f, 512f)
                lineToRelative(-74.99f, -74.99f)
                horizontalLineTo(74.99f)
                verticalLineTo(330.99f)
                lineTo(0f, 256f)
                lineToRelative(74.99f, -74.99f)
                verticalLineTo(74.99f)
                horizontalLineToRelative(106.02f)
                lineTo(256f, 0f)
                lineToRelative(74.99f, 74.99f)
                horizontalLineToRelative(106.02f)
                verticalLineToRelative(106.02f)
                lineTo(512f, 256f)
                close()
                moveTo(406.85f, 300.78f)
                lineToRelative(44.8f, -44.8f)
                lineToRelative(-44.8f, -44.8f)
                lineToRelative(-12.5f, -12.48f)
                verticalLineToRelative(-81.07f)
                horizontalLineToRelative(-81.07f)
                lineToRelative(-12.48f, -12.5f)
                lineTo(256f, 60.33f)
                verticalLineToRelative(0.02f)
                lineToRelative(-57.3f, 57.3f)
                horizontalLineToRelative(-81.07f)
                verticalLineToRelative(81.07f)
                lineToRelative(-12.5f, 12.48f)
                lineTo(60.33f, 256f)
                lineToRelative(44.82f, 44.8f)
                lineToRelative(12.5f, 12.46f)
                verticalLineToRelative(81.07f)
                horizontalLineToRelative(81.07f)
                lineToRelative(12.48f, 12.5f)
                lineToRelative(44.8f, 44.8f)
                lineToRelative(44.8f, -44.8f)
                lineToRelative(12.48f, -12.5f)
                horizontalLineToRelative(81.07f)
                verticalLineToRelative(-81.07f)
                lineTo(406.85f, 300.78f)
                close()
            }
        }.also { _StarOctogram = it}
