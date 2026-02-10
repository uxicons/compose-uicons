package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Rs.OldPeople: ImageVector
    get() = _OldPeople ?: UXIcon(name = "OldPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20f, 13.38f)
                verticalLineToRelative(10.62f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 14.6f)
                curveToRelative(-1.37f, -0.78f, -2.82f, -1.94f, -4.02f, -3.19f)
                curveToRelative(-0.06f, 1.34f, -0.04f, 2.96f, -0.02f, 4.88f)
                curveToRelative(0.02f, 1.42f, 0.04f, 3.16f, 0.03f, 4.71f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.96f)
                curveToRelative(0.03f, -1.29f, -0.66f, -9.23f, 3.01f, -13.49f)
                curveToRelative(0.96f, -1.0f, 2.12f, -1.5f, 3.46f, -1.5f)
                curveToRelative(1.75f, -0.1f, 2.95f, 1.39f, 3.81f, 2.71f)
                curveToRelative(1.43f, 1.91f, 3.65f, 3.74f, 5.69f, 4.67f)
                close()
                moveTo(11.92f, 8.85f)
                curveToRelative(-0.3f, -0.5f, -0.82f, -0.86f, -1.42f, -0.84f)
                curveToRelative(-0.78f, 0f, -1.44f, 0.29f, -2.01f, 0.89f)
                curveToRelative(-2.02f, 2.1f, -2.48f, 7.34f, -2.5f, 10.11f)
                horizontalLineToRelative(6.01f)
                curveToRelative(-0.01f, -0.94f, -0.02f, -1.84f, -0.03f, -2.69f)
                curveToRelative(-0.04f, -2.7f, -0.07f, -4.84f, 0.14f, -6.51f)
                curveToRelative(0.04f, -0.34f, -0.03f, -0.67f, -0.18f, -0.96f)
                close()
            }
        }.also { _OldPeople = it}
