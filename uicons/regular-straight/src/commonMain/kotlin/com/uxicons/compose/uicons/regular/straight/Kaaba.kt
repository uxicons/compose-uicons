package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kaaba: ImageVector? = null

val Icons.Rs.Kaaba: ImageVector
    get() = _Kaaba ?: UXIcon(name = "Kaaba") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12.75f)
                lineToRelative(4f, 2.12f)
                verticalLineToRelative(2.26f)
                lineToRelative(-4f, -2.12f)
                verticalLineToRelative(-2.26f)
                close()
                moveTo(13f, 17.16f)
                lineToRelative(4f, -2.04f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-4f, 2.04f)
                verticalLineToRelative(2.26f)
                close()
                moveTo(23f, 5.99f)
                verticalLineToRelative(12.01f)
                lineToRelative(-11f, 5.83f)
                lineTo(1f, 18.0f)
                lineTo(1f, 6.0f)
                lineTo(12f, 0.16f)
                lineToRelative(11f, 5.83f)
                close()
                moveTo(12f, 2.43f)
                lineToRelative(-7.86f, 4.17f)
                lineToRelative(7.86f, 4.17f)
                lineToRelative(7.86f, -4.17f)
                lineToRelative(-7.86f, -4.17f)
                close()
                moveTo(21f, 16.8f)
                verticalLineToRelative(-3.87f)
                lineToRelative(-2f, 1.12f)
                verticalLineToRelative(-2.26f)
                lineToRelative(2f, -1.12f)
                verticalLineToRelative(-2.41f)
                lineToRelative(-9f, 4.77f)
                lineTo(3f, 8.26f)
                verticalLineToRelative(2.36f)
                lineToRelative(2f, 1.07f)
                verticalLineToRelative(2.26f)
                lineToRelative(-2f, -1.07f)
                verticalLineToRelative(3.92f)
                lineToRelative(9f, 4.77f)
                lineToRelative(9f, -4.77f)
                close()
            }
        }.also { _Kaaba = it}
