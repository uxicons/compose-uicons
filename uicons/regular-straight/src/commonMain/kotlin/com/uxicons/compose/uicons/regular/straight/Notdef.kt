package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Rs.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(3f, 24f)
                lineTo(21f, 24f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.76f, 12f)
                lineToRelative(-5.76f, 7.92f)
                lineTo(5f, 4.07f)
                lineToRelative(5.76f, 7.92f)
                close()
                moveTo(12f, 13.7f)
                lineToRelative(6.04f, 8.3f)
                lineTo(5.96f, 22f)
                lineToRelative(6.04f, -8.3f)
                close()
                moveTo(13.24f, 12f)
                lineToRelative(5.76f, -7.92f)
                verticalLineToRelative(15.85f)
                lineToRelative(-5.76f, -7.92f)
                close()
                moveTo(18f, 2f)
                reflectiveCurveToRelative(0.02f, 0f, 0.03f, 0f)
                lineToRelative(-6.03f, 8.29f)
                lineTo(5.97f, 2.01f)
                reflectiveCurveToRelative(0.02f, 0f, 0.03f, 0f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _Notdef = it}
