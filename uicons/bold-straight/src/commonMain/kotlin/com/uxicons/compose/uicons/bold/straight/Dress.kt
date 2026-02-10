package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Bs.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.57f, 9.88f)
                lineToRelative(0.42f, -4.23f)
                lineToRelative(0.01f, -5.65f)
                horizontalLineToRelative(-3f)
                lineTo(14f, 2.28f)
                curveToRelative(-1.4f, 0.55f, -2f, 1.72f, -2f, 1.72f)
                curveToRelative(0f, 0f, -0.6f, -1.17f, -2f, -1.72f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 5.5f)
                lineToRelative(0.43f, 4.38f)
                lineTo(0.58f, 15.84f)
                curveToRelative(1.75f, 4.81f, 6.26f, 8.2f, 11.42f, 8.16f)
                curveToRelative(5.16f, 0.03f, 9.67f, -3.35f, 11.42f, -8.16f)
                lineToRelative(-6.85f, -5.96f)
                close()
                moveTo(13.94f, 6f)
                lineToRelative(-0.3f, 3f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-0.3f, -3f)
                horizontalLineToRelative(3.88f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-3.19f, 0f, -6.12f, -1.69f, -7.73f, -4.4f)
                lineToRelative(5.29f, -4.6f)
                horizontalLineToRelative(4.88f)
                lineToRelative(5.29f, 4.6f)
                curveToRelative(-1.61f, 2.7f, -4.54f, 4.4f, -7.73f, 4.4f)
                close()
            }
        }.also { _Dress = it}
