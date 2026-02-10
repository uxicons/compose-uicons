package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Ts.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(15.09f, 9.7f)
                lineToRelative(-0.3f, -1.65f)
                curveToRelative(-0.22f, -1.19f, -1.25f, -2.05f, -2.46f, -2.05f)
                horizontalLineToRelative(-1.66f)
                curveToRelative(-1.21f, 0f, -2.24f, 0.86f, -2.46f, 2.05f)
                lineToRelative(-2.17f, 11.95f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.77f)
                lineToRelative(0.12f, -0.34f)
                curveToRelative(0.05f, -0.13f, 1.11f, -3.25f, 1.11f, -5.04f)
                curveToRelative(0f, -2.31f, -1.08f, -4.13f, -2.91f, -4.92f)
                close()
                moveTo(16.06f, 19f)
                lineTo(7.24f, 19f)
                lineToRelative(1.13f, -6.25f)
                lineToRelative(3.4f, 1.7f)
                lineToRelative(0.45f, -0.9f)
                lineToRelative(-3.66f, -1.83f)
                lineToRelative(0.63f, -3.49f)
                curveToRelative(0.13f, -0.71f, 0.75f, -1.23f, 1.48f, -1.23f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.73f, 0f, 1.35f, 0.52f, 1.48f, 1.23f)
                lineToRelative(0.4f, 2.2f)
                lineToRelative(0.27f, 0.1f)
                curveToRelative(1.58f, 0.58f, 2.52f, 2.11f, 2.52f, 4.09f)
                curveToRelative(0f, 1.3f, -0.67f, 3.53f, -0.94f, 4.38f)
                close()
            }
        }.also { _PersonPregnant = it}
