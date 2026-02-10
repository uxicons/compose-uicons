package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Ss.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.88f, 19f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-4.29f, -12.02f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 0.99f)
                lineToRelative(-4.29f, 12.02f)
                horizontalLineToRelative(2.12f)
                lineToRelative(1.43f, -4f)
                horizontalLineToRelative(4.31f)
                lineToRelative(1.43f, 4f)
                close()
                moveTo(16.86f, 13f)
                lineToRelative(1.44f, -4.03f)
                lineToRelative(1.44f, 4.03f)
                horizontalLineToRelative(-2.88f)
                close()
                moveTo(5.7f, 19f)
                curveToRelative(-0.64f, 0f, -1.19f, -0.39f, -1.41f, -0.99f)
                lineTo(0f, 5.98f)
                lineTo(2.12f, 5.98f)
                lineToRelative(3.58f, 10.03f)
                lineToRelative(3.58f, -10.03f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-4.29f, 12.02f)
                curveToRelative(-0.22f, 0.6f, -0.77f, 0.99f, -1.41f, 0.99f)
                close()
                moveTo(17.57f, 0f)
                lineTo(9.0f, 24f)
                horizontalLineToRelative(-2.12f)
                lineTo(15.45f, 0f)
                horizontalLineToRelative(2.12f)
                close()
            }
        }.also { _Kerning = it}
