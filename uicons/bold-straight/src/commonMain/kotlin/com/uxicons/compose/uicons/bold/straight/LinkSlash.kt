package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Bs.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.13f, 11.58f)
                lineToRelative(2.23f, -2.22f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.23f, 2.22f)
                curveToRelative(-0.81f, 0.81f, -1.25f, 1.88f, -1.25f, 3.02f)
                reflectiveCurveToRelative(0.44f, 2.21f, 1.25f, 3.02f)
                curveToRelative(0.81f, 0.81f, 1.88f, 1.26f, 3.02f, 1.27f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.13f, 0f, 2.19f, -0.44f, 2.98f, -1.23f)
                lineToRelative(2.24f, -2.25f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.24f, 2.25f)
                curveToRelative(-1.36f, 1.36f, -3.17f, 2.11f, -5.1f, 2.11f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-1.94f, -0.01f, -3.76f, -0.77f, -5.13f, -2.15f)
                curveTo(0.76f, 20.48f, 0f, 18.66f, 0f, 16.72f)
                reflectiveCurveToRelative(0.76f, -3.77f, 2.13f, -5.14f)
                close()
                moveTo(10.55f, 15.57f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.49f, 1.49f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.49f, -1.49f)
                close()
                moveTo(2.12f, 0.0f)
                lineTo(7.92f, 5.8f)
                lineToRelative(3.68f, -3.67f)
                curveToRelative(2.83f, -2.83f, 7.44f, -2.83f, 10.28f, 0f)
                curveToRelative(1.37f, 1.37f, 2.13f, 3.2f, 2.13f, 5.14f)
                curveToRelative(0f, 1.94f, -0.76f, 3.77f, -2.13f, 5.14f)
                lineToRelative(-3.67f, 3.68f)
                lineToRelative(5.8f, 5.8f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.0f, 2.12f)
                lineTo(2.12f, 0.0f)
                close()
                moveTo(19.75f, 10.28f)
                curveToRelative(0.81f, -0.81f, 1.25f, -1.88f, 1.25f, -3.02f)
                curveToRelative(0f, -1.14f, -0.44f, -2.21f, -1.25f, -3.02f)
                curveToRelative(-1.66f, -1.66f, -4.37f, -1.66f, -6.03f, 0f)
                lineToRelative(-3.67f, 3.67f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(2.94f, -2.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.94f, 2.94f)
                lineToRelative(1.96f, 1.96f)
                lineToRelative(3.67f, -3.68f)
                close()
            }
        }.also { _LinkSlash = it}
