package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OldPeople: ImageVector? = null

val Icons.Ts.OldPeople: ImageVector
    get() = _OldPeople ?: UXIcon(name = "OldPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(19.72f, 13.55f)
                curveToRelative(-1.85f, -0.93f, -4.02f, -3.3f, -5.32f, -5.05f)
                curveToRelative(-0.79f, -1.17f, -1.81f, -2.61f, -3.41f, -2.51f)
                curveToRelative(-1.13f, 0f, -2.13f, 0.44f, -2.97f, 1.31f)
                curveToRelative(-3.48f, 3.75f, -3.02f, 13.03f, -3.02f, 13.69f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.0f, -1.43f, -0.01f, -2.9f, -0.03f, -4.3f)
                curveToRelative(-0.03f, -2.76f, -0.06f, -5.37f, 0.1f, -6.99f)
                curveToRelative(1.35f, 1.71f, 3.2f, 3.63f, 4.93f, 4.59f)
                verticalLineToRelative(9.7f)
                horizontalLineToRelative(1f)
                lineTo(20f, 13.69f)
                lineToRelative(-0.28f, -0.14f)
                close()
                moveTo(13.1f, 9.37f)
                curveToRelative(-0.2f, 1.66f, -0.17f, 4.3f, -0.13f, 7.35f)
                curveToRelative(0.01f, 1.07f, 0.03f, 2.18f, 0.03f, 3.29f)
                lineTo(5.99f, 20f)
                curveToRelative(-0.01f, -1.95f, 0.12f, -9.26f, 2.76f, -12f)
                curveToRelative(0.65f, -0.67f, 1.38f, -1f, 2.25f, -1f)
                curveToRelative(0.59f, 0f, 1.15f, 0.25f, 1.55f, 0.68f)
                lineToRelative(0.3f, 0.4f)
                curveToRelative(0.22f, 0.39f, 0.31f, 0.84f, 0.26f, 1.29f)
                close()
            }
        }.also { _OldPeople = it}
