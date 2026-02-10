package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogPencil: ImageVector? = null

val Icons.Ss.BlogPencil: ImageVector
    get() = _BlogPencil ?: UXIcon(name = "BlogPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(0f, 7f)
                close()
                moveTo(23.26f, 23.26f)
                curveToRelative(0.99f, -0.99f, 0.99f, -2.6f, 0f, -3.59f)
                lineToRelative(-6.67f, -6.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(3.59f)
                lineToRelative(6.67f, 6.67f)
                curveToRelative(0.48f, 0.48f, 1.12f, 0.74f, 1.8f, 0.74f)
                reflectiveCurveToRelative(1.32f, -0.26f, 1.79f, -0.74f)
                close()
                moveTo(11f, 17.42f)
                verticalLineToRelative(-6.42f)
                horizontalLineToRelative(6.42f)
                lineToRelative(6.58f, 6.58f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                lineTo(15.58f, 22f)
                lineToRelative(-4.58f, -4.58f)
                close()
            }
        }.also { _BlogPencil = it}
