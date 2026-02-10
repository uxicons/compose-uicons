package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kaaba: ImageVector? = null

val Icons.Ts.Kaaba: ImageVector
    get() = _Kaaba ?: UXIcon(name = "Kaaba") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 15.01f)
                lineToRelative(2f, -1.06f)
                verticalLineToRelative(1.13f)
                lineToRelative(-2f, 1.06f)
                verticalLineToRelative(-1.13f)
                close()
                moveTo(10f, 16.07f)
                verticalLineToRelative(1.13f)
                lineToRelative(2f, 1.06f)
                lineToRelative(2f, -1.06f)
                verticalLineToRelative(-1.13f)
                lineToRelative(-2f, 1.06f)
                lineToRelative(-2f, -1.06f)
                close()
                moveTo(6f, 15.08f)
                lineToRelative(2f, 1.06f)
                verticalLineToRelative(-1.13f)
                lineToRelative(-2f, -1.06f)
                verticalLineToRelative(1.13f)
                close()
                moveTo(23f, 5.83f)
                verticalLineToRelative(12.34f)
                lineToRelative(-11f, 5.83f)
                lineTo(1f, 18.17f)
                lineTo(1f, 5.83f)
                lineTo(12f, -0.0f)
                lineToRelative(11f, 5.83f)
                close()
                moveTo(22f, 6.96f)
                lineToRelative(-10f, 5.3f)
                lineTo(2f, 6.96f)
                verticalLineToRelative(1.87f)
                lineToRelative(10f, 5.3f)
                lineToRelative(10f, -5.3f)
                verticalLineToRelative(-1.87f)
                close()
                moveTo(12f, 1.13f)
                lineTo(2.57f, 6.13f)
                lineToRelative(9.43f, 5f)
                lineToRelative(9.43f, -5f)
                lineTo(12f, 1.13f)
                close()
                moveTo(22f, 17.57f)
                verticalLineToRelative(-4.61f)
                lineToRelative(-2f, 1.06f)
                verticalLineToRelative(-1.13f)
                lineToRelative(2f, -1.06f)
                verticalLineToRelative(-1.87f)
                lineToRelative(-10f, 5.3f)
                lineTo(2f, 9.96f)
                verticalLineToRelative(1.87f)
                lineToRelative(2f, 1.06f)
                verticalLineToRelative(1.13f)
                lineToRelative(-2f, -1.06f)
                verticalLineToRelative(4.61f)
                lineToRelative(10f, 5.3f)
                lineToRelative(10f, -5.3f)
                close()
            }
        }.also { _Kaaba = it}
