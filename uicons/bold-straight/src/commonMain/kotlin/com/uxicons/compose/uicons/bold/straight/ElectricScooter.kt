package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ElectricScooter: ImageVector? = null

val Icons.Bs.ElectricScooter: ImageVector
    get() = _ElectricScooter ?: UXIcon(name = "ElectricScooter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -0.69f, 0.25f, -1.33f, 0.64f, -1.83f)
                lineToRelative(-0.63f, -2.66f)
                lineToRelative(-2.79f, 3.49f)
                horizontalLineToRelative(-7.41f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -0.35f, 0.07f, -0.69f, 0.18f, -1f)
                horizontalLineToRelative(-2.18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(13.78f)
                lineToRelative(3.36f, -4.2f)
                lineToRelative(-2.23f, -9.42f)
                curveToRelative(-0.05f, -0.23f, -0.25f, -0.39f, -0.49f, -0.39f)
                horizontalLineToRelative(-3.42f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.42f)
                curveToRelative(1.63f, 0f, 3.03f, 1.11f, 3.41f, 2.69f)
                lineToRelative(3.64f, 15.35f)
                curveToRelative(1.44f, 0.22f, 2.54f, 1.46f, 2.54f, 2.95f)
                close()
                moveTo(0f, 9f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(3.61f, 10.03f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-0.66f, 2.97f)
                lineToRelative(0.63f, 0.0f)
                lineToRelative(3.26f, -4.03f)
                curveToRelative(0.27f, -0.4f, -0.02f, -0.94f, -0.5f, -0.94f)
                lineToRelative(-2.04f, -0.01f)
                lineToRelative(0.93f, -3.02f)
                horizontalLineToRelative(-2.92f)
                lineToRelative(-1.34f, 4.2f)
                curveToRelative(-0.12f, 0.39f, 0.17f, 0.83f, 0.58f, 0.83f)
                close()
            }
        }.also { _ElectricScooter = it}
