package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subscript: ImageVector? = null

val Icons.Rs.Subscript: ImageVector
    get() = _Subscript ?: UXIcon(name = "Subscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.81f, 0f)
                lineToRelative(-6.57f, 9f)
                lineToRelative(6.57f, 9f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(-5.33f, -7.31f)
                lineToRelative(-5.36f, 7.31f)
                lineTo(0.15f, 18f)
                lineToRelative(6.6f, -9f)
                lineTo(0.14f, 0f)
                horizontalLineToRelative(2.48f)
                lineToRelative(5.38f, 7.31f)
                lineTo(13.33f, 0f)
                horizontalLineToRelative(2.48f)
                close()
                moveTo(22.49f, 13f)
                lineToRelative(-2.97f, 3.07f)
                lineToRelative(1.44f, 1.39f)
                lineToRelative(1.04f, -1.06f)
                verticalLineToRelative(7.61f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-1.51f)
                close()
            }
        }.also { _Subscript = it}
