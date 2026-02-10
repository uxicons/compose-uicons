package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonWalkingWithCane: ImageVector? = null

val Icons.Bs.PersonWalkingWithCane: ImageVector
    get() = _PersonWalkingWithCane ?: UXIcon(name = "PersonWalkingWithCane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(13.36f, 12.48f)
                lineToRelative(3.13f, 2.94f)
                lineToRelative(4.54f, 8.56f)
                lineToRelative(2.65f, -1.41f)
                lineToRelative(-4.78f, -9f)
                lineToRelative(-3.33f, -3.12f)
                lineToRelative(-2.63f, -3.02f)
                curveToRelative(-0.68f, -0.86f, -1.86f, -1.43f, -2.95f, -1.43f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-1.21f, 0f, -2.32f, 0.61f, -2.93f, 1.59f)
                lineTo(0.26f, 14.16f)
                lineToRelative(2.48f, 1.69f)
                lineToRelative(3.26f, -4.8f)
                verticalLineToRelative(4.27f)
                lineToRelative(5.33f, 3.46f)
                lineToRelative(2.6f, 5.15f)
                lineToRelative(2.68f, -1.35f)
                lineToRelative(-2.96f, -5.87f)
                lineToRelative(-2.65f, -1.72f)
                verticalLineToRelative(-5.22f)
                lineToRelative(2.36f, 2.72f)
                close()
                moveTo(4.45f, 24f)
                horizontalLineToRelative(3.05f)
                lineToRelative(0.8f, -4.92f)
                lineToRelative(-2.71f, -1.81f)
                lineToRelative(-1.15f, 6.72f)
                close()
            }
        }.also { _PersonWalkingWithCane = it}
