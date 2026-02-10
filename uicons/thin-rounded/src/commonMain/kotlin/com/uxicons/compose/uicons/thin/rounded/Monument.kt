package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Tr.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(2f, 19.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.56f)
                lineToRelative(1.97f, -14.2f)
                curveToRelative(0.13f, -0.96f, 0.59f, -1.88f, 1.27f, -2.56f)
                lineToRelative(1.22f, -1.22f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                lineToRelative(1.22f, 1.22f)
                curveToRelative(0.69f, 0.69f, 1.14f, 1.6f, 1.27f, 2.56f)
                lineToRelative(1.97f, 14.2f)
                horizontalLineToRelative(2.56f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(2.5f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(16.12f, 6f)
                horizontalLineToRelative(-3.62f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(5.43f)
                lineToRelative(-1.8f, -13f)
                close()
                moveTo(8.02f, 5f)
                horizontalLineToRelative(7.97f)
                lineToRelative(-0.01f, -0.06f)
                curveToRelative(-0.1f, -0.75f, -0.46f, -1.46f, -0.99f, -1.99f)
                lineToRelative(-1.22f, -1.22f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-1.22f, 1.22f)
                curveToRelative(-0.54f, 0.54f, -0.89f, 1.24f, -0.99f, 1.99f)
                lineToRelative(-0.01f, 0.06f)
                close()
                moveTo(6.07f, 19f)
                horizontalLineToRelative(5.43f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(-1.8f, 13f)
                close()
            }
        }.also { _Monument = it}
