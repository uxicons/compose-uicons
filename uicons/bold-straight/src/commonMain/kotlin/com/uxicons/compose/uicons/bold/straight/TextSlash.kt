package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Bs.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.53f, 11.41f)
                lineTo(13.53f, 5f)
                horizontalLineToRelative(4.97f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                lineTo(22f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 2f)
                curveToRelative(-0.41f, 0f, -0.81f, 0.08f, -1.17f, 0.21f)
                lineTo(2.12f, 0.0f)
                lineTo(0f, 2.12f)
                lineTo(21.88f, 24f)
                lineToRelative(2.12f, -2.12f)
                lineTo(13.53f, 11.41f)
                close()
                moveTo(10.47f, 5f)
                lineToRelative(0.07f, -0.07f)
                verticalLineToRelative(3.48f)
                lineToRelative(-3.42f, -3.42f)
                horizontalLineToRelative(3.35f)
                close()
                moveTo(2f, 6.92f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(0.09f)
                lineTo(2f, 10f)
                verticalLineToRelative(-3.08f)
                close()
                moveTo(10.53f, 15.45f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(3.55f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.55f)
                close()
            }
        }.also { _TextSlash = it}
