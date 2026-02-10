package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonClimbing: ImageVector? = null

val Icons.Rs.PersonClimbing: ImageVector
    get() = _PersonClimbing ?: UXIcon(name = "PersonClimbing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.54f, 9.87f)
                lineToRelative(-5.54f, -4.35f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-3.44f)
                lineTo(0f, 11.59f)
                verticalLineToRelative(12.41f)
                lineTo(2f, 24f)
                lineTo(2f, 12.41f)
                lineTo(13f, 1.39f)
                lineTo(13f, 6.49f)
                lineToRelative(2.84f, 2.23f)
                lineToRelative(-4.11f, 5.04f)
                lineToRelative(-2.02f, -1.76f)
                lineTo(4f, 12.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.96f)
                lineToRelative(3.44f, 3f)
                lineTo(7.01f, 17.0f)
                lineToRelative(-3.37f, 4.39f)
                lineToRelative(1.59f, 1.22f)
                lineToRelative(2.77f, -3.61f)
                horizontalLineToRelative(5.52f)
                curveToRelative(0.96f, 0f, 1.98f, -0.54f, 2.76f, -1.46f)
                lineToRelative(3.96f, -4.85f)
                curveToRelative(0.05f, 0.12f, 0.1f, 0.25f, 0.13f, 0.38f)
                lineToRelative(0.64f, 2.55f)
                verticalLineToRelative(4.88f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                lineToRelative(-0.7f, -2.91f)
                curveToRelative(-0.27f, -1.07f, -0.89f, -2.04f, -1.76f, -2.72f)
                close()
                moveTo(14.67f, 16.32f)
                lineToRelative(-1.43f, -1.25f)
                lineToRelative(4.17f, -5.12f)
                lineToRelative(1.5f, 1.18f)
                reflectiveCurveToRelative(-4.23f, 5.17f, -4.25f, 5.19f)
                close()
                moveTo(23.98f, 5.52f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PersonClimbing = it}
