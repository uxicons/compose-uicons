package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Ts.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 4.27f)
                lineToRelative(-3.24f, -3.24f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 6.74f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.76f)
                curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                verticalLineToRelative(16.26f)
                close()
                moveTo(15.5f, 12f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(17f, 14.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7f, 18.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 20f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SimCard = it}
