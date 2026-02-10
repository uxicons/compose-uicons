package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeAlt: ImageVector? = null

val Icons.Ts.TreeAlt: ImageVector
    get() = _TreeAlt ?: UXIcon(name = "TreeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 21f)
                lineToRelative(-4.13f, -6f)
                horizontalLineToRelative(2.8f)
                lineToRelative(-4.29f, -6f)
                horizontalLineToRelative(3.2f)
                lineTo(13.64f, 0.86f)
                curveToRelative(-0.37f, -0.54f, -0.99f, -0.86f, -1.64f, -0.86f)
                reflectiveCurveToRelative(-1.27f, 0.32f, -1.65f, 0.87f)
                lineToRelative(-5.38f, 8.13f)
                horizontalLineToRelative(3.2f)
                lineToRelative(-4.29f, 6f)
                horizontalLineToRelative(2.8f)
                lineToRelative(-4.13f, 6f)
                horizontalLineToRelative(8.95f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.95f)
                close()
                moveTo(4.45f, 20f)
                lineToRelative(4.13f, -6f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(4.29f, -6f)
                horizontalLineToRelative(-3.28f)
                lineTo(11.18f, 1.43f)
                curveToRelative(0.38f, -0.55f, 1.27f, -0.53f, 1.64f, -0.01f)
                lineToRelative(4.35f, 6.58f)
                horizontalLineToRelative(-3.28f)
                lineToRelative(4.29f, 6f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(4.13f, 6f)
                horizontalLineToRelative(-7.05f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-7.05f)
                close()
            }
        }.also { _TreeAlt = it}
