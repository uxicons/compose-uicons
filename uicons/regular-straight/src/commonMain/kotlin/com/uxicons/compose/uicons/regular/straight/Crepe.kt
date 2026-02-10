package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crepe: ImageVector? = null

val Icons.Rs.Crepe: ImageVector
    get() = _Crepe ?: UXIcon(name = "Crepe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 0f)
                horizontalLineToRelative(-0.68f)
                lineToRelative(-8.16f, 20.33f)
                curveToRelative(-0.37f, 1.01f, -0.12f, 2.11f, 0.64f, 2.87f)
                curveToRelative(0.77f, 0.77f, 1.89f, 1.0f, 2.9f, 0.62f)
                lineToRelative(20.3f, -8.15f)
                verticalLineToRelative(-0.68f)
                curveToRelative(0f, -8.27f, -6.73f, -15.0f, -15f, -15.0f)
                close()
                moveTo(2.99f, 21.96f)
                curveToRelative(-0.4f, 0.14f, -0.67f, -0.07f, -0.77f, -0.17f)
                reflectiveCurveToRelative(-0.32f, -0.37f, -0.18f, -0.74f)
                lineToRelative(6.62f, -16.5f)
                curveToRelative(0.96f, 2.44f, 2.25f, 7.04f, 2.33f, 14.2f)
                lineToRelative(-8.0f, 3.21f)
                close()
                moveTo(12.97f, 17.95f)
                curveToRelative(-0.04f, -1.48f, -0.12f, -2.85f, -0.25f, -4.12f)
                curveToRelative(2.63f, 0.5f, 4.85f, 1.11f, 6.48f, 1.62f)
                close()
                moveTo(15.24f, 12.31f)
                lineTo(15.95f, 9.71f)
                curveToRelative(0.26f, -1.01f, -0.66f, -1.92f, -1.66f, -1.66f)
                lineToRelative(-2.35f, 0.62f)
                curveToRelative(-0.75f, -3.46f, -1.7f, -5.63f, -2.22f, -6.65f)
                curveToRelative(6.6f, 0.36f, 11.9f, 5.67f, 12.26f, 12.27f)
                curveToRelative(-1.33f, -0.52f, -3.7f, -1.29f, -6.74f, -1.98f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Crepe = it}
