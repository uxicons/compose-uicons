package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Rs.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -4.76f)
                lineToRelative(-2f, -2f)
                lineToRelative(0f, 6.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 10f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, -2f)
                lineToRelative(0f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11.58f)
                lineTo(13f, 5f)
                horizontalLineToRelative(6.36f)
                curveToRelative(0.35f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                verticalLineToRelative(4.36f)
                horizontalLineToRelative(2f)
                lineTo(22f, 5.64f)
                curveToRelative(0f, -1.45f, -1.18f, -2.64f, -2.64f, -2.64f)
                lineTo(4.64f, 3f)
                curveToRelative(-0.07f, 0f, -0.13f, 0.02f, -0.2f, 0.02f)
                lineTo(1.42f, 0f)
                lineTo(0f, 1.42f)
                lineTo(22.58f, 24f)
                lineToRelative(1.42f, -1.42f)
                lineTo(13f, 11.58f)
                close()
                moveTo(11f, 5f)
                verticalLineToRelative(4.58f)
                lineTo(6.42f, 5f)
                horizontalLineToRelative(4.58f)
                close()
            }
        }.also { _TextSlash = it}
