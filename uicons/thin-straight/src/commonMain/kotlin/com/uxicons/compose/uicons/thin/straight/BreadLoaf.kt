package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Ts.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.89f, 3f)
                lineTo(3.11f, 3f)
                curveToRelative(-1.72f, 0f, -3.11f, 1.4f, -3.11f, 3.11f)
                curveToRelative(0f, 1.36f, 0.8f, 2.52f, 2f, 2.94f)
                verticalLineToRelative(11.95f)
                lineTo(22f, 21f)
                lineTo(22f, 9.05f)
                curveToRelative(1.2f, -0.42f, 2f, -1.58f, 2f, -2.94f)
                curveToRelative(0f, -1.72f, -1.4f, -3.11f, -3.11f, -3.11f)
                close()
                moveTo(2.6f, 8.18f)
                curveToRelative(-0.96f, -0.19f, -1.6f, -1.03f, -1.6f, -2.07f)
                curveToRelative(0f, -1.17f, 0.95f, -2.11f, 2.11f, -2.11f)
                lineTo(12.89f, 4f)
                curveToRelative(1.17f, 0f, 2.11f, 0.95f, 2.11f, 2.11f)
                curveToRelative(0f, 1.04f, -0.64f, 1.88f, -1.6f, 2.07f)
                lineToRelative(-0.4f, 0.08f)
                verticalLineToRelative(11.73f)
                lineTo(3f, 19.99f)
                lineTo(3f, 8.27f)
                lineToRelative(-0.4f, -0.08f)
                close()
                moveTo(21.4f, 8.18f)
                lineToRelative(-0.4f, 0.08f)
                verticalLineToRelative(11.73f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 9.05f)
                curveToRelative(1.2f, -0.42f, 2f, -1.58f, 2f, -2.94f)
                curveToRelative(0f, -0.82f, -0.32f, -1.56f, -0.83f, -2.11f)
                horizontalLineToRelative(5.72f)
                curveToRelative(1.17f, 0f, 2.11f, 0.95f, 2.11f, 2.11f)
                curveToRelative(0f, 1.04f, -0.64f, 1.88f, -1.6f, 2.07f)
                close()
            }
        }.also { _BreadLoaf = it}
