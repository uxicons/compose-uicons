package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trees: ImageVector? = null

val Icons.Ss.Trees: ImageVector
    get() = _Trees ?: UXIcon(name = "Trees") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.56f, 15f)
                horizontalLineToRelative(2.38f)
                lineToRelative(-3.96f, -6f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-4.65f, -7.9f)
                lineToRelative(-0.08f, -0.11f)
                curveToRelative(-0.5f, -0.63f, -1.27f, -0.99f, -2.11f, -0.99f)
                reflectiveCurveToRelative(-1.61f, 0.36f, -2.11f, 0.99f)
                lineToRelative(-3.55f, 6.01f)
                horizontalLineToRelative(-2.18f)
                lineTo(10.47f, 0.08f)
                curveToRelative(-0.22f, -0.05f, -0.44f, -0.08f, -0.68f, -0.08f)
                curveToRelative(-0.84f, 0f, -1.61f, 0.36f, -2.11f, 0.99f)
                lineTo(2.96f, 9f)
                horizontalLineToRelative(2.15f)
                lineToRelative(-3.96f, 6f)
                horizontalLineToRelative(2.38f)
                lineTo(0.06f, 21f)
                horizontalLineToRelative(2.31f)
                lineToRelative(3.48f, -6f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-3.48f, 6f)
                horizontalLineToRelative(3.96f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8.51f)
                lineToRelative(-3.48f, -6f)
                close()
                moveTo(6.97f, 13f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(2.64f, -4f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-2.64f, 4f)
                close()
            }
        }.also { _Trees = it}
