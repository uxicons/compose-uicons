package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Rs.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(11f)
                reflectiveCurveToRelative(-2f, 0f, -2f, 0f)
                lineTo(22f, 3.39f)
                lineToRelative(-1.04f, 1.06f)
                lineToRelative(-1.44f, -1.39f)
                lineToRelative(2.97f, -3.07f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(13.37f, 6f)
                lineToRelative(-5.33f, 7.31f)
                lineTo(2.66f, 6f)
                lineTo(0.18f, 6f)
                lineToRelative(6.62f, 9f)
                lineTo(0.2f, 24f)
                horizontalLineToRelative(2.48f)
                lineToRelative(5.36f, -7.31f)
                lineToRelative(5.33f, 7.31f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-6.57f, -9f)
                lineToRelative(6.57f, -9f)
                horizontalLineToRelative(-2.48f)
                close()
            }
        }.also { _Superscript = it}
