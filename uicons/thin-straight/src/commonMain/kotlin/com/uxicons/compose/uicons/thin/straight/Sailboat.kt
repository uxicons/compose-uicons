package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Ts.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.0f, 15f)
                lineToRelative(0.07f, 0.56f)
                curveToRelative(0.01f, 0.08f, 1.12f, 8.44f, 10.05f, 8.44f)
                horizontalLineToRelative(3.72f)
                curveToRelative(8.93f, 0f, 10.09f, -8.35f, 10.1f, -8.44f)
                lineToRelative(0.07f, -0.56f)
                lineTo(0.0f, 15f)
                close()
                moveTo(13.84f, 23f)
                horizontalLineToRelative(-3.72f)
                curveToRelative(-6.83f, 0f, -8.57f, -5.24f, -8.96f, -7f)
                horizontalLineToRelative(21.68f)
                curveToRelative(-0.4f, 1.77f, -2.18f, 7f, -9.01f, 7f)
                close()
                moveTo(12.01f, 0.06f)
                lineToRelative(-0.01f, 12.94f)
                horizontalLineToRelative(11.99f)
                lineTo(12.01f, 0.06f)
                close()
                moveTo(13.01f, 2.61f)
                lineToRelative(8.69f, 9.39f)
                horizontalLineToRelative(-8.7f)
                lineToRelative(0.01f, -9.39f)
                close()
                moveTo(10f, 1.88f)
                lineTo(0.06f, 13f)
                horizontalLineToRelative(9.94f)
                lineTo(10f, 1.88f)
                close()
                moveTo(9f, 12f)
                lineTo(2.3f, 12f)
                lineToRelative(6.7f, -7.5f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _Sailboat = it}
